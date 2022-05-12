
package net.mcreator.randomstuff.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.randomstuff.procedures.NetherbnItemInInventoryTickProcedure;
import net.mcreator.randomstuff.init.RandomStuffModTabs;

public class NetherbnItem extends Item {
	public NetherbnItem() {
		super(new Item.Properties().tab(RandomStuffModTabs.TAB_ELEMENTS).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		NetherbnItemInInventoryTickProcedure.execute(entity);
	}
}
