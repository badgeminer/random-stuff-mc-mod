package net.mcreator.randomstuff.procedures;

import net.minecraftforge.fmllegacy.network.NetworkHooks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.randomstuff.world.inventory.LootMenu;
import net.mcreator.randomstuff.init.RandomStuffModItems;

import java.util.function.Supplier;
import java.util.Map;

import io.netty.buffer.Unpooled;

public class LootTokenRightClickedInAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double rand = 0;
		(itemstack).shrink(1);
		(itemstack).setCount(0);
		{
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
				NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return new TextComponent("Loot");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new LootMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
		rand = Math.random();
		if (rand >= 0.9) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.NETHERITE_BLOCK);
				_setstack.setCount(1);
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (rand >= 0.85) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.TOTEM_OF_UNDYING);
				_setstack.setCount(1);
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (rand >= 0.8) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.NETHER_STAR);
				_setstack.setCount(1);
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (rand >= 0.75) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.ELYTRA);
				_setstack.setCount(1);
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (rand >= 0.7) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(RandomStuffModItems.POLISHED_AMBER);
				_setstack.setCount(1);
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (rand >= 0.6) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(RandomStuffModItems.POLIHSED_RUBIE);
				_setstack.setCount(1);
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (rand >= 0.5) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(RandomStuffModItems.POLISED_SAPHIRE);
				_setstack.setCount(1);
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
