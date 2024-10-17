
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yousefmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.yousefmod.item.YOUSEFwandItem;
import net.mcreator.yousefmod.YousefmodMod;

public class YousefmodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(YousefmodMod.MODID);
	public static final DeferredHolder<Item, Item> BEBEA = block(YousefmodModBlocks.BEBEA);
	public static final DeferredHolder<Item, Item> YOUSE_FWAND = REGISTRY.register("youse_fwand", YOUSEFwandItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
