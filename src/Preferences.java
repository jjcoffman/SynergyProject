import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextPane;

import java.awt.*;

import javax.swing.text.*;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JTextField;

import com.synergyproject.jdbc.db.JDBCMySQLConnection;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


//This class handles the preferences of changing the SQL Database Path in the event that it needs to be changed
public class Preferences 
{
	private JPanel prefPane;
	private JLabel lblSqlPath;
	private JTextField textField;
	private JButton btnSubmit;
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
			}
		});
		btnIUnderstand.setBounds(393, 247, 117, 29);
		prefPane.add(btnIUnderstand);
		
		textField = new JTextField();
		textField.setVisible(false);
		textField.setBounds(145, 348, 613, 28);
		prefPane.add(textField);
		textField.setColumns(10);
		
		lblSqlPath = new JLabel("SQL Path:");
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
		btnSubmit.setBounds(641, 388, 117, 29);
		prefPane.add(btnSubmit);
		
		prefPane.setVisible(true);
	}
	protected void enterClicked() 
	{
		int yes = 2;
		//0 = yes, 1 = no, 2 = cancel
		yes = JOptionPane.showConfirmDialog(null, "Are you Sure that you want to make this change???");
		System.out.println(yes);
		if(yes == 0)
			changeSQL();
	}
	private void changeSQL() 
	{
		
		//JDBCMySQLConnection.setPath(textField.getText());
		JOptionPane.showMessageDialog(null, "The Path has been changed");
	}
	public JPanel getPanel()
	{
		return prefPane;
		
	}
}
