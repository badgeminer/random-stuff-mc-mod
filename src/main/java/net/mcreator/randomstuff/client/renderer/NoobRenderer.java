
package net.mcreator.randomstuff.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.randomstuff.entity.NoobEntity;
import net.mcreator.randomstuff.client.model.Modelsteve;

public class NoobRenderer extends MobRenderer<NoobEntity, Modelsteve<NoobEntity>> {
	public NoobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsteve(context.bakeLayer(Modelsteve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NoobEntity entity) {
		return new ResourceLocation("random_stuff:textures/blueprint.png");
	}
}
