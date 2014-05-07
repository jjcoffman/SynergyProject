import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

//this Class creates the Welcome screen for Login by the users
public class LoginScreen extends JFrame implements ActionListener
{
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnLogin;
	private JFrame WelcomeScreen;
	private JButton btnExit;
	

	public LoginScreen()
	{
		WelcomeScreen = new JFrame("West Slope Recovery");
		WelcomeScreen.setSize(700, 400);
		WelcomeScreen.getContentPane().setLayout(null);
		WelcomeScreen.setLocationRelativeTo(null);
		WelcomeScreen.setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		textField = new JTextField();
		textField.setBounds(472, 137, 134, 28);
		WelcomeScreen.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(400, 179, 63, 16);
		WelcomeScreen.getContentPane().add(lblPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(435, 231, 79, 29);
		btnLogin.addActionListener(this);
		WelcomeScreen.getContentPane().add(btnLogin);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(531, 231, 75, 29);
		btnExit.addActionListener(this);
		WelcomeScreen.getContentPane().add(btnExit);
		
		textField_1 = new JTextField();
		textField_1.setBounds(472, 173, 134, 28);
		WelcomeScreen.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(400, 143, 66, 16);
		WelcomeScreen.getContentPane().add(lblUsername);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIconTextGap(0);
		lblNewLabel.setFocusTraversalKeysEnabled(false);
		lblNewLabel.setFocusable(false);
		lblNewLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblNewLabel.setRequestFocusEnabled(false);
		lblNewLabel.setIcon(new ImageIcon("img/westSlopeImage.jpg"));
		lblNewLabel.setBounds(40, 75, 319, 198);
		WelcomeScreen.getContentPane().add(lblNewLabel);
		
		WelcomeScreen.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnLogin)
		{
			WelcomeScreen.dispose();
			new Frame();
	
		}
		else if(e.getSource()==btnExit)
		{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new LoginScreen();
			}
		});
		
	}
}
