/* Name: Justin Chhay
   Teacher: Mr. Afsari-Nejad
   Date: October 16, 2019
   Description: This MyCreation class executes all classes and
		threads inside of the JustinChhay_MyCreation folder.
   Storyline: This animation is called "Camping Outdoors." Here we can see typical interactions between various
	      species found in the woods. As the clouds are movng across the blue sky, there is a lumberjack
	      who has cut down a tree. Further behind, there is a bug crawling along the side of a fallen tree.
	      Furthermore, we can see a bear waiting to grab its prey; A lone salmon, as it swims down the river.
		~ This animation was chosen from the Environment category ~
*/

// The "JustinChhay_MyCreation" class.
import java.awt.*;
import hsa.Console;

public class JustinChhay_MyCreation
{
    Console c;  //The output console

    // Background Method - Adds Background class to JustinChhay_MyCreation
    public void Background ()
    {
	Background b = new Background (c);
    }


    // MovingCloud Method - Adds MovingCloud class to JustinChhay_MyCreation
    public void MovingCloud ()
    {
	// Colours to be passed into the cloud constructors
	Color orange = new Color (255, 127, 80);
	Color yellow = new Color (255, 255, 51);

	//COMMENT OUT ANY OF THE OVERLOADED METHODS TO TEST!
	
	// Creates the moving cloud thread (default method)
	MovingCloud mc = new MovingCloud (c);          
	// Starts the thread
	mc.start (); 

	// Creates the moving cloud thread w/ added parameters
	//MovingCloud mc1 = new MovingCloud (c, orange, -80);
	// Starts the thread
	//mc1.start ();

	// Creates the moving cloud thread w/ more added parameters
	//MovingCloud mc2 = new MovingCloud (c, yellow, 50, 15);
	// Starts the thread
	//mc2.start ();

    }


    // Lumberjack Method - Adds Lumberjack class to JustinChhay_MyCreation
    public void Lumberjack ()
    {
	//Creates the thread
	Lumberjack lJ = new Lumberjack (c);
	//Starts the thread
	lJ.start ();
    }


    // FallingTree Method - Adds FallingTree class to JustinChhay_MyCreation
    public void FallingTree ()
    {
	//Creates the thread
	FallingTree fT = new FallingTree (c);
	//Starts the thread
	fT.start ();
    }


    // CrawlingBug Method - Adds CrawlingBug class to JustinChhay_MyCreation
    public void CrawlingBug ()
    {
	//Creates the thread
	CrawlingBug cB = new CrawlingBug (c);
	//Starts the thread
	cB.start ();
    }


    // SwimmingFish Method - Adds SwimmingFish class to JustinChhay_MyCreation
    public void SwimmingFish ()
    {
	//Creates the thread
	SwimmingFish sF = new SwimmingFish (c);
	//Starts the thread
	sF.start ();
	
	// Joins with bear thread so that it only executes when swimmingFish thread
	try
	{
	    sF.join ();
	}
	catch (InterruptedException e)
	{
	}
	
    }


    // Bear Method - Adds Bear class to JustinChhay_MyCreation
    public void Bear ()
    {
	//Creates the thread
	Bear w = new Bear (c);
	//Starts the thread
	w.run ();
    }


    // Creates new window and title for window
    public JustinChhay_MyCreation ()
    {
	c = new Console ("Camping Outdoors - Environment");
    }


    // Main Method - Executes methods accordingly
    public static void main (String[] args)
    {
	JustinChhay_MyCreation m = new JustinChhay_MyCreation ();
	m.Background ();
	m.MovingCloud ();
	m.Lumberjack ();
	m.FallingTree ();
	m.CrawlingBug ();
	m.SwimmingFish ();
	m.Bear ();
    }
} // JustinChhay_MyCreation class

