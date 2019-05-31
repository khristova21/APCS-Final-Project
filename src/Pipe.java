import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;



public class Pipe extends JComponent
{
	private Main frame;
	private Rectangle pipe;       //bottom of screen
	private Rectangle pipeTop;    //top of screen
	
	public Pipe(Main frame)
	{
		this.frame = frame;
		//pipe = new Rectangle(frame.getWidth()-200, frame.getHeight()-100, frame.getWidth()/5, frame.getHeight()/3 );
		pipeTop = new Rectangle(frame.getWidth(), 0, frame.getWidth()/5, frame.getHeight()/3 );
		pipe = new Rectangle(0, 0, frame.getWidth() / 5, frame.getHeight() / 3);

	 }

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.fill(pipe);
		g2.fill(pipeTop);
	}
}



