package net.mcreator.randomstuff.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RubyItemInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, Infinity, 10));
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = (true);
			_player.onUpdateAbilities();
		}
	}
}