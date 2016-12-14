# brunelvis

A Java and Brunel Visualization powered data visualization of employment by college major from 2011-2012.
The dataset contained of the employment status and college major of college graduates of all ages from 2011-2012. 
Dataset courtesy of FiveThirtyEight: https://raw.githubusercontent.com/fivethirtyeight/data/master/college-majors/all-ages.csv
<br><br>
From this dataset, a bubble chart sorted by employment number and colored by major category (Computers & Mathematics, Education, Engineering, etc.) was made using the Brunel language. 
The larger the bubble, the higher the employment number is for each major.
<br><br>
![alt tag](https://github.com/chrisnguyenhi/brunelvis/blob/master/output.png)
<p align="center"></p>
This program is written in Java using Brunel 2.0. After compiling, the program creates a index.html file containing the visualization results. 
<br><br>
Brunel Command: <br>
``
data('https://raw.githubusercontent.com/fivethirtyeight/data/master/college-majors/all-ages.csv') bubble color(Major_category) size(Employed) title("Employment by Major from 2010-2012") sort(Employed) label(Major) tooltip(Major, #all) legends(none) style('.header{fill: black} .background {fill:#eef2f3}')
``
<br>
<br>Try this command on Brunel Visualization 2.0: http://brunel.mybluemix.net/gallery_app/renderer
<br>Download Brunel from Java: https://github.com/Brunel-Visualization/Brunel/releases


