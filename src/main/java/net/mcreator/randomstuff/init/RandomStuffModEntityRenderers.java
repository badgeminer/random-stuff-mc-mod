
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.randomstuff.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.randomstuff.client.renderer.ShadowArmorRenderer;
import net.mcreator.randomstuff.client.renderer.QueenElizibethRenderer;
import net.mcreator.randomstuff.client.renderer.NoobRenderer;
import net.mcreator.randomstuff.client.renderer.NoobKingRenderer;
import net.mcreator.randomstuff.client.renderer.Nightmare1Renderer;
import net.mcreator.randomstuff.client.renderer.GhostRenderer;
import net.mcreator.randomstuff.client.renderer.EndghostRenderer;
import net.mcreator.randomstuff.client.renderer.EnderGhostRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RandomStuffModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RandomStuffModEntities.ENDGHOST.get(), EndghostRenderer::new);
		event.registerEntityRenderer(RandomStuffModEntities.SHADOW_ARMOR.get(), ShadowArmorRenderer::new);
		event.registerEntityRenderer(RandomStuffModEntities.GHOST.get(), GhostRenderer::new);
		event.registerEntityRenderer(RandomStuffModEntities.NOOB.get(), NoobRenderer::new);
		event.registerEntityRenderer(RandomStuffModEntities.QUEEN_ELIZIBETH.get(), QueenElizibethRenderer::new);
		event.registerEntityRenderer(RandomStuffModEntities.ENDER_GHOST.get(), EnderGhostRenderer::new);
		event.registerEntityRenderer(RandomStuffModEntities.NOOB_KING.get(), NoobKingRenderer::new);
		event.registerEntityRenderer(RandomStuffModEntities.NIGHTMARE_1.get(), Nightmare1Renderer::new);
		event.registerEntityRenderer(RandomStuffModEntities.NIGHTMARE_1_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
