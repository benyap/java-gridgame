package gridworld;

import bwyap.gridgame.GridGame;
import gridworld.res.GridWorldResources;

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
	protected void initResource() {
		// Initialize custom GridWorld resources
		res = new GridWorldResources();
		res.init();
		res.load();
	}
	
	@Override
	protected void initWindow() {
		// Initialize a new GridWorldDemoWindow (instead of default window)
		window = new GridWorldDemoWindow(TITLE);
		window.addKeyListener(input);
		
		// initialize demo components
		((GridWorldDemoWindow)window).testInit();
	}
	
}
