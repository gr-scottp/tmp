
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cinnamoroll.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.cinnamoroll.client.gui.JamilanotcinmrollScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CinnamorollModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(CinnamorollModMenus.JAMILANOTCINMROLL.get(), JamilanotcinmrollScreen::new);
	}
}
