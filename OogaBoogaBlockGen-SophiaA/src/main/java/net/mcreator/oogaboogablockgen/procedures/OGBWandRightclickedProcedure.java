package net.mcreator.oogaboogablockgen.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class OGBWandRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double ZOffset = 0;
		double XOffset = 0;
		double YOffset = 0;
		double X1Offset = 0;
		double Z1Offset = 0;
		double X2Offset = 0;
		double Z2Offset = 0;
		ZOffset = -1;
		XOffset = -1;
		YOffset = -1;
		for (int index0 = 0; index0 < 10; index0++) {
			for (int index1 = 0; index1 < 10; index1++) {
				for (int index2 = 0; index2 < 10; index2++) {
					world.setBlock(BlockPos.containing(x + XOffset, y + 1, z + ZOffset), Blocks.OAK_PLANKS.defaultBlockState(), 3);
					XOffset = XOffset + 1;
				}
				XOffset = XOffset + 1;
			}
			ZOffset = ZOffset + 1;
			XOffset = -1;
		}
	}
}
