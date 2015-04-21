package MangoBox.panorama;

import MangoBox.panorama.init.PanoramaItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PanoramaTab extends CreativeTabs {

	public PanoramaTab(String label) {
		super(label);
		this.setBackgroundImageName("panorama.png");
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return PanoramaItems.ItemThrustBoots;
	}

}
