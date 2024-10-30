
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.something.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.something.item.TheKEYItem;
import net.mcreator.something.item.OverunderItem;
import net.mcreator.something.item.NOTWATERItem;
import net.mcreator.something.item.MajikWanddeItem;
import net.mcreator.something.SomethingMod;

public class SomethingModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SomethingMod.MODID);
	public static final DeferredItem<Item> THE_KEY = REGISTRY.register("the_key", TheKEYItem::new);
	public static final DeferredItem<Item> JUSTINBEBE = block(SomethingModBlocks.JUSTINBEBE);
	public static final DeferredItem<Item> NOTWATER_BUCKET = REGISTRY.register("notwater_bucket", NOTWATERItem::new);
	public static final DeferredItem<Item> OVERUNDER = REGISTRY.register("overunder", OverunderItem::new);
	public static final DeferredItem<Item> MAJIK_WANDDE = REGISTRY.register("majik_wandde", MajikWanddeItem::new);
	public static final DeferredItem<Item> ABLOCK = block(SomethingModBlocks.ABLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
