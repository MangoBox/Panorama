package MangoBox.spectrum.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemStrongPickaxe extends ItemPickaxe {

	public ItemStrongPickaxe(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
	}
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        playerIn.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 200, 3, false, true));
    	return itemStackIn;
    }
	
	

}
