package bwyap.gridgame.render;

/**
 * A GameWindow that holds a GameCanvas component for drawing to the screen
 * @author bwyap
 *
 */
public abstract class CanvasGameWindow extends GameWindow {

	private static final long serialVersionUID = -2586990083574509326L;
	
	protected GameCanvas canvas;
	
	/**
	 * Create a new CanvasGameWindow and initialize GameCanvas to a black screen
	 * @param title
	 */
	public CanvasGameWindow(String title) {
		super(title);
		
		canvas = new GameCanvas();
		this.add(canvas);
	}
	
	@Override
	public final void render() {
		canvas.repaint();
	}
	
}
