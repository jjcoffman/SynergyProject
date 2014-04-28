import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Signature extends Canvas implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private Canvas sigPanel;
	
	public Signature()
	{
		sigPanel = new Canvas();
		sigPanel.setSize(new Dimension(300, 200));
		sigPanel.addMouseListener(new Mouse);
		
		
	}
	public Canvas getPanel()
	{
		return sigPanel;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
}
