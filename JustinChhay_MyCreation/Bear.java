// Name: Justin Chhay
// Teacher: Mr. Afsari-Nejad
// Date: October 16, 2019
// Description: This class contains the animation code for the bear.

// The "Bear" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; // allows access to Thread class

public class Bear implements Runnable
{
    private Console c;           // The output console

    // Draws and animates the bear running to the river
    public void bear ()
    {
	// Total Colours Used in this Class: 4

	Color bear = new Color (128, 64, 0);      //Local colour var - Bear
	Color bear2 = new Color (117, 59, 0);     //Local colour var - Bear (Darker Shade)
	Color bear3 = new Color (214, 189, 169);  //Local colour var - Bear (Lighter Shade)
	Color grass = new Color (102, 153, 0);    //Local colour var - Grass

	// For Loop - Moves bear's y-coordinates to the left
	for (int n = 0 ; n < 145 ; n++)
	{
	    //Int Array Variables - Bear Teeth (polygon)
	    int teethX[] = {637 - n, 642 - n, 640 - n};
	    int teethY[] = {314, 314, 321};

	    //Erase
	    c.setColor (grass);
	    c.fillRect (607 - n, 270, 200, 125);


	    //Body of Bear
	    c.setColor (bear2);
	    c.fillRoundRect (640 - n, 300, 100, 65, 20, 20);

	    //Legs of Bear
	    c.fillOval (640 - n, 320, 35, 75);
	    c.fillOval (705 - n, 320, 35, 75);

	    //Head of Bear
	    c.setColor (bear);
	    c.fillOval (605 - n, 270, 65, 55);

	    //Ears of Bear
	    c.fillOval (607 - n, 270, 15, 15);
	    c.fillOval (650 - n, 270, 15, 15);

	    //Snout of Bear
	    c.setColor (bear3);
	    c.fillOval (612 - n, 300, 40, 25);

	    //Mouth of Bear
	    c.setColor (Color.black);
	    c.drawArc (595 - n, 308, 50, 8, 260, 120);

	    //Nose of Bear
	    c.fillOval (620 - n, 300, 10, 7);

	    //Teeth of Bear
	    c.setColor (Color.white);
	    c.fillPolygon (teethX, teethY, 3);

	    //Eyes of Bear
	    c.fillOval (615 - n, 285, 15, 8);
	    c.fillOval (638 - n, 285, 15, 8);
	    c.setColor (Color.black);
	    c.fillOval (616 - n, 285, 8, 8);
	    c.fillOval (640 - n, 285, 8, 8);

	    //Arm of Bear
	    c.setColor (bear2);
	    c.fillRoundRect (560 - n, 330, 100, 30, 20, 20);
	    
	    //Slows down animation
	    try
	    {
		Thread.sleep(15);
	    }
	    catch(Exception e)
	    {              
	    }
	    
	}
    }


    public Bear (Console con)
    {
	c = con;
    }


    public void run ()
    {
	bear ();
    }
} // Bear class
