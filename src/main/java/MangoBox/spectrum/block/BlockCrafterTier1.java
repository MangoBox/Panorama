package MangoBox.spectrum.block;

import MangoBox.spectrum.Spectrum;
import MangoBox.spectrum.gui.GUIs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockCrafterTier1 extends Block{

	public BlockCrafterTier1(Material materialIn) {
		super(materialIn);
		// TODO Auto-generated constructor stub
	}
	
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
		if(world.isRemote) {
				player.openGui(Spectrum.instance, GUIs.Crafter.ordinal(), world, x, y, z);
			return true;
		}
    	return true;
    	
    }

}
