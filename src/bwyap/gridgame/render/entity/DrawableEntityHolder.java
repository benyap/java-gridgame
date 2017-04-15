package bwyap.gridgame.render.entity;

import java.awt.Graphics;

import bwyap.gridgame.render.entity.base.DrawableEntity;

/**
 * A class that holds a drawable entity within itself and draws it when this entity is rendered
 * @author bwyap
 *
 */
public abstract class DrawableEntityHolder extends DrawableEntity {
	
	protected DrawableEntity entity;
	
	/**
	 * Create a new entity holder
	 */
	public DrawableEntityHolder(DrawableEntity e) {
		super(e.id(), e.priority(), e.getPosX(), e.getPosY());
		this.entity = e;
	}

	@Override
	public void draw(Graphics g) {
		entity.draw(g);
	}
}
