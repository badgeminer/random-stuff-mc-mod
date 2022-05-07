
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.randomstuff.block.entity.DrillBlockEntity;
import net.mcreator.randomstuff.RandomStuffMod;

public class RandomStuffModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, RandomStuffMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DRILL = register("drill", RandomStuffModBlocks.DRILL, DrillBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
