package MangoBox.spectrum;

import MangoBox.spectrum.init.SpectrumItems;
import MangoBox.spectrum.init.SpectrumItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SpectrumTab extends CreativeTabs {

	public SpectrumTab(String label) {
		super(label);
		this.setBackgroundImageName("spectrum.png");
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return SpectrumItems.ItemThrustBoots;
	}

}
