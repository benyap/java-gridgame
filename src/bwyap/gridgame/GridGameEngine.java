package bwyap.gridgame;

import bwyap.gridgame.engine.FixedTimeStepGameEngine;

/**
 * Implementation of the FixedTimeStepGameEngine for the GridGame
 * @author bwyap
 *
 */
public class GridGameEngine extends FixedTimeStepGameEngine {
	
	private GridGameWindow window;
	
	/**
	 * Create a GridGameEngine with the desired target fps
	 * @param fps
	 */
	public GridGameEngine(float fps, GridGameWindow window) {
		super(fps);
		this.window = window;
	}
	
	@Override
	public void update(float timeElapsed) {
		// update the window
		window.update(timeElapsed);
		
	}
	
	@Override
	public void render() {
		// update the fps in the title bar
		window.setTitle(window.getDefaultTitle() + " (" + (int)getMeasuredfps() + " fps)");
		
		// render components in the window
		window.render();
	}
	
}
