
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.erikmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.erikmod.world.inventory.TickggMenu;
import net.mcreator.erikmod.ErikmodMod;

public class ErikmodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, ErikmodMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<TickggMenu>> TICKGG = REGISTRY.register("tickgg", () -> IMenuTypeExtension.create(TickggMenu::new));
}
