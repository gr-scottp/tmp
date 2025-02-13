
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.erikmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.erikmod.block.ErikytuBlock;
import net.mcreator.erikmod.block.ErikishimPortalBlock;
import net.mcreator.erikmod.block.ErikBlocksBlock;
import net.mcreator.erikmod.ErikmodMod;

public class ErikmodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ErikmodMod.MODID);
	public static final DeferredBlock<Block> ERIK_BLOCKS = REGISTRY.register("erik_blocks", ErikBlocksBlock::new);
	public static final DeferredBlock<Block> ERIKYTU = REGISTRY.register("erikytu", ErikytuBlock::new);
	public static final DeferredBlock<Block> ERIKISHIM_PORTAL = REGISTRY.register("erikishim_portal", ErikishimPortalBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
