package net.mcreator.wingsoffire.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.wingsoffire.init.WingsoffireModBlocks;

public class WingsOfFireexEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing(x + (entity.getDirection()).getStepX(), y, z + (entity.getDirection()).getStepZ()), WingsoffireModBlocks.WINGS_OF_FIREEX.get().defaultBlockState(), 3);
	}
}
