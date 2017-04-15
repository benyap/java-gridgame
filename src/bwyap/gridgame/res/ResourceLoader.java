package bwyap.gridgame.res;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

/**
 * A class responsible for loading resources 
 * @author bwyap
 *
 */
public class ResourceLoader {
	
	protected HashMap<String, Resource> resources = new HashMap<String, Resource>();
	
	private static HashMap<String, BufferedImage> images = new HashMap<String, BufferedImage>();	
	
	/**
	 * Get an image from the resource loader
	 * @param id
	 * @return
	 */
	public static BufferedImage getImage(String id) {
		return images.get(id);
	}
	
	/**
	 * Initialize resource loader.
	 * This method should be overridden to load custom resources.
	 */
	public void init() {
		
	}
	
	/**
	 * Load resources
	 */
	public void load() {
		// load all resources
		for(String s : resources.keySet()) {
			Resource r = resources.get(s);
			switch(r.type()) {
			case PNG:
				loadImage(r.id(), r.location());
				break;
			}
		}
	}
	
	/**
	 * Load an image from within class
	 * @param id
	 * @param location
	 */
	protected void loadImage(String id, String location) {
		try {
			BufferedImage bg = ImageIO.read(getClass().getResource(location));
		    images.put(id, bg);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
