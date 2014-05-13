import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.Font;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddIndividualNote extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private JFrame IndividualNotes;
	private JTextField textField;
	private JTextField txtT;
	private JTextField textField_2;
	private JTextField txtHhmm;
	private JButton btnSubmit;
	private JButton btnCancel;
	private JTextField textField_6;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	SQLSetInfo test = new SQLSetInfo();
	
	public AddIndividualNote(int id)
	{
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YY");
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		Date mon = c.getTime();
		c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		Date sun = c.getTime();
		IndividualNotes = new JFrame("Patient Notes");
		IndividualNotes.setTitle("Add Client Note");
		IndividualNotes.getContentPane().setLayout(null);
		IndividualNotes.setSize(760, 540);
		IndividualNotes.setLocationRelativeTo(null);
		//IndividualNotes.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
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
		lblTo.setBounds(610, 50, 30, 28);
		IndividualNotes.getContentPane().add(lblTo);
		
		textField = new JTextField();
		textField.setText(dateFormat.format(mon));
		textField.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField.setBounds(80, 50, 80, 28);
		IndividualNotes.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtT = new JTextField();
		txtT.setText(dateFormat.format(sun));
		txtT.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtT.setBounds(210, 50, 80, 28);
		IndividualNotes.getContentPane().add(txtT);
		txtT.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_2.setBounds(360, 50, 80, 28);
		IndividualNotes.getContentPane().add(textField_2);
		textField_2.setText(dateFormat.format(date));
		textField_2.setColumns(10);
		
		txtHhmm = new JTextField();
		txtHhmm.setText("HH:MM");
		txtHhmm.setBounds(490, 50, 60, 28);
		IndividualNotes.getContentPane().add(txtHhmm);
		txtHhmm.setColumns(10);
		
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
		
		textField_6 = new JTextField();
		textField_6.setText("HH:MM");
		textField_6.setColumns(10);
		textField_6.setBounds(640, 50, 60, 28);
		IndividualNotes.getContentPane().add(textField_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(20, 90, 720, 360);
		IndividualNotes.getContentPane().add(textArea);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("AM");
		rdbtnNewRadioButton.setBounds(550, 40, 60, 20);
		IndividualNotes.getContentPane().add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnPm = new JRadioButton("PM");
		rdbtnPm.setBounds(550, 60, 60, 20);
		IndividualNotes.getContentPane().add(rdbtnPm);
		buttonGroup.add(rdbtnPm);
		
		JRadioButton radioButton = new JRadioButton("AM");
		radioButton.setBounds(700, 40, 60, 20);
		IndividualNotes.getContentPane().add(radioButton);
		buttonGroup_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("PM");
		radioButton_1.setBounds(700, 60, 60, 20);
		IndividualNotes.getContentPane().add(radioButton_1);
		IndividualNotes.setVisible(true);
		buttonGroup_1.add(radioButton_1);
		
		JLabel lblNewLabel = new JLabel(getClientName(id));
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel.setBounds(120, 20, 200, 16);
		IndividualNotes.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setText(String.valueOf(id));
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(680, 20, 60, 16);
		IndividualNotes.getContentPane().add(lblNewLabel_1);
		
	}


	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnSubmit)
		{
			//returnInfo();
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
	
	private String getClientName(int id){
		try {
		return test.getName(id);
		}
		catch(NullPointerException e) {
			return "";
		}
	}
}
