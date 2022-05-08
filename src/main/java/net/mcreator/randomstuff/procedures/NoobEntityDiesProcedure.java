package net.mcreator.randomstuff.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class NoobEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
	}
}
