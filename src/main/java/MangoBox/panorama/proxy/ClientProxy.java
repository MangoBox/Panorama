package MangoBox.panorama.proxy;

import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import MangoBox.panorama.Panorama;
import MangoBox.panorama.init.PanoramaItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders() {
		PanoramaItems.registerRenders();
	}

}
