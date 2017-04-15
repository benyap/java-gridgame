package bwyap.gridgame.render.entity;

import java.awt.Color;

import bwyap.gridgame.render.entity.base.DrawableEntityObject;

/**
 * An abstract class that represents a drawable shape
 * @author bwyap
 *
 */
public abstract class Shape extends DrawableEntityObject {
	
	public static final Color DEFAULT_COLOUR = Color.WHITE;

	protected Color colour;
	
	public Shape(String id, int priority, float x, float y, float w, float h) {
		super(id, priority, x, y, w, h);
		colour = DEFAULT_COLOUR;
	}

	public Shape(String id, float x, float y, float w, float h) {
		this(id, DEFAULT_PRIORITY, x, y, w, h);
	}

	/**
	 * Set the colour of the shape
	 * @param colour
	 */
	public void setColour(Color colour) {
		this.colour = colour;
	}
	
	@Override
	public void update(float timeElapsed) {
		// TODO Auto-generated method stub
		
	}
	
}
