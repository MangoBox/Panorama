package MangoBox.spectrum.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemIcicleBlade extends ItemSword {

	public ItemIcicleBlade(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
	}
	
    public EnumAction getItemUseAction(ItemStack stack)
    {
    	return EnumAction.BLOCK;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
		return true;
    	
    }
    
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        
    	target.playSound("random.fizz", 1.0F, 1.0F);
    	target.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 60, 10, false, true));
    	stack.damageItem(1, attacker);
    	return true;
    	
    }

}
