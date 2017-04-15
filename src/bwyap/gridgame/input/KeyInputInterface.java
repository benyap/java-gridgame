package bwyap.gridgame.input;

/**
 * An interface for polling a key input controller
 * @author bwyap
 *
 */
public interface KeyInputInterface {
	
	/**
	 * Check if the specified key is down
	 * @param keycode
	 * @return
	 */
	public boolean isKeyDown(int keycode);
	
	/**
	 * Check if a specified key is down,
	 * and consumes the key event if it is down
	 * (sets the keyDown value to false)
	 * @param keycode
	 * @return
	 */
	public boolean getKeyPress(int keycode);
	
	/** 
	 * Return the key map used by the KeyInputController
	 */
	public KeyMap getKeyMap();
	
}
