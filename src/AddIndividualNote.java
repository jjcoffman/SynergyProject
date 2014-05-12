import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;


public class AddIndividualNote extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private JFrame IndividualNotes;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnSubmit;
	private JButton btnCancel;
	private JTextField textField_6;
	
	public AddIndividualNote()
	{
		IndividualNotes = new JFrame("Patient Notes");
		IndividualNotes.setTitle("Add Client Note");
		IndividualNotes.getContentPane().setLayout(null);
		IndividualNotes.setSize(760, 540);
		IndividualNotes.setLocationRelativeTo(null);
		IndividualNotes.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel lblClientName = new JLabel("Client Name:");
		lblClientName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientName.setBounds(20, 20, 90, 16);
		IndividualNotes.getContentPane().add(lblClientName);
		
		JLabel lblClientId = new JLabel("Client ID:");
		lblClientId.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientId.setBounds(600, 20, 70, 16);
		IndividualNotes.getContentPane().add(lblClientId);
		
		JLabel lblWeekOf = new JLabel("Week of:");
		lblWeekOf.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblWeekOf.setBounds(20, 50, 70, 28);
		IndividualNotes.getContentPane().add(lblWeekOf);
		
		JLabel lblThru = new JLabel("Thru:");
		lblThru.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblThru.setBounds(170, 50, 40, 28);
		IndividualNotes.getContentPane().add(lblThru);
		
		JLabel lblDateOf = new JLabel("Date of:");
		lblDateOf.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblDateOf.setBounds(300, 50, 60, 28);
		IndividualNotes.getContentPane().add(lblDateOf);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTime.setBounds(450, 50, 40, 28);
		IndividualNotes.getContentPane().add(lblTime);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo.setBounds(600, 50, 30, 28);
		IndividualNotes.getContentPane().add(lblTo);
		
		textField = new JTextField();
		textField.setText("00/00/00");
		textField.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField.setBounds(80, 50, 80, 28);
		IndividualNotes.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(210, 50, 80, 28);
		IndividualNotes.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(360, 50, 80, 28);
		IndividualNotes.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("12:43");
		textField_3.setBounds(490, 50, 50, 28);
		IndividualNotes.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnSubmit.setBounds(610, 460, 120, 29);
		btnSubmit.addActionListener(this);
		IndividualNotes.getContentPane().add(btnSubmit);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnCancel.setBounds(30, 460, 120, 29);
		btnCancel.addActionListener(this);
		IndividualNotes.getContentPane().add(btnCancel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("AM");
		chckbxNewCheckBox.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(540, 40, 60, 20);
		IndividualNotes.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxPm = new JCheckBox("PM");
		chckbxPm.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxPm.setBounds(540, 60, 60, 20);
		IndividualNotes.getContentPane().add(chckbxPm);
		
		textField_6 = new JTextField();
		textField_6.setText("12:43");
		textField_6.setColumns(10);
		textField_6.setBounds(630, 50, 50, 28);
		IndividualNotes.getContentPane().add(textField_6);
		
		JCheckBox checkBox = new JCheckBox("PM");
		checkBox.setFont(new Font("Verdana", Font.PLAIN, 13));
		checkBox.setBounds(680, 60, 60, 20);
		IndividualNotes.getContentPane().add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("AM");
		checkBox_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		checkBox_1.setBounds(680, 40, 60, 20);
		IndividualNotes.getContentPane().add(checkBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(20, 90, 720, 360);
		IndividualNotes.getContentPane().add(textArea);
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
