package brunelvis;


import org.brunel.action.Action;
import org.brunel.build.d3.D3Builder;
import org.brunel.build.util.BuilderOptions;
import org.brunel.model.VisItem;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class brunelvis {

    /**
     * Run a simple Brunel command.
     * The first parameter is a Brunel Command. The second is the URL of the data source. This can be a file reference
     * such as 'file://...'.
     * When run it will build a HTML page with the full Brunel in it, and display it in the default browser
     * @param args specify the command
     */
    public static void main(String[] args) throws Exception {

        // Process the commands:
        String command = "bubble color(Major_category) size(Employed) title(\"Employment by Major from 2010-2012\") sort(Employed) label(Major) tooltip(Major, #all) legends(none) style('.header{fill: black} .background {fill:#eef2f3}')";
        if (args.length > 0) command = args[0];

        String source = "https://raw.githubusercontent.com/fivethirtyeight/data/master/college-majors/all-ages.csv";
        if (args.length > 1) source = args[1];

        // Assemble the two parts into one complete brunel command, with data and visualization actions
        String fullCommand = "data('" + source + "') " + command;

        // Build the action and apply it to create the VisItem
        Action action = Action.parse(fullCommand);
        VisItem vis = action.apply();

        // Define a builder 
        BuilderOptions options = new BuilderOptions();
        options.version = "2.0";
        D3Builder builder = D3Builder.make(options);
        builder.build(vis, 1280, 720);

        // Write the results out as a HTML page
        File file = new File("index.html");
        PrintWriter out = new PrintWriter(new FileWriter(file));
        out.println("<HTML><HEAD>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");   
        out.println("<title>Employment by Major</title>");
        
        // Add Bootstrap onto HTML 
        Boothorn myHorn = new Boothorn();
        myHorn.bootPrinter(out);
        
        // Add in style sheet definitions
        out.println(builder.makeStyleSheets());

        String css = builder.getStyleOverrides();
        if (!css.isEmpty()) {
            out.println("\t<style>\n\t\t" + css + "\n\t</style>\n");
        }

        out.println("</HEAD><BODY>");
        out.println("<div=\"col-sm-6\"");
        out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>");
        out.println("");
        out.println("<svg id=\"visualization\" width=\"auto\" height=\"auto\"></svg>");

        // Add in the imports needed
        out.println(builder.makeImports());
        out.println("<script>");

        // Add in the Javascript
        out.println(builder.getVisualization());
        out.println("</script>");
        out.println("</BODY></HTML>");
        out.close();
        Desktop.getDesktop().browse(file.toURI());

    }
}