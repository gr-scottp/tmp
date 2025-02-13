
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.oogaboogablockgen.fluid.TheBuildWaterFluid;
import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

public class OogaboogablockgenModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, OogaboogablockgenMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> THE_BUILD_WATER = REGISTRY.register("the_build_water", () -> new TheBuildWaterFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_THE_BUILD_WATER = REGISTRY.register("flowing_the_build_water", () -> new TheBuildWaterFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(THE_BUILD_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_THE_BUILD_WATER.get(), RenderType.translucent());
		}
	}
}
