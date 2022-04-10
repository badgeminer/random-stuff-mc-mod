
package net.mcreator.randomstuff.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.randomstuff.init.RandomStuffModTabs;

public class SmithsAnvilCoreItem extends Item {
	public SmithsAnvilCoreItem() {
		super(new Item.Properties().tab(RandomStuffModTabs.TAB_RANDOM_STUFF_SMITH).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("smiths_anvil_core");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
