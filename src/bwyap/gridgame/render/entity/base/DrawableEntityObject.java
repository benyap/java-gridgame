package bwyap.gridgame.render.entity.base;

/**
 * An abstract class for a drawable entity with dimensions (width and height)
 * @author bwyap
 *
 */
public abstract class DrawableEntityObject extends DrawableEntity {

	protected float width, height;
	
	public DrawableEntityObject(String id, int priority, float x, float y, float w, float h) {
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
