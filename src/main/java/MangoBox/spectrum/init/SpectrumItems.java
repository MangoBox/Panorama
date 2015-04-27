package MangoBox.spectrum.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import MangoBox.spectrum.item.ItemThrustBoots;
import MangoBox.spectrum.Panorama;
import MangoBox.spectrum.Reference;

public class SpectrumItems {
	
	//Armor
	public static Item ItemThrustBoots;
	public static Item ItemScubaHelmet;
	public static Item ItemSpeedyPants;
	public static Item ItemSheildChest;
	public static Item ItemNanoHelm;
	public static Item ItemNanoChest;
	public static Item ItemNanoLegs;
	public static Item ItemNanoBoots;
	
	//Tools and Weapons
	public static Item ItemIcicleBlade;
	public static Item ItemStrongPickaxe;
	public static Item ItemSlicyAxe;
	public static Item ItemAceOfSpades;
	public static Item ItemDefendersEdge;
	
	//Items
	public static Item ItemPortalPearl;
	public static Item ItemTier1Core;
	public static Item ItemTier2Core;
	public static Item ItemTier3Core;
	
	//Armor Materials
	public static ItemArmor.ArmorMaterial basicArmorMaterial = EnumHelper.addArmorMaterial("basicArmorMaterial", "panorama:models/armor/basicmaterial_layer_1.png", 1000, new int[]{1, 1, 1, 1}, 10);
	public static ItemArmor.ArmorMaterial nanoArmorMaterial = EnumHelper.addArmorMaterial("nanoArmorMaterial", "panorama:models/armor/nanomaterial_layer_1.png", 1000, new int[]{5, 5, 5, 5}, 10);
	
	//Tool materials
	public static Item.ToolMaterial basicMaterial = EnumHelper.addToolMaterial("BasicMaterial", 1000, 0, 14F, 2F, 10);
	public static Item.ToolMaterial Tier2Material = EnumHelper.addToolMaterial("Tier2Material", 1000, 0, 14F, 2F, 10);
	
	public static void init() {
		//Armor
		ItemThrustBoots = new MangoBox.spectrum.materialClasses.basicArmorMaterial(basicArmorMaterial, 0, 3).setUnlocalizedName("ItemThrustBoots").setCreativeTab(Panorama.tabPanorama);
		ItemScubaHelmet = new MangoBox.spectrum.materialClasses.basicArmorMaterial(basicArmorMaterial, 0, 0).setUnlocalizedName("ItemScubaHelmet").setCreativeTab(Panorama.tabPanorama);
		ItemSpeedyPants = new MangoBox.spectrum.materialClasses.basicArmorMaterial(basicArmorMaterial, 0, 2).setUnlocalizedName("ItemSpeedyPants").setCreativeTab(Panorama.tabPanorama);
		ItemSheildChest = new MangoBox.spectrum.materialClasses.basicArmorMaterial(basicArmorMaterial, 0, 1).setUnlocalizedName("ItemSheildChest").setCreativeTab(Panorama.tabPanorama);
		ItemNanoHelm = new MangoBox.spectrum.materialClasses.nanoArmorMaterial(nanoArmorMaterial, 0, 0).setUnlocalizedName("ItemNanoHelm").setCreativeTab(Panorama.tabPanorama);
		ItemNanoChest = new MangoBox.spectrum.materialClasses.nanoArmorMaterial(nanoArmorMaterial, 0, 1).setUnlocalizedName("ItemNanoChest").setCreativeTab(Panorama.tabPanorama);
		ItemNanoLegs = new MangoBox.spectrum.materialClasses.nanoArmorMaterial(nanoArmorMaterial, 0, 2).setUnlocalizedName("ItemNanoLegs").setCreativeTab(Panorama.tabPanorama);
		ItemNanoBoots = new MangoBox.spectrum.materialClasses.nanoArmorMaterial(nanoArmorMaterial, 0, 3).setUnlocalizedName("ItemNanoBoots").setCreativeTab(Panorama.tabPanorama);
		
		//Items
		ItemPortalPearl = new Item().setUnlocalizedName("ItemPortalPearl").setCreativeTab(Panorama.tabPanorama);
		ItemTier1Core = new Item().setUnlocalizedName("ItemTier1Core").setCreativeTab(Panorama.tabPanorama);
		ItemTier2Core = new Item().setUnlocalizedName("ItemTier2Core").setCreativeTab(Panorama.tabPanorama);
		ItemTier3Core = new Item().setUnlocalizedName("ItemTier3Core").setCreativeTab(Panorama.tabPanorama);
		
		
		//Tools and Weapons
		ItemIcicleBlade = new MangoBox.spectrum.item.ItemIcicleBlade(basicMaterial).setUnlocalizedName("ItemIcicleBlade").setCreativeTab(Panorama.tabPanorama);
		ItemStrongPickaxe = new MangoBox.spectrum.item.ItemStrongPickaxe(basicMaterial).setUnlocalizedName("ItemStrongPickaxe").setCreativeTab(Panorama.tabPanorama);
		ItemSlicyAxe = new MangoBox.spectrum.item.ItemSlicyAxe(basicMaterial).setUnlocalizedName("ItemSlicyAxe").setCreativeTab(Panorama.tabPanorama);
		ItemAceOfSpades = new MangoBox.spectrum.item.ItemAceOfSpades(basicMaterial).setUnlocalizedName("ItemAceOfSpades").setCreativeTab(Panorama.tabPanorama);
		ItemDefendersEdge = new MangoBox.spectrum.item.ItemDefendersEdge(Tier2Material).setUnlocalizedName("ItemDefendersEdge").setCreativeTab(Panorama.tabPanorama);
	
	
	}
	
	
	public static void register() {
		
		//Armor
		GameRegistry.registerItem(ItemThrustBoots, ItemThrustBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemScubaHelmet, ItemScubaHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSpeedyPants, ItemSpeedyPants.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSheildChest, ItemSheildChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemNanoHelm, ItemNanoHelm.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemNanoChest, ItemNanoChest.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemNanoLegs, ItemNanoLegs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemNanoBoots, ItemNanoBoots.getUnlocalizedName().substring(5));
		
		//Items
		GameRegistry.registerItem(ItemPortalPearl, ItemPortalPearl.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemTier1Core, ItemTier1Core.getUnlocalizedName().substring(5));
		
		//Tools and Weapons
		GameRegistry.registerItem(ItemIcicleBlade, ItemIcicleBlade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemStrongPickaxe, ItemStrongPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSlicyAxe, ItemSlicyAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemAceOfSpades, ItemAceOfSpades.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemDefendersEdge,ItemDefendersEdge.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemTier1Core, ItemTier1Core.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemTier2Core, ItemTier2Core.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemTier3Core, ItemTier3Core.getUnlocalizedName().substring(5));
	}

	public static void registerRenders() {
		//Armor
		registerRender(ItemThrustBoots);
		registerRender(ItemScubaHelmet);
		registerRender(ItemSpeedyPants);
		registerRender(ItemSheildChest);
		registerRender(ItemNanoHelm);
		registerRender(ItemNanoChest);
		registerRender(ItemNanoLegs);
		registerRender(ItemNanoBoots);
		
		//Items
		registerRender(ItemPortalPearl);
		registerRender(ItemTier1Core);
		registerRender(ItemTier2Core);
		registerRender(ItemTier3Core);
		
		//Tools and Weapons
		registerRender(ItemIcicleBlade);
		registerRender(ItemStrongPickaxe);
		registerRender(ItemSlicyAxe);
		registerRender(ItemAceOfSpades);
		registerRender(ItemDefendersEdge);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
