package net.mcreator.dextermod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.dextermod.init.DextermodModBlocks;

public class DexterFaceBlockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x + 1, y, z), DextermodModBlocks.DEXTER_FACE_BLOCK.get().defaultBlockState(), 3);
	}
}
