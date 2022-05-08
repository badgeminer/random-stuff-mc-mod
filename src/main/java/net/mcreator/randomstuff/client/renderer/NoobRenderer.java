
package net.mcreator.randomstuff.client.renderer;

public class NoobRenderer extends MobRenderer<NoobEntity, Modelsteve<NoobEntity>> {

	public NoobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsteve(context.bakeLayer(Modelsteve.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(NoobEntity entity) {
		return new ResourceLocation("random_stuff:textures/noob-1234-20274971.png");
	}

}
