
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RandomStuffModTabs {
	public static CreativeModeTab TAB_RANDOM_STUFF_SMITH;
	public static CreativeModeTab TAB_RANDOM_STUFF_MISC;
	public static CreativeModeTab TAB_ELEMENTS;

	public static void load() {
		TAB_RANDOM_STUFF_SMITH = new CreativeModeTab("tabrandom_stuff_smith") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RandomStuffModItems.SMITHS_ANVIL_CORE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_RANDOM_STUFF_MISC = new CreativeModeTab("tabrandom_stuff_misc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RandomStuffModItems.UNOBTANIBLE_ICON_ITEM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ELEMENTS = new CreativeModeTab("tabelements") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.NETHER_STAR);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
