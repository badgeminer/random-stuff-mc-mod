
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

import net.mcreator.randomstuff.block.SapBlock;
import net.mcreator.randomstuff.block.NoobWorldPortalBlock;
import net.mcreator.randomstuff.block.GemstoneOreBlock;
import net.mcreator.randomstuff.block.DrillBlock;
import net.mcreator.randomstuff.block.BossAltarBlock;
import net.mcreator.randomstuff.RandomStuffMod;

public class RandomStuffModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomStuffMod.MODID);
	public static final RegistryObject<Block> GEMSTONE_ORE = REGISTRY.register("gemstone_ore", () -> new GemstoneOreBlock());
	public static final RegistryObject<Block> DRILL = REGISTRY.register("drill", () -> new DrillBlock());
	public static final RegistryObject<Block> SAP = REGISTRY.register("sap", () -> new SapBlock());
	public static final RegistryObject<Block> BOSS_ALTAR = REGISTRY.register("boss_altar", () -> new BossAltarBlock());
	public static final RegistryObject<Block> NOOB_WORLD_PORTAL = REGISTRY.register("noob_world_portal", () -> new NoobWorldPortalBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BossAltarBlock.registerRenderLayer();
		}
	}
}
