
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.something.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.something.block.NOTWATERBlock;
import net.mcreator.something.block.JUSTINBEBEBlock;
import net.mcreator.something.SomethingMod;

public class SomethingModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SomethingMod.MODID);
	public static final DeferredHolder<Block, Block> JUSTINBEBE = REGISTRY.register("justinbebe", JUSTINBEBEBlock::new);
	public static final DeferredHolder<Block, Block> NOTWATER = REGISTRY.register("notwater", NOTWATERBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
