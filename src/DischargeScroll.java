import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DischargeScroll
{
	private Discharge DischargeS;
	private Discharge2 DischargeS2;
	private JFrame window;
	private JScrollPane spInd;
	
	//THIS IS USED FOR WINDOW BUILDER TO KNOW WHERE TO LOOK TO SHOW THE PANEL
	
	public DischargeScroll()
	{
		window = new JFrame("Discharge");
		DischargeS = new Discharge();
		DischargeS.buildGUI();
		JPanel d = (JPanel) DischargeS.getPanel();
		
		DischargeS2 = new Discharge2();
		DischargeS2.buildPanel();
		
		JPanel d2 = (JPanel) DischargeS2.getPanel();
		JPanel d3 = new JPanel();
		d3.setLayout(null);
		d3.add(d);
		d3.add(d2);
		d3.setPreferredSize(new Dimension(645, 1400));
		d2.setLocation(0, 750);
		
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
