import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
public class GameOfLife extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameOfLife() {
		setSize(800, 819);
		setTitle("Game Of Life");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Toolkit toolkit = getToolkit();
		 Dimension size = toolkit.getScreenSize();
		 setLocation(size.width/2 - getWidth()/2,
		size.height/2 - getHeight()/2);
	}
}
