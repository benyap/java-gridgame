package bwyap.gridgame.render.drawable;

/**
 * An abstract for a drawable object with dimensions (width and height)
 * @author bwyap
 *
 */
public abstract class DrawableObject extends Drawable {

	protected float width, height;
	
	public DrawableObject(String id, int priority, float x, float y, float w, float h) {
		super(id, priority, x, y);
		this.width = w;
		this.height = h;
	}
	
	/**
	 * Get the width of the object
	 * @return
	 */
	public float getWidth() {
		return width;
	}
	
	/**
	 * Get the height of the object
	 * @return
	 */
	public float getHeight() {
		return height;
	}
}
