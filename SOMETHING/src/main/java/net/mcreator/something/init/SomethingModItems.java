
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.something.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.something.item.TheKEYItem;
import net.mcreator.something.item.NOTWATERItem;
import net.mcreator.something.SomethingMod;

public class SomethingModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SomethingMod.MODID);
	public static final DeferredHolder<Item, Item> THE_KEY = REGISTRY.register("the_key", TheKEYItem::new);
	public static final DeferredHolder<Item, Item> JUSTINBEBE = block(SomethingModBlocks.JUSTINBEBE);
	public static final DeferredHolder<Item, Item> NOTWATER_BUCKET = REGISTRY.register("notwater_bucket", NOTWATERItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
