
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dextermod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.dextermod.block.DexterFaceBlockBlock;
import net.mcreator.dextermod.DextermodMod;

public class DextermodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DextermodMod.MODID);
	public static final DeferredBlock<Block> DEXTER_FACE_BLOCK = REGISTRY.register("dexter_face_block", DexterFaceBlockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
