
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.something.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.something.world.inventory.JakyFurnaceGUIMenu;
import net.mcreator.something.SomethingMod;

public class SomethingModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, SomethingMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<JakyFurnaceGUIMenu>> JAKY_FURNACE_GUI = REGISTRY.register("jaky_furnace_gui", () -> IMenuTypeExtension.create(JakyFurnaceGUIMenu::new));
}
