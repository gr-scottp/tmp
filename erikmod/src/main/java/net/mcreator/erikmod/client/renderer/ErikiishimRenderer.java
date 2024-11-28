
package net.mcreator.erikmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.erikmod.entity.ErikiishimEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class ErikiishimRenderer extends MobRenderer<ErikiishimEntity, VillagerModel<ErikiishimEntity>> {
	public ErikiishimRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	protected void scale(ErikiishimEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(ErikiishimEntity entity) {
		return ResourceLocation.parse("erikmod:textures/entities/villager.png");
	}
}
