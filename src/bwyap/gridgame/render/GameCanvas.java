package bwyap.gridgame.render;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/**
 * A GameCanvas is an extension of a Swing JPanel used to render game graphics.
 * Provides a custom paint method to render images to the screen.
 * @author bwyap
 *
 */
public class GameCanvas extends JPanel {

	private static final long serialVersionUID = -5071626780225236403L;
	
	private final Color DEFAULT_BG_COLOUR = Color.BLACK;
	
	private List<Drawable> drawables;
	
	/**
	 * Create a new GameCanvas
	 */
	public GameCanvas() {
		// switch on double buffering
		super(true);
		
		// default background colour
		this.setBackground(DEFAULT_BG_COLOUR);
		
		drawables = new ArrayList<Drawable>();
	}
	
	/**
	 * Add a drawable item to be rendered on the canvas
	 * @param item
	 */
	public void addDrawable(Drawable item) {
		drawables.add(item);
	}
	
	@Override
	/**
	 * Paint the game objects 
	 * @param g
	 */
	public final void paintComponent(Graphics g) {
		setAntialias((Graphics2D) g);
		super.paintComponent(g);
		
		// draw each component
		for(Drawable d : drawables) {
			d.draw(g);
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
