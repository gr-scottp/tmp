
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yousefmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.yousefmod.block.BebeaBlock;
import net.mcreator.yousefmod.YousefmodMod;

public class YousefmodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(YousefmodMod.MODID);
	public static final DeferredBlock<Block> BEBEA = REGISTRY.register("bebea", BebeaBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
