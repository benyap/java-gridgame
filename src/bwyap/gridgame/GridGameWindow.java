package bwyap.gridgame;

import bwyap.gridgame.input.KeyInputController;
import bwyap.gridgame.input.KeyInputInterface;
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
		
	private KeyInputInterface input;
	
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
	
	/**
	 * Add a key input listener to the window
	 * @param listener
	 */
	public void addKeyListener(KeyInputController listener) {
		super.addKeyListener(listener);
		input = listener;
	}
	
	/**
	 * Get the KeyInputInterface for this window
	 * @return
	 */
	public KeyInputInterface getKeyInputInterface() {
		return input;
	}
	
	@Override
	public void update(float timeElapsed) {
		
	}

	@Override
	public void render() {
		
	}

}
