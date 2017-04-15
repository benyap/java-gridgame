package gridworld.res;

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
	
	private HashMap<String, Resource> resources;
	
	private static HashMap<String, BufferedImage> images;
	
	/**
	 * Get an image from the resource loader
	 * @param id
	 * @return
	 */
	public static BufferedImage getImage(String id) {
		return images.get(id);
	}
	
	/**
	 * Initialize resource loader
	 */
	public void init() {
		images = new HashMap<String, BufferedImage>();
		
		resources = new HashMap<String, Resource>();
		
		// Add resources to the list
		resources.put("ball", new Resource("ball", "/gridworld/res/temp/Ball.png", ResourceType.PNG));
		// TODO
		//
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
	private void loadImage(String id, String location) {
		try {
			BufferedImage bg = ImageIO.read(getClass().getResource(location));
		    images.put(id, bg);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
