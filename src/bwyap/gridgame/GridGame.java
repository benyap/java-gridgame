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
	
	private static final int FPS_RATE = 60;
	
	protected KeyInputController input;
	protected GridGameWindow window;
	protected GameEngineInterface engine;
	protected Thread engineThread;
	
	/**
	 * Create a new GridGame object and initialize game engine and game window. 
	 */
	public GridGame() {	
		initInput();
		initWindow();
		initEngine();
	}
	
	/**
	 * Initialize the input controller
	 */
	protected void initInput() {
		input = new KeyInputController();
	}
	
	/**
	 * Initialize the game window
	 */
	protected void initWindow() {
		window = new GridGameWindow("Game Window");
	}
	
	/**
	 * Initialize the game engine
	 */
	protected void initEngine() {
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
