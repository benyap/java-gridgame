package gridworld.drawable;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

/**
 * A drawable text element
 * @author bwyap
 *
 */
public class Text extends Drawable {
	
	public static final String DEFAULT_FONTNAME = "SansSerif";
	public static final int DEFAULT_SIZE = 12;
	public static final int DEFAULT_STYLE = Font.PLAIN;
	public static final Color DEFAULT_COLOUR = Color.WHITE;
	
	private String text;
	private Font font;
	private Color colour;
	
	private boolean updateRenderY;
	private float renderY;
	
	/**
	 * Create a text element that can be drawn 
	 * @param id a unique name to identify the object
	 * @param priority specifies the drawing priority of the object
	 * @param text the text of the element
	 * @param x x position
	 * @param y y position
	 */
	public Text(String id, int priority, String text, float x, float y) {
		super(id, priority, x, y);
		this.text = text;
		font = new Font(DEFAULT_FONTNAME, DEFAULT_STYLE, DEFAULT_SIZE);
		colour = DEFAULT_COLOUR;
	}
	
	/**
	 * Create a text element that can be drawn with the default drawing priority
	 * @param id a unique name to identify the object
	 * @param text the text of the element
	 * @param x x position
	 * @param y y position
	 */
	public Text(String id, String text, float x, float y) {
		this(id, Drawable.DEFAULT_PRIORITY, text, x, y);
	}
	
	/**
	 * Set the font, style and size of the text element
	 * @param fontName
	 * @param style
	 * @param size
	 */
	public void setFont(String fontName, int style, int size) {
		font = new Font(fontName, style, size);
	}
	
	/**
	 * Set the font used by the text element
	 * @param fontName
	 */
	public void setFont(String fontName) {
		font = new Font(fontName, font.getStyle(), font.getSize());
	}
	
	/**
	 * Set the size of the font element
	 * @param size
	 */
	public void setSize(int size) {
		font = new Font(font.getName(), font.getStyle(), size);
		updateRenderY = true;
	}
	
	/**
	 * Set the style of the font element
	 * @param style
	 */
	public void setStyle(int style) {
		font = new Font(font.getName(), style, font.getStyle());
	}
	
	/**
	 * Set the colour of the font element
	 * @param colour
	 */
	public void setColour(Color colour) {
		this.colour = colour;
	}
	
	@Override
	public void draw(Graphics g) {
		if (updateRenderY) updateRenderY(g);
		g.setFont(font);
		g.setColor(colour);
		g.drawString(text, (int)x, (int)renderY);
	}	
	
	/**
	 * Update the render Y position to factor in baseline rendering for the drawString method
	 * @param g
	 */
	private void updateRenderY(Graphics g) {
		FontMetrics metrics = g.getFontMetrics(font);		
		renderY = y + metrics.getHeight() - metrics.getDescent();
	}

}
