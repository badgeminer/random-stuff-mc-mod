
package net.mcreator.randomstuff.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.randomstuff.procedures.RubieNetheriteHelmetTickEventProcedure;
import net.mcreator.randomstuff.init.RandomStuffModTabs;

public abstract class RubieNetheriteItem extends ArmorItem {
	public RubieNetheriteItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 26;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 3, 6, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "rubie_netherite";
			}

			@Override
			public float getToughness() {
				return 2.1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends RubieNetheriteItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(RandomStuffModTabs.TAB_RANDOM_STUFF_SMITH));
			setRegistryName("rubie_netherite_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_stuff:textures/models/armor/rubienetherite__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			RubieNetheriteHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends RubieNetheriteItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(RandomStuffModTabs.TAB_RANDOM_STUFF_SMITH));
			setRegistryName("rubie_netherite_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_stuff:textures/models/armor/rubienetherite__layer_1.png";
		}
	}

	public static class Leggings extends RubieNetheriteItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(RandomStuffModTabs.TAB_RANDOM_STUFF_SMITH));
			setRegistryName("rubie_netherite_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_stuff:textures/models/armor/rubienetherite__layer_2.png";
		}
	}

	public static class Boots extends RubieNetheriteItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(RandomStuffModTabs.TAB_RANDOM_STUFF_SMITH));
			setRegistryName("rubie_netherite_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "random_stuff:textures/models/armor/rubienetherite__layer_1.png";
		}
	}
}
