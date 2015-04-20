package MangoBox.panorama.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class ItemDefendersEdge extends ItemSword {

	public ItemDefendersEdge(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
	}
	
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        playerIn.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 200, ((int)playerIn.getMaxHealth() - (int)playerIn.getHealth() / 4), true, false));
    	playerIn.playSound("random.anvil_land", 0.5F, 1.0F);
    	worldIn.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, playerIn.posX, playerIn.posY + 1D, playerIn.posZ, 0.1, 0.1, 0.1, 1);
        return itemStackIn;
    }

	
}
