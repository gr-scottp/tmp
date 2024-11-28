
package net.mcreator.cavarli.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.cavarli.entity.Noob1234567890OHIOEntity;

public class Noob1234567890OHIORenderer extends MobRenderer<Noob1234567890OHIOEntity, SpiderModel<Noob1234567890OHIOEntity>> {
	public Noob1234567890OHIORenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Noob1234567890OHIOEntity entity) {
		return ResourceLocation.parse("cavarli:textures/entities/cavarlidragon.png");
	}
}
