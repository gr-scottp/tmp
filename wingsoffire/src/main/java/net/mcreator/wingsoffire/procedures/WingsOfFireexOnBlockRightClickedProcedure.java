package net.mcreator.wingsoffire.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.wingsoffire.init.WingsoffireModBlocks;

public class WingsOfFireexOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double anikax = 0;
		double anikay = 0;
		double anikaz = 0;
		anikax = x;
		anikay = y;
		anikaz = z;
		while ((world.getBlockState(BlockPos.containing(anikax + (entity.getDirection()).getStepX(), y, anikaz + (entity.getDirection()).getStepZ()))).getBlock() == WingsoffireModBlocks.WINGS_OF_FIREEX.get()) {
			anikax = anikax + (entity.getDirection()).getStepX();
			anikaz = anikaz + (entity.getDirection()).getStepZ();
		}
		world.setBlock(BlockPos.containing(anikax + (entity.getDirection()).getStepX(), y, anikaz + (entity.getDirection()).getStepZ()), WingsoffireModBlocks.WINGS_OF_FIREEX.get().defaultBlockState(), 3);
	}
}
