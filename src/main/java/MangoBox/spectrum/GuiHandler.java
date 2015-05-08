package MangoBox.spectrum;

import MangoBox.spectrum.gui.GUIs;
import MangoBox.spectrum.gui.GuiTable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == GUIs.Crafter.ordinal()) return new GuiTable(player, world, x, y, z);
		else return null;
	}

}
