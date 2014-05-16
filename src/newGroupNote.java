import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.awt.Font;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class newGroupNote extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private JFrame AddNote;
	private JButton btnSubmit;
	private JButton btnCancel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblID;
	private JLabel labelName;
	private JRadioButton rdbtnMonday;
	private JRadioButton rdbtnTuesday;
	private JRadioButton rdbtnThursday;
	private JRadioButton rdbtnWendnesday;
	private JRadioButton rdbtnSaturday;
	private JRadioButton rdbtnFriday;
	private JRadioButton rdbtnSunday;
	private JRadioButton rdbtnKickoff;
	private JRadioButton rdbtnAm;
	private JRadioButton rdbtnPm;
	private JLabel lblWeekOf;
	private JLabel lblMmddyy;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	
	SQLSetInfo test = new SQLSetInfo();
	
	public newGroupNote(int id) {
		
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	Calendar c = Calendar.getInstance();
	c.setFirstDayOfWeek(Calendar.MONDAY);
	c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	Date mon = c.getTime();
	System.out.println(mon);
		
	AddNote = new JFrame("New Group Note");
	AddNote.getContentPane().setLayout(null);
	AddNote.setSize(800, 400);
	AddNote.setLocationRelativeTo(null);
	//AddNote.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JLabel lblClientName = new JLabel("Client Name:");
	lblClientName.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblClientName.setBounds(20, 20, 90, 16);
	AddNote.getContentPane().add(lblClientName);
	
	JLabel lblClientId = new JLabel("Client ID:");
	lblClientId.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblClientId.setBounds(330, 20, 70, 16);
	AddNote.getContentPane().add(lblClientId);
	
	btnCancel = new JButton("Cancel");
	btnCancel.setFont(new Font("Verdana", Font.PLAIN, 13));
	btnCancel.setBounds(30, 340, 120, 29);
	btnCancel.addActionListener(this);
	AddNote.getContentPane().add(btnCancel);
	
	btnSubmit = new JButton("Submit");
	btnSubmit.setFont(new Font("Verdana", Font.PLAIN, 13));
	btnSubmit.setBounds(650, 340, 120, 29);
	btnSubmit.addActionListener(this);
	AddNote.getContentPane().add(btnSubmit);
	
	lblID = new JLabel(String.valueOf(id));
	lblID.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblID.setBounds(400, 20, 60, 16);
	AddNote.getContentPane().add(lblID);
	
	labelName = new JLabel(getClientName(id));
	labelName.setFont(new Font("Verdana", Font.PLAIN, 13));
	labelName.setBounds(120, 20, 200, 16);
	AddNote.getContentPane().add(labelName);
	
	rdbtnMonday = new JRadioButton("Monday");
	rdbtnMonday.setBounds(20, 50, 110, 20);
	AddNote.getContentPane().add(rdbtnMonday);
	buttonGroup_2.add(rdbtnMonday);
	
	rdbtnTuesday = new JRadioButton("Tuesday");
	rdbtnTuesday.setBounds(130, 50, 110, 20);
	AddNote.getContentPane().add(rdbtnTuesday);
	buttonGroup_2.add(rdbtnTuesday);
	
	rdbtnThursday = new JRadioButton("Thursday");
	rdbtnThursday.setBounds(350, 50, 110, 20);
	AddNote.getContentPane().add(rdbtnThursday);
	buttonGroup_2.add(rdbtnThursday);
	
	rdbtnWendnesday = new JRadioButton("Wendnesday");
	rdbtnWendnesday.setBounds(240, 50, 110, 20);
	AddNote.getContentPane().add(rdbtnWendnesday);
	buttonGroup_2.add(rdbtnWendnesday);
	
	rdbtnSaturday = new JRadioButton("Saturday");
	rdbtnSaturday.setBounds(570, 50, 110, 20);
	AddNote.getContentPane().add(rdbtnSaturday);
	buttonGroup_2.add(rdbtnSaturday);
	
	rdbtnFriday = new JRadioButton("Friday");
	rdbtnFriday.setBounds(460, 50, 110, 20);
	AddNote.getContentPane().add(rdbtnFriday);
	buttonGroup_2.add(rdbtnFriday);
	
	rdbtnSunday = new JRadioButton("Sunday");
	rdbtnSunday.setBounds(680, 50, 110, 20);
	AddNote.getContentPane().add(rdbtnSunday);
	buttonGroup_2.add(rdbtnSunday);
	
	rdbtnKickoff = new JRadioButton("Kick/Off");
	rdbtnKickoff.setFont(new Font("Verdana", Font.PLAIN, 13));
	rdbtnKickoff.setBounds(20, 80, 90, 20);
	AddNote.getContentPane().add(rdbtnKickoff);
	buttonGroup_3.add(rdbtnKickoff);
	
	rdbtnAm = new JRadioButton("AM");
	rdbtnAm.setFont(new Font("Verdana", Font.PLAIN, 13));
	rdbtnAm.setBounds(110, 80, 60, 20);
	AddNote.getContentPane().add(rdbtnAm);
	buttonGroup_3.add(rdbtnAm);
	
	rdbtnPm = new JRadioButton("PM");
	rdbtnPm.setFont(new Font("Verdana", Font.PLAIN, 13));
	rdbtnPm.setBounds(170, 80, 60, 20);
	AddNote.getContentPane().add(rdbtnPm);
	buttonGroup_3.add(rdbtnPm);
	
	JTextArea textArea = new JTextArea();
	textArea.setFont(new Font("Verdana", Font.PLAIN, 13));
	textArea.setWrapStyleWord(true);
	textArea.setLineWrap(true);
	textArea.setBounds(20, 140, 760, 180);
	AddNote.getContentPane().add(textArea);
	
	lblWeekOf = new JLabel("Week Of:");
	lblWeekOf.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblWeekOf.setBounds(630, 20, 70, 16);
	AddNote.getContentPane().add(lblWeekOf);
	
	lblMmddyy = new JLabel(dateFormat.format(mon));
	lblMmddyy.setHorizontalAlignment(SwingConstants.CENTER);
	lblMmddyy.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblMmddyy.setBounds(700, 20, 80, 16);
	AddNote.getContentPane().add(lblMmddyy);
	
	JLabel label_1 = new JLabel("Time:");
	label_1.setFont(new Font("Verdana", Font.PLAIN, 13));
	label_1.setBounds(470, 90, 40, 28);
	AddNote.getContentPane().add(label_1);
	
	textField = new JTextField();
	textField.setText("HH:MM");
	textField.setColumns(10);
	textField.setBounds(510, 90, 60, 28);
	AddNote.getContentPane().add(textField);
	
	JRadioButton radioButton = new JRadioButton("PM");
	radioButton.setBounds(570, 100, 60, 20);
	AddNote.getContentPane().add(radioButton);
	buttonGroup_4.add(radioButton);
	
	JLabel label = new JLabel("To:");
	label.setFont(new Font("Verdana", Font.PLAIN, 13));
	label.setBounds(630, 90, 30, 28);
	AddNote.getContentPane().add(label);
	
	textField_1 = new JTextField();
	textField_1.setText("HH:MM");
	textField_1.setColumns(10);
	textField_1.setBounds(660, 90, 60, 28);
	AddNote.getContentPane().add(textField_1);
	
	JRadioButton radioButton_1 = new JRadioButton("AM");
	radioButton_1.setBounds(720, 80, 60, 20);
	AddNote.getContentPane().add(radioButton_1);
	buttonGroup_5.add(radioButton_1);
	
	JRadioButton radioButton_2 = new JRadioButton("PM");
	radioButton_2.setBounds(720, 100, 60, 20);
	AddNote.getContentPane().add(radioButton_2);
	buttonGroup_5.add(radioButton_2);
	
	JRadioButton radioButton_3 = new JRadioButton("AM");
	radioButton_3.setBounds(570, 80, 60, 20);
	AddNote.getContentPane().add(radioButton_3);
	buttonGroup_4.add(radioButton_3);
	
	JSeparator separator = new JSeparator();
	separator.setBounds(0, 70, 800, 12);
	AddNote.getContentPane().add(separator);
	
	
	AddNote.setVisible(true);
	}
	
	private String getClientName(int id){
		try {
		return test.getName(id);
		}
		catch(NullPointerException e) {
			return "";
		}
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnCancel)
		{
			AddNote.dispose();
		}
		else if(e.getSource()==btnSubmit)
		{
			AddNote.dispose();
		}
		
	}
}