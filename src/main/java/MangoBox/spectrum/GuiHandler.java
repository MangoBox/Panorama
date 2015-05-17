package MangoBox.spectrum;

import MangoBox.spectrum.block.BlockCrafterTier1;
import MangoBox.spectrum.gui.GUIs;
import MangoBox.spectrum.gui.GuiTable;
import MangoBox.spectrum.gui.container.ContainerTable;
import MangoBox.spectrum.gui.container.TileEntityTableCrafter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile_entity = world.getTileEntity(new BlockPos(x, y, z));
		if (tile_entity instanceof TileEntityTableCrafter)
		{
			return new ContainerTable(player.inventory, (TileEntityTableCrafter) tile_entity);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

}
