package bwyap.gridgame.render.entity;

/**
 * An abstract base class for a drawable element
 * @author bwyap
 *
 */
public abstract class DrawableEntity extends Entity implements DrawableInterface {
	
	public static final int DEFAULT_PRIORITY = 1;
	
	private String id;
	private int priority;
		
	/**
	 * Create a drawable object with the given ID and priority
	 * @param id
	 * @param priority
	 * @param x the x position to draw the element
	 * @param y the y position to draw the element
	 */
	public DrawableEntity(String id, int priority, float x, float y) {
		this.id = id;
		this.priority = priority;
		this.posX = x;
		this.posY = y;
	}
	
	@Override
	public String id() {
		return id;
	}

	@Override
	public int priority() {
		return priority;
	}
	
}
