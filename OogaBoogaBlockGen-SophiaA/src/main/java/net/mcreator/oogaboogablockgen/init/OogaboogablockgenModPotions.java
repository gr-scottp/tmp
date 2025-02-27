
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

public class OogaboogablockgenModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, OogaboogablockgenMod.MODID);
	public static final DeferredHolder<Potion, Potion> BEST_POTION_IN_THE_GAME = REGISTRY.register("best_potion_in_the_game",
			() -> new Potion(new MobEffectInstance(OogaboogablockgenModMobEffects.BEST_POTION_YIPPEE, 3600, 0, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0, false, true), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 0, false, true), new MobEffectInstance(MobEffects.JUMP, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.REGENERATION, 3600, 0, false, true), new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 0, false, true), new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0, false, true), new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0, false, true), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.SATURATION, 3600, 0, false, true), new MobEffectInstance(MobEffects.ABSORPTION, 3600, 0, false, true)));
}
