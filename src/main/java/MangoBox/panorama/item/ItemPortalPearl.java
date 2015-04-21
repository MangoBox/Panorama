package MangoBox.panorama.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemPortalPearl extends Item {
	
	private int posX;
	private int posY;
	private int posZ;

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float HitX, float hitY, float hitZ) {
		posX = pos.getX();
		posY = pos.getY();
		posZ = pos.getZ();
		return false;
		
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn) {	
		playerIn.setPosition(posX, posY, posZ);

		return stack;
		
	}

	
	
}
