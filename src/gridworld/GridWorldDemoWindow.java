package gridworld;

import java.awt.Color;

import bwyap.gridgame.GridGameWindow;
import gridworld.entity.Orbiter;
import gridworld.entity.RotationDirection;
import gridworld.entity.base.Text;

/**
 * An extension of GridGameWindow which implements custom game functionality
 * @author bwyap
 *
 */
public class GridWorldDemoWindow extends GridGameWindow {

	private static final long serialVersionUID = -3347622854920719009L;
	
	private Orbiter o1;
	private Orbiter o2;
	private Orbiter o3;
	
	/**
	 * Create a GridWorldWindow and initialize the game state. <- TODO
	 * @param title
	 */
	public GridWorldDemoWindow(String title) {
		super(title);
		test();
	}
	
	public void test() {
		// Create some text elements
		Text t1 = new Text("Title1", "Hello world!", 0, 0);
		t1.setSize(60);
		getCanvas().addDrawable(t1);

		Text t2 = new Text("Title2", "The quick brown fox jumps over the lazy dog", 5, 70);
		t2.setSize(14);
		getCanvas().addDrawable(t2);

		
		// Create three orbiters
		o1 = new Orbiter("o1", 150, 200, 30, 30);
		o1.setColour(Color.RED);
		o1.setRadius(100);
		o1.setSpeed(500);
		getCanvas().addDrawable(o1);
		
		o2 = new Orbiter("o2", 350, 200, 30, 30);
		o2.setColour(Color.GREEN);
		o2.setRadius(80);
		o2.setSpeed(100);
		o2.setDirection(RotationDirection.ANTICLOCKWISE);
		getCanvas().addDrawable(o2);
		
		o3 = new Orbiter("o3", 650, 200, 30, 30);
		o3.setColour(Color.BLUE);
		o3.setRadius(120);
		o3.setSpeedX(500);
		o3.setSpeedY(300);
		getCanvas().addDrawable(o3);
	}
	
	@Override
	public void update(float timeElapsed) {
		// update objects
		o1.update(timeElapsed);
		o2.update(timeElapsed);
		o3.update(timeElapsed);
	}
	
}
