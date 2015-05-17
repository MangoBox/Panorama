package MangoBox.spectrum.gui;

import MangoBox.spectrum.Reference;
import MangoBox.spectrum.gui.container.ContainerTable;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiTable extends GuiContainer{
	public GuiTable(IInventory inv1, IInventory inv2) {
		super(new ContainerTable(inv1, inv2));
		this.xSize = 176;
		this.ySize = 167;
		
	}
	private int x, y, z;
	private EntityPlayer player;
	private World world;
	private int xSize, ySize;
	private ResourceLocation backgroundimage = new ResourceLocation(Reference.MOD_ID.toLowerCase() + ":" + "textures/client/gui/TableGui.png");
	
	

	
	@Override
	public void drawScreen(int mouseX, int mouseY, float renderPartialTicks) {
		this.mc.getTextureManager().bindTexture(backgroundimage);
		int x = (this.width - xSize) / 2;
		int y = (this.height - ySize) / 2;
		drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}
	
	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks,
			int mouseX, int mouseY) {
		// TODO Auto-generated method stub
		
	}

}
