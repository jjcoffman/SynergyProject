import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.*;

import java.awt.*;

//this Class creates the Welcome screen for Login by the users
public class EditUser extends JFrame implements ActionListener
{
	
	private static final long serialVersionUID = 1L;
	private JButton btnLogin;
	private JFrame Edit;
	private JButton btnExit;
	private SigPane pane;
	private JTextField txtName;
	private JTextField txtUserID;
	private JTextField txtPassword;
	private String userName;
	private String userID;
	private String userPassword;
	private BufferedImage image;
	

	public EditUser()
	{
		Edit = new JFrame("Edit User");
		Edit.setSize(700, 400);
		Edit.setPreferredSize(new Dimension(700, 400));
		Edit.setLocationRelativeTo(null);
		Edit.setDefaultCloseOperation(Edit.DISPOSE_ON_CLOSE);
		Edit.getContentPane().setLayout(null);
		JLabel lab = new JLabel("Users Name:");
		lab.setHorizontalAlignment(SwingConstants.RIGHT);
		lab.setFont(new Font("Verdana", Font.PLAIN, 13));
		lab.setBounds(6, 38, 130, 16);
		Edit.getContentPane().add(lab);
		
		pane = new SigPane();
		pane.setBounds(16, 152, 400, 200);
		pane.setPreferredSize(new Dimension(400,300));
		Edit.getContentPane().add(pane);
		
		JLabel lblUsersId = new JLabel("Users ID:");
		lblUsersId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsersId.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblUsersId.setBounds(6, 66, 130, 16);
		Edit.getContentPane().add(lblUsersId);
		
		JLabel lblUsersPassword = new JLabel("Users Password:");
		lblUsersPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsersPassword.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblUsersPassword.setBounds(6, 94, 130, 16);
		Edit.getContentPane().add(lblUsersPassword);
		
		txtName = new JTextField();
		txtName.setBounds(148, 33, 134, 28);
		Edit.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtUserID = new JTextField();
		txtUserID.setBounds(148, 61, 134, 28);
		Edit.getContentPane().add(txtUserID);
		txtUserID.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(148, 89, 134, 28);
		Edit.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(428, 323, 117, 29);
		btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pane.clearSignatures();
            }
        });
		Edit.getContentPane().add(btnClear);
		
		JCheckBox chckbxUserHasAdminstrative = new JCheckBox("User has Adminstrative Access");
		chckbxUserHasAdminstrative.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxUserHasAdminstrative.setBounds(432, 152, 242, 23);
		Edit.getContentPane().add(chckbxUserHasAdminstrative);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(557, 323, 117, 29);
		Edit.getContentPane().add(btnSubmit);
		
		JLabel lblSignaturePanel = new JLabel("Signature Panel");
		lblSignaturePanel.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblSignaturePanel.setBounds(158, 135, 109, 16);
		Edit.getContentPane().add(lblSignaturePanel);
		Edit.pack();
		Edit.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnLogin)
		{
			Edit.dispose();
			new Frame();
	
		}
		else if(e.getSource()==btnExit)
		{
			System.exit(0);
		}
	}
	
	public void getImage()
	{
		image = pane.getImage();
	}
	
	
	
	//TODO add get and setters from the SQL of users
	

}
