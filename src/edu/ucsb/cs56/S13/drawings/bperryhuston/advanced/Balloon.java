package edu.ucsb.cs56.S13.drawings.bperryhuston.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Ellipse2D;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Balloon that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Bronwyn Perry-Huston
   @version for CS56, Spring 13, UCSB
   
*/
public class Balloon extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x  x coord of upper left corner of the Balloon
       @param y  y coord of upper left corner of the Balloon
       @param width width of the Balloon
       @param height height of the Balloon
     */
    public Balloon(double x, double y, double width, double height)
    {
    
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double balloon_height = 0.25 * height;
       
        
        // Make the balloon part
        Ellipse2D.Double ball =
            new Ellipse2D.Double(x, y, width, balloon_height);
        
                          
        // make the ribbon.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Line2D.Double ribbon =
            new Line2D.Double(x + width/2.0, y + balloon_height,
                              x + width/2.0, y + height);


        // put the whole Balloon together
       
        GeneralPath wholeBalloon = this.get();
        wholeBalloon.append(ball, false);
        wholeBalloon.append(ribbon, false);
        
        
    }

}
