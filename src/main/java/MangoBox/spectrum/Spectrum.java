package MangoBox.spectrum;

import java.util.logging.Level;
import java.util.logging.Logger;

import MangoBox.spectrum.init.SpectrumBlocks;
import MangoBox.spectrum.init.SpectrumItems;
import MangoBox.spectrum.item.ItemThrustBoots;
import MangoBox.spectrum.proxy.CommonProxy;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Spectrum {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Instance(Reference.MOD_ID)
	public static Object Modinstance;
	
	public static final SpectrumTab tabSpectrum = new SpectrumTab("tabSpectrum");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Logger.getLogger(Reference.MOD_ID).log(Level.INFO, "PreInitialization Beginning for Spectrum");
		SpectrumBlocks.init();
		SpectrumBlocks.register();
		SpectrumItems.init();
		SpectrumItems.register();
		Logger.getLogger(Reference.MOD_ID).log(Level.INFO, "PreInitialization Complete for Spectrum :D");
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		Logger.getLogger(Reference.MOD_ID).log(Level.INFO, "Initialization Beginning for Spectrum");
		proxy.registerRenders();
		NetworkRegistry.INSTANCE.registerGuiHandler(Modinstance, new GuiHandler());
		Logger.getLogger(Reference.MOD_ID).log(Level.INFO, "Initialization Complete for Spectrum :D");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		Logger.getLogger(Reference.MOD_ID).log(Level.INFO, "PostInitialization Beginning for Spectrum");
		Logger.getLogger(Reference.MOD_ID).log(Level.INFO, "PostInitialization Complete for Spectrum! All ready to go! :D :D :D");
	}

}
