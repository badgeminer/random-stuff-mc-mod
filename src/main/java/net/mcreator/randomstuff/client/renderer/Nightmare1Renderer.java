
package net.mcreator.randomstuff.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.randomstuff.entity.Nightmare1Entity;
import net.mcreator.randomstuff.client.model.Modelsteve;

public class Nightmare1Renderer extends MobRenderer<Nightmare1Entity, Modelsteve<Nightmare1Entity>> {
	public Nightmare1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelsteve(context.bakeLayer(Modelsteve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Nightmare1Entity entity) {
		return new ResourceLocation("random_stuff:textures/nighmare-dream-19624028.png");
	}
}
