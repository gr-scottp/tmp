
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yousefmod.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.yousefmod.client.gui.TickViewScreen;
import net.mcreator.yousefmod.client.gui.FanumtaxScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class YousefmodModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(YousefmodModMenus.TICK_VIEW.get(), TickViewScreen::new);
		event.register(YousefmodModMenus.FANUMTAX.get(), FanumtaxScreen::new);
	}
}
