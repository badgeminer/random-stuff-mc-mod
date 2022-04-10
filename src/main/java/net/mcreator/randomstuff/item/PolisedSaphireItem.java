
package net.mcreator.randomstuff.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.randomstuff.init.RandomStuffModTabs;

public class PolisedSaphireItem extends Item {
	public PolisedSaphireItem() {
		super(new Item.Properties().tab(RandomStuffModTabs.TAB_RANDOM_STUFF_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("polised_saphire");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
