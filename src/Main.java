import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Main extends JFrame
{
	
	private static final int DV =  5;
	
	int vY = 0, aY; 
	
	public Main()  
	{
		Ball ball = new Ball();
		Pipe pipeSet = new Pipe(this);
		//pipeSet.setFrame(this);
		ArrayList<Pipe> pipes = new ArrayList<Pipe>();
		CardLayout cl = new CardLayout();
		JPanel overall = new JPanel(cl);
		JPanel homeScreen = new HomeScreen();
		//start button
		JButton start  = new JButton("START");
		start.setBounds(0,0,300,100);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		setLayout(null);
		setBounds(100, 100, 600, 600);

		add(ball);
		//fish.setBounds(230, 230, this.getHeight() / 7, this.getHeight() / 7);
		//coral.setLocation(screenSize.width, 0);
		pipeSet.setBounds(100, 100, 150, 150);
		add(pipeSet);
		System.out.println(pipeSet.getBounds());
		
		
		//add the top corals (upside down) 
		
		
		
		//add the corals from the bottom 
		


		
		this.addKeyListener(new KeyListener() 
		{

			@Override
			public void keyPressed(KeyEvent arg0) {}

			@Override
			public void keyReleased(KeyEvent k)
			{
				if(k.getKeyCode() == KeyEvent.VK_SPACE) 
				{
					//want value of y to go down(closer to zero)
					//which means it goes up visabley on the screen 
					vY -= DV;
					//ball.setDY(0);
				}
			}

			@Override
			public void keyTyped(KeyEvent arg0) {}
			
		});
		
		
		
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	

	public static void main(String[] args) 
	{
		new Main();
	}

}
