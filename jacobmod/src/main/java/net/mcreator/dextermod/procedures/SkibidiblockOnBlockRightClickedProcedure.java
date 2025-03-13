package net.mcreator.dextermod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SkibidiblockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xoffset = 0;
		double yoffset = 0;
		double zoffset = 0;
		xoffset = -2;
		yoffset = 0;
		zoffset = -2;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 5; index1++) {
				world.setBlock(BlockPos.containing(x + xoffset, y - 1, z + zoffset), Blocks.MAGMA_BLOCK.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xoffset, y - 3, z + zoffset), Blocks.MAGMA_BLOCK.defaultBlockState(), 3);
				xoffset = xoffset + 1;
			}
			xoffset = -2;
			zoffset = zoffset + 1;
		}
	}
}
