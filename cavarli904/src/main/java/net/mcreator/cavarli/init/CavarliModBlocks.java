
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cavarli.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.cavarli.block.CavarliBlockBlock;
import net.mcreator.cavarli.CavarliMod;

public class CavarliModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CavarliMod.MODID);
	public static final DeferredHolder<Block, Block> CAVARLI_BLOCK = REGISTRY.register("cavarli_block", CavarliBlockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
