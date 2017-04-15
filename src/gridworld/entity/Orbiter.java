package gridworld.entity;

import java.awt.Graphics;

import bwyap.gridgame.render.entity.base.DrawableEntity;
import bwyap.gridgame.render.entity.base.DrawableInterface;

/**
 * A class which holds an entity and orbits it around a point
 * @author bwyap
 *
 */
public class Orbiter extends DrawableEntity implements DrawableInterface {
	
	private RotationDirection  direction = RotationDirection.CLOCKWISE;
	private float counter = 0;
	private float centerX, centerY;
	private float radiusX = 100, radiusY = 100;
	private float speedX = 100, speedY = 100;
	
	private DrawableEntity entity;
	
	/**
	 * Create a new orbiter centered at x and y with a default radius and speed
	 */
	public Orbiter(DrawableEntity e) {
		super(e.id(), e.priority(), e.getPosX(), e.getPosY());
		this.centerX = e.getPosX();
		this.centerY = e.getPosY();
		this.entity = e;
	}
	
	/**
	 * Set the center point which the orbiter orbits around
	 * @param centerX
	 * @param centerY
	 */
	public void setCenter(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	/**
	 * Set the radius of the orbit
	 * @param radius
	 */
	public void setRadius(int radius) {
		this.radiusX = radius;
		this.radiusY = radius;
	}
	
	/**
	 * Set the x width of the orbit
	 * @param radiusX
	 */
	public void setRadiusX(int radiusX) {
		this.radiusX = radiusX;
	}
	
	/**
	 * Set the y height of the orbit
	 * @param radiusY
	 */
	public void setRadiusY(int radiusY) {
		this.radiusY = radiusY;
	}
	
	/**
	 * Set the speed of the orbit (higher number means slower orbit).
	 * @param speed
	 */
	public void setSpeed(float speed) {
		this.speedX = speed;
		this.speedY = speed;
	}
	
	/**
	 * Set the x speed of the orbit (higher number means slower orbit).
	 * Note that if the x and y speed are different, it will no longer be an elliptical orbit.
	 * @param speed
	 */
	public void setSpeedX(float speedX) {
		this.speedX = speedX;
	}
	
	/**
	 * Set the y speed of the orbit (higher number means slower orbit).
	 * Note that if the x and y speed are different, it will no longer be an elliptical orbit.
	 * @param speed
	 */
	public void setSpeedY(float speedY) {
		this.speedY = speedY;
	}
	
	/**
	 * Set the direction of rotation
	 * @param direction
	 */
	public void setDirection(RotationDirection direction) {
		this.direction = direction;
	}
	
	@Override
	public void update(float timeElapsed) {
		counter += timeElapsed;
		
		// use sin and cos to achieve rotation based on counter
		entity.setPosition(
				centerX + (int)(radiusX*direction.dirX*Math.sin(counter/speedX)), 
				centerY + (int)(radiusY*direction.dirY*Math.cos(counter/speedY)));
	}

	@Override
	public void draw(Graphics g) {
		entity.draw(g);
	}

}
