package gridworld.res;

import bwyap.gridgame.res.Resource;
import bwyap.gridgame.res.ResourceLoader;
import bwyap.gridgame.res.ResourceType;

/**
 * Extension of the resource loader that loads GridWorld resources
 * @author bwyap
 *
 */
public class GridWorldResources extends ResourceLoader {
	
	@Override
	public void init() {
		// Adding custom resources
		resources.put("ball", new Resource("ball", "/gridworld/res/temp/Ball.png", ResourceType.PNG));
		
		// TODO new resources here
		
		
	}
	
}
