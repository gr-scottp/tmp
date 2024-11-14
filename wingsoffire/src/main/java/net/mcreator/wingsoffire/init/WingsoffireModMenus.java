
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wingsoffire.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.wingsoffire.world.inventory.CheckersguiMenu;
import net.mcreator.wingsoffire.WingsoffireMod;

public class WingsoffireModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, WingsoffireMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<CheckersguiMenu>> CHECKERSGUI = REGISTRY.register("checkersgui", () -> IMenuTypeExtension.create(CheckersguiMenu::new));
}
