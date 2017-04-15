package bwyap.gridgame.render.entity;

import java.awt.Graphics;

/**
 * An elliptical drawable object
 * @author bwyap
 *
 */
public class Ellipse extends Shape {

	/**
	 * Create an elliptical drawable object
	 * @param id a unique name to identify the object
	 * @param priority specifies the drawing priority of the object
	 * @param x x position
	 * @param y y position
	 * @param w width
	 * @param h height
	 */
	public Ellipse(String id, int priority, float x, float y, float w, float h) {
		super(id, priority, x, y, w, h);
	}
	
	/**
	 * Create an elliptical drawable object with a default drawing priority
	 * @param id a unique name to identify the object
	 * @param priority specifies the drawing priority of the object
	 * @param x x position
	 * @param y y position
	 * @param w width
	 * @param h height
	 */
	public Ellipse(String id, float x, float y, float w, float h) {
		super(id, x, y, w, h);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(colour);
		g.fillOval((int)posX, (int)posY, (int)width, (int)height);
	}
	
}
