package bwyap.gridgame.render.entity.base;

/**
 * An interface for all updatable entities
 * @author bwyap
 *
 */
public interface EntityInterface {
	
	/**
	 * Update the entity's state
	 * @param timeElapsed
	 */
	public void update(float timeElapsed);
	
	/**
	 * Set the y position of the entity
	 * @param y
	 */
	public void setPosY(float y);

	/**
	 * Set the x position of the entity
	 * @param x
	 */
	public void setPosX(float x);

	/**
	 * Set the x and y position of the entity
	 * @param x
	 * @param y
	 */
	public void setPosition(float x, float y);
		
	/**
	 * Get the x position of the entity
	 * @return
	 */
	public float getPosX();
	
	/**
	 * Get the y position of the entity
	 * @return
	 */
	public float getPosY();
	
}
