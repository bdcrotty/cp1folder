import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Arc2D.*;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        
    g2.setColor(new Color(195, 0, 60)); 
// This is setting the color to an RGB color scheme that defines the LG logo

        Ellipse2D.Double circle = new Ellipse2D.Double(50, 50, 430, 420);
        g2.fill(circle);
        Ellipse2D.Double c2 = new Ellipse2D.Double(25, 25, 480, 470);
        g2.fill(c2); 
// This code is creating and defining the two circles in the logo
    g2.setColor(Color.white); 
// This code changes the rest of the shapes below to a white color.
    
    
        g2.setStroke(new BasicStroke(15)); 
// This is changing the thickness of the lines below
        g2.drawArc(65, 60, 400, 400, 90, 180);
        // x y width height startangle arc angle 
//This is the creation of the neccesary Arcs
        g2.drawArc(65, 60, 400, 400, 0, -90);
        g2.setStroke(new BasicStroke(1)); 
// This is resetting the thickness
        Rectangle box = new Rectangle(342, 250, 130, 15); 
// This is the creation of the rectangles necessary to build the L and the G
        g2.draw(box); 
        g2.fill(box);
        Rectangle l1 = new Rectangle(250, 150, 15, 200); 
        g2.draw(l1); 
        g2.fill(l1);
        Rectangle l2 = new Rectangle(250, 350, 70, 15); 
        g2.draw(l2); 
        g2.fill(l2);
         Ellipse2D.Double c1 = new Ellipse2D.Double(150, 150, 60, 60); 
// This is creating  and overlapping circle to make the logo feel more authentic
        g2.fill(c1);
        


        
    // comment this out once you have finished
        //drawGrid(g2);
    }
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < 1000; y += 50){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
        }
    }
}