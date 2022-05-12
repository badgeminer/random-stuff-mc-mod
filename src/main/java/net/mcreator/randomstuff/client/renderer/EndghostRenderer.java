
package net.mcreator.randomstuff.client.renderer;

public class EndghostRenderer extends MobRenderer<EndghostEntity, Modelsteve<EndghostEntity>> {

	public EndghostRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsteve(context.bakeLayer(Modelsteve.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(EndghostEntity entity) {
		return new ResourceLocation("random_stuff:textures/ca0c87fec7413dcb7d1f61af24cf649a556e05b0225022c1f61d80893f33987f.png");
	}

	@Override
	protected boolean isBodyVisible(EndghostEntity _ent) {
		Entity entity = _ent;
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return !

		GhostTransparentEntityModelConditionProcedure.execute();
	}

}
