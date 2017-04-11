package bwyap.gridgame;

import bwyap.gridgame.engine.GameEngineInterface;

/**
 * A GridGame object holds all game components, 
 * such as the game engine, game window and input controller. 
 * @author bwyap
 *
 */
public class GridGame {
	
	private static final int FPS_RATE = 30;
	
	private GridGameWindow window;
	private GameEngineInterface engine;
	
	/**
	 * Create a new GridGame object and initialize game engine and game window. 
	 */
	public GridGame() {		
		window = new GridGameWindow("Game Window");

		engine = new GridGameEngine(FPS_RATE, window);
		new Thread(engine).start();
		
		window.setVisible(true);
	}
	
}
