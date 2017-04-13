package gridworld;

import bwyap.gridgame.GridGame;

/**
 * This is the class that is run by the Driver class.
 * All custom implementation through the GridGame Engine should be handled here.
 * Contains the game engine, game window and input controller objects
 * @author bwyap
 *
 */
public class GridWorld extends GridGame {
	
	public static final String TITLE = "Grid world";
	
	@Override
	protected void initWindow() {
		// Initialize a new GridWorldWindow (instead of default window)
		window = new GridWorldDemoWindow(TITLE);
	}
	
}
