
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

public class OogaboogablockgenModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(OogaboogablockgenMod.MODID);
	public static final DeferredHolder<Item, Item> OOGA_BOOGA_BLOCK_GEN = block(OogaboogablockgenModBlocks.OOGA_BOOGA_BLOCK_GEN);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
