import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Font;
import java.awt.Color;

public class newGroupNote extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private JFrame AddNote;
	private JTextField txtNote;
	private JButton btnSubmit;
	private JButton btnCancel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_1;
	
	public newGroupNote()
	{
	AddNote = new JFrame("New Group Note");
	AddNote.getContentPane().setLayout(null);
	AddNote.setSize(450, 300);
	AddNote.setLocationRelativeTo(null);
	//AddNote.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JLabel lblClientName = new JLabel("Client Name:");
	lblClientName.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblClientName.setBounds(8, 28, 104, 16);
	AddNote.getContentPane().add(lblClientName);
	
	JLabel lblClientId = new JLabel("Client ID:");
	lblClientId.setFont(new Font("Verdana", Font.PLAIN, 13));
	lblClientId.setBounds(8, 56, 93, 16);
	AddNote.getContentPane().add(lblClientId);
	
	txtNote = new JTextField();
	txtNote.setFont(new Font("Verdana", Font.PLAIN, 13));
	txtNote.setBackground(Color.WHITE);
	txtNote.setBounds(8, 84, 434, 140);
	AddNote.getContentPane().add(txtNote);
	
	btnCancel = new JButton("Cancel");
	btnCancel.setFont(new Font("Verdana", Font.PLAIN, 13));
	btnCancel.setBounds(6, 236, 117, 29);
	btnCancel.addActionListener(this);
	AddNote.getContentPane().add(btnCancel);
	
	btnSubmit = new JButton("Submit");
	btnSubmit.setFont(new Font("Verdana", Font.PLAIN, 13));
	btnSubmit.setBounds(327, 236, 117, 29);
	btnSubmit.addActionListener(this);
	AddNote.getContentPane().add(btnSubmit);
	
	textField_1 = new JTextField();
	textField_1.setBounds(308, 44, 134, 28);
	AddNote.getContentPane().add(textField_1);
	textField_1.setColumns(10);
	
	JLabel lblTime = new JLabel("Time");
	lblTime.setHorizontalAlignment(SwingConstants.CENTER);
	lblTime.setBounds(308, 25, 134, 16);
	AddNote.getContentPane().add(lblTime);
	
	
	AddNote.setVisible(true);
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