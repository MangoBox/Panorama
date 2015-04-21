package MangoBox.panorama.init;

import MangoBox.panorama.Panorama;
import MangoBox.panorama.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import MangoBox.panorama.item.ItemThrustBoots;

public class PanoramaItems {
	
	public static Item ItemThrustBoots;
	public static Item ItemScubaHelmet;
	public static Item ItemSpeedyPants;
	public static Item ItemSheildChest;
	public static Item ItemIcicleBlade;
	public static Item ItemStrongPickaxe;
	public static Item ItemSlicyAxe;
	public static Item ItemAceOfSpades;
	public static Item ItemDefendersEdge;
	public static Item ItemPortalPearl;
	public static ItemArmor.ArmorMaterial basicArmorMaterial = EnumHelper.addArmorMaterial("basicArmorMaterial", "panorama:modesl/armor/thrustboots.png", 1000, new int[]{1, 1, 1, 1}, 10);
	public static Item.ToolMaterial basicMaterial = EnumHelper.addToolMaterial("BasicMaterial", 1000, 0, 14F, 2F, 10);
	public static Item.ToolMaterial Tier2Material = EnumHelper.addToolMaterial("Tier2Material", 1000, 0, 14F, 2F, 10);
	
	public static void init() {
		//Armor
		ItemThrustBoots = new MangoBox.panorama.materialClasses.basicArmorMaterial(basicArmorMaterial, 0, 3).setUnlocalizedName("ItemThrustBoots").setCreativeTab(Panorama.tabPanorama);
		ItemScubaHelmet = new MangoBox.panorama.materialClasses.basicArmorMaterial(basicArmorMaterial, 0, 0).setUnlocalizedName("ItemScubaHelmet").setCreativeTab(Panorama.tabPanorama);
		ItemSpeedyPants = new MangoBox.panorama.materialClasses.basicArmorMaterial(basicArmorMaterial, 0, 2).setUnlocalizedName("ItemSpeedyPants").setCreativeTab(Panorama.tabPanorama);
		ItemSheildChest = new MangoBox.panorama.materialClasses.basicArmorMaterial(basicArmorMaterial, 0, 1).setUnlocalizedName("ItemSheildChest").setCreativeTab(Panorama.tabPanorama);
		
		//Items
		ItemPortalPearl = new Item().setUnlocalizedName("ItemPortalPearl").setCreativeTab(Panorama.tabPanorama);
		
		//Tools and Weapons
		ItemIcicleBlade = new MangoBox.panorama.item.ItemIcicleBlade(basicMaterial).setUnlocalizedName("ItemIcicleBlade").setCreativeTab(Panorama.tabPanorama);
		ItemStrongPickaxe = new MangoBox.panorama.item.ItemStrongPickaxe(basicMaterial).setUnlocalizedName("ItemStrongPickaxe").setCreativeTab(Panorama.tabPanorama);
		ItemSlicyAxe = new MangoBox.panorama.item.ItemSlicyAxe(basicMaterial).setUnlocalizedName("ItemSlicyAxe").setCreativeTab(Panorama.tabPanorama);
		ItemAceOfSpades = new MangoBox.panorama.item.ItemAceOfSpades(basicMaterial).setUnlocalizedName("ItemAceOfSpades").setCreativeTab(Panorama.tabPanorama);
		ItemDefendersEdge = new MangoBox.panorama.item.ItemDefendersEdge(Tier2Material).setUnlocalizedName("ItemDefendersEdge").setCreativeTab(Panorama.tabPanorama);
	
	
	}
	
	
	public static void register() {
		
		//Armor
		GameRegistry.registerItem(ItemThrustBoots, ItemThrustBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemScubaHelmet, ItemScubaHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSpeedyPants, ItemSpeedyPants.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSheildChest, ItemSheildChest.getUnlocalizedName().substring(5));
		
		//Items
		GameRegistry.registerItem(ItemPortalPearl, ItemPortalPearl.getUnlocalizedName().substring(5));
		
		//Tools and Weapons
		GameRegistry.registerItem(ItemIcicleBlade, ItemIcicleBlade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemStrongPickaxe, ItemStrongPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSlicyAxe, ItemSlicyAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemAceOfSpades, ItemAceOfSpades.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemDefendersEdge,ItemDefendersEdge.getUnlocalizedName().substring(5));
	}

	public static void registerRenders() {
		//Armor
		registerRender(ItemThrustBoots);
		registerRender(ItemScubaHelmet);
		registerRender(ItemSpeedyPants);
		registerRender(ItemSheildChest);
		
		//Items
		registerRender(ItemPortalPearl);
		
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
