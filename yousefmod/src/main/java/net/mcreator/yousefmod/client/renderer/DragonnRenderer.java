
package net.mcreator.yousefmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.GhastModel;

import net.mcreator.yousefmod.entity.DragonnEntity;

public class DragonnRenderer extends MobRenderer<DragonnEntity, GhastModel<DragonnEntity>> {
	public DragonnRenderer(EntityRendererProvider.Context context) {
		super(context, new GhastModel(context.bakeLayer(ModelLayers.GHAST)), 2.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(DragonnEntity entity) {
		return ResourceLocation.parse("yousefmod:textures/entities/dragon.png");
	}
}
