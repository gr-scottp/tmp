package net.mcreator.cinnamoroll.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cinnamoroll.init.CinnamorollModBlocks;

public class HouseOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xoffset = 0;
		double zoffset = 0;
		double yoffset = 0;
		xoffset = -2;
		yoffset = 0;
		zoffset = -2;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 5; index1++) {
				world.setBlock(BlockPos.containing(x + xoffset, y - 1, z + zoffset), CinnamorollModBlocks.HOUSE.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xoffset, y + 3, z + zoffset), CinnamorollModBlocks.HOUSE.get().defaultBlockState(), 3);
				xoffset = xoffset + 1;
			}
			xoffset = -2;
			zoffset = zoffset + 1;
		}
		xoffset = -2;
		yoffset = 0;
		zoffset = -2;
		for (int index2 = 0; index2 < 3; index2++) {
			for (int index3 = 0; index3 < 5; index3++) {
				world.setBlock(BlockPos.containing(x + xoffset, y + yoffset, z + 2), CinnamorollModBlocks.HOUSE.get().defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xoffset, y + yoffset, z - 2), CinnamorollModBlocks.HOUSE.get().defaultBlockState(), 3);
				xoffset = xoffset + 1;
			}
			xoffset = -2;
			yoffset = yoffset + 1;
		}
	}
}
