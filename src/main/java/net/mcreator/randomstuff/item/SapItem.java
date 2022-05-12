
package net.mcreator.randomstuff.item;

import net.minecraft.network.chat.Component;

public class SapItem extends BucketItem {

	public SapItem() {
		super(RandomStuffModFluids.SAP,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(CreativeModeTab.TAB_MISC));
	}

}
