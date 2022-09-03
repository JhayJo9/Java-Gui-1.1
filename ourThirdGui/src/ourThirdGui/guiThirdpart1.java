package ourThirdGui;
import javax.swing.JOptionPane;

public class guiThirdpart1 {
	public static void main (String [] args) {
		
		do {
			
			String name = JOptionPane.showInputDialog("Enter your name: ");
			JOptionPane.showMessageDialog(null, "Hello " + name);
			
			int age = Integer.parseInt(JOptionPane.showInputDialog("How old are your? "));
			JOptionPane.showMessageDialog(null, "so you are " +age+ " years old");
			
			
			String place = JOptionPane.showInputDialog("What is your address? ");
			JOptionPane.showMessageDialog(null, "You live in " + place);
			if(place.equalsIgnoreCase("cavite")) {
				JOptionPane.showMessageDialog(null, "Hello Again");
			}
			
			String birthDate = JOptionPane.showInputDialog("when is your birthday? ");
			JOptionPane.showMessageDialog(null, "ok");
			if(birthDate.equalsIgnoreCase("")) {
				JOptionPane.showMessageDialog(null, "Hello Again");
			}
			
			String course = JOptionPane.showInputDialog("What course did you take in college? ");
			if(course.equalsIgnoreCase("BSIT")) {
				JOptionPane.showMessageDialog(null, " so you like programing");
			}
			
			String ask1 = JOptionPane.showInputDialog("[yes/no]");
			if(ask1.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "ok so what programing langueges did you know? ");
			}
            if(ask1.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "ok");
			}
			   
			String answer1 = JOptionPane.showInputDialog("Enter the programing langueges");
			   JOptionPane.showMessageDialog(null, answer1 + "ow I know that languege as well");
			
			
			if(course.equalsIgnoreCase("crim")) {
				JOptionPane.showMessageDialog(null, "Hello Again");
			}
					
		    
			
			
			
			
			
			
			
		}while(true);
	    
		
		
		
		
		
		
		
		
		
	}
} 
