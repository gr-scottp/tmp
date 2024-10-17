
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cavarli.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cavarli.item.CAVARLInoob1234567890Item;
import net.mcreator.cavarli.CavarliMod;

public class CavarliModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CavarliMod.MODID);
	public static final DeferredHolder<Item, Item> CAVARLI_BLOCK = block(CavarliModBlocks.CAVARLI_BLOCK);
	public static final DeferredHolder<Item, Item> CAVARL_INOOB_1234567890 = REGISTRY.register("cavarl_inoob_1234567890", CAVARLInoob1234567890Item::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
