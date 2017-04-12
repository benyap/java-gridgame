package gridworld;

import java.awt.Color;

import bwyap.gridgame.GridGameWindow;
import gridworld.drawable.Rectangle;
import gridworld.drawable.Text;

/**
 * An extension of GridGameWindow which implements custom game functionality
 * @author bwyap
 *
 */
public class GridWorldWindow extends GridGameWindow {

	private static final long serialVersionUID = -3347622854920719009L;
	
	private Rectangle s1; 
	
	/**
	 * Create a GridWorldWindow and initialize the game state. <- TODO
	 * @param title
	 */
	public GridWorldWindow(String title) {
		super(title);
		test();
	}
	
	/*
	 * TODO TESTING ONLY
	 */
	public void test() {
		Text t1 = new Text("Title1", "Hello HELLO", 0, 0);
		t1.setSize(60);
		
		Text t2 = new Text("Title2", "Hello HELLO", 400, 0);
		t2.setSize(10);
		
		getCanvas().addDrawable(t1);
		getCanvas().addDrawable(t2);
		
		s1 = new Rectangle("Square1", 100, 100, 30, 30);
		s1.setColour(Color.RED);
		getCanvas().addDrawable(s1);
	}
	
	float counter = 0;
	@Override
	public void update(float timeElapsed) {
		
		// TODO TESTING ONLY ====
		counter += timeElapsed;
		s1.setPosition(200 + (int)(80*Math.sin(counter/300)), 200 + (int)(80*Math.cos(counter/300)));
		// ======================
		
	}
	
}
