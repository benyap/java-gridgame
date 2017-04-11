package bwyap.gridgame;

import bwyap.gridgame.engine.GameEngineInterface;
import bwyap.gridgame.input.KeyInputController;

/**
 * A GridGame object holds all game components, 
 * such as the game engine, game window and input controller. 
 * @author bwyap
 *
 */
public class GridGame {
	
	private static final int FPS_RATE = 30;
	
	private KeyInputController input;
	private GridGameWindow window;
	private GameEngineInterface engine;
	private Thread engineThread;
	
	/**
	 * Create a new GridGame object and initialize game engine and game window. 
	 */
	public GridGame() {		
		input = new KeyInputController();
		window = new GridGameWindow("Game Window");
		engine = new GridGameEngine(FPS_RATE, window);
		engineThread = new Thread(engine);
	}
	
	/**
	 * Start the game engine and show the game window
	 */
	public void start() {
		window.addKeyListener(input);
		window.setVisible(true);
		engineThread.start();
	}
	
}
