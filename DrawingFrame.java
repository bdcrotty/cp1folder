import javax.swing.JFrame;

public class DrawingFrame
{
    public static void main(String[] args){
// This allows the running of the Program
	
	
        JFrame frame = new JFrame("Frame for Picture");
        frame.setSize(600, 600);
//This sets the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//This allows the program to stop when the Frame is closed
        
        DrawingPicture picture = new DrawingPicture();
        frame.add(picture);
        
        frame.setVisible(true);
//This allows the Frame to be visible and the picture created. 
    }
}