
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cavarli.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.cavarli.world.inventory.CacacacacacaGUIMenu;
import net.mcreator.cavarli.CavarliMod;

public class CavarliModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, CavarliMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<CacacacacacaGUIMenu>> CACACACACACA_GUI = REGISTRY.register("cacacacacaca_gui", () -> IMenuTypeExtension.create(CacacacacacaGUIMenu::new));
}
