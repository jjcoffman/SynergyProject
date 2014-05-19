import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.*;

import java.awt.*;

//this Class creates the Welcome screen for Login by the users
public class NewUser extends JFrame implements ActionListener
{
	
	private static final long serialVersionUID = 1L;
	private JFrame Edit;
	private JButton btnExit;
	private JButton btnSubmit;
	private SigPane pane;
	private JTextField txtUserID;
	private JTextField txtUserName;
	private JTextField txtPassword;
	private String userName;
	private String userID;
	private String userPassword;
	private BufferedImage image;
	private JTextField textFName;
	private JTextField textLName;
	private MyTableModel table;
	private JCheckBox chckbxUserHasAdminstrative;
	
	TempSetInfo set = new TempSetInfo();
	TempRetrieveInfo test3 = new TempRetrieveInfo();

	public NewUser(MyTableModel passedTable)
	{
		table = passedTable;
		Edit = new JFrame("Edit User");
		Edit.setTitle("Create New User");
		Edit.setSize(700, 400);
		Edit.setPreferredSize(new Dimension(700, 400));
		Edit.setLocationRelativeTo(null);
		Edit.setDefaultCloseOperation(Edit.DISPOSE_ON_CLOSE);
		Edit.getContentPane().setLayout(null);
		JLabel lab = new JLabel("UserName:");
		lab.setHorizontalAlignment(SwingConstants.RIGHT);
		lab.setFont(new Font("Verdana", Font.PLAIN, 13));
		lab.setBounds(20, 50, 130, 28);
		Edit.getContentPane().add(lab);
		
		pane = new SigPane();
		pane.setBounds(20, 160, 400, 200);
		pane.setPreferredSize(new Dimension(400,300));
		Edit.getContentPane().add(pane);
		
		JLabel lblUsersId = new JLabel("User ID#:");
		lblUsersId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsersId.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblUsersId.setBounds(20, 20, 130, 28);
		Edit.getContentPane().add(lblUsersId);
		
		JLabel lblUsersPassword = new JLabel("Password:");
		lblUsersPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsersPassword.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblUsersPassword.setBounds(20, 80, 130, 28);
		Edit.getContentPane().add(lblUsersPassword);
		
		txtUserID = new JTextField();
		txtUserID.setBounds(150, 20, 140, 28);
		Edit.getContentPane().add(txtUserID);
		txtUserID.setColumns(10);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(150, 50, 140, 28);
		Edit.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(150, 80, 140, 28);
		Edit.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnClear.setBounds(440, 330, 120, 29);
		btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                pane.clearSignatures();
            }
        });
		Edit.getContentPane().add(btnClear);
		
		chckbxUserHasAdminstrative = new JCheckBox("User has Adminstrative Access");
		chckbxUserHasAdminstrative.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxUserHasAdminstrative.setBounds(350, 80, 242, 23);
		Edit.getContentPane().add(chckbxUserHasAdminstrative);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnSubmit.setBounds(570, 330, 120, 29);
		btnSubmit.addActionListener(this);
		Edit.getContentPane().add(btnSubmit);
		
		JLabel lblSignaturePanel = new JLabel("Signature Panel");
		lblSignaturePanel.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblSignaturePanel.setBounds(160, 135, 109, 16);
		Edit.getContentPane().add(lblSignaturePanel);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblFirstName.setBounds(290, 20, 130, 28);
		Edit.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblLastName.setBounds(290, 50, 130, 28);
		Edit.getContentPane().add(lblLastName);
		
		textFName = new JTextField();
		textFName.setColumns(10);
		textFName.setBounds(420, 20, 140, 28);
		Edit.getContentPane().add(textFName);
		
		textLName = new JTextField();
		textLName.setColumns(10);
		textLName.setBounds(420, 50, 140, 28);
		Edit.getContentPane().add(textLName);
		Edit.pack();
		Edit.setVisible(true);
		

		
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnSubmit)
		{
			Object[] data = new Object[6];
			data[0] = Integer.parseInt(txtUserID.getText());
			data[1] = txtUserName.getText();
			data[2] = txtPassword.getText();
			data[3] = textFName.getText();
			data[4] = textLName.getText();
			if (chckbxUserHasAdminstrative.isSelected()){
				data[5] = 1;
			}
			else {
				data[5] = 0;
			}
			
			set.newUser(data);
			Object[][] data2 = getUsers();
			table.update(data2);
			Edit.dispose();
	
		}
		else if(e.getSource()==btnExit)
		{
			System.exit(0);
		}
	}
	
	private Object[][] getUsers()
	{
		//Object[][] data = {{12342,"users1", "Clint Eastwood", "no"}};
		//return data;
		try {
			int size = test3.getSize("USERS");
		
		Object[][] data = new Object[size][4];
		for (int i = 1; i <= size; i++){
			data[i-1] = test3.getUSERSRows(i - 1, 1);
		}
		System.out.println("rows in USERS: " + test3.getSize("USERS"));
		return data;
		}
		catch(NullPointerException e) {
			System.out.println("No database connected!");
			Object[][] data = {{"No", "data", "base", "Connected"}};
			return data;
		}
	}
	
	public void getImage()
	{
		image = pane.getImage();
	}
	
	
	
	//TODO add get and setters from the SQL of users
	

}
