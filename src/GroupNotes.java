import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.Component;
import java.awt.Font;

public class GroupNotes implements ActionListener {
	private JPanel GroupNotes;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void BuildPanel() 
	{
		GroupNotes = new JPanel();
		GroupNotes.setSize(665, 905);
		GroupNotes.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel.setBounds(20, 20, 625, 16);
		GroupNotes.add(lblNewLabel);
	}
	
	public JComponent getPanel(){
		return GroupNotes;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
}
