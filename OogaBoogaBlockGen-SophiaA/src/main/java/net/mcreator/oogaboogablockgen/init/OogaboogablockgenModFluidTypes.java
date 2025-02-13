
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.oogaboogablockgen.fluid.types.TheBuildWaterFluidType;
import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

public class OogaboogablockgenModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, OogaboogablockgenMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> THE_BUILD_WATER_TYPE = REGISTRY.register("the_build_water", () -> new TheBuildWaterFluidType());
}
