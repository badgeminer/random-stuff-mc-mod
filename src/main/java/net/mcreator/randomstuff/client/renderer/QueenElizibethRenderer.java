
package net.mcreator.randomstuff.client.renderer;

public class QueenElizibethRenderer extends MobRenderer<QueenElizibethEntity, Modelsteve<QueenElizibethEntity>> {

	public QueenElizibethRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsteve(context.bakeLayer(Modelsteve.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(QueenElizibethEntity entity) {
		return new ResourceLocation("random_stuff:textures/asset_secretchest.png");
	}

}
