package net.mcreator.erikmod.procedures;

import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.erikmod.init.ErikmodModBlocks;

public class ErikBlocksEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, BlockPos pos) {
		if (entity == null)
			return;
		BlockPos newPos = pos.relative(entity.getMotionDirection(), 1);
		world.setBlock(newPos, ErikmodModBlocks.ERIK_BLOCKS.get().defaultBlockState(), 3);
	}
}
