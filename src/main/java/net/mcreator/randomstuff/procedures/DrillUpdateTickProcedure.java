package net.mcreator.randomstuff.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.randomstuff.init.RandomStuffModItems;

import java.util.concurrent.atomic.AtomicInteger;

public class DrillUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.round(Math.random() * 100) <= 1) {
			if (world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName() != null
					&& BiomeDictionary
							.hasType(
									ResourceKey
											.create(Registry.BIOME_REGISTRY,
													world.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY)
															.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))),
									BiomeDictionary.Type.PLAINS)) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = 0;
						final ItemStack _setstack = new ItemStack(RandomStuffModItems.RUBIE);
						_setstack.setCount((int) (new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).getCount());
									});
								}
								return _retval.get();
							}
						}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 0) + 1));
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if (world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName() != null
					&& BiomeDictionary
							.hasType(
									ResourceKey
											.create(Registry.BIOME_REGISTRY,
													world.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY)
															.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))),
									BiomeDictionary.Type.SNOWY)) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = 0;
						final ItemStack _setstack = new ItemStack(RandomStuffModItems.JASPER);
						_setstack.setCount((int) (new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).getCount());
									});
								}
								return _retval.get();
							}
						}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 0) + 1));
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			} else if (world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName() != null
					&& BiomeDictionary
							.hasType(
									ResourceKey
											.create(Registry.BIOME_REGISTRY,
													world.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY)
															.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))),
									BiomeDictionary.Type.SANDY)) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
					if (_ent != null) {
						final int _sltid = 0;
						final ItemStack _setstack = new ItemStack(RandomStuffModItems.SAPHIRE);
						_setstack.setCount((int) (new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).getCount());
									});
								}
								return _retval.get();
							}
						}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 0) + 1));
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
		}
	}
}
