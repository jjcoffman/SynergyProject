import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;


public class Frame extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JFrame frame = new JFrame("West Slope Recovery");;
	JPanel EnclosingPanel;
	
	
	public Frame()
	{
		MainWindow pane = new MainWindow();
		JTextField text = new JTextField("");
		text.setBounds(0, 80, 120, -80);
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 120, 80);
		label.setIcon(new ImageIcon("src//westSlopeImagesmall.jpg"));
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, Color.BLACK, Color.LIGHT_GRAY));
		lblNewLabel.setRequestFocusEnabled(false);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("src//WestSlopeBanner.jpg"));
		lblNewLabel.setBounds(120, 0, 904, 80);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		//here we add the panels
		
		pane.buildPanel();
		JComponent p = pane.getPanel();
		frame.getContentPane().add(p);
		frame.getContentPane().add(text);
		frame.setResizable(false);
		//frame.setUndecorated(true);
		
		frame.setPreferredSize(new Dimension(1024, 720));
		frame.setSize(1024, 720);
        frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		frame.pack();
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Frame();
			}
		});
		
	}
}
