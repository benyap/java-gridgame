package bwyap.gridgame.render.drawable;

import java.awt.Graphics;

/**
 * A component that is drawable through Java's {@code Grahpics} API
 * @author bwyap
 *
 */
public interface DrawableInterface {
	
	/**
	 * Get the id of the drawable
	 * @return
	 */
	public String id();
	
	/**
	 * Draw the component through Java's {@code Grahpics} API
	 * @param g
	 */
	public void draw(Graphics g);
	
	/**
	 * Get the priority of of the drawable element
	 * @return
	 */
	public int priority();
	
	/**
	 * Get the x position to draw the object
	 * @return
	 */
	public float x();
	
	/**
	 * Get the y position to draw the object
	 * @return
	 */
	public float y();
	
	/**
	 * Set the x position of the object
	 * @param x
	 */
	public void setX(float x);
	
	/**
	 * Set the y position of the object
	 * @param y
	 */
	public void setY(float y);
	
	/**
	 * Set the x and y position of the object
	 * @param x
	 * @param y
	 */
	public void setPosition(float x, float y);
	
}
