package net.mcreator.yousefmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.yousefmod.init.YousefmodModBlocks;

public class BebeaEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing(x + (entity.getDirection()).getStepX(), y, z + (entity.getDirection()).getStepZ()), YousefmodModBlocks.BEBEA.get().defaultBlockState(), 3);
	}
}
