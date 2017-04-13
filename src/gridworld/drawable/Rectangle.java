package gridworld.drawable;

import java.awt.Color;
import java.awt.Graphics;

import bwyap.gridgame.render.drawable.Drawable;
import bwyap.gridgame.render.drawable.DrawableObject;

/**
 * A rectangular shaped drawable object
 * @author bwyap
 *
 */
public class Rectangle extends DrawableObject {

	public static final Color DEFAULT_COLOUR = Color.WHITE;

	private Color colour;
	
	/**
	 * Create a rectangular shaped drawable object
	 * @param id a unique name to identify the object
	 * @param priority specifies the drawing priority of the object
	 * @param x x position
	 * @param y y position
	 * @param w width
	 * @param h height
	 */
	public Rectangle(String id, int priority, float x, float y, float w, float h) {
		super(id, priority, x, y, w, h);
		colour = DEFAULT_COLOUR;
	}
	
	/**
	 * Create a rectangular shaped drawable object with a default drawing priority
	 * @param id a unique name to identify the object
	 * @param x x position
	 * @param y y position
	 * @param w width
	 * @param h height
	 */
	public Rectangle(String id, float x, float y, float w, float h) {
		this(id, Drawable.DEFAULT_PRIORITY, x, y, w, h);
	}
	
	/**
	 * Set the colour of the rectangle
	 * @param colour
	 */
	public void setColour(Color colour) {
		this.colour = colour;
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(colour);
		g.fillRect((int)x, (int)y, (int)width, (int)height);
	}

}
