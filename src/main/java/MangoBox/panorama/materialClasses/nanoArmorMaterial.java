package MangoBox.panorama.materialClasses;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;

public class nanoArmorMaterial extends ItemArmor implements ISpecialArmor {

	public nanoArmorMaterial(ArmorMaterial material, int renderIndex,
			int armorType) {
		super(material, renderIndex, armorType);
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase player,
			ItemStack armor, DamageSource source, double damage, int slot) {
		return null;
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		return 5;
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack,
			DamageSource source, int damage, int slot) {
		
	}
	
	@Override
	public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) {
		if(slot == 2) {
			return "panorama:models/armor/nanomaterial_layer_2.png";
		} else
		return "panorama:models/armor/nanomaterial_layer_1.png";
		
	}
}
