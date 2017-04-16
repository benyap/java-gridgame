package gridworld;

import java.awt.Color;
import java.util.ArrayList;

import bwyap.gridgame.GridGameWindow;
import bwyap.gridgame.render.entity.DrawableImage;
import bwyap.gridgame.render.entity.Ellipse;
import bwyap.gridgame.render.entity.Mover;
import bwyap.gridgame.render.entity.Orbiter;
import bwyap.gridgame.render.entity.Rectangle;
import bwyap.gridgame.render.entity.Text;
import bwyap.gridgame.render.entity.base.DrawableEntity;
import bwyap.gridgame.res.ResourceLoader;

/**
 * An extension of GridGameWindow which implements custom game functionality.
 * Demo of GridGame components
 * @author bwyap
 *
 */
public class GridWorldDemoWindow extends GridGameWindow {

	private static final long serialVersionUID = -3347622854920719009L;
	
	private ArrayList<Orbiter> orbiters;
	private Orbiter o3;
	private Mover m1;
	
	/**
	 * Create a GridWorldWindow and initialize the game state. <- TODO
	 * @param title
	 */
	public GridWorldDemoWindow(String title) {
		super(title);
	}
	
	/**
	 * Initialize test elements
	 */
	public void testInit() {
		// Create some text elements
		Text t1 = new Text("Title1", "Hello world!", 0, 0);
		t1.setSize(60);
		getCanvas().addDrawable(t1);

		Text t2 = new Text("Title2", "The quick brown fox jumps over the lazy dog", 5, 70);
		t2.setSize(14);
		getCanvas().addDrawable(t2);

		
		// Create orbiters
		orbiters = new ArrayList<Orbiter>();
		
		Rectangle r = new Rectangle("r1", 150, 200, 30, 30);
		r.setColour(Color.RED);
		addOrbiter(r, 100, 500);
		
		r = new Rectangle("r2", 550, 200, 30, 30);
		r.setColour(Color.BLUE);
		o3 = new Orbiter(r);
		o3.setRadius(120);
		o3.setSpeedX(500);
		o3.setSpeedY(300);
		orbiters.add(o3);
		getCanvas().addDrawable(o3);
		
		addEllipse("e0", 500, 100, 40, 250);
		addEllipse("e1", 100, 100, 80, 300);
		addEllipse("e2", 200, 200, 80, 400);
		addEllipse("e3", 300, 400, 80, 500);
		addEllipse("e4", 400, 100, 40, 450);
		addEllipse("e5", 500, 100, 80, 350);
		addEllipse("e6", 100, 100, 30, 300);
		addEllipse("e7", 200, 700, 20, 400);
		addEllipse("e8", 300, 400, 50, 500);
		addEllipse("e9", 400, 700, 70, 450);
		addEllipse("e10", 400, 100, 110, 470);
		addEllipse("e11", 500, 150, 20, 350);
		addEllipse("e12", 800, 150, 330, 330);
		addEllipse("e13", 680, 750, 40, 420);
		addEllipse("e14", 200, 450, 55, 510);
		addEllipse("e15", 300, 750, 75, 400);
		
		DrawableImage i1 = new DrawableImage("i1", 300, 400, 50, 50, ResourceLoader.getImage("ball"));
		addOrbiter(i1, 30, 300);
		
		// Create a move that responds to keyboard input
		DrawableImage i2 = new DrawableImage("i2", 1, 400, 500, 50, 50, ResourceLoader.getImage("ball"));
		m1 = new Mover(i2, input);
		getCanvas().addDrawable(m1);
	}
	
	/**
	 * Convenience method for adding generic orbiters to the canvas
	 * @param e
	 * @param radius
	 * @param speed
	 */
	private void addOrbiter(DrawableEntity e, int radius, int speed) {
		Orbiter o = new Orbiter(e);
		o.setRadius(radius);
		o.setSpeed(speed);
		getCanvas().addDrawable(o);
		orbiters.add(o);
	}
	
	/**
	 * Convenience method for adding ellipse orbiters to the canvas
	 * @param e
	 * @param radius
	 * @param speed
	 */
	private void addEllipse(String id, int x, int y, int radius, int speed) {
		Ellipse e = new Ellipse(id, x, y, 10, 10);
		e.setColour(Color.YELLOW);
		addOrbiter(e, radius, speed);
	}
	
	@Override
	public void update(float timeElapsed) {
		// update objects
		for(Orbiter o : orbiters) {
			o.update(timeElapsed);
		}
		m1.update(timeElapsed);
	}
	
}
