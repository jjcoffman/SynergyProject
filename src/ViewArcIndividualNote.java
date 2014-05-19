import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class ViewArcIndividualNote extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JFrame viewNote;
	private JTextArea txtNote;
	private JButton btnCancel;
	private JLabel lblDateField;
	private JLabel lblCounselor;
	private JLabel lblNewLabel;
	private JLabel lblLblclientid;
	private JLabel lblLblclientname;
	
	SQLSetInfo test = new SQLSetInfo();
	SQLRetrieveInfo test2 = new SQLRetrieveInfo();
	TempRetrieveInfo test3 = new TempRetrieveInfo();
	
	public ViewArcIndividualNote(int id, String date)
	{
		Object[] data = new Object[2];
		data = getNoteText(id, date);
	viewNote = new JFrame("View Individual Note");
	viewNote.getContentPane().setLayout(null);
	viewNote.setSize(450, 300);
	viewNote.setLocationRelativeTo(null);
	viewNote.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	JLabel lblClientName = new JLabel("Client Name:");
	lblClientName.setHorizontalAlignment(SwingConstants.RIGHT);
	lblClientName.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblClientName.setBounds(20, 20, 90, 16);
	viewNote.getContentPane().add(lblClientName);
	
	JLabel lblClientId = new JLabel("Client ID:");
	lblClientId.setHorizontalAlignment(SwingConstants.RIGHT);
	lblClientId.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblClientId.setBounds(20, 40, 90, 16);
	viewNote.getContentPane().add(lblClientId);
	
	txtNote = new JTextArea((String)data[0]);
	txtNote.setLineWrap(true);
	txtNote.setWrapStyleWord(true);
	txtNote.setEditable(false);
	txtNote.setFont(new Font("Verdana", Font.PLAIN, 13));
	txtNote.setBackground(Color.WHITE);
	txtNote.setBounds(20, 120, 410, 107);
	viewNote.getContentPane().add(txtNote);
	
	btnCancel = new JButton("Close");
	btnCancel.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) 
		{viewNote.dispose();}});
	btnCancel.setFont(new Font("Verdana", Font.PLAIN, 13));
	btnCancel.setBounds(20, 240, 120, 29);
	viewNote.getContentPane().add(btnCancel);
	
	JLabel lblTime = new JLabel("Date:");
	lblTime.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblTime.setHorizontalAlignment(SwingConstants.RIGHT);
	lblTime.setBounds(20, 90, 90, 16);
	viewNote.getContentPane().add(lblTime);
	
	lblDateField = new JLabel(date);
	lblDateField.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblDateField.setBounds(110, 90, 104, 16);
	viewNote.getContentPane().add(lblDateField);
	
	lblCounselor = new JLabel("Counselor:");
	lblCounselor.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblCounselor.setHorizontalAlignment(SwingConstants.RIGHT);
	lblCounselor.setBounds(20, 60, 90, 16);
	viewNote.getContentPane().add(lblCounselor);
	
	lblNewLabel = new JLabel((String)data[1]);
	lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblNewLabel.setBounds(110, 60, 200, 16);
	viewNote.getContentPane().add(lblNewLabel);
	
	lblLblclientid = new JLabel(String.valueOf(id));
	lblLblclientid.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblLblclientid.setBounds(110, 40, 200, 16);
	viewNote.getContentPane().add(lblLblclientid);
	
	lblLblclientname = new JLabel(getClientName(id));
	lblLblclientname.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblLblclientname.setBounds(110, 20, 200, 16);
	viewNote.getContentPane().add(lblLblclientname);
	
	
	viewNote.setVisible(true);
	}
	
	private String getClientName(int id){
		try {
		return test3.getArcName(id);
		}
		catch(NullPointerException e) {
			return "";
		}
	}
	
	private Object[] getNoteText(int id,String date) {
		Object[] data = new Object[2];
		try {
			data = test3.getIndNote(id, date);
			}
			catch(NullPointerException e) {
				data[0] = "";
				data[1] = "";
				return data;
			}
		return data;
	}
}