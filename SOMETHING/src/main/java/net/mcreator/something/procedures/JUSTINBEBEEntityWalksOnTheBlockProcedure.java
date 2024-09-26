package net.mcreator.something.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.something.init.SomethingModBlocks;

public class JUSTINBEBEEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing((entity.getDirection()).getStepX() + x, y, (entity.getDirection()).getStepZ() + z), SomethingModBlocks.JUSTINBEBE.get().defaultBlockState(), 3);
	}
}
