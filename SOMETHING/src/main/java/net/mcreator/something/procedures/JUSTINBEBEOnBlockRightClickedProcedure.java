package net.mcreator.something.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.something.init.SomethingModBlocks;

public class JUSTINBEBEOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Xcurrent = 0;
		double Ycurrent = 0;
		double zcurrent = 0;
		Xcurrent = x;
		Ycurrent = y;
		zcurrent = z;
		while ((world.getBlockState(BlockPos.containing(Xcurrent + (entity.getDirection()).getStepX(), Ycurrent + (entity.getDirection()).getStepY(), zcurrent + (entity.getDirection()).getStepZ()))).getBlock() == SomethingModBlocks.JUSTINBEBE
				.get()) {
			Xcurrent = Xcurrent + (entity.getDirection()).getStepY();
			zcurrent = zcurrent + (entity.getDirection()).getStepZ();
		}
		world.setBlock(BlockPos.containing(Xcurrent + (entity.getDirection()).getStepY(), y, zcurrent + (entity.getDirection()).getStepZ()), SomethingModBlocks.JUSTINBEBE.get().defaultBlockState(), 3);
	}
}
