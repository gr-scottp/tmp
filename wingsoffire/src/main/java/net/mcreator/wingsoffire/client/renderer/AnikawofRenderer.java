
package net.mcreator.wingsoffire.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.wingsoffire.entity.AnikawofEntity;

public class AnikawofRenderer extends MobRenderer<AnikawofEntity, CowModel<AnikawofEntity>> {
	public AnikawofRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AnikawofEntity entity) {
		return ResourceLocation.parse("wingsoffire:textures/entities/polarbear.png");
	}
}
