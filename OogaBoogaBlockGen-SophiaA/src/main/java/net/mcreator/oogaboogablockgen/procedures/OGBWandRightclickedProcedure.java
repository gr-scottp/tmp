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
		ZOffset = -2;
		XOffset = -2;
		YOffset = 0;
		for (int index0 = 0; index0 < 6; index0++) {
			for (int index1 = 0; index1 < 6; index1++) {
				world.setBlock(BlockPos.containing(x + XOffset, y + 0, z + ZOffset), Blocks.OAK_PLANKS.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + XOffset, y + 5, z + ZOffset), Blocks.SMOOTH_QUARTZ.defaultBlockState(), 3);
				XOffset = XOffset + 1;
			}
			ZOffset = ZOffset + 1;
			XOffset = -2;
		}
		ZOffset = -2;
		XOffset = -2;
		YOffset = 0;
		for (int index2 = 0; index2 < 5; index2++) {
			for (int index3 = 0; index3 < 6; index3++) {
				world.setBlock(BlockPos.containing(x + XOffset, y + YOffset, z + 3), Blocks.QUARTZ_PILLAR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + XOffset, y + YOffset, z - 3), Blocks.QUARTZ_PILLAR.defaultBlockState(), 3);
				XOffset = XOffset + 1;
			}
			YOffset = YOffset + 1;
			XOffset = -2;
		}
		ZOffset = -2;
		XOffset = -2;
		YOffset = 0;
		for (int index4 = 0; index4 < 5; index4++) {
			for (int index5 = 0; index5 < 6; index5++) {
				world.setBlock(BlockPos.containing(x + 3, y + YOffset, z + ZOffset), Blocks.QUARTZ_PILLAR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x - 3, y + YOffset, z + ZOffset), Blocks.QUARTZ_PILLAR.defaultBlockState(), 3);
				XOffset = XOffset + 1;
			}
			YOffset = YOffset + 1;
			XOffset = -2;
		}
	}
}
