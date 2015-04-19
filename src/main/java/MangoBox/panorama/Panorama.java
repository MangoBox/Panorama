package MangoBox.panorama;

import java.util.logging.Level;
import java.util.logging.Logger;

import MangoBox.panorama.init.PanoramaItems;
import MangoBox.panorama.item.ItemThrustBoots;
import MangoBox.panorama.proxy.CommonProxy;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Panorama {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Logger.getLogger(Reference.MOD_ID).log(Level.INFO, "PreInitialization Beginning for Panorama");
		PanoramaItems.init();
		PanoramaItems.register();
		Logger.getLogger(Reference.MOD_ID).log(Level.INFO, "PreInitialization Complete for Panorama :D");
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		Logger.getLogger(Reference.MOD_ID).log(Level.INFO, "Initialization Beginning for Panorama");
		proxy.registerRenders();
		Logger.getLogger(Reference.MOD_ID).log(Level.INFO, "Initialization Complete for Panorama :D");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		Logger.getLogger(Reference.MOD_ID).log(Level.INFO, "PostInitialization Beginning for Panorama");
		Logger.getLogger(Reference.MOD_ID).log(Level.INFO, "PostInitialization Complete for Panorama! All ready to go! :D :D :D");
	}

}
