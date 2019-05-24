import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Fish extends JComponent
{
    private BufferedImage image;

    public Fish()
    {
       try {                
          image = ImageIO.read(getClass().getResourceAsStream("/fish.jpg"));
       } catch (IOException ex) {
            // handle exception...
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this.getParent().getHeight()/8, this.getParent().getHeight()/8, null);
    }
	
}
