import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class ExistingClient

{

	private JPanel panel;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public void buildPanel()
	{
		panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(904, 640);
		
		JList list = new JList();
		list.setSize(700, 400);
		list.setValueIsAdjusting(true);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Hulk Hogan (CLICK HERE FOR DEMO)", "Jason Statham", "Chris Hemswoth", "Cam Newton", "Jason Aldean", "Chuck Norris", "Franz Ferdinand"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(77, 123, 339, 380);
		panel.add(list);
		
		JLabel lblpanels = new JLabel("Existing Clients");
		lblpanels.setHorizontalAlignment(SwingConstants.CENTER);
		lblpanels.setRequestFocusEnabled(false);
		lblpanels.setBounds(164, 101, 143, 16);
		panel.add(lblpanels);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setBounds(187, 527, 117, 29);
		panel.add(btnSelect);
		
		JLabel lblClientName = new JLabel("Client Name:");
		lblClientName.setBounds(474, 123, 143, 16);
		panel.add(lblClientName);
		
		JLabel lblClientId = new JLabel("Client ID:");
		lblClientId.setBounds(742, 123, 143, 16);
		panel.add(lblClientId);
		
		JLabel lblEmergencyContact = new JLabel("Emergency Contact:");
		lblEmergencyContact.setBounds(474, 226, 143, 16);
		panel.add(lblEmergencyContact);
		
		JLabel lblEmergencyPhone = new JLabel("Emergency Phone:");
		lblEmergencyPhone.setBounds(474, 254, 143, 16);
		panel.add(lblEmergencyPhone);
		
		JLabel lblClientPhone = new JLabel("Client Phone:");
		lblClientPhone.setBounds(474, 151, 143, 16);
		panel.add(lblClientPhone);
		
		
		panel.setVisible(true);
		
	}
	public JComponent getPanel()
	{
		return panel;
	}
}
