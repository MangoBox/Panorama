package MangoBox.spectrum.item;

import java.util.List;

import MangoBox.spectrum.Spectrum;
import MangoBox.spectrum.gui.GUIs;
import net.minecraft.block.state.IBlockState;
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
		
		return false;
		
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
			if(world.isRemote) {
					player.openGui(Spectrum.Modinstance, GUIs.Crafter.ordinal(), world, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ());
				return item;
			}
	    	return item;
		
	}

	
	
}
