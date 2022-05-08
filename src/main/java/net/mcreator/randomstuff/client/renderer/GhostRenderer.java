
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
		return new ResourceLocation("random_stuff:textures/811f8dae76dd7890612f9fee95dcd0b3b37f36a1984f28d7d5bc2656728cbf.png");
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
