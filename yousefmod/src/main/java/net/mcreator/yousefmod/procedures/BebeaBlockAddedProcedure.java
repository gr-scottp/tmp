package net.mcreator.yousefmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.yousefmod.init.YousefmodModBlocks;

public class BebeaBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing((entity.getDirection()).getStepX() + x, y, (entity.getDirection()).getStepZ() + x), YousefmodModBlocks.BEBEA.get().defaultBlockState(), 3);
	}
}
