package bwyap.gridgame.render;

import javax.swing.JFrame;

/**
 * An abstract window class which extends JFrame.
 * Contains update and render methods. 
 * @author bwyap
 *
 */
public abstract class GameWindow extends JFrame {

	private static final long serialVersionUID = 3461972185561625371L;
	
	private String title;
	
	/**
	 * Create a game window with the default close operation
	 * @param title
	 */
	public GameWindow(String title) {
		super(title);
		this.title = title;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * Get the default title assigned to the window
	 * @return
	 */
	public String getDefaultTitle() {
		return title;
	}
	
	/**
	 * Update the elements in the window
	 * @param timeElapsed
	 */
	public abstract void update(float timeElapsed);
	
	/**
	 * Render the elements in the window
	 */
	public abstract void render();
	
}
