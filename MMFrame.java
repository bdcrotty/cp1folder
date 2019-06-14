import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class MMFrame extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;


		g2.setColor(Color.black);

		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200);
		g2.fill(circle);

		g2.setColor(Color.black);

		Ellipse2D.Double c1 = new Ellipse2D.Double(50, 50, 100, 100);
		g2.fill(c1);

		g2.setColor(Color.black);

		Ellipse2D.Double c2 = new Ellipse2D.Double(250, 50, 100, 100);
		g2.fill(c2);

	}
}