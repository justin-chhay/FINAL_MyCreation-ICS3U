// Name: Justin Chhay
// Teacher: Mr. Afsari-Nejad
// Date: October 16, 2019
// Description: This class contains all the animation code for the swimming fish.

// The "SwimmingFish" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; //Allows access to Thread class

public class SwimmingFish extends Thread
{
    private Console c;           // The output console

    //Animates fish swimming downstream
    public void swimmingFish ()
    {
	// Number of Colours Used In This Class: 6

	Color river = new Color (0, 102, 153);      //Local colour var - River
	Color body = new Color (255, 140, 105);     //Local colour var - Fish Body
	Color head = new Color (118, 182, 196);     //Local colour var - Fish Head
	Color tail = new Color (46, 139, 87);       //Local colour var - Fish Tail
	Color gills = new Color (0, 0, 0);          //Local colour var - Fish Gills
	Color fishFace = new Color (255, 255, 255); //Local colour var - Fish Eyes & Mouth

	//For Loop used to move fish down along its y-axis
	for (int n = 0 ; n < 125 ; n++)
	{
	    //Int Array Variables for tail (polygon)
	    int tailX[] = {355, 385, 385, 355, 360};
	    int tailY[] = {200 + n, 205 + n, 215 + n, 220 + n, 210 + n};

	    //Erase
	    c.setColor (river);
	    c.fillRect (355, 198 + n, 75, 30);


	    //Fish Tail
	    c.setColor (tail);
	    c.fillPolygon (tailX, tailY, 5);

	    //Fish Body
	    c.setColor (body);
	    c.fillOval (370, 200 + n, 50, 25);

	    //Fish Head
	    c.setColor (head);
	    c.fillArc (390, 200 + n, 35, 25, 90, -180);

	    //Fish Gills
	    c.setColor (gills);
	    c.drawArc (390, 210 + n, 7, 7, 90, -180);
	    c.drawArc (385, 206 + n, 7, 7, 90, -180);
	    c.drawArc (385, 214 + n, 7, 7, 90, -180);

	    //Fish Face
	    c.setColor (fishFace);
	    c.fillArc (413, 211 + n, 10, 10, 180, 180);
	    c.fillOval (413, 206 + n, 5, 5);

	    //Slows down the animation
	    try
	    {
		Thread.sleep (50);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public SwimmingFish (Console con)
    {
	c = con;
    }


    public void run ()
    {
	swimmingFish ();
    }
} // SwimmingFish class


