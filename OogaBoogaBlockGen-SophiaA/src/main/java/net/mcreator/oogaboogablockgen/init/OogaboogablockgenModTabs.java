
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class OogaboogablockgenModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OogaboogablockgenMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(OogaboogablockgenModBlocks.OOGA_BOOGA_BLOCK_GEN.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {

			tabData.accept(OogaboogablockgenModItems.MONEY.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(OogaboogablockgenModItems.MONEY.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(OogaboogablockgenModItems.OGB_WAND.get());
			tabData.accept(OogaboogablockgenModItems.MONEY.get());

		}
	}
}
