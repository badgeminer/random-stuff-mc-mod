
package net.mcreator.randomstuff.potion;

public class FrozenMobEffect extends MobEffect {

	public FrozenMobEffect() {
		super(MobEffectCategory.HARMFUL, -13369345);
	}

	@Override
	public String getDescriptionId() {
		return "effect.random_stuff.frozen";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
