import java.awt.Color;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Font;


public class NewClient
{
	private JPanel newClient;
	private JTable table;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void buildPanel() 
	{
		newClient = new JPanel();
		newClient.setFont(new Font("Verdana", Font.PLAIN, 13));
		newClient.setSize(904,640);
		newClient.setLayout(null);
		
		Object[][] data = {{1,1,1}, {1,1,1}, {1,1,1}};
		String[] columnNames = {"Name", "Phone Number", "Date"};
		table = new JTable(data, columnNames);
		table.setFont(new Font("Verdana", Font.PLAIN, 13));
		table.setGridColor(Color.LIGHT_GRAY);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setFont(new Font("Verdana", Font.PLAIN, 13));
		scroll.setSize(864, 400);
		scroll.setLocation(20, 48);
		newClient.add(scroll);
		
		
		JLabel lblClientsPendingIntake = new JLabel("Clients Pending Intake");
		lblClientsPendingIntake.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientsPendingIntake.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientsPendingIntake.setBounds(350, 20, 200, 16);
		newClient.add(lblClientsPendingIntake);
		
		JButton btnNewPhoneInterview = new JButton("New Phone Interview");
		btnNewPhoneInterview.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewPhoneInterview.setBounds(192, 452, 200, 29);
		newClient.add(btnNewPhoneInterview);
		
		JButton button = new JButton("Proceed to Initial Intake");
		button.setFont(new Font("Verdana", Font.PLAIN, 13));
		button.setBounds(482, 452, 200, 29);
		newClient.add(button);
		

		newClient.setVisible(true);
	}

	public JComponent getPanel()
	{
		return newClient;
	}
}
