
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.oogaboogablockgen.potion.BestPotionYippeeMobEffect;
import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

public class OogaboogablockgenModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, OogaboogablockgenMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> BEST_POTION_YIPPEE = REGISTRY.register("best_potion_yippee", () -> new BestPotionYippeeMobEffect());
}
