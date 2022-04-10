
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.randomstuff.item.UnobtanibleIconItemItem;
import net.mcreator.randomstuff.item.SmithsAnvilCoreItem;
import net.mcreator.randomstuff.item.SaphireNetheriteItem;
import net.mcreator.randomstuff.item.SandPaperItem;
import net.mcreator.randomstuff.item.RubieNetheriteItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RandomStuffModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item SMITHS_ANVIL_CORE = register(new SmithsAnvilCoreItem());
	public static final Item SAND_PAPER = register(new SandPaperItem());
	public static final Item RUBIE_NETHERITE_HELMET = register(new RubieNetheriteItem.Helmet());
	public static final Item RUBIE_NETHERITE_CHESTPLATE = register(new RubieNetheriteItem.Chestplate());
	public static final Item RUBIE_NETHERITE_LEGGINGS = register(new RubieNetheriteItem.Leggings());
	public static final Item RUBIE_NETHERITE_BOOTS = register(new RubieNetheriteItem.Boots());
	public static final Item SAPHIRE_NETHERITE_HELMET = register(new SaphireNetheriteItem.Helmet());
	public static final Item SAPHIRE_NETHERITE_CHESTPLATE = register(new SaphireNetheriteItem.Chestplate());
	public static final Item SAPHIRE_NETHERITE_LEGGINGS = register(new SaphireNetheriteItem.Leggings());
	public static final Item SAPHIRE_NETHERITE_BOOTS = register(new SaphireNetheriteItem.Boots());
	public static final Item UNOBTANIBLE_ICON_ITEM = register(new UnobtanibleIconItemItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
