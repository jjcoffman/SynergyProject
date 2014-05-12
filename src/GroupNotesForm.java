import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class GroupNotesForm extends JFrame
{
	private static final long serialVersionUID = 1L;
	private GroupNotes GroupNotes;
	private JFrame window;
	private JScrollPane spInd;
	
	//THIS IS USED FOR WINDOW BUILDER TO KNOW WHERE TO LOOK TO SHOW THE PANEL
	
	public GroupNotesForm()
	{
		window = new JFrame("View Group Notes");
		GroupNotes = new GroupNotes();
		GroupNotes.BuildPanel();
		JPanel d = (JPanel) GroupNotes.getPanel();
		
		JPanel d3 = new JPanel();
		d3.setLayout(null);
		d3.add(d);;
		d3.setPreferredSize(new Dimension(645, 1650));
		
		spInd = new JScrollPane(d3);
		spInd.setBounds(0, 0, 665, 678);
		spInd.setVisible(true);
		
		window.setPreferredSize(new Dimension(665, 700));
		window.setSize(665, 700);
        window.setLocationRelativeTo(null);
		window.getContentPane().setLayout(null);
		window.setDefaultCloseOperation(window.DISPOSE_ON_CLOSE);
		window.getContentPane().add(spInd);
		window.pack();
		window.setVisible(true);
	}
}
