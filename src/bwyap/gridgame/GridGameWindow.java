package bwyap.gridgame;

import bwyap.gridgame.window.GameWindow;

/**
 * A Game window for GridGame.
 * @author bwyap
 * 
 */
public class GridGameWindow extends GameWindow {

	private static final long serialVersionUID = -6717115563458854290L;
	
	// Default window size
	private static final int HEIGHT = 600;
	private static final int WIDTH = 800;
		
	/**
	 * Create a new GameWindow for GridGame
	 * @param title
	 */
	public GridGameWindow(String title) {
		super(title);
		
		// set window properties
		this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
	
	@Override
	public void update(float timeElapsed) {
		
	}

	@Override
	public void render() {
		
	}

}
