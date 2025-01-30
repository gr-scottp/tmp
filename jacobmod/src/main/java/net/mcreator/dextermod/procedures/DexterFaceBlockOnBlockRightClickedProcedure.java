package net.mcreator.dextermod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;

import net.mcreator.dextermod.init.DextermodModBlocks;

public class DexterFaceBlockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xOffset = 0;
		double zOffset = 0;
		xOffset = x;
		zOffset = z;
		while ((world.getBlockState(BlockPos.containing(xOffset + (entity.getDirection()).getStepX(), y, zOffset + (entity.getDirection()).getStepZ()))).getBlock() == DextermodModBlocks.DEXTER_FACE_BLOCK.get()) {
			xOffset = xOffset + (entity.getDirection()).getStepX();
			zOffset = zOffset + (entity.getDirection()).getStepZ();
		}
		world.setBlock(BlockPos.containing(xOffset + (entity.getDirection()).getStepX(), y, zOffset + (entity.getDirection()).getStepZ()), DextermodModBlocks.DEXTER_FACE_BLOCK.get().defaultBlockState(), 3);
		world.playSound(
				null,
				new BlockPos(x, y, z),
				SoundEvents.CREEPER_DEATH,

				10.0F,
				1.0F
		);
	}
}
