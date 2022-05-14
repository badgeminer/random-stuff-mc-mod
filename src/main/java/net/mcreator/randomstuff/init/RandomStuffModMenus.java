
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.randomstuff.world.inventory.TempestCrafterGuiMenu;
import net.mcreator.randomstuff.world.inventory.NoobKingSpawnMenu;
import net.mcreator.randomstuff.world.inventory.LootMenu;
import net.mcreator.randomstuff.world.inventory.DrillGuiMenu;
import net.mcreator.randomstuff.world.inventory.BossAltarGuiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RandomStuffModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<LootMenu> LOOT = register("loot", (id, inv, extraData) -> new LootMenu(id, inv, extraData));
	public static final MenuType<DrillGuiMenu> DRILL_GUI = register("drill_gui", (id, inv, extraData) -> new DrillGuiMenu(id, inv, extraData));
	public static final MenuType<BossAltarGuiMenu> BOSS_ALTAR_GUI = register("boss_altar_gui",
			(id, inv, extraData) -> new BossAltarGuiMenu(id, inv, extraData));
	public static final MenuType<NoobKingSpawnMenu> NOOB_KING_SPAWN = register("noob_king_spawn",
			(id, inv, extraData) -> new NoobKingSpawnMenu(id, inv, extraData));
	public static final MenuType<TempestCrafterGuiMenu> TEMPEST_CRAFTER_GUI = register("tempest_crafter_gui",
			(id, inv, extraData) -> new TempestCrafterGuiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
