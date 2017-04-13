package bwyap.gridgame.render.drawable;

/**
 * An abstract base class for a drawable element
 * @author bwyap
 *
 */
public abstract class Drawable implements DrawableInterface {
	
	public static final int DEFAULT_PRIORITY = 1;
	
	private String id;
	private int priority;
	
	protected float x, y;
	
	/**
	 * Create a drawable object with the given ID and priority
	 * @param id
	 * @param priority
	 * @param x the x position to draw the element
	 * @param y the y position to draw the element
	 */
	public Drawable(String id, int priority, float x, float y) {
		this.id = id;
		this.priority = priority;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String id() {
		return id;
	}

	@Override
	public int priority() {
		return priority;
	}
	
	@Override
	public float x() {
		return x;
	}
	
	@Override
	public float y() {
		return y;
	}

	@Override
	public void setX(float x) {
		this.x = x;
	}

	@Override
	public void setY(float y) {
		this.y = y;
	}
	
	@Override
	public void setPosition(float x, float y) {
		setX(x);
		setY(y);
	}

}
