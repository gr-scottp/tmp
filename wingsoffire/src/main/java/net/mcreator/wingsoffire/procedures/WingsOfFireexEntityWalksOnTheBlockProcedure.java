package net.mcreator.wingsoffire.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.wingsoffire.init.WingsoffireModBlocks;

public class WingsOfFireexEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, BlockPos pos) {
		if (entity == null)
			return;

	world.setBlock(pos.relative(entity.getMotionDirection(), 1), WingsoffireModBlocks.WINGS_OF_FIREEX.get().defaultBlockState(), 3);
	world.setBlock(pos.above(2), WingsoffireModBlocks.WINGS_OF_FIREEX.get().defaultBlockState(), 3);
	}
}
