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
public class GridWorldDemoWindow extends GridGameWindow {

	private static final long serialVersionUID = -3347622854920719009L;
	
	private Rectangle s1; 
	private Rectangle s2; 
	private Rectangle s3; 
	
	/**
	 * Create a GridWorldWindow and initialize the game state. <- TODO
	 * @param title
	 */
	public GridWorldDemoWindow(String title) {
		super(title);
		test();
	}
	
	/*
	 * TODO TESTING ONLY
	 */
	public void test() {
		Text t1 = new Text("Title1", "Hello world!", 0, 0);
		t1.setSize(60);
		
		Text t2 = new Text("Title2", "The quick brown fox jumps over the lazy dog", 5, 70);
		t2.setSize(14);
		
		getCanvas().addDrawable(t1);
		getCanvas().addDrawable(t2);
		
		s1 = new Rectangle("Square1", 100, 100, 30, 30);
		s1.setColour(Color.RED);
		getCanvas().addDrawable(s1);
		
		s2 = new Rectangle("Square2", 100, 100, 30, 30);
		s2.setColour(Color.GREEN);
		getCanvas().addDrawable(s2);
		
		s3 = new Rectangle("Square3", 100, 100, 30, 30);
		s3.setColour(Color.BLUE);
		getCanvas().addDrawable(s3);
	}
	
	float counter = 0;
	@Override
	public void update(float timeElapsed) {
		
		// TODO TESTING ONLY ====
		counter += timeElapsed;
		s1.setPosition(200 + (int)(80*Math.sin(counter/300)), 200 + (int)(80*Math.cos(counter/300)));
		s2.setPosition(400 + (int)(90*Math.sin(counter/200)), 200 + (int)(90*Math.cos(counter/200)));
		s3.setPosition(600 + (int)(70*Math.sin(counter/100)), 200 + (int)(-70*Math.sin(counter/100)));
		// ======================
		
	}
	
}
