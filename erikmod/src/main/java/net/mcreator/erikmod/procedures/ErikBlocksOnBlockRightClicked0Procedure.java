package net.mcreator.erikmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;

import net.mcreator.erikmod.init.ErikmodModBlocks;

public class ErikBlocksOnBlockRightClicked0Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xcurent = 0;
		double ycurent = 0;
		double zcurent = 0;
		xcurent = x;
		ycurent = y;
		zcurent = z;
		while ((world.getBlockState(BlockPos.containing(xcurent + (entity.getDirection()).getStepX(), ycurent + (entity.getDirection()).getStepY(), ycurent + (entity.getDirection()).getStepZ()))).getBlock() == ErikmodModBlocks.ERIK_BLOCKS.get()) {
			xcurent = xcurent + (entity.getDirection()).getStepX();
			ycurent = ycurent + (entity.getDirection()).getStepY();
			zcurent = ycurent + (entity.getDirection()).getStepZ();
			world.playSound(null, entity.blockPosition(), SoundEvents.CREEPER_PRIMED, SoundSource.BLOCKS);
		}
		world.setBlock(BlockPos.containing(xcurent + (entity.getDirection()).getStepX(), ycurent + (entity.getDirection()).getStepY(), ycurent + (entity.getDirection()).getStepZ()), ErikmodModBlocks.ERIK_BLOCKS.get().defaultBlockState(), 3);
	}
}
