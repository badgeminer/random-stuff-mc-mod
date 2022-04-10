
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RandomStuffModTabs {
	public static CreativeModeTab TAB_RANDOM_STUFF_SMITH;
	public static CreativeModeTab TAB_RANDOM_STUFF_MISC;

	public static void load() {
		TAB_RANDOM_STUFF_SMITH = new CreativeModeTab("tabrandom_stuff_smith") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RandomStuffModItems.SMITHS_ANVIL_CORE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_RANDOM_STUFF_MISC = new CreativeModeTab("tabrandom_stuff_misc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RandomStuffModItems.UNOBTANIBLE_ICON_ITEM);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
