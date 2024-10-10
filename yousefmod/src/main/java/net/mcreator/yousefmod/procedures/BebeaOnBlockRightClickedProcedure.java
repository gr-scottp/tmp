package net.mcreator.yousefmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.yousefmod.init.YousefmodModBlocks;

public class BebeaOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xCurrent = 0;
		double yCurrent = 0;
		double zCurrent = 0;
		xCurrent = x;
		zCurrent = z;
		while ((world.getBlockState(BlockPos.containing(xCurrent + (entity.getDirection()).getStepX(), y, zCurrent + (entity.getDirection()).getStepZ()))).getBlock() == YousefmodModBlocks.BEBEA.get()) {
			xCurrent = xCurrent + (entity.getDirection()).getStepX();
			zCurrent = zCurrent + (entity.getDirection()).getStepZ();
		}
		if (world.isEmptyBlock(BlockPos.containing(xCurrent + (entity.getDirection()).getStepX(), y, zCurrent + (entity.getDirection()).getStepZ()))) {
			world.setBlock(BlockPos.containing(xCurrent + (entity.getDirection()).getStepX(), y, zCurrent + (entity.getDirection()).getStepZ()), YousefmodModBlocks.BEBEA.get().defaultBlockState(), 3);
		}
	}
}
