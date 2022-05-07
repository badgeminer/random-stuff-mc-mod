
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.randomstuff.block.GemstoneOreBlock;
import net.mcreator.randomstuff.block.DrillBlock;
import net.mcreator.randomstuff.RandomStuffMod;

public class RandomStuffModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RandomStuffMod.MODID);
	public static final RegistryObject<Block> GEMSTONE_ORE = REGISTRY.register("gemstone_ore", () -> new GemstoneOreBlock());
	public static final RegistryObject<Block> DRILL = REGISTRY.register("drill", () -> new DrillBlock());
}
