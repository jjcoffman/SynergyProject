import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class NewClient
{
	private JPanel newClient;
	private JTable table;
	private JPanel menu;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void buildPanel() 
	{
		newClient = new JPanel();
		newClient.setSize(904,640);
		newClient.setLayout(null);
		
		table = new JTable();
		table.setAutoCreateColumnsFromModel(true);
		table.setBackground(Color.WHITE);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		table.setBounds(108, 470, 687, -317);
		newClient.add(table);
		
		
		JLabel lblClientsPendingIntake = new JLabel("Clients Pending Intake");
		lblClientsPendingIntake.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientsPendingIntake.setBounds(357, 107, 190, 16);
		newClient.add(lblClientsPendingIntake);
		
		
		menu = new JPanel();
		menu.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		menu.setLayout(null);
		menu.setSize(904, 40);
		
		JButton btnPhoneInterview = new JButton("Phone Interview");
		btnPhoneInterview.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnPhoneInterview.setBounds(246, 6, 143, 29);
		menu.add(btnPhoneInterview);
		
		JButton btnContinueToIntake = new JButton("Continue to Intake");
		btnContinueToIntake.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnContinueToIntake.setBounds(635, 6, 143, 29);
		menu.add(btnContinueToIntake);
		
		newClient.add(menu);
		menu.setLocation(0, 577);
		
		
		
		
		
		newClient.setVisible(true);
	}

	public JComponent getPanel()
	{
		return newClient;
	}
}
