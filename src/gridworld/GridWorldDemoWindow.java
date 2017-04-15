package gridworld;

import java.awt.Color;

import bwyap.gridgame.GridGameWindow;
import bwyap.gridgame.render.entity.Image;
import bwyap.gridgame.render.entity.Rectangle;
import bwyap.gridgame.render.entity.Text;
import bwyap.gridgame.res.ResourceLoader;
import gridworld.entity.Orbiter;
import gridworld.entity.RotationDirection;

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
	private Orbiter o4;
	
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

		
		// Create orbiters
		Rectangle r = new Rectangle("r1", 150, 200, 30, 30);
		r.setColour(Color.RED);
		o1 = new Orbiter(r);
		o1.setRadius(100);
		o1.setSpeed(500);
		getCanvas().addDrawable(o1);
		
		r = new Rectangle("r2", 350, 200, 30, 30);
		r.setColour(Color.GREEN);
		o2 = new Orbiter(r);
		o2.setRadius(80);
		o2.setSpeed(100);
		o2.setDirection(RotationDirection.ANTICLOCKWISE);
		getCanvas().addDrawable(o2);
		
		r = new Rectangle("r3", 550, 200, 30, 30);
		r.setColour(Color.BLUE);
		o3 = new Orbiter(r);
		o3.setRadius(120);
		o3.setSpeedX(500);
		o3.setSpeedY(300);
		getCanvas().addDrawable(o3);
		
		Image i = new Image("i1", 300, 400, 50, 50, ResourceLoader.getImage("ball"));
		o4 = new Orbiter(i);
		o4.setSpeed(300);
		getCanvas().addDrawable(o4);
		
	}
	
	@Override
	public void update(float timeElapsed) {
		// update objects
		o1.update(timeElapsed);
		o2.update(timeElapsed);
		o3.update(timeElapsed);
		o4.update(timeElapsed);
	}
	
}
