
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class Shapes extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g; // Importing Graphics 2d

		Rectangle box = new Rectangle(5, 10, 50, 30); // creating a rectangle at x15 y10 with width 50 and height 30.
		g2.draw(box); // Going to actually draw the box.

		g2.setColor(Color.blue); // This will set the fill color to blue.

		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200); // Sets the location and dimensions of a new circle
		g2.fill(circle); // Fills the circle with the  set color, in this case blue

	}
}
