
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wingsoffire.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.wingsoffire.block.WingsOfFireexBlock;
import net.mcreator.wingsoffire.block.MomofrogsigmaBlock;
import net.mcreator.wingsoffire.block.MomofrogdimensionPortalBlock;
import net.mcreator.wingsoffire.block.FunblockBlock;
import net.mcreator.wingsoffire.block.CheckersBlock;
import net.mcreator.wingsoffire.WingsoffireMod;

public class WingsoffireModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(WingsoffireMod.MODID);
	public static final DeferredBlock<Block> WINGS_OF_FIREEX = REGISTRY.register("wings_of_fireex", WingsOfFireexBlock::new);
	public static final DeferredBlock<Block> CHECKERS = REGISTRY.register("checkers", CheckersBlock::new);
	public static final DeferredBlock<Block> FUNBLOCK = REGISTRY.register("funblock", FunblockBlock::new);
	public static final DeferredBlock<Block> MOMOFROGSIGMA = REGISTRY.register("momofrogsigma", MomofrogsigmaBlock::new);
	public static final DeferredBlock<Block> MOMOFROGDIMENSION_PORTAL = REGISTRY.register("momofrogdimension_portal", MomofrogdimensionPortalBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
