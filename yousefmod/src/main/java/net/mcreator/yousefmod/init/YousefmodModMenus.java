
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yousefmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.yousefmod.world.inventory.TickViewMenu;
import net.mcreator.yousefmod.world.inventory.FanumtaxMenu;
import net.mcreator.yousefmod.YousefmodMod;

public class YousefmodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, YousefmodMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<TickViewMenu>> TICK_VIEW = REGISTRY.register("tick_view", () -> IMenuTypeExtension.create(TickViewMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FanumtaxMenu>> FANUMTAX = REGISTRY.register("fanumtax", () -> IMenuTypeExtension.create(FanumtaxMenu::new));
}
