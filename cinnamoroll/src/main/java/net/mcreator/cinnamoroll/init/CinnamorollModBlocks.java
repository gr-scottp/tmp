
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cinnamoroll.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.cinnamoroll.block.Winterblock2Block;
import net.mcreator.cinnamoroll.block.WinterLandBlock;
import net.mcreator.cinnamoroll.block.LoLBlock;
import net.mcreator.cinnamoroll.block.HouseBlock;
import net.mcreator.cinnamoroll.block.BobTheBuilderPortalBlock;
import net.mcreator.cinnamoroll.CinnamorollMod;

public class CinnamorollModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CinnamorollMod.MODID);
	public static final DeferredBlock<Block> WINTER_LAND = REGISTRY.register("winter_land", WinterLandBlock::new);
	public static final DeferredBlock<Block> LO_L = REGISTRY.register("lo_l", LoLBlock::new);
	public static final DeferredBlock<Block> WINTERBLOCK_2 = REGISTRY.register("winterblock_2", Winterblock2Block::new);
	public static final DeferredBlock<Block> BOB_THE_BUILDER_PORTAL = REGISTRY.register("bob_the_builder_portal", BobTheBuilderPortalBlock::new);
	public static final DeferredBlock<Block> HOUSE = REGISTRY.register("house", HouseBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
