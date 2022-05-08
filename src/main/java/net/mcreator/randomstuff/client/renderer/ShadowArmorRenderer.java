
package net.mcreator.randomstuff.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.randomstuff.entity.ShadowArmorEntity;
import net.mcreator.randomstuff.client.model.ModelshadowArmor;

public class ShadowArmorRenderer extends MobRenderer<ShadowArmorEntity, ModelshadowArmor<ShadowArmorEntity>> {
	public ShadowArmorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelshadowArmor(context.bakeLayer(ModelshadowArmor.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowArmorEntity entity) {
		return new ResourceLocation("random_stuff:textures/shadow_armor.png");
	}
}
