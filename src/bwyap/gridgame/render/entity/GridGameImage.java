package bwyap.gridgame.render.entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import bwyap.gridgame.render.entity.base.DrawableEntityObject;

/**
 * A bufferred image that can be drawn to the canvas as an entity object
 * @author bwyap
 *
 */
public class GridGameImage extends DrawableEntityObject {

	private BufferedImage image;
	
	/**
	 * Create a new entity object represented by a drawable image
	 * @param id
	 * @param priority
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 * @param image the image to be drawn
	 */
	public GridGameImage(String id, int priority, float x, float y, float w, float h, BufferedImage image) {
		super(id, priority, x, y, w, h);
		this.image = image;
	}
	
	/**
	 * Create a new entity object represented by a drawable image (with default drawing priority)
	 * @param id
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 * @param image the image to be drawn
	 */
	public GridGameImage(String id, float x, float y, float w, float h, BufferedImage image) {
		this(id, DEFAULT_PRIORITY, x, y, w, h, image);
	}

	@Override
	public void draw(Graphics g) {
		// draw the image
		g.drawImage(image, 
				(int)posX, (int)posY, 
				(int)(posX + width), (int)(posY + height), 
				0, 0, 
				(int)image.getWidth(), (int)image.getHeight(), 
				null);
	}
	
	@Override
	public void update(float timeElapsed) {
		// TODO Auto-generated method stub
		
	}

}
