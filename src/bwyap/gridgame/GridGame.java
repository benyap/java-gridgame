package bwyap.gridgame;

import bwyap.gridgame.engine.GameEngineInterface;
import bwyap.gridgame.input.KeyInputController;
import bwyap.gridgame.res.ResourceLoader;

/**
 * A GridGame object holds all game components, 
 * such as the game engine, game window, input controller and resources. 
 * @author bwyap
 *
 */
public class GridGame {
	
	private static final int FPS_RATE = 60;
	
	protected KeyInputController input;
	protected GridGameWindow window;
	protected GameEngineInterface engine;
	protected Thread engineThread;
	protected ResourceLoader res;
	
	/**
	 * Create a new GridGame object and initialize game engine and game window. 
	 */
	public GridGame() {	
		initResource();
		initInput();
		initWindow();
		initEngine();
	}
	
	/**
	 * Initialize the resource loader
	 */
	protected void initResource() {
		res = new ResourceLoader();
		res.init();
		res.load();
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
