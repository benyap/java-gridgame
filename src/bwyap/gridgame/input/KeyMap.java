package bwyap.gridgame.input;

import java.util.HashMap;

import com.sun.glass.events.KeyEvent;

/**
 * A mapping of keyboard inputs to supported key presses
 * @author bwyap
 *
 */
public class KeyMap {
	
	/**
	 * Supported key presses in the {@code KeyMap} object
	 * @author bwyap
	 *
	 */
	public enum Key {
		MOVE_UP,
		MOVE_DOWN,
		MOVE_LEFT,
		MOVE_RIGHT;
	}
	
	private HashMap<Key, Integer> map;
	
	/**
	 * Create a new key map with deafult values
	 */
	public KeyMap() {
		map = new HashMap<Key, Integer>();
		setDefaults();
	}
	
	/**
	 * Set the default key map values
	 */
	public void setDefaults() {
		map.put(Key.MOVE_UP, KeyEvent.VK_W);
		map.put(Key.MOVE_DOWN, KeyEvent.VK_S);
		map.put(Key.MOVE_LEFT, KeyEvent.VK_A);
		map.put(Key.MOVE_RIGHT, KeyEvent.VK_D);
	}
	
	/**
	 * Get the keycode mapping of the specified key press
	 * @param m
	 * @return
	 */
	public int getMapping(Key m) {
		return map.get(m);
	}
	
	/**
	 * Set the keycode mapping of the specified key press
	 * @param m
	 * @param keycode
	 */
	public void setMapping(Key m, int keycode) {
		map.put(m, keycode);
	}
	
}
