# brunelvis

A Java and Brunel Visualization powered data visualization of employment by college major from 2011-2012.
The dataset contained the employment status and college major of college graduates of all ages from 2011-2012. 
<br>
Dataset courtesy of FiveThirtyEight: https://raw.githubusercontent.com/fivethirtyeight/data/master/college-majors/all-ages.csv
<br><br>
From this dataset, a bubble chart sorted by employment number and colored by major category (Computers & Mathematics, Education, Engineering, etc.) was made using the Brunel language. 
The larger the bubble, the higher the employment number is for each major.
<br><br>
![alt tag](https://github.com/chrisnguyenhi/brunelvis/blob/master/output.png)
<br>
<p align="center"></p>
This program is written in Java using Brunel 2.0. After compiling, the program creates a html file containing the visualization results. 
<br><br>
Brunel Command: <br>
``data('https://raw.githubusercontent.com/fivethirtyeight/data/master/college-majors/all-ages.csv') bubble color(Major_category) size(Employed) title("Employment by Major from 2010-2012") sort(Employed) label(Major) tooltip(Major, #all) legends(none) style('.header{fill: black} .background {fill:#eef2f3}')
``
<br>
<br>
<br>
Another similar program was made in marvel.java where a data visualization was made with a much larger dataset containing the information of Marvel Characters found on Marvel Wikia. 
<br>
Dataset courtesy of FiveThirtyEight: https://raw.githubusercontent.com/fivethirtyeight/data/master/comic-characters/marvel-wikia-data.csv
<br><br>
![alt tag](https://github.com/chrisnguyenhi/brunelvis/blob/master/marvel.png)
<br>
<br>
<br>Try these commands on Brunel Visualization 2.0: http://brunel.mybluemix.net/gallery_app/renderer
<br>Download Brunel from Java: https://github.com/Brunel-Visualization/Brunel/releases


