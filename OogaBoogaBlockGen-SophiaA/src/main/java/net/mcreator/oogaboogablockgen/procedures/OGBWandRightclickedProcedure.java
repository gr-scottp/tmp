package net.mcreator.oogaboogablockgen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModBlocks;

public class OGBWandRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double ZOffset = 0;
		double XOffset = 0;
		double YOffset = 0;
		ZOffset = -1;
		XOffset = -1;
		for (int index0 = 0; index0 < 3; index0++) {
			for (int index1 = 0; index1 < 3; index1++) {
				world.setBlock(BlockPos.containing(x + XOffset, y + -2, z + ZOffset), OogaboogablockgenModBlocks.OOGA_BOOGA_BLOCK_GEN.get().defaultBlockState(), 3);
				XOffset = XOffset + 1;
			}
			ZOffset = ZOffset + 1;
			XOffset = -1;
		}
	}
}
