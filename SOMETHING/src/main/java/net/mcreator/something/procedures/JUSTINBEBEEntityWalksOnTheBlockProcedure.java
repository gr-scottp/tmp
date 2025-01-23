package net.mcreator.something.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.something.init.SomethingModBlocks;

public class JUSTINBEBEEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, BlockPos pos) {
		if (entity == null)
			return;
		BlockPos newPos = pos.relative(entity.getMotionDirection(), 1);
		world.setBlock(newPos, SomethingModBlocks.JUSTINBEBE.get().defaultBlockState(), 3);
	}
}
