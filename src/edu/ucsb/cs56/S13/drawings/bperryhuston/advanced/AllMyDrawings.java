package edu.ucsb.cs56.S13.drawings.bperryhuston.advanced;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;  // single lines
import java.awt.geom.Ellipse2D;  // ellipses and circles
import java.awt.geom.Rectangle2D; // for the bounding box
import java.awt.Rectangle;  // squares and rectangles
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;


import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Bronwyn Perry-Huston 
 * @version for CS56, lab05, Spring 13
 */


public class AllMyDrawings
{
    /** Draw a picture with a few balloons 
     */

    public static void drawPicture1(Graphics2D g2) {

	Balloon b1 = new Balloon(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(b1);

    BirthdayBalloon bb = new BirthdayBalloon(400,50,200,700);
    g2.setColor(Color.CYAN); g2.draw(bb);
	
	// Make a black balloon that's half the size, 
	// and moved over 150 pixels in x direction

	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Here's a balloon that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	// Draw two birthday balloons
	
	BirthdayBalloon bb1 = new BirthdayBalloon(50,350,40,75);
	BirthdayBalloon bb2 = new BirthdayBalloon(200,350,200,100);
	
	g2.draw(bb1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(bb2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few balloons by Bronwyn Perry-Huston", 20,20);
    }


    /** Draw a picture with a few balloons and birthday balloons
     */
    public static void drawPicture2(Graphics2D g2) {

	// Draw some balloons
	
	Balloon large = new Balloon(100,50,200,900);
	Balloon smallball = new Balloon(20,50,10,60);
	Balloon tallSkinny = new Balloon(20,150,20,150);
	Balloon shortFat = new Balloon(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallball);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Balloon b1 = new Balloon(100,250,50,175);
	g2.setColor(Color.CYAN); g2.draw(b1);
	
	// Make a black balloon that's half the size, 
	// and moved over 150 pixels in x direction
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Here's a balloon that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	// Draw two houses with Windows
	
	BirthdayBalloon bb1 = new BirthdayBalloon(50, 50,20,90);
	BirthdayBalloon bb2 = new BirthdayBalloon(200, 50,100,500);
	
	g2.draw(bb1);
	g2.setColor(new Color(0x8F00FF)); 

	// Rotate the second house 45 degrees around its center.
	Shape bb3 = ShapeTransforms.rotatedCopyOf(bb2, Math.PI/4.0);

	g2.draw(bb3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of balllons and birthday balloons by Bronwyn Perry-Huston", 20,20);
    }
  
    /** Draw a different picture with a few balloons
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Balloons by Bronwyn Perry-Huston", 20,20);

	
	// Draw some coffee cups.
	
       Balloon large = new Balloon(100,100,100,500);
       BirthdayBalloon bday = new BirthdayBalloon(10,10, 100,600);
       BirthdayBalloon bday2 = new BirthdayBalloon(400,10, 300,100);
       
       g2.setColor(Color.RED);     g2.draw(large);
       g2.setColor(Color.GREEN);   g2.draw(bday);
       g2.setColor(Color.GREEN);   g2.draw(bday2);
       
       
    }
    

}
