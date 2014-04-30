import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
public class SigPanel 
{
	private int width = 300;
	private int height = 150;
	private int tool = 1;
    int currentX, currentY, oldX, oldY;
	private Graphics graph;
	/**
	 * @wbp.parser.entryPoint
	 */
	public void buildPanel()
	{
		
		sigPane = new JPanel();
		sigPane;
		sigPane.setPreferredSize(new Dimension(width, height));
		sigPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		sigPane.setBackground(Color.WHITE);
		sigPane.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				sigMouseClicked(e);
			}
		});
		sigPane.addMouseListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) 
			{
				sigMouseDragged(e);
			}
		});
		sigPane.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) 
			{
				sigMouseReleased(e);

			}
		});
		sigPane.setPreferredSize(new Dimension(width, height));
		sigPane.setBackground(Color.WHITE);
			
		sigPane.repaint();
	}
	
	
	protected void sigMouseReleased(MouseEvent e) 
	{
            currentX = e.getX();
            currentY = e.getY();
            graph.drawLine(currentX, currentY, currentX+1, currentY+1);
            sigPane.repaint();
            System.out.println("line!!!! from" + oldX + "to" + currentX);	
	}


	protected void sigMouseDragged(MouseEvent e) 
	{
	            currentX = e.getX();
	            currentY = e.getY();
	            oldX = currentX;
	            oldY = currentY;
	            graph.drawLine(currentX, currentY, currentX+1, currentY+1);
	            sigPane.repaint();
	            System.out.println(currentX + " " + currentY);
	            System.out.println("PEN!!!!");	
	}


	protected void sigMouseClicked(MouseEvent e) 
	{
		oldX = e.getX();
        oldY = e.getY();
        graph.drawRect(e.getX(), e.getY(), 1, 1);
        sigPane.repaint();
        System.out.println(oldX + " " + oldY);
		
	}


	public JPanel getPanel()
	{
		return sigPane;
	}
	private JPanel sigPane;//this is the the actual panel
	
	class sigPane extends JPanel {
		private static final long serialVersionUID = 1L;

		sigPane() {
            // set a preferred size for the custom panel.
            setPreferredSize(new Dimension(height, width));
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
        }
    }
}

