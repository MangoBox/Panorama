package MangoBox.spectrum.proxy;

import net.minecraftforge.fml.common.registry.GameRegistry;
import MangoBox.spectrum.gui.container.TileEntityTableCrafter;
import MangoBox.spectrum.init.SpectrumItems;

public class CommonProxy {

	public void registerRenders() {
		// TODO Auto-generated method stub
		
	}

	public void registerKeyBindings() {
		//NOOP
		
	}
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityTableCrafter.class, TileEntityTableCrafter.publicName);
	}

}
