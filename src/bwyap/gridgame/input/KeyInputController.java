package bwyap.gridgame.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * A basic key input controller for a keyboard.
 * NOTE: this key controller does not support modifier keys 
 * (e.g. {@code SHIFT}, {@code ALT} etc.)
 * @author bwyap
 *
 */
public class KeyInputController implements KeyInputInterface, KeyListener {
	
	private boolean[] keys;
	private KeyMap keyMap;
	
	/**
	 * Create a new key input controller
	 */
	public KeyInputController() {
		keys = new boolean[65535];
		keyMap = new KeyMap();
	}
	
	@Override
	public boolean isKeyDown(int keycode) {
		return keys[keycode];
	}
	
	@Override
	public boolean getKeyPress(int keycode) {
		if (keys[keycode]) {
			keys[keycode] = false;
			return true;
		}
		return false;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}
	
	@Override
	public void keyTyped(KeyEvent e) { }
	
	/**
	 * Set the key map used by the KeyInputController
	 * @param keyMap
	 */
	public void setKeyMap(KeyMap keyMap) {
		this.keyMap = keyMap;
	}
	
	@Override
	public KeyMap getKeyMap() {
		return keyMap;
	}
	
}
