
import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo");  // Creating an object which is the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // When  exiting the frame, the  program stops.
		frame.setSize(400, 400); // This sets the size of the frame to the desired dimensions.
		
		Shapes r = new Shapes(); // Creating the shapes object
		frame.add(r); // Naming the shape as r and adding the shape

		frame.setVisible(true);  // To put make the shape appear visible on the frame.
	}
}
