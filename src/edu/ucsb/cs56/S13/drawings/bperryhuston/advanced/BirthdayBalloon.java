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

        double ball_height = 0.25 * height;
        double present_height = 0.5 * ball_height;
        double present_width = 0.5 * width;
	
	//make the present shape to add
        Rectangle2D.Double present_outside =
	        new Rectangle2D.Double(x + (.25 * width), y + (0.25* ball_height), present_width, present_height);
        Rectangle2D.Double present_stripe_vert =
	        new Rectangle2D.Double(x + (.25 * width) + .4*present_width, y + (0.25* ball_height), 0.2*
                                   present_width, present_height);
        Rectangle2D.Double present_stripe_horiz =
	        new Rectangle2D.Double(x + (.25 * width), y + (0.25* ball_height) + (0.4*present_height),
                                   present_width, 0.2*present_height);
        
        
        
	
	// add the message to the balloon
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

       GeneralPath wholeBalloon = this.get();
       wholeBalloon.append(present_outside, false);
       wholeBalloon.append(present_stripe_vert, false);
       wholeBalloon.append(present_stripe_horiz, false);
        
    }

}

