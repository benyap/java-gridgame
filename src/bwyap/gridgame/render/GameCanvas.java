package bwyap.gridgame.render;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;

/**
 * A GameCanvas is an extension of a Swing JPanel used to render game graphics.
 * Provides a custom paint method to render images to the screen.
 * @author bwyap
 *
 */
public class GameCanvas extends JPanel implements CanvasInterface {

	private static final long serialVersionUID = -5071626780225236403L;
	
	private final Color DEFAULT_BG_COLOUR = Color.BLACK;
	
	private Map<Integer, Map<String, DrawableInterface>> drawables;	// map of priority levels to drawables
	private Map<String, Integer> drawablePriority;					// map of drawable IDs to priority levels
	private List<Integer> priorities;								// sorted list of existing priorities
	
	/**
	 * Create a new GameCanvas
	 */
	public GameCanvas() {
		// switch on double buffering
		super(true);
		
		// default background colour
		this.setBackground(DEFAULT_BG_COLOUR);
		
		// initialize maps
		drawables = new HashMap<Integer, Map<String, DrawableInterface>>();
		drawablePriority = new HashMap<String, Integer>();
		priorities = new LinkedList<Integer>();
	}
	
	@Override
	public void addDrawable(DrawableInterface item) {
		// create new map for priority level if it doesn't exist
		if (!drawables.containsKey(item.priority())) {
			Map<String, DrawableInterface> map = new HashMap<String, DrawableInterface>();
			drawables.put(item.priority(), map);
			priorities.add(item.priority());
			Collections.sort(priorities);
		}
		
		// add the drawable
		drawables.get(item.priority()).put(item.id(), item);
		drawablePriority.put(item.id(), item.priority());
	}
	
	@Override
	public DrawableInterface removeDrawable(String id) {
		// check if the drawable exists
		if (drawablePriority.containsKey(id)) {
			return drawables.get(drawablePriority.get(id)).remove(id);
		}
		else return null;
	}
	
	/**
	 * Paint the game objects to the canvas. 
	 * @param g
	 */
	@Override
	public final void paintComponent(Graphics g) {
		setAntialias((Graphics2D) g);
		super.paintComponent(g);
		
		// for each priority, draw all objects in that layer
		// priorities should be kept sorted by the addDrawable method
		for(int p : priorities) {
			for(String id : drawables.get(p).keySet()) {
				drawables.get(p).get(id).draw(g);
			}
		}
	}
	
	/**
	 * Set anti-alias on
	 * @param g
	 */
	private void setAntialias(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON); 
	}
	
}
