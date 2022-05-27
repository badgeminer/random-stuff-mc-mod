package net.mcreator.randomstuff.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FrozenActiveTickConditionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 100));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 1, 5));
	}
}
