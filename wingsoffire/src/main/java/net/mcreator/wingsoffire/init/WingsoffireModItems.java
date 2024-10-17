
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wingsoffire.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.wingsoffire.item.GloryandthehiddenkingdomItem;
import net.mcreator.wingsoffire.WingsoffireMod;

public class WingsoffireModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(WingsoffireMod.MODID);
	public static final DeferredHolder<Item, Item> WINGS_OF_FIREEX = block(WingsoffireModBlocks.WINGS_OF_FIREEX);
	public static final DeferredHolder<Item, Item> GLORYANDTHEHIDDENKINGDOM = REGISTRY.register("gloryandthehiddenkingdom", GloryandthehiddenkingdomItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
