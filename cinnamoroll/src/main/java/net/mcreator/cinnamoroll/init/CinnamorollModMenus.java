
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cinnamoroll.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.cinnamoroll.world.inventory.JamilanotcinmrollMenu;
import net.mcreator.cinnamoroll.CinnamorollMod;

public class CinnamorollModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, CinnamorollMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<JamilanotcinmrollMenu>> JAMILANOTCINMROLL = REGISTRY.register("jamilanotcinmroll", () -> IMenuTypeExtension.create(JamilanotcinmrollMenu::new));
}
