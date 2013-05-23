package edu.ucsb.cs56.S13.drawings.bperryhuston.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;
/**
   A BirthdayBalloon
      
   @author Bronwyn Perry-Huston
   @version for CS56, S13, UCSB
   
*/
public class BirthdayBalloon extends Balloon implements Shape
{
    /**
     * Constructor for objects of class BirthdayBalloon
     */
    public BirthdayBalloon(double x, double y, double width, double height)
    {
	// construct the basic balloon shell
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	//make the text to add

	
	// add the message to the balloon
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

        GeneralPath wholeBalloon = this.get();
        wholeBalloon.append(message, false);
        
    }

}

