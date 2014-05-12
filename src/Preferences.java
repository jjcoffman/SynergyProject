import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.SwingConstants;


//This class handles the preferences of changing the SQL Database Path in the event that it needs to be changed
public class Preferences 
{
	private JPanel prefPane;
	private JLabel lblSqlPath;
	private JTextField textField;
	private JButton btnSubmit;
	private JTextField txtUserName;
	private JTextField txtPassword;
	private JLabel lblUsername;
	private JLabel lblPassword;
	/**
	 * @wbp.parser.entryPoint
	 */
	public void buildPanel()
	{
		prefPane = new JPanel();
		prefPane.setSize(904,640);
		prefPane.setLayout(null);
		
		StyledDocument document = new DefaultStyledDocument();
		Style defaultStyle = document.getStyle(StyleContext.DEFAULT_STYLE);
		StyleConstants.setAlignment(defaultStyle, StyleConstants.ALIGN_CENTER);
		
		JTextPane txtpnThisPanelShould = new JTextPane(document);
		txtpnThisPanelShould.setPreferredSize(new Dimension(613, 125));
		txtpnThisPanelShould.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		txtpnThisPanelShould.setSelectionColor(Color.DARK_GRAY);
		txtpnThisPanelShould.setSelectedTextColor(Color.ORANGE);
		txtpnThisPanelShould.setEditable(false);
		txtpnThisPanelShould.setForeground(Color.RED);
		txtpnThisPanelShould.setBackground(Color.BLACK);
		txtpnThisPanelShould.setFont(new Font("Verdana", Font.BOLD, 14));
		txtpnThisPanelShould.setText("THIS PANEL SHOULD ONLY BE USED WHEN MOVING THIS PROGRAM TO A NEW SYSTEM OR IF THE PROGRAM DATABASE IS DELETED OR CORRUPTED, MODIFYING THIS FIELD WILL CAUSE PERMANENT DAMAGE, USE EXTREMEM CAUTION");
		txtpnThisPanelShould.setBounds(145, 90, 613, 135);
		prefPane.add(txtpnThisPanelShould);
		
		JButton btnIUnderstand = new JButton("I Understand");
		btnIUnderstand.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				textField.setVisible(true);
				btnSubmit.setVisible(true);
				lblSqlPath.setVisible(true);
				lblUsername.setVisible(true);
				lblPassword.setVisible(true);
				txtUserName.setVisible(true);
				txtPassword.setVisible(true);
			}
		});
		btnIUnderstand.setBounds(393, 247, 117, 29);
		prefPane.add(btnIUnderstand);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField.setVisible(false);
		textField.setBounds(145, 348, 613, 28);
		prefPane.add(textField);
		textField.setColumns(10);
		
		lblSqlPath = new JLabel("SQL Path:");
		lblSqlPath.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblSqlPath.setVisible(false);
		lblSqlPath.setBounds(145, 329, 77, 16);
		prefPane.add(lblSqlPath);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				enterClicked();
			}
		});
		btnSubmit.setVisible(false);
		btnSubmit.setBounds(393, 423, 117, 29);
		prefPane.add(btnSubmit);
		
		lblUsername = new JLabel("Username:");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblUsername.setBounds(180, 388, 95, 16);
		lblUsername.setVisible(false);
		prefPane.add(lblUsername);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(285, 383, 130, 28);
		txtUserName.setVisible(false);
		prefPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPassword.setBounds(415, 388, 100, 16);
		lblPassword.setVisible(false);
		prefPane.add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(525, 383, 134, 28);
		txtPassword.setVisible(false);
		txtPassword.setColumns(10);
		prefPane.add(txtPassword);
		
		prefPane.setVisible(true);
	}
	protected void enterClicked() 
	{
		int yes = 2;
		//0 = yes, 1 = no, 2 = cancel
		yes = JOptionPane.showConfirmDialog(null, "Are you Sure that you want to make this change???");
		if(yes == 0)
			changeSQL();
	}
	private void changeSQL() 
	{
		//TODO
		//JDBCMySQLConnection.setPath(textField.getText());
		JOptionPane.showMessageDialog(null, "The Path has been changed");
	}
	public JPanel getPanel()
	{
		return prefPane;
		
	}
}
