
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cavarli.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.cavarli.client.gui.CacacacacacaGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CavarliModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(CavarliModMenus.CACACACACACA_GUI.get(), CacacacacacaGUIScreen::new);
	}
}
