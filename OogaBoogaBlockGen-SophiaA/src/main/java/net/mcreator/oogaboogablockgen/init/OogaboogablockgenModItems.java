
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.oogaboogablockgen.item.OGBWandItem;
import net.mcreator.oogaboogablockgen.item.MoneyItem;
import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

public class OogaboogablockgenModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(OogaboogablockgenMod.MODID);
	public static final DeferredItem<Item> OOGA_BOOGA_BLOCK_GEN = block(OogaboogablockgenModBlocks.OOGA_BOOGA_BLOCK_GEN);
	public static final DeferredItem<Item> OGB_WAND = REGISTRY.register("ogb_wand", OGBWandItem::new);
	public static final DeferredItem<Item> GOOFY_AHH_BLOCK_YIPPEEE = block(OogaboogablockgenModBlocks.GOOFY_AHH_BLOCK_YIPPEEE);
	public static final DeferredItem<Item> MONEY = REGISTRY.register("money", MoneyItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
