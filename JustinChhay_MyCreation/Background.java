// Name: Justin Chhay
// Teacher: Mr. Afsari-Nejad
// Date: October 16, 2019
// Description: Background java class file.
//              This is NOT a thread, since it is still. This class draw the background scenery onto the console window.

// The "Background" class.
import java.awt.*;
import hsa.Console;

public class Background
{
    private Console c;           // The output console

    //class to draw background onto console window
    public void draw ()
    {
	// Number of Colours in this class: 9

	Color sky = new Color (153, 204, 255);         //Local colour var - Sky
	Color grass = new Color (102, 153, 0);         //Local colour var - Grass
	Color sun = new Color (255, 204, 0);           //Local colour var - Sun
	Color river = new Color (0, 102, 153);         //Local colour var - River
	Color brush = new Color (0, 102, 0);           //Local colour var - Leaves and Bush
	Color berry = new Color (153, 0, 0);           //Local colour var - Berries on Bush
	Color trunk = new Color (153, 102, 51);        //Local colour var - Trunk
	Color innerTrunk = new Color (210, 166, 121);  //Local colour var - Inner Trunk
	Color name = new Color (102, 255, 0);          //Local colour var - Name


	// For Loop - Draws Sky and Grass
	for (int n = 0 ; n < 640 ; n++)
	{
	    c.setColor (sky);
	    c.drawRect (0, 0, n, 180);
	    c.setColor (grass);
	    c.drawRect (0, 180, n, 320);
	}

	// For Loop - Draws Sun
	for (int n = 0 ; n < 50 ; n++)
	{
	    c.setColor (sun);
	    c.drawOval (450 + n, 20 + n, 100 - 2 * n, 100 - 2 * n);
	}

	// For Loop - Draws River
	for (int n = 0 ; n < 105 ; n++)
	{
	    c.setColor (river);
	    c.drawLine (325 + n, 180, 375 + n, 500);
	}

	// For Loop - Draws Part of River (adds shape to river)
	for (int n = 0 ; n < 180 ; n++)
	{
	    c.setColor (river);
	    c.drawRect (290, 180, n, 25);
	}

	// For Loop - Draws Bush (Main Body)
	for (int n = 0 ; n < 90 ; n++)
	{
	    c.setColor (brush);
	    c.drawRect (550, 170, n, 60);
	}

	// For Loop - Draws Bush (Curves of Bush Edge)
	for (int n = 0 ; n < 25 ; n++)
	{
	    c.setColor (brush);
	    c.drawOval (540 + n, 150 + n, 50 - 2 * n, 50 - 2 * n);
	    c.drawOval (560 + n, 145 + n, 50 - 2 * n, 50 - 2 * n);
	    c.drawOval (580 + n, 142 + n, 50 - 2 * n, 50 - 2 * n);
	    c.drawOval (600 + n, 140 + n, 50 - 2 * n, 50 - 2 * n);
	    c.drawOval (620 + n, 143 + n, 50 - 2 * n, 50 - 2 * n);
	    c.drawOval (530 + n, 160 + n, 50 - 2 * n, 50 - 2 * n);
	    c.drawOval (520 + n, 170 + n, 50 - 2 * n, 50 - 2 * n);
	    c.drawOval (525 + n, 180 + n, 50 - 2 * n, 50 - 2 * n);
	}

	// For Loop - Draws Bush (Curves Underneath Bush)
	for (int n = 0 ; n < 25 ; n++)
	{
	    c.setColor (brush);
	    c.drawOval (540 + n, 220 + n, 30 - 2 * n, 15 - 2 * n);
	    c.drawOval (560 + n, 221 + n, 30 - 2 * n, 15 - 2 * n);
	    c.drawOval (580 + n, 221 + n, 30 - 2 * n, 15 - 2 * n);
	    c.drawOval (600 + n, 221 + n, 30 - 2 * n, 15 - 2 * n);
	    c.drawOval (620 + n, 220 + n, 30 - 2 * n, 15 - 2 * n);
	}

	// For Loop - Draws Berries on Bush
	for (int n = 0 ; n < 100 ; n++)
	{
	    c.setColor (berry);
	    c.drawOval (535 + n, 188 + n, 10 - 2 * n, 10 - 2 * n);
	    c.drawOval (560 + n, 205 + n, 10 - 2 * n, 10 - 2 * n);
	    c.drawOval (564 + n, 177 + n, 10 - 2 * n, 10 - 2 * n);
	    c.drawOval (585 + n, 163 + n, 10 - 2 * n, 10 - 2 * n);
	    c.drawOval (592 + n, 190 + n, 10 - 2 * n, 10 - 2 * n);
	    c.drawOval (613 + n, 208 + n, 10 - 2 * n, 10 - 2 * n);
	    c.drawOval (620 + n, 162 + n, 10 - 2 * n, 10 - 2 * n);
	}

	// For Loop - Draws Bigger Berries on Bush
	for (int n = 0 ; n < 100 ; n++)
	{
	    c.setColor (berry);
	    c.drawOval (545 + n, 188 + n, 15 - 2 * n, 15 - 2 * n);
	    c.drawOval (570 + n, 205 + n, 15 - 2 * n, 15 - 2 * n);
	}

	// For Loop - Draws Trunk (Standing Up)
	for (int n = 0 ; n < 40 ; n++)
	{
	    c.setColor (trunk);
	    c.drawArc (50, 235 - n, 39, 15, 0, -180);
	    c.drawArc (130, 230 - n, 39, 15, 0, -180);
	}

	// For Loop - Draws Trunk (Standing Up, Cut Inner Trunk)
	for (int n = 0 ; n < 20 ; n++)
	{
	    // Inside of Tree (Phloem)
	    c.setColor (innerTrunk);
	    c.drawOval (130 + n, 190 + n, 39 - 2 * n, 15 - 2 * n);
	}

	// For Loop - Draws Trunk (Standing Up, Cut Inner Trunk, Detailing)
	for (int n = 0 ; n < 1 ; n++)
	{
	    // Rings of Cut Tree
	    c.setColor (trunk);
	    c.drawOval (132, 192, 35 - n, 10 - n);
	    c.drawOval (137, 196, 26 - n, 3 - n);
	}


	// For Loop - Draws Trunk (Fallen)
	for (int n = 0 ; n < 100 ; n++)
	{
	    c.setColor (trunk);
	    c.drawArc (190 + n, 220, 10, 40, 0, 360);
	}

	// For Loop - Draws Leaves (Standing Up, Tree)
	for (int n = 0 ; n < 45 ; n++)
	{
	    c.setColor (brush);
	    c.drawLine (25 + n, 215 - n, 114 - n, 215 - n);
	    c.drawLine (25 + n, 190 - n, 114 - n, 190 - n);
	    c.drawLine (25 + n, 165 - n, 114 - n, 165 - n);
	}

	//Name
	c.setFont(new Font("TimesRoman", Font.BOLD|Font.ITALIC, 20));
	c.setColor (name);
	c.drawString ("Justin Chhay", 15, 480);
    }


    public Background (Console con)
    {
	c = con;
	draw ();
    }
} // Background class
