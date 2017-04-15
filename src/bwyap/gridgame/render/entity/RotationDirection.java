package bwyap.gridgame.render.entity;

/**
 * Specifies the direction of rotation for an orbit.
 * @author bwyap
 *
 */
public enum RotationDirection {
	CLOCKWISE(1, -1), ANTICLOCKWISE(1, 1);
	
	int dirX, dirY;
	
	RotationDirection(int dirX, int dirY) {
		this.dirX = dirX;
		this.dirY = dirY;
	}
}