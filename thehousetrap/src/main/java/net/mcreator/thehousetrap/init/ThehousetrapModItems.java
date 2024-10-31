
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehousetrap.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thehousetrap.item.CiraeFroggyItem;
import net.mcreator.thehousetrap.ThehousetrapMod;

public class ThehousetrapModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ThehousetrapMod.MODID);
	public static final DeferredItem<Item> CIRAEBLOCK = block(ThehousetrapModBlocks.CIRAEBLOCK);
	public static final DeferredItem<Item> CIRAE_FROGGY = REGISTRY.register("cirae_froggy", CiraeFroggyItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
