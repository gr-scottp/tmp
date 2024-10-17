package net.mcreator.yousefmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.yousefmod.init.YousefmodModBlocks;

public class YOUSEFwandRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double zOffset = 0;
		double xOffset = 0;
		zOffset = -1;
		xOffset = -1;
		for (int index0 = 0; index0 < 3; index0++) {
			for (int index1 = 0; index1 < 3; index1++) {
				world.setBlock(BlockPos.containing(x + xOffset, y - 2, z + zOffset), YousefmodModBlocks.BEBEA.get().defaultBlockState(), 3);
				xOffset = 1 + xOffset;
			}
			xOffset = -1;
			zOffset = 1 + zOffset;
		}
	}
}
