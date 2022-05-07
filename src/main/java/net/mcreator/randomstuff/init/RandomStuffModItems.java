
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

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
import net.mcreator.randomstuff.RandomStuffMod;

public class RandomStuffModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RandomStuffMod.MODID);
	public static final RegistryObject<Item> SMITHS_ANVIL_CORE = REGISTRY.register("smiths_anvil_core", () -> new SmithsAnvilCoreItem());
	public static final RegistryObject<Item> SAND_PAPER = REGISTRY.register("sand_paper", () -> new SandPaperItem());
	public static final RegistryObject<Item> RUBIE_NETHERITE_HELMET = REGISTRY.register("rubie_netherite_helmet",
			() -> new RubieNetheriteItem.Helmet());
	public static final RegistryObject<Item> RUBIE_NETHERITE_CHESTPLATE = REGISTRY.register("rubie_netherite_chestplate",
			() -> new RubieNetheriteItem.Chestplate());
	public static final RegistryObject<Item> RUBIE_NETHERITE_LEGGINGS = REGISTRY.register("rubie_netherite_leggings",
			() -> new RubieNetheriteItem.Leggings());
	public static final RegistryObject<Item> RUBIE_NETHERITE_BOOTS = REGISTRY.register("rubie_netherite_boots", () -> new RubieNetheriteItem.Boots());
	public static final RegistryObject<Item> SAPHIRE_NETHERITE_HELMET = REGISTRY.register("saphire_netherite_helmet",
			() -> new SaphireNetheriteItem.Helmet());
	public static final RegistryObject<Item> SAPHIRE_NETHERITE_CHESTPLATE = REGISTRY.register("saphire_netherite_chestplate",
			() -> new SaphireNetheriteItem.Chestplate());
	public static final RegistryObject<Item> SAPHIRE_NETHERITE_LEGGINGS = REGISTRY.register("saphire_netherite_leggings",
			() -> new SaphireNetheriteItem.Leggings());
	public static final RegistryObject<Item> SAPHIRE_NETHERITE_BOOTS = REGISTRY.register("saphire_netherite_boots",
			() -> new SaphireNetheriteItem.Boots());
	public static final RegistryObject<Item> UNOBTANIBLE_ICON_ITEM = REGISTRY.register("unobtanible_icon_item", () -> new UnobtanibleIconItemItem());
	public static final RegistryObject<Item> LOOT_TOKEN = REGISTRY.register("loot_token", () -> new LootTokenItem());
	public static final RegistryObject<Item> AMBER = REGISTRY.register("amber", () -> new AmberItem());
	public static final RegistryObject<Item> POLISHED_AMBER = REGISTRY.register("polished_amber", () -> new PolishedAmberItem());
	public static final RegistryObject<Item> RUBIE = REGISTRY.register("rubie", () -> new RubieItem());
	public static final RegistryObject<Item> POLIHSED_RUBIE = REGISTRY.register("polihsed_rubie", () -> new PolihsedRubieItem());
	public static final RegistryObject<Item> SAPHIRE = REGISTRY.register("saphire", () -> new SaphireItem());
	public static final RegistryObject<Item> POLISED_SAPHIRE = REGISTRY.register("polised_saphire", () -> new PolisedSaphireItem());
	public static final RegistryObject<Item> JASPER = REGISTRY.register("jasper", () -> new JasperItem());
	public static final RegistryObject<Item> POLISHED_JASPER = REGISTRY.register("polished_jasper", () -> new PolishedJasperItem());
	public static final RegistryObject<Item> TOPAZ = REGISTRY.register("topaz", () -> new TopazItem());
	public static final RegistryObject<Item> POLISHED_TOPAZ = REGISTRY.register("polished_topaz", () -> new PolishedTopazItem());
	public static final RegistryObject<Item> MASTER_SWORD = REGISTRY.register("master_sword", () -> new MasterSwordItem());
	public static final RegistryObject<Item> GEMSTONE_ORE = block(RandomStuffModBlocks.GEMSTONE_ORE, RandomStuffModTabs.TAB_RANDOM_STUFF_SMITH);
	public static final RegistryObject<Item> DRILL = block(RandomStuffModBlocks.DRILL, RandomStuffModTabs.TAB_RANDOM_STUFF_MISC);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
