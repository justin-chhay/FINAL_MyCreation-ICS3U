// Name: Justin Chhay
// Teacher: Mr. Afsari-Nejad
// Date: October 16, 2019
// Description: This class contains all the animation code for the lumberjack.

// The "Lumberjack" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; //Allows access to Thread class

public class Lumberjack extends Thread
{
    private Console c;           // The output console

    //Animates lumberjack with an axe walking
    public void lumberjack ()
    {
	// Number of Colours Used In This Class: 12

	Color grass = new Color (102, 153, 0);       //Local colour var - Grass
	Color skin = new Color (255, 204, 153);      //Local colour var - Skin
	Color skinD = new Color (255, 179, 102);     //Local colour var - Skin (Darker Shade)
	Color eyes = new Color (255, 255, 255);      //Local colour var - Eyes
	Color facialDetail = new Color (0, 0, 0);    //Local colour var - Pupils and Mouth
	Color hat = new Color (149, 114, 136);       //Local colour var - Hat
	Color hatLeaf = new Color (255, 0, 0);       //Local colour var - Maple Leaf Design (for hat)
	Color shirt = new Color (128, 0, 0);         //Local colour var - Shirt
	Color jeans = new Color (0, 102, 255);       //Local colour var - Jeans
	Color shoes = new Color (153, 115, 0);       //Local colour var - Shoes
	Color axeHandle = new Color (223, 191, 159); //Local colour var - Axe Handle
	Color axeBlade = new Color (153, 153, 153);  //Local colour var - Axe Blade

	//For Loop used to animate lumberjack walking towards tree
	for (int n = 0 ; n < 116 ; n++)
	{

	    //Erase
	    c.setColor (grass);
	    c.fillRect (10 + n, 268, 100, 195);


	    // Body of Lumberjack
	    c.setColor (shirt);
	    c.fillRect (30 + n, 335, 40, 65);

	    // Legs of Lumberjack
	    c.setColor (jeans);
	    c.fillRect (38 + n, 400, 25, 40);

	    // Shoes of Lumberjack
	    c.setColor (shoes);
	    c.fillRoundRect (35 + n, 440, 50, 20, 10, 10);

	    // Neck of Lumberjack
	    c.setColor (skinD);
	    c.fillRect (40 + n, 315, 20, 20);

	    // Head of Lumberjack
	    c.setColor (skin);
	    c.fillOval (28 + n, 275, 47, 50);

	    // Face of Lumberjack
	    c.setColor (eyes);
	    c.fillOval (40 + n, 297, 12, 8);
	    c.fillOval (57 + n, 297, 12, 8);
	    c.setColor (facialDetail);
	    c.fillOval (44 + n, 297, 7, 7);
	    c.fillOval (61 + n, 297, 7, 7);
	    c.setColor (Color.red);
	    c.fillArc (45 + n, 305, 15, 15, 180, 180);

	    // Hat of Lumberjack
	    c.setColor (hat);
	    c.fillRect (20 + n, 270, 15, 50);
	    c.fillRect (20 + n, 270, 55, 20);
	    c.setColor (hatLeaf);
	    c.fillMapleLeaf (45 + n, 270, 20, 17);
	    c.setColor (Color.black);
	    c.drawMapleLeaf (45 + n, 270, 20, 17);

	    // Axe
	    c.setColor (axeBlade);
	    c.fillRect (100 + n, 280, 50, 30);
	    c.setColor (axeHandle);
	    c.fillRoundRect (100 + n, 280, 10, 75, 10, 10);

	    // Arm of Lumberjack
	    c.setColor (skin);
	    c.fillRoundRect (45 + n, 345, 75, 20, 20, 20);

	    //Slows down the animation
	    try
	    {
		Thread.sleep (40);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Lumberjack (Console con)
    {
	c = con;
    }


    public void run ()
    {
	lumberjack ();
    }
} // Lumberjack class
