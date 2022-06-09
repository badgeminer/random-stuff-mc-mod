
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.randomstuff.world.features.plants.UmberStalkFeature;
import net.mcreator.randomstuff.world.features.plants.RainbowCapFeature;
import net.mcreator.randomstuff.world.features.plants.GhostMorelFeature;
import net.mcreator.randomstuff.world.features.plants.FireFungusFeature;
import net.mcreator.randomstuff.world.features.plants.AstralToadstoolFeature;
import net.mcreator.randomstuff.RandomStuffMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class RandomStuffModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, RandomStuffMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> UMBER_STALK = register("umber_stalk", UmberStalkFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, UmberStalkFeature.GENERATE_BIOMES, UmberStalkFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GHOST_MOREL = register("ghost_morel", GhostMorelFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, GhostMorelFeature.GENERATE_BIOMES, GhostMorelFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FIRE_FUNGUS = register("fire_fungus", FireFungusFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, FireFungusFeature.GENERATE_BIOMES, FireFungusFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ASTRAL_TOADSTOOL = register("astral_toadstool", AstralToadstoolFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, AstralToadstoolFeature.GENERATE_BIOMES,
					AstralToadstoolFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RAINBOW_CAP = register("rainbow_cap", RainbowCapFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, RainbowCapFeature.GENERATE_BIOMES, RainbowCapFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
