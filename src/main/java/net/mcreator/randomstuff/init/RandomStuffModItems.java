
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.randomstuff.item.WarpStaffItem;
import net.mcreator.randomstuff.item.UnobtanibleIconItemItem;
import net.mcreator.randomstuff.item.TopazItem;
import net.mcreator.randomstuff.item.SoulShardItem;
import net.mcreator.randomstuff.item.SmithsAnvilCoreItem;
import net.mcreator.randomstuff.item.ShadowGemItem;
import net.mcreator.randomstuff.item.SaphireNetheriteItem;
import net.mcreator.randomstuff.item.SaphireItem;
import net.mcreator.randomstuff.item.SapItem;
import net.mcreator.randomstuff.item.SandPaperItem;
import net.mcreator.randomstuff.item.RubyItem;
import net.mcreator.randomstuff.item.RubieNetheriteItem;
import net.mcreator.randomstuff.item.RubieItem;
import net.mcreator.randomstuff.item.PolishedTopazItem;
import net.mcreator.randomstuff.item.PolishedJasperItem;
import net.mcreator.randomstuff.item.PolishedAmberItem;
import net.mcreator.randomstuff.item.PolisedSaphireItem;
import net.mcreator.randomstuff.item.PolihsedRubieItem;
import net.mcreator.randomstuff.item.OiItem;
import net.mcreator.randomstuff.item.NoobWorldItem;
import net.mcreator.randomstuff.item.NetherbnItem;
import net.mcreator.randomstuff.item.NetherElementItem;
import net.mcreator.randomstuff.item.MasterSwordItem;
import net.mcreator.randomstuff.item.LootTokenItem;
import net.mcreator.randomstuff.item.LiquidDarknessItem;
import net.mcreator.randomstuff.item.JasperItem;
import net.mcreator.randomstuff.item.IceCubeItem;
import net.mcreator.randomstuff.item.EyeItem;
import net.mcreator.randomstuff.item.EndPotecterElementItem;
import net.mcreator.randomstuff.item.EarthGemItem;
import net.mcreator.randomstuff.item.DrillRayItem;
import net.mcreator.randomstuff.item.DirtBagItem;
import net.mcreator.randomstuff.item.CheeseItem;
import net.mcreator.randomstuff.item.BoobitemItem;
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
	public static final RegistryObject<Item> BOSS_ALTAR = block(RandomStuffModBlocks.BOSS_ALTAR, RandomStuffModTabs.TAB_RANDOM_STUFF_SMITH);
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
	public static final RegistryObject<Item> SHADOW_GEM = REGISTRY.register("shadow_gem", () -> new ShadowGemItem());
	public static final RegistryObject<Item> SOUL_SHARD = REGISTRY.register("soul_shard", () -> new SoulShardItem());
	public static final RegistryObject<Item> JASPER = REGISTRY.register("jasper", () -> new JasperItem());
	public static final RegistryObject<Item> POLISHED_JASPER = REGISTRY.register("polished_jasper", () -> new PolishedJasperItem());
	public static final RegistryObject<Item> TOPAZ = REGISTRY.register("topaz", () -> new TopazItem());
	public static final RegistryObject<Item> ENDGHOST = REGISTRY.register("endghost_spawn_egg",
			() -> new ForgeSpawnEggItem(RandomStuffModEntities.ENDGHOST, -1, -65536, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> POLISHED_TOPAZ = REGISTRY.register("polished_topaz", () -> new PolishedTopazItem());
	public static final RegistryObject<Item> MASTER_SWORD = REGISTRY.register("master_sword", () -> new MasterSwordItem());
	public static final RegistryObject<Item> GEMSTONE_ORE = block(RandomStuffModBlocks.GEMSTONE_ORE, RandomStuffModTabs.TAB_RANDOM_STUFF_SMITH);
	public static final RegistryObject<Item> DRILL = block(RandomStuffModBlocks.DRILL, RandomStuffModTabs.TAB_RANDOM_STUFF_MISC);
	public static final RegistryObject<Item> WARP_STAFF = REGISTRY.register("warp_staff", () -> new WarpStaffItem());
	public static final RegistryObject<Item> SHADOW_ARMOR = REGISTRY.register("shadow_armor_spawn_egg",
			() -> new ForgeSpawnEggItem(RandomStuffModEntities.SHADOW_ARMOR, -16777216, -10092391,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> EYE = REGISTRY.register("eye", () -> new EyeItem());
	public static final RegistryObject<Item> BOOBITEM = REGISTRY.register("boobitem", () -> new BoobitemItem());
	public static final RegistryObject<Item> EARTH_GEM = REGISTRY.register("earth_gem", () -> new EarthGemItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> GHOST = REGISTRY.register("ghost_spawn_egg",
			() -> new ForgeSpawnEggItem(RandomStuffModEntities.GHOST, -1, -65536, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> NOOB = REGISTRY.register("noob_spawn_egg",
			() -> new ForgeSpawnEggItem(RandomStuffModEntities.NOOB, -11776241, -16465639, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> QUEEN_ELIZIBETH = REGISTRY.register("queen_elizibeth_spawn_egg",
			() -> new ForgeSpawnEggItem(RandomStuffModEntities.QUEEN_ELIZIBETH, -1, -393467, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SAP_BUCKET = REGISTRY.register("sap_bucket", () -> new SapItem());
	public static final RegistryObject<Item> DRILL_RAY = REGISTRY.register("drill_ray", () -> new DrillRayItem());
	public static final RegistryObject<Item> NETHERBN = REGISTRY.register("netherbn", () -> new NetherbnItem());
	public static final RegistryObject<Item> END_POTECTER_ELEMENT = REGISTRY.register("end_potecter_element", () -> new EndPotecterElementItem());
	public static final RegistryObject<Item> NETHER_ELEMENT = REGISTRY.register("nether_element", () -> new NetherElementItem());
	public static final RegistryObject<Item> NOOB_WORLD = REGISTRY.register("noob_world", () -> new NoobWorldItem());
	public static final RegistryObject<Item> OI = REGISTRY.register("oi", () -> new OiItem());
	public static final RegistryObject<Item> DIRT_BAG = REGISTRY.register("dirt_bag", () -> new DirtBagItem());
	public static final RegistryObject<Item> LIQUID_DARKNESS = REGISTRY.register("liquid_darkness", () -> new LiquidDarknessItem());
	public static final RegistryObject<Item> ICE_CUBE = REGISTRY.register("ice_cube", () -> new IceCubeItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> THE_NOOB_KINGS_ALTER = block(RandomStuffModBlocks.THE_NOOB_KINGS_ALTER,
			RandomStuffModTabs.TAB_RANDOM_STUFF_SMITH);
	public static final RegistryObject<Item> NOOB_KING = REGISTRY.register("noob_king_spawn_egg",
			() -> new ForgeSpawnEggItem(RandomStuffModEntities.NOOB_KING, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ENCHANTED_DIRT = block(RandomStuffModBlocks.ENCHANTED_DIRT, CreativeModeTab.TAB_MATERIALS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
