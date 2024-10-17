package net.mcreator.wingsoffire.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.wingsoffire.init.WingsoffireModBlocks;

public class GloryandthehiddenkingdomRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double squidxoffset = 0;
		double squidzoffset = 0;
		squidxoffset = -1;
		squidzoffset = -1;
		for (int index0 = 0; index0 < 3; index0++) {
			for (int index1 = 0; index1 < 3; index1++) {
				world.setBlock(BlockPos.containing(x + squidxoffset, y, z + squidzoffset), WingsoffireModBlocks.WINGS_OF_FIREEX.get().defaultBlockState(), 3);
				squidxoffset = squidxoffset + 1;
			}
			squidxoffset = -1;
			squidzoffset = squidzoffset + 1;
		}
	}
}
