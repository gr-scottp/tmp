package net.mcreator.oogaboogablockgen.procedures;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModBlocks;

public class AutoPlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, BlockPos pos) {
		if (entity == null)
			return;
		BlockPos newPos = pos.relative(entity.getMotionDirection(), 1);
		world.setBlock(newPos, OogaboogablockgenModBlocks.OOGA_BOOGA_BLOCK_GEN.get().defaultBlockState(), 3);
	}
}
