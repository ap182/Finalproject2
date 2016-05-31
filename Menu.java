
import java.awt.Graphics;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;



public class Menu extends JPanel{
	private static final long serialVersionUID = 1L;
	int highscore;
	
	
	static BufferedImage img = null;{
		try {
			img = ImageIO.read(new URL("http://i.imgur.com/XVZY5qH.png"));
		} catch (IOException e) {
			System.out.println("WRONG MENU");
		}}
	
	boolean startGame = false;						
	
	
	public Menu(){
		setFocusable(true);							
		addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent e) {
				startGame = true;
			}

			});
	}
	
	public void paint (Graphics g){
		super.paint(g);
	
		g.drawImage(img, 0, 0, null);					
		
	}
}