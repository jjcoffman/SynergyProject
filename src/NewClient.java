import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.Font;


public class NewClient
{
	private JPanel newClient;
	private JTable table;
	private MyTableModel pending;
	private int userid;
	private int access;
	
	SQLRetrieveInfo test = new SQLRetrieveInfo();
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void buildPanel(int id2, int admin2) 
	{
		userid = id2;
		access = admin2;
		newClient = new JPanel();
		newClient.setFont(new Font("Verdana", Font.PLAIN, 13));
		newClient.setSize(904,640);
		newClient.setLayout(null);
		
		Object[][] data = getExisting();
		String[] columnNames = {"Name", "Phone Number", "Date"};
		pending = new MyTableModel(data, columnNames);
		table = new JTable(pending);
		table.getModel().addTableModelListener(table);
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
		lblClientsPendingIntake.setBounds(350, 20, 200, 20);
		newClient.add(lblClientsPendingIntake);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 	
			{
				Object[][] data = getExisting();
				pending.update(data);
			} 
		});
		btnRefresh.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnRefresh.setBounds(20, 452, 100, 29);
		newClient.add(btnRefresh);
		
		JButton btnNewPhoneInterview = new JButton("New Phone Interview");
		btnNewPhoneInterview.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 	
			{new IntakeForm("", 0, pending);} 
		});
		btnNewPhoneInterview.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewPhoneInterview.setBounds(192, 452, 200, 29);
		newClient.add(btnNewPhoneInterview);
		
		JButton button = new JButton("Proceed to Initial Intake");
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				if(table.getSelectedRow() != -1){
				Object i = table.getValueAt(table.getSelectedRow(),1);
				String s = (String)i;
				System.out.println(s);

				new IntakeForm(s, 1, pending);}
			} //TODO add id identifier for the existing client we are passing
		});
		button.setFont(new Font("Verdana", Font.PLAIN, 13));
		button.setBounds(482, 452, 200, 29);
		newClient.add(button);
		

		newClient.setVisible(true);
	}

	private Object[][] getExisting() 
	{
		//Object[][] data = {{12342,"Clint Eastwood"},{23423,"Will Clark"},{34454,"Barry Bonds"},{34552,"Derek Jeter"}};
		//return data;
		try {
			int size = test.getSize("Phone_Intake");
		
		Object[][] data = new Object[size][2];
		for (int i = 1; i <= size; i++){
			data[i-1] = test.getPendingRows(i - 1, 1);
		}
		System.out.println("rows in Phone_Intake: " + test.getSize("Phone_Intake"));
		return data;
		}
		catch(NullPointerException e) {
			System.out.println("No database connected!");
			Object[][] data = {{"No data", "base", "Connected"}};
			return data;
		}
	}

	public JComponent getPanel()
	{
		return newClient;
	}
}
