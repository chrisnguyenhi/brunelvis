package brunelvis;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Class to automate the injection of basic Bootstrap elements
public class Boothorn {
	
	public Boothorn(){
		System.out.println();
		System.out.println("Bootstrap Elements: ");
		System.out.println();
		System.out.println("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">");
        System.out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>");
        System.out.println("<script src=\"js/bootstrap.min.js\"></script>");
        System.out.println();	
	}
	
	// Takes in a PrintWriter
	public void bootPrinter(PrintWriter out){
		out.println();
		out.println("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">");
        out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>");
        out.println("<script src=\"js/bootstrap.min.js\"></script>");
        out.println();
	}
	
	// Takes in a FileWriter
	public void bootWriter(FileWriter out) throws IOException{
		out.write("\n");
		out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
        out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
        out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
	}

	// Takes in a BufferedWriter
	public void bootBuffered(BufferedWriter out) throws IOException{
		out.write("\n");
		out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
        out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
        out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
	}
}
