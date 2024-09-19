package net.mcreator.yousefmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.yousefmod.init.YousefmodModBlocks;

public class BebeaOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x + 1, y, z), YousefmodModBlocks.BEBEA.get().defaultBlockState(), 3);
	}
}
