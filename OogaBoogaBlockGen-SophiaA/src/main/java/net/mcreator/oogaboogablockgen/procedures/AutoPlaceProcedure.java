package net.mcreator.oogaboogablockgen.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModBlocks;

public class AutoPlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing(x + (entity.getDirection()).getStepX(), y, z + (entity.getDirection()).getStepZ()), OogaboogablockgenModBlocks.OOGA_BOOGA_BLOCK_GEN.get().defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - (entity.getDirection()).getStepX(), y, z - (entity.getDirection()).getStepZ()), Blocks.AIR.defaultBlockState(), 3);
	}
}
