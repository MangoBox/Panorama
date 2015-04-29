package MangoBox.spectrum.init;

import MangoBox.spectrum.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SpectrumBlocks {
	
	public static Block BlockCrafterTier1;
	
	public static void init() {
		
		BlockCrafterTier1 = new MangoBox.spectrum.block.BlockCrafterTier1(Material.rock).setUnlocalizedName("BlockCrafterTier1");
		
	}
	
	public static void register() {
		GameRegistry.registerBlock(BlockCrafterTier1,BlockCrafterTier1.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRender(BlockCrafterTier1);
	}
	
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
