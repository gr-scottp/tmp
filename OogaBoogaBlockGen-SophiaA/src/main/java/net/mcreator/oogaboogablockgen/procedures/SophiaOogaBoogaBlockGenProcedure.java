package net.mcreator.oogaboogablockgen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModBlocks;

public class SophiaOogaBoogaBlockGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xvar = 0;
		xvar = x;
		while ((world.getBlockState(BlockPos.containing(xvar + 1, y, z))).getBlock() == (world.getBlockState(BlockPos.containing(xvar, y, z))).getBlock()) {
			xvar = x + 1;
		}
		world.setBlock(BlockPos.containing(xvar + 1, y, z), OogaboogablockgenModBlocks.OOGA_BOOGA_BLOCK_GEN.get().defaultBlockState(), 3);
	}
}
