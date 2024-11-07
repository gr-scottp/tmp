
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.something.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.something.client.gui.JakyFurnaceGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SomethingModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(SomethingModMenus.JAKY_FURNACE_GUI.get(), JakyFurnaceGUIScreen::new);
	}
}
