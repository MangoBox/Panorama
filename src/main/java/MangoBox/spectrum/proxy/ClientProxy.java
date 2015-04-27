package MangoBox.spectrum.proxy;

import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import MangoBox.spectrum.init.SpectrumItems;
import MangoBox.spectrum.Panorama;
import MangoBox.spectrum.init.SpectrumItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders() {
		SpectrumItems.registerRenders();
	}

}
