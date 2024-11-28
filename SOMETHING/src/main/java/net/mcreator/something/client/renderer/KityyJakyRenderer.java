
package net.mcreator.something.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.something.entity.KityyJakyEntity;

public class KityyJakyRenderer extends MobRenderer<KityyJakyEntity, OcelotModel<KityyJakyEntity>> {
	public KityyJakyRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel(context.bakeLayer(ModelLayers.OCELOT)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(KityyJakyEntity entity) {
		return ResourceLocation.parse("something:textures/entities/british_shorthair.png");
	}
}
