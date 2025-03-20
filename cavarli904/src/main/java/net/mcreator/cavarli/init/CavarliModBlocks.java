
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cavarli.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.cavarli.block.OHIOTOLENOOB1234Block;
import net.mcreator.cavarli.block.Lolc1234PortalBlock;
import net.mcreator.cavarli.block.CavarliBlockBlock;
import net.mcreator.cavarli.CavarliMod;

public class CavarliModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CavarliMod.MODID);
	public static final DeferredBlock<Block> CAVARLI_BLOCK = REGISTRY.register("cavarli_block", CavarliBlockBlock::new);
	public static final DeferredBlock<Block> OHIOTOLENOOB_1234 = REGISTRY.register("ohiotolenoob_1234", OHIOTOLENOOB1234Block::new);
	public static final DeferredBlock<Block> LOLC_1234_PORTAL = REGISTRY.register("lolc_1234_portal", Lolc1234PortalBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
