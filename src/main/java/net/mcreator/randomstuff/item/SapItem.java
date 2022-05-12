
package net.mcreator.randomstuff.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.randomstuff.init.RandomStuffModFluids;

public class SapItem extends BucketItem {
	public SapItem() {
		super(RandomStuffModFluids.SAP,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
