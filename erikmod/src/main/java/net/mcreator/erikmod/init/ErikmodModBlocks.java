
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.erikmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.erikmod.block.ErikBlocksBlock;
import net.mcreator.erikmod.ErikmodMod;

public class ErikmodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ErikmodMod.MODID);
	public static final DeferredHolder<Block, Block> ERIK_BLOCKS = REGISTRY.register("erik_blocks", ErikBlocksBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
