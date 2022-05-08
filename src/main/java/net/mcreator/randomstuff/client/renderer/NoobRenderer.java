
package net.mcreator.randomstuff.client.renderer;

public class NoobRenderer extends HumanoidMobRenderer<NoobEntity, HumanoidModel<NoobEntity>> {

	public NoobRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(NoobEntity entity) {
		return new ResourceLocation("random_stuff:textures/daily_left_wing.png");
	}

}
