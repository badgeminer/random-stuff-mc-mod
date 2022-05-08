
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.randomstuff.RandomStuffMod;

public class RandomStuffModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, RandomStuffMod.MODID);
	public static final RegistryObject<Potion> BATTLE = REGISTRY.register("battle",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 36000, 5, false, true),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 36000, 5, false, true),
					new MobEffectInstance(MobEffects.HEAL, 3600, 5, false, true),
					new MobEffectInstance(MobEffects.REGENERATION, 36000, 5, false, true),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 36000, 5, false, true),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 36000, 1, false, true),
					new MobEffectInstance(MobEffects.HEALTH_BOOST, 36000, 5, false, true),
					new MobEffectInstance(MobEffects.ABSORPTION, 36000, 5, false, true)));
}
