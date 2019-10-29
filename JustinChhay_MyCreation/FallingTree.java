// Name: Justin Chhay
// Teacher: Mr. Afsari-Nejad
// Date: October 16, 2019
// Description: This class contains the animation code for the falling tree.

// The "FallingTree" class.
import java.awt.*;
import hsa.Console;
import java.lang.*; //Allows access to Thread class

public class FallingTree extends Thread
{
    private Console c;           // The output console

    //Animated tree falling down (being cut by lumberjack's axe)
    public void fallingTree ()
    {
	// Total Colours Used In This Class: 3

	Color grass = new Color (102, 153, 0); //Local colour var - Grass
	Color brush = new Color (0, 102, 0); //Local colour var - Leaves and Bush
	Color trunk = new Color (153, 102, 51); //Local colour var - Trunk

	//For Loop used to animate tree falling
	for (int n = 0 ; n < 200 ; n++)
	{
	    //Int Array Variables for Tree (Polygon)
	    int treeX[] = {245, 290, 200};
	    int treeY[] = {300 + n, 420 + n, 420 + n};

	    //Erase
	    c.setColor (grass);
	    c.fillRect (200, 299 + n, 90, 200);


	    //Tree
	    c.setColor (trunk);
	    c.fillArc (220, 450 + n, 50, 15, 180, 180);
	    c.setColor (trunk);
	    c.fillRect (220, 420 + n, 50, 40);
	    c.setColor (brush);
	    c.fillPolygon (treeX, treeY, 3);

	    //Slows down the animation
	    try
	    {
		Thread.sleep (38);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public FallingTree (Console con)
    {
	c = con;
    }


    public void run ()
    {
	fallingTree ();
    }
} // FallingTree class
