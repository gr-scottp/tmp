
package net.mcreator.thehousetrap.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import net.mcreator.thehousetrap.entity.CiraewolfEntity;

public class CiraewolfRenderer extends MobRenderer<CiraewolfEntity, OcelotModel<CiraewolfEntity>> {
	public CiraewolfRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CiraewolfEntity entity) {
		return ResourceLocation.parse("thehousetrap:textures/entities/wolf.png");
	}
}
