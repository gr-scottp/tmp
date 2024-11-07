
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dextermod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.dextermod.world.inventory.DexterFurnaceGUIMenu;
import net.mcreator.dextermod.DextermodMod;

public class DextermodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, DextermodMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<DexterFurnaceGUIMenu>> DEXTER_FURNACE_GUI = REGISTRY.register("dexter_furnace_gui", () -> IMenuTypeExtension.create(DexterFurnaceGUIMenu::new));
}
