
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yousefmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.yousefmod.YousefmodMod;

public class YousefmodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, YousefmodMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> SQUIDGAME = REGISTRY.register("squidgame", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("yousefmod", "squidgame")));
}
