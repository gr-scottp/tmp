
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.oogaboogablockgen.world.inventory.YIPEEMenu;
import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

public class OogaboogablockgenModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, OogaboogablockgenMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<YIPEEMenu>> YIPEE = REGISTRY.register("yipee", () -> IMenuTypeExtension.create(YIPEEMenu::new));
}
