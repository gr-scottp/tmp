
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.someone.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.someone.block.HanaBlockBlock;
import net.mcreator.someone.SomeoneMod;

public class SomeoneModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SomeoneMod.MODID);
	public static final DeferredHolder<Block, Block> HANA_BLOCK = REGISTRY.register("hana_block", HanaBlockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
