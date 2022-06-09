
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.randomstuff.block.UmberStalkBlock;
import net.mcreator.randomstuff.block.TheNoobKingsAlterBlock;
import net.mcreator.randomstuff.block.TempestCrafterBlock;
import net.mcreator.randomstuff.block.SapBlock;
import net.mcreator.randomstuff.block.RainbowCapBlock;
import net.mcreator.randomstuff.block.PowderKegBlock;
import net.mcreator.randomstuff.block.GhostMorelBlock;
import net.mcreator.randomstuff.block.GemstoneOreBlock;
import net.mcreator.randomstuff.block.FireFungusBlock;
import net.mcreator.randomstuff.block.EnchantedDirtBlock;
import net.mcreator.randomstuff.block.DrillBlock;
import net.mcreator.randomstuff.block.BossAltarBlock;
import net.mcreator.randomstuff.block.AstralToadstoolBlock;
import net.mcreator.randomstuff.RandomStuffMod;

public class RandomStuffModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomStuffMod.MODID);
	public static final RegistryObject<Block> BOSS_ALTAR = REGISTRY.register("boss_altar", () -> new BossAltarBlock());
	public static final RegistryObject<Block> GEMSTONE_ORE = REGISTRY.register("gemstone_ore", () -> new GemstoneOreBlock());
	public static final RegistryObject<Block> DRILL = REGISTRY.register("drill", () -> new DrillBlock());
	public static final RegistryObject<Block> SAP = REGISTRY.register("sap", () -> new SapBlock());
	public static final RegistryObject<Block> THE_NOOB_KINGS_ALTER = REGISTRY.register("the_noob_kings_alter", () -> new TheNoobKingsAlterBlock());
	public static final RegistryObject<Block> ENCHANTED_DIRT = REGISTRY.register("enchanted_dirt", () -> new EnchantedDirtBlock());
	public static final RegistryObject<Block> TEMPEST_CRAFTER = REGISTRY.register("tempest_crafter", () -> new TempestCrafterBlock());
	public static final RegistryObject<Block> POWDER_KEG = REGISTRY.register("powder_keg", () -> new PowderKegBlock());
	public static final RegistryObject<Block> UMBER_STALK = REGISTRY.register("umber_stalk", () -> new UmberStalkBlock());
	public static final RegistryObject<Block> GHOST_MOREL = REGISTRY.register("ghost_morel", () -> new GhostMorelBlock());
	public static final RegistryObject<Block> FIRE_FUNGUS = REGISTRY.register("fire_fungus", () -> new FireFungusBlock());
	public static final RegistryObject<Block> ASTRAL_TOADSTOOL = REGISTRY.register("astral_toadstool", () -> new AstralToadstoolBlock());
	public static final RegistryObject<Block> RAINBOW_CAP = REGISTRY.register("rainbow_cap", () -> new RainbowCapBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BossAltarBlock.registerRenderLayer();
			TheNoobKingsAlterBlock.registerRenderLayer();
			TempestCrafterBlock.registerRenderLayer();
			UmberStalkBlock.registerRenderLayer();
			GhostMorelBlock.registerRenderLayer();
			FireFungusBlock.registerRenderLayer();
			AstralToadstoolBlock.registerRenderLayer();
			RainbowCapBlock.registerRenderLayer();
		}
	}
}
