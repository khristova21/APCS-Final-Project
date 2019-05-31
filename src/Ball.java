import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Ball extends JComponent
{
    //private BufferedImage image;
	private Ellipse2D.Double ball;


    public Ball()
    {
    	ball = new Ellipse2D.Double(0, 0, 10, 10);
    	this.setSize(11,11);
    }
    	public void paintComponent(Graphics g)     //this method already exists but we're overriding 
    	{
    		Graphics2D g2 = (Graphics2D) g;
    		g2.fill(ball);
    		
    	}
    	
    	
    	
    	
    	
    	
//       try 
//       {                
//          image = ImageIO.read(getClass().getResourceAsStream("/Fish.png"));
//       } catch (IOException ex) 
//       {
//            // handle exception...
//       }
    
    
//	public void setDX(int x)
//	{
//		dx = x;
//	}
//	public void setDY(int y)
//	{
//		dy = y;
//	}
//	
//	public int getDX()
//	{
//		return dx;
//	}
//	public int getDY()
//	{
//		return dy;
//	}
//	
//	public void update()
//	{
//		setLocation(getX() + dx, getY() + dy);
//		if(getX() <= 0)
//		{
//			setDX(0);
//		}
//		if(getX() >= 590)
//		{
//			setDX(0);
//		}
//		if(getY() <= 0)
//		{
//			setDY(0);
//		}
//		if(getY() >= 570)
//		{
//			setDY(0);
//		}
//	}
}
