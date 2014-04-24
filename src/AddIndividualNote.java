import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class AddIndividualNote extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private JFrame IndividualNotes;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnSubmit;
	private JButton btnCancel;
	
	public AddIndividualNote()
	{
		IndividualNotes = new JFrame("Patient Notes");
		IndividualNotes.setTitle("Add Client Note");
		IndividualNotes.getContentPane().setLayout(null);
		IndividualNotes.setSize(665, 533);
		IndividualNotes.setLocationRelativeTo(null);
		IndividualNotes.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel lblClientName = new JLabel("Client Name");
		lblClientName.setBounds(6, 16, 104, 16);
		IndividualNotes.getContentPane().add(lblClientName);
		
		JLabel lblClientId = new JLabel("Client ID");
		lblClientId.setBounds(438, 16, 80, 16);
		IndividualNotes.getContentPane().add(lblClientId);
		
		JLabel lblWeekOf = new JLabel("Week of:");
		lblWeekOf.setBounds(16, 50, 61, 16);
		IndividualNotes.getContentPane().add(lblWeekOf);
		
		JLabel lblThru = new JLabel("Thru:");
		lblThru.setBounds(146, 50, 61, 16);
		IndividualNotes.getContentPane().add(lblThru);
		
		JLabel lblDateOf = new JLabel("Date of:");
		lblDateOf.setBounds(296, 50, 61, 16);
		IndividualNotes.getContentPane().add(lblDateOf);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setBounds(434, 50, 61, 16);
		IndividualNotes.getContentPane().add(lblTime);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setBounds(531, 50, 61, 16);
		IndividualNotes.getContentPane().add(lblTo);
		
		textField = new JTextField();
		textField.setBounds(73, 44, 61, 28);
		IndividualNotes.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 44, 96, 28);
		IndividualNotes.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(356, 44, 66, 28);
		IndividualNotes.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(471, 44, 48, 28);
		IndividualNotes.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(561, 44, 80, 28);
		IndividualNotes.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(35, 83, 595, 361);
		IndividualNotes.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(513, 456, 117, 29);
		btnSubmit.addActionListener(this);
		IndividualNotes.getContentPane().add(btnSubmit);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(35, 453, 117, 29);
		btnCancel.addActionListener(this);
		IndividualNotes.getContentPane().add(btnCancel);
		IndividualNotes.setVisible(true);
	}


	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnSubmit)
		{
			returnInfo();
			IndividualNotes.dispose();
		}
		else if(e.getSource()==btnCancel)
		{
			IndividualNotes.dispose();
		}
		
	}


	private void returnInfo() 
	{
		// TODO Auto-generated method stub
		
	}
}
