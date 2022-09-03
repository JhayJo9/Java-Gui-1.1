package ourFirstGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ourSecondGui implements ActionListener {
	
	private static JLabel userLabel;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JTextField userText;
	private static JButton button;
	private static JLabel success;
	public static void main (String [] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new ourSecondGui());
		panel.add(button);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Hello, World");
		String  user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user +", " + password);
		
		if(user.equals("Jhay") && password.equals("Jhay12345")) {
			success.setText("Login Successful");
		}
		if(user.equals("Joey") && password.equals("Joey12345")) {
			success.setText("Login Successful");
		}
	}
}
