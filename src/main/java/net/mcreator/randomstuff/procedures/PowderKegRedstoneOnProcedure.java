package net.mcreator.randomstuff.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PowderKegRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 100, Explosion.BlockInteraction.BREAK);
	}
}
