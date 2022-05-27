
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.randomstuff.block.entity.TheNoobKingsAlterBlockEntity;
import net.mcreator.randomstuff.block.entity.TempestCrafterBlockEntity;
import net.mcreator.randomstuff.block.entity.PowderKegBlockEntity;
import net.mcreator.randomstuff.block.entity.DrillBlockEntity;
import net.mcreator.randomstuff.block.entity.BossAltarBlockEntity;
import net.mcreator.randomstuff.RandomStuffMod;

public class RandomStuffModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, RandomStuffMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BOSS_ALTAR = register("boss_altar", RandomStuffModBlocks.BOSS_ALTAR,
			BossAltarBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DRILL = register("drill", RandomStuffModBlocks.DRILL, DrillBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> THE_NOOB_KINGS_ALTER = register("the_noob_kings_alter",
			RandomStuffModBlocks.THE_NOOB_KINGS_ALTER, TheNoobKingsAlterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TEMPEST_CRAFTER = register("tempest_crafter", RandomStuffModBlocks.TEMPEST_CRAFTER,
			TempestCrafterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> POWDER_KEG = register("powder_keg", RandomStuffModBlocks.POWDER_KEG,
			PowderKegBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
