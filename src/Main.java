import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame
{
	
	private static final int DV =  5;
	
	int vY = 0, aY; 
	
	public Main()  
	{
		Fish fish = new Fish();
		//ArrayList<Coral> corals = new ArrayList<Coral>();
		CardLayout cl = new CardLayout();
		JPanel overall = new JPanel(cl);
		JPanel homeScreen = new HomeScreen();

		this.add(fish);
		this.setVisible(true);
		
		
		
		this.addKeyListener(new KeyListener() 
		{

			@Override
			public void keyPressed(KeyEvent arg0) {}

			@Override
			public void keyReleased(KeyEvent k)
			{
				if(k.getKeyCode() == KeyEvent.VK_SPACE) 
				{
					//want value of y to go down
					vY -= DV;
				}
			}

			@Override
			public void keyTyped(KeyEvent arg0) {}
			
		});
		
		
	}
	
	
	

	public static void main(String[] args) 
	{
		new Main();
	}

}
