package net.mcreator.oogaboogablockgen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModBlocks;

public class OogaBoogaBlockGenOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xCurrent = 0;
		double yCurrent = 0;
		double zCurrent = 0;
		xCurrent = x;
		yCurrent = y;
		zCurrent = z;
		while ((world.getBlockState(BlockPos.containing(xCurrent + (entity.getDirection()).getStepX(), yCurrent + (entity.getDirection()).getStepY(), zCurrent + (entity.getDirection()).getStepZ())))
				.getBlock() == OogaboogablockgenModBlocks.OOGA_BOOGA_BLOCK_GEN.get()) {
			xCurrent = xCurrent + (entity.getDirection()).getStepX();
			yCurrent = yCurrent + (entity.getDirection()).getStepY();
			zCurrent = zCurrent + (entity.getDirection()).getStepZ();
		}
		world.setBlock(BlockPos.containing(xCurrent + (entity.getDirection()).getStepX(), yCurrent + (entity.getDirection()).getStepY(), zCurrent + (entity.getDirection()).getStepZ()),
				OogaboogablockgenModBlocks.OOGA_BOOGA_BLOCK_GEN.get().defaultBlockState(), 3);
	}
}
