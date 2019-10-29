// Name: Justin Chhay
// Teacher: Mr. Afsari-Nejad
// Date: October 16, 2019
// Description: This class contains the animation code for the crawling bug.

// The "CrawlingBug" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; // Allows access to Thread class

public class CrawlingBug extends Thread
{
    private Console c;           // The output console

    //Animates bug crawling on fallen trunk
    public void crawlingBug ()
    {
	//Total Colours Used In This Class: 3

	Color trunk = new Color (153, 102, 51); //Local colour var - Trunk
	Color bug = new Color (0, 204, 0); //Local colour var - Bug
	Color bugBody = new Color (180, 0, 0); //Local colour var - Bug Body

	//For Loop - animates the bug crawling to the right
	for (int n = 0 ; n < 50 ; n++)
	{
	    //Erase
	    c.setColor (trunk);
	    c.fillRect (193 + n, 220, 50, 40);

	    //Bug Antennae and Legs
	    c.setColor (Color.black);
	    c.drawArc (225 + n, 224, 20, 10, 270, 100);
	    c.drawArc (225 + n, 238, 20, 10, 90, -100);
	    c.drawArc (205 + n, 223, 15, 20, 0, 120);
	    c.drawArc (195 + n, 226, 15, 20, 0, 120);
	    c.drawArc (205 + n, 235, 15, 20, 0, -120);
	    c.drawArc (195 + n, 232, 15, 20, 0, -120);

	    //Bug Body
	    c.setColor (bugBody);
	    c.fillOval (198 + n, 233, 30, 10);

	    //Bug Head and Wings
	    c.setColor (bug);
	    c.fillOval (220 + n, 230, 15, 15);
	    c.fillOval (202 + n, 228, 20, 10);
	    c.fillOval (202 + n, 238, 20, 10);

	    //Slows down animation
	    try
	    {
		Thread.sleep (100);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public CrawlingBug (Console con)
    {
	c = con;
    }


    public void run ()
    {
	crawlingBug ();
    }
} // CrawlingBug class
