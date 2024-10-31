
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.erikmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.erikmod.item.ErikwandthebestItem;
import net.mcreator.erikmod.ErikmodMod;

public class ErikmodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ErikmodMod.MODID);
	public static final DeferredItem<Item> ERIK_BLOCKS = block(ErikmodModBlocks.ERIK_BLOCKS);
	public static final DeferredItem<Item> ERIKWANDTHEBEST = REGISTRY.register("erikwandthebest", ErikwandthebestItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
