// Name: Justin Chhay
// Teacher: Mr. Afsari-Nejad
// Date: October 16, 2019
// Description: This class contains all the animation code for the moving clouds.

// The "MovingCloud" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; //Allows access to Thread Class

public class MovingCloud extends Thread
{
    private Console c;           // The output console
    private Color cloudColor;
    private int space;
    private int delay = 25;

    //Animates clouds moving to the right in the sky
    public void movingCloud ()
    {
	//loop used to animate the storm cloud
	for (int x = 0 ; x < 250 ; x++)
	{
	    Color sky = new Color (153, 204, 255); //Local colour var - Sky

	    //Erase
	    c.setColor (sky);
	    c.fillRect (-1 + space + x, 40, 150, 45);

	    //Cloud
	    c.setColor (cloudColor);
	    c.fillOval (0 + space + x, 50, 50, 35);
	    c.setColor (cloudColor);
	    c.fillOval (13 + space + x, 45, 50, 35);
	    c.setColor (cloudColor);
	    c.fillOval (25 + space + x, 50, 50, 35);
	    c.setColor (cloudColor);
	    c.fillOval (38 + space + x, 40, 50, 35);
	    c.setColor (cloudColor);
	    c.fillOval (50 + space + x, 50, 50, 35);
	    c.setColor (cloudColor);
	    c.fillOval (63 + space + x, 40, 50, 35);
	    c.setColor (cloudColor);
	    c.fillOval (75 + space + x, 50, 50, 35);
	    c.setColor (cloudColor);
	    c.fillOval (88 + space + x, 45, 50, 35);
	    c.setColor (cloudColor);
	    c.fillOval (100 + space + x, 50, 50, 35);
	    
	    //Slows down the animation
	    try
	    {
		Thread.sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    //Default overloaded method
    public MovingCloud (Console con)
    {
	c = con;
	cloudColor = new Color (245, 245, 245);
    }


    // Two more parameters, the color and the spacing
    public MovingCloud (Console con, Color x, int s)
    {
	c = con;
	cloudColor = x;
	space = s;
    }


    // Same as the second, but with an added delay parameter
    public MovingCloud (Console con, Color x, int s, int d)
    {
	c = con;
	cloudColor = x;
	space = s;
	delay = d;
    }


    public void run ()
    {
	movingCloud ();
    }
} // MovingCloud class
