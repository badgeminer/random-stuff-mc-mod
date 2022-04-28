
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.randomstuff.item.UnobtanibleIconItemItem;
import net.mcreator.randomstuff.item.TopazItem;
import net.mcreator.randomstuff.item.SmithsAnvilCoreItem;
import net.mcreator.randomstuff.item.SaphireNetheriteItem;
import net.mcreator.randomstuff.item.SaphireItem;
import net.mcreator.randomstuff.item.SandPaperItem;
import net.mcreator.randomstuff.item.RubieNetheriteItem;
import net.mcreator.randomstuff.item.RubieItem;
import net.mcreator.randomstuff.item.PolishedTopazItem;
import net.mcreator.randomstuff.item.PolishedJasperItem;
import net.mcreator.randomstuff.item.PolishedAmberItem;
import net.mcreator.randomstuff.item.PolisedSaphireItem;
import net.mcreator.randomstuff.item.PolihsedRubieItem;
import net.mcreator.randomstuff.item.MasterSwordItem;
import net.mcreator.randomstuff.item.LootTokenItem;
import net.mcreator.randomstuff.item.JasperItem;
import net.mcreator.randomstuff.item.AmberItem;

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
	public static final Item LOOT_TOKEN = register(new LootTokenItem());
	public static final Item AMBER = register(new AmberItem());
	public static final Item POLISHED_AMBER = register(new PolishedAmberItem());
	public static final Item RUBIE = register(new RubieItem());
	public static final Item POLIHSED_RUBIE = register(new PolihsedRubieItem());
	public static final Item SAPHIRE = register(new SaphireItem());
	public static final Item POLISED_SAPHIRE = register(new PolisedSaphireItem());
	public static final Item JASPER = register(new JasperItem());
	public static final Item POLISHED_JASPER = register(new PolishedJasperItem());
	public static final Item TOPAZ = register(new TopazItem());
	public static final Item POLISHED_TOPAZ = register(new PolishedTopazItem());
	public static final Item MASTER_SWORD = register(new MasterSwordItem());
	public static final Item GEMSTONE_ORE = register(RandomStuffModBlocks.GEMSTONE_ORE, RandomStuffModTabs.TAB_RANDOM_STUFF_SMITH);
	public static final Item DRILL = register(RandomStuffModBlocks.DRILL, RandomStuffModTabs.TAB_RANDOM_STUFF_MISC);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
