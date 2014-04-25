import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class viewGroupNote extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JFrame viewNote;
	private JTextArea txtNote;
	private JButton btnCancel;
	private JLabel lblTimeField;
	private JLabel lblCounselor;
	private JLabel lblNewLabel;
	private JLabel lblLblclientid;
	private JLabel lblLblclientname;
	
	public viewGroupNote()
	{
	viewNote = new JFrame("View Group Note");
	viewNote.getContentPane().setLayout(null);
	viewNote.setSize(450, 300);
	viewNote.setLocationRelativeTo(null);
	viewNote.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	JLabel lblClientName = new JLabel("Client Name:");
	lblClientName.setHorizontalAlignment(SwingConstants.RIGHT);
	lblClientName.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblClientName.setBounds(8, 28, 93, 16);
	viewNote.getContentPane().add(lblClientName);
	
	JLabel lblClientId = new JLabel("Client ID:");
	lblClientId.setHorizontalAlignment(SwingConstants.RIGHT);
	lblClientId.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblClientId.setBounds(22, 56, 79, 16);
	viewNote.getContentPane().add(lblClientId);
	
	txtNote = new JTextArea();
	txtNote.setWrapStyleWord(true);
	txtNote.setEditable(false);
	txtNote.setFont(new Font("Verdana", Font.PLAIN, 13));
	txtNote.setBackground(Color.WHITE);
	txtNote.setBounds(8, 117, 434, 107);
	viewNote.getContentPane().add(txtNote);
	
	btnCancel = new JButton("Close");
	btnCancel.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) 
		{viewNote.dispose();}});
	btnCancel.setFont(new Font("Verdana", Font.PLAIN, 13));
	btnCancel.setBounds(6, 236, 117, 29);
	viewNote.getContentPane().add(btnCancel);
	
	JLabel lblTime = new JLabel("Time:");
	lblTime.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblTime.setHorizontalAlignment(SwingConstants.RIGHT);
	lblTime.setBounds(249, 236, 79, 16);
	viewNote.getContentPane().add(lblTime);
	
	lblTimeField = new JLabel("lblTimeField");
	lblTimeField.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblTimeField.setBounds(340, 236, 104, 16);
	viewNote.getContentPane().add(lblTimeField);
	
	lblCounselor = new JLabel("Counselor:");
	lblCounselor.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblCounselor.setHorizontalAlignment(SwingConstants.RIGHT);
	lblCounselor.setBounds(22, 84, 79, 16);
	viewNote.getContentPane().add(lblCounselor);
	
	lblNewLabel = new JLabel("lblCounselorField");
	lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblNewLabel.setBounds(113, 84, 151, 16);
	viewNote.getContentPane().add(lblNewLabel);
	
	lblLblclientid = new JLabel("lblClientID");
	lblLblclientid.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblLblclientid.setBounds(113, 57, 93, 16);
	viewNote.getContentPane().add(lblLblclientid);
	
	lblLblclientname = new JLabel("lblClientName");
	lblLblclientname.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblLblclientname.setBounds(113, 29, 117, 16);
	viewNote.getContentPane().add(lblLblclientname);
	
	
	viewNote.setVisible(true);
	}
}