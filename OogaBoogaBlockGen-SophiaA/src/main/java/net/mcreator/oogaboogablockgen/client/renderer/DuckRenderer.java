
package net.mcreator.oogaboogablockgen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.oogaboogablockgen.entity.DuckEntity;

public class DuckRenderer extends MobRenderer<DuckEntity, ChickenModel<DuckEntity>> {
	public DuckRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DuckEntity entity) {
		return ResourceLocation.parse("oogaboogablockgen:textures/entities/duckysussybakayipeewahooimrunningoutofnameshelp.png");
	}
}
