
package net.mcreator.randomstuff.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.randomstuff.procedures.ObsidianSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.randomstuff.init.RandomStuffModItems;

public class ObsidianSwordItem extends SwordItem {
	public ObsidianSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 10000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 200;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RandomStuffModItems.OBSIDIAN_SHARD.get()));
			}
		}, 3, -2.6f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ObsidianSwordLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
