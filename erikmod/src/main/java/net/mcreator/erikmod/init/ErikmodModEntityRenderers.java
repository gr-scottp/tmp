
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.erikmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.erikmod.client.renderer.ErikiishimRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ErikmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ErikmodModEntities.ERIKIISHIM.get(), ErikiishimRenderer::new);
	}
}
