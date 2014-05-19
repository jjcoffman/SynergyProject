import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

import java.awt.*;

//this Class creates the Welcome screen for Login by the users
public class LoginScreen extends JFrame implements ActionListener
{
	
	private static final long serialVersionUID = 1L;
	private JTextField uName;
	private JTextField pWord;
	private JButton btnLogin;
	private JFrame WelcomeScreen;
	private JButton btnExit;
	
	TempRetrieveInfo get = new TempRetrieveInfo();
	private JLabel lblNewLabel_1;

	public LoginScreen()
	{
		WelcomeScreen = new JFrame("West Slope Recovery");
		WelcomeScreen.setTitle("West Slope Recovery Client Manager");
		WelcomeScreen.setSize(700, 400);
		WelcomeScreen.getContentPane().setLayout(null);
		WelcomeScreen.setLocationRelativeTo(null);
		WelcomeScreen.setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		uName = new JTextField();
		uName.setBounds(490, 140, 150, 28);
		WelcomeScreen.getContentPane().add(uName);
		uName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPassword.setBounds(400, 180, 80, 28);
		WelcomeScreen.getContentPane().add(lblPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnLogin.setBounds(420, 240, 100, 29);
		btnLogin.addActionListener(this);
		WelcomeScreen.getContentPane().add(btnLogin);
		
		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnExit.setBounds(540, 240, 100, 29);
		btnExit.addActionListener(this);
		WelcomeScreen.getContentPane().add(btnExit);
		
		pWord = new JTextField();
		pWord.setBounds(490, 180, 150, 28);
		WelcomeScreen.getContentPane().add(pWord);
		pWord.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblUsername.setBounds(400, 140, 80, 28);
		WelcomeScreen.getContentPane().add(lblUsername);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIconTextGap(0);
		lblNewLabel.setFocusTraversalKeysEnabled(false);
		lblNewLabel.setFocusable(false);
		lblNewLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblNewLabel.setRequestFocusEnabled(false);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("westSlopeImage.jpg")));
		lblNewLabel.setBounds(40, 75, 319, 198);
		WelcomeScreen.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Invalid Username or Password!");
		lblNewLabel_1.setVisible(false);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(410, 220, 250, 16);
		WelcomeScreen.getContentPane().add(lblNewLabel_1);
		
		WelcomeScreen.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnLogin)
		{
			String user = uName.getText();
			String password = pWord.getText();
			int exists = get.userExists(user);
			int valid = 0;
			System.out.println("Exists: " + exists);
			if(exists == 0){
				lblNewLabel_1.setVisible(true);
			}
			else if (exists == 1){
				valid = get.matchUser(user, password);
				System.out.println("FOUND: " + valid);
			}
			if(valid == 1){
				WelcomeScreen.dispose();
				new Frame();
			}
	
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
