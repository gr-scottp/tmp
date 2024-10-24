
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

public class OogaboogablockgenModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, OogaboogablockgenMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> STARS = REGISTRY.register("stars", () -> new SimpleParticleType(false));
}
