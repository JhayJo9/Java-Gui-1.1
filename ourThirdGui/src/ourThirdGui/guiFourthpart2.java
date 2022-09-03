package ourThirdGui;
import javax.swing.JOptionPane;
public class guiFourthpart2 {
	public static void main (String [] args) {
		
		do {
			String name = JOptionPane.showInputDialog("Enter your name");
			JOptionPane.showMessageDialog(null, "Hello " + name);
			
			String questions1 = JOptionPane.showInputDialog("What sre you trying to do? ");
			JOptionPane.showMessageDialog(null, "ahh okay " + name );
			
			String question2 = JOptionPane.showInputDialog("you like programming? [yes/no]");
			
			if(question2.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "oh so you like progamming");
			}
			else if(question2.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "then why wasting your time in here if you don't like programming?");
			}
			
		}while(true);
	}
}
