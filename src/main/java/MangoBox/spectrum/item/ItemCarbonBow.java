package MangoBox.spectrum.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemCarbonBow extends ItemBow {
	@Override 
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		ArrowNockEvent event = new ArrowNockEvent(player, stack);
		if(event.isCanceled())
			return event.result;
		
		return stack;
		
	}

	EntityArrow makeArrow(ItemStack stack, World world, EntityPlayer player, int par1, float par2) {
		return new EntityArrow(world, player, player, par2, par2 * 5.0F);
		
	}
}
