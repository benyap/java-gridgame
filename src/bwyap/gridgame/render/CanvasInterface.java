package bwyap.gridgame.render;

/**
 * Interface for a canvas which can render Drawable items
 * @author bwyap
 *
 */
public interface CanvasInterface {
	
	/**
	 * Add a drawable item to be rendered on the canvas
	 * @param item the drawable item
	 */
	public void addDrawable(DrawableInterface item);
	
	/**
	 * Remove a drawable item from the canvas.
	 * @param id the id of the drawable item
	 * @return the drawable item if it exists, null otherwise
	 */
	public DrawableInterface removeDrawable(String id);

}
