
package net.mcreator.randomstuff.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.randomstuff.entity.EnderGhostEntity;
import net.mcreator.randomstuff.client.model.Modelsteve;

public class EnderGhostRenderer extends MobRenderer<EnderGhostEntity, Modelsteve<EnderGhostEntity>> {
	public EnderGhostRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsteve(context.bakeLayer(Modelsteve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnderGhostEntity entity) {
		return new ResourceLocation("random_stuff:textures/200ace630848097ff745b94d99448882a0fd49af6f55afad741f774256d64302.png");
	}
}
