
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oogaboogablockgen.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.oogaboogablockgen.block.OogaBoogaBlockGenBlock;
import net.mcreator.oogaboogablockgen.OogaboogablockgenMod;

public class OogaboogablockgenModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(OogaboogablockgenMod.MODID);
	public static final DeferredHolder<Block, Block> OOGA_BOOGA_BLOCK_GEN = REGISTRY.register("ooga_booga_block_gen", OogaBoogaBlockGenBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
