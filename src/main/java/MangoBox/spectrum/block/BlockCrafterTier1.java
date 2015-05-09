package MangoBox.spectrum.block;

import MangoBox.spectrum.Spectrum;
import MangoBox.spectrum.gui.GUIs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
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
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        if(worldIn.isRemote) {
                playerIn.openGui(Spectrum.Modinstance, GUIs.Crafter.ordinal(), worldIn, pos.getX(), pos.getY(), pos.getZ());
            return true;
        }
        return true;
    }

}
