package net.mcreator.cinnamoroll.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.cinnamoroll.init.CinnamorollModBlocks;

public class RainProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sauag7esx = 0;
		double sauag7esy = 0;
		double sauag7esz = 0;
		sauag7esx = x;
		sauag7esy = y;
		sauag7esz = z;
		while ((world.getBlockState(BlockPos.containing(sauag7esx + (entity.getDirection()).getStepX(), y, sauag7esz + (entity.getDirection()).getStepZ()))).getBlock() == CinnamorollModBlocks.WINTER_LAND.get()) {
			sauag7esx = sauag7esx + (entity.getDirection()).getStepX();
			sauag7esz = sauag7esz + (entity.getDirection()).getStepZ();
		}
		world.setBlock(BlockPos.containing(sauag7esx + (entity.getDirection()).getStepX(), y, sauag7esz + (entity.getDirection()).getStepZ()), CinnamorollModBlocks.WINTER_LAND.get().defaultBlockState(), 3);
	}
}
