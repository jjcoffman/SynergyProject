import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;


public class SubstanceIntake extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private JFrame SubstanceIntake;
	private JTextField txtSubs;
	private JTextField txtUsed;
	private JTextField txtAmount;
	private JTextField txtFreq;
	private JTextField txtMethod;
	private JButton btnCancel;
	private JButton btnAdd;
	
	public SubstanceIntake()
	{
	SubstanceIntake = new JFrame("Add Substance");
	SubstanceIntake.getContentPane().setLayout(null);
	SubstanceIntake.setSize(450, 300);
	SubstanceIntake.setLocationRelativeTo(null);
	SubstanceIntake.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JLabel label = new JLabel("");
	label.setBounds(0, 0, 94, 66);
	label.setIcon(new ImageIcon("src//westSlopeImagesmall.jpg"));
	SubstanceIntake.getContentPane().add(label);
	
	JLabel lblNewLabel = new JLabel("West Slope Recovery Patient Management");
	lblNewLabel.setBounds(95, 0, 355, 66);
	SubstanceIntake.getContentPane().add(lblNewLabel);
	
	JLabel lblSubstanceName = new JLabel("Substance Name:");
	lblSubstanceName.setHorizontalAlignment(SwingConstants.RIGHT);
	lblSubstanceName.setBounds(30, 70, 121, 16);
	SubstanceIntake.getContentPane().add(lblSubstanceName);
	
	JLabel lblLastUsed = new JLabel("Last Used:");
	lblLastUsed.setHorizontalAlignment(SwingConstants.RIGHT);
	lblLastUsed.setBounds(30, 100, 121, 16);
	SubstanceIntake.getContentPane().add(lblLastUsed);
	
	JLabel lblFrequency = new JLabel("Frequency:");
	lblFrequency.setHorizontalAlignment(SwingConstants.RIGHT);
	lblFrequency.setBounds(30, 160, 124, 16);
	SubstanceIntake.getContentPane().add(lblFrequency);
	
	JLabel lblAmountUsed = new JLabel("Amount Used:");
	lblAmountUsed.setHorizontalAlignment(SwingConstants.RIGHT);
	lblAmountUsed.setBounds(30, 130, 124, 16);
	SubstanceIntake.getContentPane().add(lblAmountUsed);
	
	JLabel lblMethod = new JLabel("Method:");
	lblMethod.setHorizontalAlignment(SwingConstants.RIGHT);
	lblMethod.setBounds(33, 190, 121, 16);
	SubstanceIntake.getContentPane().add(lblMethod);
	
	txtSubs = new JTextField();
	txtSubs.setBounds(166, 64, 278, 28);
	SubstanceIntake.getContentPane().add(txtSubs);
	txtSubs.setColumns(10);
	
	txtUsed = new JTextField();
	txtUsed.setColumns(10);
	txtUsed.setBounds(166, 94, 281, 28);
	SubstanceIntake.getContentPane().add(txtUsed);
	
	txtAmount = new JTextField();
	txtAmount.setColumns(10);
	txtAmount.setBounds(166, 124, 281, 28);
	SubstanceIntake.getContentPane().add(txtAmount);
	
	txtFreq = new JTextField();
	txtFreq.setBounds(166, 154, 278, 28);
	SubstanceIntake.getContentPane().add(txtFreq);
	txtFreq.setColumns(10);
	
	txtMethod = new JTextField();
	txtMethod.setColumns(10);
	txtMethod.setBounds(166, 184, 278, 28);
	SubstanceIntake.getContentPane().add(txtMethod);
	
	btnCancel = new JButton("Cancel");
	btnCancel.setBounds(30, 232, 117, 29);
	btnCancel.addActionListener(this);
	SubstanceIntake.getContentPane().add(btnCancel);
	
	btnAdd = new JButton("Add");
	btnAdd.setBounds(327, 232, 117, 29);
	btnAdd.addActionListener(this);
	SubstanceIntake.getContentPane().add(btnAdd);
	SubstanceIntake.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnCancel)
		{
			SubstanceIntake.dispose();
		}
		else if(e.getSource()==btnAdd)
		{
			SubstanceIntake.dispose();
		}
	}
}
