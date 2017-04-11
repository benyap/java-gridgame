package bwyap.gridgame.render;

import java.awt.Graphics;

/**
 * A component that is drawable through Java's {@code Grahpics} API
 * @author bwyap
 *
 */
public interface Drawable {
	
	/**
	 * Draw the component through Java's {@code Grahpics} API
	 * @param g
	 */
	public void draw(Graphics g);
	
}
