package bwyap.gridgame.render;

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
	
}
