
package net.mcreator.randomstuff.client.renderer;

public class GhostRenderer extends MobRenderer<GhostEntity, Modelsteve<GhostEntity>> {

	public GhostRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsteve(context.bakeLayer(Modelsteve.LAYER_LOCATION)), 0.5f);

		this.addLayer(new EyesLayer<GhostEntity, Modelsteve<GhostEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("random_stuff:textures/glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GhostEntity entity) {
		return new ResourceLocation("random_stuff:textures/e799350985fb163c1cb764c8b119dbd2f37bfc0d6fb0301bbae3746f1aecf81c.png");
	}

	@Override
	protected boolean isBodyVisible(GhostEntity _ent) {
		Entity entity = _ent;
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return !

		GhostTransparentEntityModelConditionProcedure.execute();
	}

}
