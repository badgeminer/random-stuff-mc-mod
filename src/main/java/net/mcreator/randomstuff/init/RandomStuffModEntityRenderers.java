
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.randomstuff.client.renderer.ShadowArmorRenderer;
import net.mcreator.randomstuff.client.renderer.NoobRenderer;
import net.mcreator.randomstuff.client.renderer.GhostRenderer;
import net.mcreator.randomstuff.client.renderer.EndghostRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RandomStuffModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RandomStuffModEntities.SHADOW_ARMOR.get(), ShadowArmorRenderer::new);
		event.registerEntityRenderer(RandomStuffModEntities.GHOST.get(), GhostRenderer::new);
		event.registerEntityRenderer(RandomStuffModEntities.NOOB.get(), NoobRenderer::new);
		event.registerEntityRenderer(RandomStuffModEntities.ENDGHOST.get(), EndghostRenderer::new);
	}
}
