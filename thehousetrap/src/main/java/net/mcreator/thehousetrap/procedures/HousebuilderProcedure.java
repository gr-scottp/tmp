package net.mcreator.thehousetrap.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.thehousetrap.init.ThehousetrapModBlocks;

public class HousebuilderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xoffset = 0;
		double zoffset = 0;
		xoffset = -1;
		zoffset = -1;
		for (int index0 = 0; index0 < 3; index0++) {
			for (int index1 = 0; index1 < 3; index1++) {
				world.setBlock(BlockPos.containing(x + xoffset, y - 2, z + zoffset), ThehousetrapModBlocks.CIRAEBLOCK.get().defaultBlockState(), 3);
				xoffset = xoffset + 1;
			}
			xoffset = -1;
			zoffset = zoffset + 1;
		}
	}
}
