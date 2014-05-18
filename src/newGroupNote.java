import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.Font;
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
	private JLabel lblID;
	private JLabel labelName;
	private int CID;
	private MyTableModel passedTable;
	private JRadioButton rdbtnMonday;
	private JRadioButton rdbtnTuesday;
	private JRadioButton rdbtnThursday;
	private JRadioButton rdbtnWednesday;
	private JRadioButton rdbtnSaturday;
	private JRadioButton rdbtnFriday;
	private JRadioButton rdbtnSunday;
	private JRadioButton rdbtnKickoff;
	private JRadioButton rdbtnAm;
	private JRadioButton rdbtnPm;
	private JRadioButton rdbtnStartAM;
	private JRadioButton rdbtnStartPM;
	private JRadioButton rdbtnEndAM;
	private JRadioButton rdbtnEndPM;
	private JLabel lblWeekOf;
	private JLabel lblMmddyy;
	private JLabel label_2;
	private JTextField textStartTime;
	private JTextField textEndTime;
	private JTextArea textNotes;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	
	SQLSetInfo test = new SQLSetInfo();
	SQLRetrieveInfo test2 = new SQLRetrieveInfo();
	TempSetInfo temp = new TempSetInfo();
	private JTextField topic;
	
	public newGroupNote(int id, MyTableModel table) {
	passedTable = table;	
	CID = id;
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	Calendar c = Calendar.getInstance();
	c.setFirstDayOfWeek(Calendar.MONDAY);
	c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	Date mon = c.getTime();
	c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
	Date sun = c.getTime();
	System.out.println(mon);
		
	AddNote = new JFrame("New Group Note");
	AddNote.getContentPane().setLayout(null);
	AddNote.setSize(800, 400);
	AddNote.setLocationRelativeTo(null);
	
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
	rdbtnMonday.setFont(new Font("Verdana", Font.PLAIN, 13));
	rdbtnMonday.setSelected(true);
	rdbtnMonday.setBounds(20, 50, 110, 30);
	AddNote.getContentPane().add(rdbtnMonday);
	buttonGroup_2.add(rdbtnMonday);
	rdbtnMonday.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e) {
	    	rdbtnKickoff.setSelected(true);
	    	textStartTime.setText("HH:MM");
	    	textEndTime.setText("HH:MM");
	    	rdbtnStartAM.setSelected(true);
	    	rdbtnEndAM.setSelected(true);
	    	textStartTime.setEditable(true);
	    	textEndTime.setEditable(true);
	    	rdbtnStartAM.setEnabled(true);
	    	rdbtnStartPM.setEnabled(true);
	    	rdbtnEndAM.setEnabled(true);
	    	rdbtnEndPM.setEnabled(true);
	    	rdbtnAm.setEnabled(true);
	    	rdbtnPm.setEnabled(true);
	    }
	});
	
	rdbtnTuesday = new JRadioButton("Tuesday");
	rdbtnTuesday.setFont(new Font("Verdana", Font.PLAIN, 13));
	rdbtnTuesday.setBounds(130, 50, 110, 30);
	AddNote.getContentPane().add(rdbtnTuesday);
	buttonGroup_2.add(rdbtnTuesday);
	rdbtnTuesday.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e) {
	    	rdbtnKickoff.setSelected(true);
	    	textStartTime.setText("HH:MM");
	    	textEndTime.setText("HH:MM");
	    	rdbtnStartAM.setSelected(true);
	    	rdbtnEndAM.setSelected(true);
	    	textStartTime.setEditable(true);
	    	textEndTime.setEditable(true);
	    	rdbtnStartAM.setEnabled(true);
	    	rdbtnStartPM.setEnabled(true);
	    	rdbtnEndAM.setEnabled(true);
	    	rdbtnEndPM.setEnabled(true);
	    	rdbtnAm.setEnabled(true);
	    	rdbtnPm.setEnabled(true);
	    }
	});
	
	rdbtnThursday = new JRadioButton("Thursday");
	rdbtnThursday.setFont(new Font("Verdana", Font.PLAIN, 13));
	rdbtnThursday.setBounds(350, 50, 110, 30);
	AddNote.getContentPane().add(rdbtnThursday);
	buttonGroup_2.add(rdbtnThursday);
	rdbtnThursday.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e) {
	    	rdbtnKickoff.setSelected(true);
	    	textStartTime.setText("HH:MM");
	    	textEndTime.setText("HH:MM");
	    	rdbtnStartAM.setSelected(true);
	    	rdbtnEndAM.setSelected(true);
	    	textStartTime.setEditable(true);
	    	textEndTime.setEditable(true);
	    	rdbtnStartAM.setEnabled(true);
	    	rdbtnStartPM.setEnabled(true);
	    	rdbtnEndAM.setEnabled(true);
	    	rdbtnEndPM.setEnabled(true);
	    	rdbtnAm.setEnabled(true);
	    	rdbtnPm.setEnabled(true);
	    }
	});
	
	rdbtnWednesday = new JRadioButton("Wednesday");
	rdbtnWednesday.setFont(new Font("Verdana", Font.PLAIN, 13));
	rdbtnWednesday.setBounds(240, 50, 110, 30);
	AddNote.getContentPane().add(rdbtnWednesday);
	buttonGroup_2.add(rdbtnWednesday);
	rdbtnWednesday.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e) {
	    	rdbtnKickoff.setSelected(true);
	    	textStartTime.setText("HH:MM");
	    	textEndTime.setText("HH:MM");
	    	rdbtnStartAM.setSelected(true);
	    	rdbtnEndAM.setSelected(true);
	    	textStartTime.setEditable(true);
	    	textEndTime.setEditable(true);
	    	rdbtnStartAM.setEnabled(true);
	    	rdbtnStartPM.setEnabled(true);
	    	rdbtnEndAM.setEnabled(true);
	    	rdbtnEndPM.setEnabled(true);
	    	rdbtnAm.setEnabled(true);
	    	rdbtnPm.setEnabled(true);
	    }
	});
	
	rdbtnSaturday = new JRadioButton("Saturday");
	rdbtnSaturday.setFont(new Font("Verdana", Font.PLAIN, 13));
	rdbtnSaturday.setBounds(570, 50, 110, 30);
	AddNote.getContentPane().add(rdbtnSaturday);
	buttonGroup_2.add(rdbtnSaturday);
	rdbtnSaturday.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e) {
	    	rdbtnKickoff.setSelected(true);
	    	textStartTime.setText("HH:MM");
	    	textEndTime.setText("HH:MM");
	    	rdbtnStartAM.setSelected(true);
	    	rdbtnEndAM.setSelected(true);
	    	textStartTime.setEditable(true);
	    	textEndTime.setEditable(true);
	    	rdbtnStartAM.setEnabled(true);
	    	rdbtnStartPM.setEnabled(true);
	    	rdbtnEndAM.setEnabled(true);
	    	rdbtnEndPM.setEnabled(true);
	    	rdbtnAm.setEnabled(true);
	    	rdbtnPm.setEnabled(false);
	    }
	});
	
	rdbtnFriday = new JRadioButton("Friday");
	rdbtnFriday.setFont(new Font("Verdana", Font.PLAIN, 13));
	rdbtnFriday.setBounds(460, 50, 110, 30);
	AddNote.getContentPane().add(rdbtnFriday);
	buttonGroup_2.add(rdbtnFriday);
	rdbtnFriday.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e) {
	    	rdbtnKickoff.setSelected(true);
	    	textStartTime.setText("HH:MM");
	    	textEndTime.setText("HH:MM");
	    	rdbtnStartAM.setSelected(true);
	    	rdbtnEndAM.setSelected(true);
	    	textStartTime.setEditable(true);
	    	textEndTime.setEditable(true);
	    	rdbtnStartAM.setEnabled(true);
	    	rdbtnStartPM.setEnabled(true);
	    	rdbtnEndAM.setEnabled(true);
	    	rdbtnEndPM.setEnabled(true);
	    	rdbtnAm.setEnabled(true);
	    	rdbtnPm.setEnabled(true);
	    }
	});
	
	rdbtnSunday = new JRadioButton("Sunday");
	rdbtnSunday.setFont(new Font("Verdana", Font.PLAIN, 13));
	rdbtnSunday.setBounds(680, 50, 110, 30);
	AddNote.getContentPane().add(rdbtnSunday);
	buttonGroup_2.add(rdbtnSunday);
	rdbtnSunday.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e) {
	    	rdbtnKickoff.setSelected(true);
	    	textStartTime.setText("HH:MM");
	    	textEndTime.setText("HH:MM");
	    	rdbtnStartAM.setSelected(true);
	    	rdbtnEndAM.setSelected(true);
	    	textStartTime.setEditable(true);
	    	textEndTime.setEditable(true);
	    	rdbtnStartAM.setEnabled(true);
	    	rdbtnStartPM.setEnabled(true);
	    	rdbtnEndAM.setEnabled(true);
	    	rdbtnEndPM.setEnabled(true);
	    	rdbtnAm.setEnabled(false);
	    	rdbtnPm.setEnabled(false);
	    }
	});
	
	rdbtnKickoff = new JRadioButton("Kick/Off");
	rdbtnKickoff.setSelected(true);
	rdbtnKickoff.setFont(new Font("Verdana", Font.PLAIN, 13));
	rdbtnKickoff.setBounds(20, 90, 90, 30);
	AddNote.getContentPane().add(rdbtnKickoff);
	buttonGroup_3.add(rdbtnKickoff);
	rdbtnKickoff.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e) {
	    	textStartTime.setText("HH:MM");
	    	textEndTime.setText("HH:MM");
	    	rdbtnStartAM.setSelected(true);
	    	rdbtnEndAM.setSelected(true);
	    	textStartTime.setEditable(true);
	    	textEndTime.setEditable(true);
	    	rdbtnStartAM.setEnabled(true);
	    	rdbtnStartPM.setEnabled(true);
	    	rdbtnEndAM.setEnabled(true);
	    	rdbtnEndPM.setEnabled(true);
	    }
	});
	
	rdbtnAm = new JRadioButton("AM");
	rdbtnAm.setFont(new Font("Verdana", Font.PLAIN, 13));
	rdbtnAm.setBounds(110, 90, 60, 30);
	AddNote.getContentPane().add(rdbtnAm);
	buttonGroup_3.add(rdbtnAm);
	rdbtnAm.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e) {
	    	textStartTime.setText("10:00");
	    	textStartTime.setEditable(false);
	    	textEndTime.setText("12:00");
	    	textEndTime.setEditable(false);
	    	rdbtnStartAM.setSelected(true);
	    	rdbtnEndPM.setSelected(true);
	    	rdbtnStartAM.setEnabled(false);
	    	rdbtnStartPM.setEnabled(false);
	    	rdbtnEndAM.setEnabled(false);
	    	rdbtnEndPM.setEnabled(false);
	    }
	});
	
	rdbtnPm = new JRadioButton("PM");
	rdbtnPm.setFont(new Font("Verdana", Font.PLAIN, 13));
	rdbtnPm.setBounds(170, 90, 60, 30);
	AddNote.getContentPane().add(rdbtnPm);
	buttonGroup_3.add(rdbtnPm);
	rdbtnPm.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e) {
	    	textStartTime.setText("02:00");
	    	textEndTime.setText("04:00");
	    	textStartTime.setEditable(false);
	    	textEndTime.setEditable(false);
	    	rdbtnStartPM.setSelected(true);
	    	rdbtnEndPM.setSelected(true);
	    	rdbtnStartAM.setEnabled(false);
	    	rdbtnStartPM.setEnabled(false);
	    	rdbtnEndAM.setEnabled(false);
	    	rdbtnEndPM.setEnabled(false);
	    }
	});
	
	textNotes = new JTextArea();
	textNotes.setFont(new Font("Verdana", Font.PLAIN, 13));
	textNotes.setWrapStyleWord(true);
	textNotes.setLineWrap(true);
	textNotes.setBounds(20, 140, 760, 180);
	AddNote.getContentPane().add(textNotes);
	
	lblWeekOf = new JLabel("Week Of:");
	lblWeekOf.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblWeekOf.setBounds(520, 20, 70, 16);
	AddNote.getContentPane().add(lblWeekOf);
	
	lblMmddyy = new JLabel(dateFormat.format(mon));
	lblMmddyy.setHorizontalAlignment(SwingConstants.CENTER);
	lblMmddyy.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblMmddyy.setBounds(590, 20, 80, 16);
	AddNote.getContentPane().add(lblMmddyy);
	
	JLabel label_1 = new JLabel("Time:");
	label_1.setFont(new Font("Verdana", Font.PLAIN, 13));
	label_1.setBounds(470, 90, 40, 28);
	AddNote.getContentPane().add(label_1);
	
	textStartTime = new JTextField();
	textStartTime.setFont(new Font("Verdana", Font.PLAIN, 13));
	textStartTime.setText("HH:MM");
	textStartTime.setColumns(10);
	textStartTime.setBounds(510, 90, 65, 28);
	AddNote.getContentPane().add(textStartTime);
	
	rdbtnStartPM = new JRadioButton("PM");
	rdbtnStartPM.setBounds(575, 110, 60, 20);
	AddNote.getContentPane().add(rdbtnStartPM);
	buttonGroup_4.add(rdbtnStartPM);
	
	JLabel label = new JLabel("To:");
	label.setFont(new Font("Verdana", Font.PLAIN, 13));
	label.setBounds(630, 90, 30, 28);
	AddNote.getContentPane().add(label);
	
	textEndTime = new JTextField();
	textEndTime.setFont(new Font("Verdana", Font.PLAIN, 13));
	textEndTime.setText("HH:MM");
	textEndTime.setColumns(10);
	textEndTime.setBounds(660, 90, 65, 28);
	AddNote.getContentPane().add(textEndTime);
	
	rdbtnEndAM = new JRadioButton("AM");
	rdbtnEndAM.setSelected(true);
	rdbtnEndAM.setBounds(725, 90, 60, 20);
	AddNote.getContentPane().add(rdbtnEndAM);
	buttonGroup_5.add(rdbtnEndAM);
	
	rdbtnEndPM = new JRadioButton("PM");
	rdbtnEndPM.setBounds(725, 110, 60, 20);
	AddNote.getContentPane().add(rdbtnEndPM);
	buttonGroup_5.add(rdbtnEndPM);
	
	rdbtnStartAM = new JRadioButton("AM");
	rdbtnStartAM.setSelected(true);
	rdbtnStartAM.setBounds(575, 90, 60, 20);
	AddNote.getContentPane().add(rdbtnStartAM);
	buttonGroup_4.add(rdbtnStartAM);
	
	JSeparator separator = new JSeparator();
	separator.setBounds(0, 80, 800, 12);
	AddNote.getContentPane().add(separator);
	
	JLabel lblTopic = new JLabel("Topic:");
	lblTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblTopic.setBounds(250, 90, 45, 28);
	AddNote.getContentPane().add(lblTopic);
	
	topic = new JTextField();
	topic.setFont(new Font("Verdana", Font.PLAIN, 13));
	topic.setColumns(10);
	topic.setBounds(295, 90, 160, 28);
	AddNote.getContentPane().add(topic);
	
	JLabel lblNewLabel = new JLabel("-");
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblNewLabel.setBounds(670, 20, 10, 16);
	AddNote.getContentPane().add(lblNewLabel);
	
	label_2 = new JLabel(dateFormat.format(sun));
	label_2.setHorizontalAlignment(SwingConstants.CENTER);
	label_2.setFont(new Font("Verdana", Font.PLAIN, 13));
	label_2.setBounds(680, 20, 80, 16);
	AddNote.getContentPane().add(label_2);
	
	
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
	
	private void validateInfo(){
		Boolean valid = true;
		if (!textStartTime.getText().matches("[0-1][0-9][:][0-5][0-9]") && valid == true) {
			valid = false;
			JOptionPane.showMessageDialog(null, "Please Enter a valid time in format: HH:MM");
		}
		if (!textEndTime.getText().matches("[0-1][0-9][:][0-5][0-9]") && valid == true) {
			valid = false;
			JOptionPane.showMessageDialog(null, "Please Enter a valid time in format: HH:MM");
		}
		if (valid) {
			//0: Client Id, 1: Week Of, 2: day, 3: session, 4: startTime, 5: startAMPM, 6: endTime, 7: endAMPM, 8: note, 9: endDate, 10: topic
			Object[] data = new Object[11];
			data[0] = Integer.parseInt(lblID.getText());
			data[1] = lblMmddyy.getText();
			data[9] = label_2.getText();
			data[10] = topic.getText();
			if (rdbtnMonday.isSelected()){
				data[2] = "Monday";
			}
			else if (rdbtnTuesday.isSelected()){
				data[2] = "Tuesday";
			}
			else if (rdbtnWednesday.isSelected()){
				data[2] = "Wednesday";
			}
			else if (rdbtnThursday.isSelected()){
				data[2] = "Thursday";
			}
			else if (rdbtnFriday.isSelected()){
				data[2] = "Friday";
			}
			else if (rdbtnSaturday.isSelected()){
				data[2] = "Saturday";
			}
			else if (rdbtnSunday.isSelected()){
				data[2] = "Sunday";
			}
			if (rdbtnKickoff.isSelected()) {
				data[3] = "KickOff";
			}
			else if (rdbtnAm.isSelected()) {
				data[3] = "AM";
			}
			else if (rdbtnPm.isSelected()) {
				data[3] = "PM";
			}
			data[4] = textStartTime.getText();
			if (rdbtnStartAM.isSelected()){
				data[5] = "AM";
			}
			else{
				data[5] = "PM";
			}
			data[6] = textEndTime.getText();
			if (rdbtnEndAM.isSelected()){
				data[7] = "AM";
			}
			else{
				data[7] = "PM";
			}
			data[8] = textNotes.getText();
			
		/*	for(int i = 0; i < 9; i++){
				System.out.println("Test Value new Group:" + i + ", " + data[i]);
			} */
			
			temp.sendGroupInfo(data);
			Object[][] data2 = getGroup(CID);
			passedTable.update(data2);
			AddNote.dispose();

		}
		
	}
	
	private Object[][] getGroup(int id) {
		//Object[][] data = {{"1/12/14","Bootstrap Bill"}};
		//return data;
		try {
			int size = test.getGroupSize("GRP_NOTES", id);
			Object[][] data = new Object[size][2];
			data= test.getGroupRows(size, id);
			return data;
		}
		catch(NullPointerException e) {
			System.out.println("No database connected!");
			Object[][] data = {{"No database", "Connected"}};
			return data;
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
			validateInfo();
		}
		
	}
}