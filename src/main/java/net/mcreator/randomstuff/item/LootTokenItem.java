
package net.mcreator.randomstuff.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.randomstuff.procedures.LootTokenRightClickedInAirProcedure;
import net.mcreator.randomstuff.init.RandomStuffModTabs;

public class LootTokenItem extends Item {
	public LootTokenItem() {
		super(new Item.Properties().tab(RandomStuffModTabs.TAB_RANDOM_STUFF_MISC).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("loot_token");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		LootTokenRightClickedInAirProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}
}
