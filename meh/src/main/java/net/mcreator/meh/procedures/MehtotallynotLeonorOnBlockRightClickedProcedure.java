package net.mcreator.meh.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.meh.init.MehModBlocks;

public class MehtotallynotLeonorOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xOffset = 0;
		double zOffset = 0;
		xOffset = -1;
		zOffset = -1;
		for (int index0 = 0; index0 < 3; index0++) {
			for (int index1 = 0; index1 < 3; index1++) {
				world.setBlock(BlockPos.containing(x + xOffset, y - 1, z + zOffset), MehModBlocks.MEHTOTALLYNOT_LEONOR.get().defaultBlockState(), 3);
				zOffset = 1 + zOffset;
			}
			zOffset = -1;
			xOffset = 1 + xOffset;
		}
	}
}
