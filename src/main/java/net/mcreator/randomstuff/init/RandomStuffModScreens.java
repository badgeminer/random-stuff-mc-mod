
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.randomstuff.client.gui.LootScreen;
import net.mcreator.randomstuff.client.gui.DrillGuiScreen;
import net.mcreator.randomstuff.client.gui.BossAltarGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RandomStuffModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(RandomStuffModMenus.LOOT, LootScreen::new);
			MenuScreens.register(RandomStuffModMenus.DRILL_GUI, DrillGuiScreen::new);
			MenuScreens.register(RandomStuffModMenus.BOSS_ALTAR_GUI, BossAltarGuiScreen::new);
		});
	}
}
