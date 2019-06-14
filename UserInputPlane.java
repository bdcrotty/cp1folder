
import javax.swing.JOptionPane;

public class UserInputPlane{
	public static void main(String[] args){
		
		String firstName = JOptionPane.showInputDialog("First Name");
		String lastName = JOptionPane.showInputDialog("Last Name");
		
		JOptionPane.showMessageDialog(null, firstName + " " + lastName);
		
	}
}
