
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wingsoffire.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.wingsoffire.block.WingsOfFireexBlock;
import net.mcreator.wingsoffire.block.RaiseyouryayayaBlock;
import net.mcreator.wingsoffire.block.Raiseyouryayaya2Block;
import net.mcreator.wingsoffire.block.FunblockBlock;
import net.mcreator.wingsoffire.block.CheckersBlock;
import net.mcreator.wingsoffire.WingsoffireMod;

public class WingsoffireModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(WingsoffireMod.MODID);
	public static final DeferredBlock<Block> WINGS_OF_FIREEX = REGISTRY.register("wings_of_fireex", WingsOfFireexBlock::new);
	public static final DeferredBlock<Block> CHECKERS = REGISTRY.register("checkers", CheckersBlock::new);
	public static final DeferredBlock<Block> FUNBLOCK = REGISTRY.register("funblock", FunblockBlock::new);
	public static final DeferredBlock<Block> RAISEYOURYAYAYA = REGISTRY.register("raiseyouryayaya", RaiseyouryayayaBlock::new);
	public static final DeferredBlock<Block> RAISEYOURYAYAYA_2 = REGISTRY.register("raiseyouryayaya_2", Raiseyouryayaya2Block::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
