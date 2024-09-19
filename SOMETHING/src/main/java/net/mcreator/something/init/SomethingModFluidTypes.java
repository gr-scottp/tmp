
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.something.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.something.fluid.types.NOTWATERFluidType;
import net.mcreator.something.SomethingMod;

public class SomethingModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, SomethingMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> NOTWATER_TYPE = REGISTRY.register("notwater", () -> new NOTWATERFluidType());
}
