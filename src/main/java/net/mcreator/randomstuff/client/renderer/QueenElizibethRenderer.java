
package net.mcreator.randomstuff.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.randomstuff.entity.QueenElizibethEntity;
import net.mcreator.randomstuff.client.model.Modelsteve;

public class QueenElizibethRenderer extends MobRenderer<QueenElizibethEntity, Modelsteve<QueenElizibethEntity>> {
	public QueenElizibethRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsteve(context.bakeLayer(Modelsteve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(QueenElizibethEntity entity) {
		return new ResourceLocation("random_stuff:textures/asset_secretchest.png");
	}
}
