
package net.mcreator.randomstuff.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class NetherbnItem extends Item {

	public NetherbnItem() {
		super(new Item.Properties().tab(RandomStuffModTabs.TAB_ELEMENTS).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		NetherbnItemInInventoryTickProcedure.execute(

		);
	}

}
