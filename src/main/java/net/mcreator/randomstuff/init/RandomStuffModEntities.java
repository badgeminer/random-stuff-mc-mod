
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.randomstuff.entity.ShadowArmorEntity;
import net.mcreator.randomstuff.entity.QueenElizibethEntity;
import net.mcreator.randomstuff.entity.NoobEntity;
import net.mcreator.randomstuff.entity.GhostEntity;
import net.mcreator.randomstuff.entity.EndghostEntity;
import net.mcreator.randomstuff.entity.EnderGhostEntity;
import net.mcreator.randomstuff.RandomStuffMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RandomStuffModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, RandomStuffMod.MODID);
	public static final RegistryObject<EntityType<EndghostEntity>> ENDGHOST = register("endghost",
			EntityType.Builder.<EndghostEntity>of(EndghostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(EndghostEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShadowArmorEntity>> SHADOW_ARMOR = register("shadow_armor",
			EntityType.Builder.<ShadowArmorEntity>of(ShadowArmorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowArmorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GhostEntity>> GHOST = register("ghost",
			EntityType.Builder.<GhostEntity>of(GhostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GhostEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NoobEntity>> NOOB = register("noob",
			EntityType.Builder.<NoobEntity>of(NoobEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(NoobEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<QueenElizibethEntity>> QUEEN_ELIZIBETH = register("queen_elizibeth",
			EntityType.Builder.<QueenElizibethEntity>of(QueenElizibethEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(QueenElizibethEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnderGhostEntity>> ENDER_GHOST = register("ender_ghost",
			EntityType.Builder.<EnderGhostEntity>of(EnderGhostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnderGhostEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EndghostEntity.init();
			ShadowArmorEntity.init();
			GhostEntity.init();
			NoobEntity.init();
			QueenElizibethEntity.init();
			EnderGhostEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENDGHOST.get(), EndghostEntity.createAttributes().build());
		event.put(SHADOW_ARMOR.get(), ShadowArmorEntity.createAttributes().build());
		event.put(GHOST.get(), GhostEntity.createAttributes().build());
		event.put(NOOB.get(), NoobEntity.createAttributes().build());
		event.put(QUEEN_ELIZIBETH.get(), QueenElizibethEntity.createAttributes().build());
		event.put(ENDER_GHOST.get(), EnderGhostEntity.createAttributes().build());
	}
}
