package net.mcreator.randomstuff.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class SaphireNeteriteTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() >= 0.8) {
			if (ItemTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:saphire_netherite_tag")).contains(
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem())
					&& ItemTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:saphire_netherite_tag"))
							.contains((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
									.getItem())
					&& ItemTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:saphire_netherite_tag")).contains(
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
									.getItem())
					&& ItemTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:saphire_netherite_tag"))
							.contains((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
									.getItem())) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 120, 4, (true), (false)));
			}
		}
	}
}
