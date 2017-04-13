package bwyap.gridgame.render.entity;

/**
 * An updatable entity with a position (x and y)
 * @author bwyap
 *
 */
public abstract class Entity implements EntityInterface {
	
	protected float posX, posY;
	
	@Override
	public void setPosX(float x) {
		this.posX = x;
	}
	
	@Override
	public void setPosY(float y) {
		this.posY = y;
	}
	
	@Override
	public void setPosition(float x, float y) {
		this.posX = x;
		this.posY = y;
	}
	
	@Override
	public float getPosX() {
		return posX;
	}
	
	@Override
	public float getPosY() {
		return posY;
	}
	
}
