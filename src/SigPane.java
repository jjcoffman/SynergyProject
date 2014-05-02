import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class SigPane extends JPanel 
{

    private static final int aWidth = 400;
    private static final int aHeight = 200;
    private static final long serialVersionUID = 1L;
    ArrayList<Point> points = new ArrayList<Point>();
    BufferedImage bImage = new BufferedImage(aWidth, aHeight, BufferedImage.TYPE_INT_RGB);

    public SigPane()
    {
         setBorder(BorderFactory.createLineBorder(Color.black));
         Graphics g2d = bImage.getGraphics();
         g2d.setColor(Color.WHITE);
         g2d.fillRect(0, 0, aWidth, aHeight);
         g2d.dispose();

         addMouseListener(new MouseAdapter(){
             public void mousePressed(MouseEvent e)
             {
                points.clear();
                points.add(e.getPoint());
             }
         });

         addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) 
            {
                points.add(e.getPoint());
                repaint();
            }
         }); 

         addMouseListener(new MouseAdapter(){
             public void mouseReleased(MouseEvent e)
             {
                 points.add(e.getPoint());
                 points.clear();
                 repaint();
             }
         });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawIntoBufferedImage();
        g.drawImage(bImage,0,0,null);
        draw(g);

    }
    public void drawIntoBufferedImage()
    {
        Graphics g = bImage.getGraphics();
        draw(g);
        g.dispose();
    }

    public void draw(Graphics g)
    {
         if(points != null && points.size() > 1)
         {

             g.setColor(Color.BLACK);
              for(int i = 0; i < points.size()-1;i++)
               {
                   int x1 = points.get(i).x;
                   int y1 = points.get(i).y;
                   int x2 = points.get(i+1).x;
                   int y2 = points.get(i+1).y;
                   g.drawLine(x1, y1, x2, y2);
               }
         }
    }
    //clear Signatures method
    public void clearSignatures()
    {
        if(points!=null)
        {
            points.clear();
            Graphics g = bImage.getGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, aWidth, aWidth);
            g.dispose();
            repaint();
        }
    }
    
    public BufferedImage getImage()
    {
    	return bImage;
    }
    
    //this will write a file to the computer and stores
    public File saveImage(int userID)
    {
    	try 
    	{
    	    // retrieve image
    	    BufferedImage bi = bImage;
    	    File outputfile = new File("src//" + userID +".png");
    	    ImageIO.write(bi, "png", outputfile);
    	    return outputfile;
    	} 
    	catch (IOException e) 
    	{
    	    return null;
    	}
    }
}