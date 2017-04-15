package bwyap.gridgame.render.entity;

import bwyap.gridgame.input.KeyInputInterface;
import bwyap.gridgame.input.KeyMap.Key;
import bwyap.gridgame.render.entity.base.DrawableEntity;

/**
 * A drawable entity that responds to keyboard input
 * @author bwyap
 *
 */
public class Mover extends DrawableEntityHolder {
	
	private KeyInputInterface input;
	
	/**
	 * Create a new mover at the location of the drawable entity
	 * @param e
	 */
	public Mover(DrawableEntity e, KeyInputInterface input) {
		super(e);
		this.input = input;
	}
	
	@Override
	public void update(float timeElapsed) {
		// Implementing basic movement behaviour
		if (input.isKeyDown(input.getKeyMap().getMapping(Key.MOVE_UP))) {
			entity.setPosition(entity.getPosX(), (int)(entity.getPosY() - 0.4 * timeElapsed));
		}
		if (input.isKeyDown(input.getKeyMap().getMapping(Key.MOVE_DOWN))) {
			entity.setPosition(entity.getPosX(), (int)(entity.getPosY() + 0.4 * timeElapsed));
		}
		if (input.isKeyDown(input.getKeyMap().getMapping(Key.MOVE_LEFT))) {
			entity.setPosition((int)(entity.getPosX() - 0.4 * timeElapsed), entity.getPosY());
		}
		if (input.isKeyDown(input.getKeyMap().getMapping(Key.MOVE_RIGHT))) {
			entity.setPosition((int)(entity.getPosX() + 0.4 * timeElapsed), entity.getPosY());
		}
	}

}
