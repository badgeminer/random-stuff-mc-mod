
package net.mcreator.randomstuff.client.renderer;

public class ShadowArmorRenderer extends MobRenderer<ShadowArmorEntity, ModelshadowArmor<ShadowArmorEntity>> {

	public ShadowArmorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelshadowArmor(context.bakeLayer(ModelshadowArmor.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ShadowArmorEntity entity) {
		return new ResourceLocation("random_stuff:textures/shadow_armor.png");
	}

}
