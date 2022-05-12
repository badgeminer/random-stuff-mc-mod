
package net.mcreator.randomstuff.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class ShadowGemItem extends Item {

	public ShadowGemItem() {
		super(new Item.Properties().tab(RandomStuffModTabs.TAB_RANDOM_STUFF_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BLOCK;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

}
