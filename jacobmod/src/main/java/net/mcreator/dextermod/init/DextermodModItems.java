
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dextermod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dextermod.item.PlatformWandItem;
import net.mcreator.dextermod.DextermodMod;

public class DextermodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DextermodMod.MODID);
	public static final DeferredItem<Item> DEXTER_FACE_BLOCK = block(DextermodModBlocks.DEXTER_FACE_BLOCK);
	public static final DeferredItem<Item> PLATFORM_WAND = REGISTRY.register("platform_wand", PlatformWandItem::new);
	public static final DeferredItem<Item> DEXTER_FUNACE_BLOCK = block(DextermodModBlocks.DEXTER_FUNACE_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
