package MangoBox.spectrum.gui.container;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ContainerTable extends Container implements ITileEntityProvider {

	private IInventory tableInv;
	
	public ContainerTable(IInventory playerInv, IInventory tableInv) {
		this.tableInv = tableInv;
		tableInv.openInventory(null);
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				this.addSlotToContainer(new Slot(tableInv, j + i * 5, j * 18 + 44, i * 18 + 18));
			}
		}

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 9; ++j)
			{
				this.addSlotToContainer(new Slot(playerInv, j + i * 9 + 9, j * 18 + 8, i * 18 + 85));
			}
		}

		for (int i = 0; i < 9; i++)
		{
			this.addSlotToContainer(new Slot(playerInv, i, i * 18 + 8, 143));
		}
	}
	
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.tableInv.isUseableByPlayer(playerIn);
	}
	
	
	@Override
	public void onContainerClosed(EntityPlayer entityPlayer)
	{
		super.onContainerClosed(entityPlayer);
		this.tableInv.closeInventory(entityPlayer);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer entityPlayer, int slotNum)
	{
		ItemStack itemCopy = null;
		Slot slot = (Slot) this.inventorySlots.get(slotNum);

		if (slot != null && slot.getHasStack())
		{
			ItemStack item = slot.getStack();
			itemCopy = item.copy();

			if (slotNum < 15)
			{
				if (!this.mergeItemStack(item, 15, this.inventorySlots.size(), true))
				{
					return null;
				}
			}
			else if (!this.mergeItemStack(item, 0, 15, false))
			{
				return null;
			}

			if (item.stackSize == 0)
			{
				slot.putStack((ItemStack) null);
			}
			else
			{
				slot.onSlotChanged();
			}
		}

		return itemCopy;
	}


	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityTableCrafter();
	}

}
