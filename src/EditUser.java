import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

//this Class creates the Welcome screen for Login by the users
public class EditUser extends JFrame implements ActionListener
{
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnLogin;
	private JFrame Edit;
	private JButton btnExit;
	private SigPanel pane;
	

	public EditUser()
	{
		Edit = new JFrame("Edit User");
		Edit.setSize(700, 400);
		Edit.setPreferredSize(new Dimension(700, 400));
		Edit.setLocationRelativeTo(null);
		Edit.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Edit.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JLabel lab = new JLabel("werwe");
		Edit.getContentPane().add(lab);
		
		pane = new SigPanel();
		pane.buildPanel();
		JPanel sig = (JPanel) pane.getPanel();
		Edit.getContentPane().add(sig);
		Edit.pack();
		Edit.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnLogin)
		{
			Edit.dispose();
			new Frame();
	
		}
		else if(e.getSource()==btnExit)
		{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new EditUser();
			}
		});
		
	}
}
