package net.mcreator.dextermod.procedures;

import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.dextermod.init.DextermodModBlocks;
import net.minecraft.world.level.block.Blocks;

public class DexterFaceBlockEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, BlockPos pos) {
		if (entity == null)
			return;
		BlockPos newPos = pos.relative(entity.getMotionDirection(), 1);
		world.setBlock(newPos, DextermodModBlocks.DEXTER_FACE_BLOCK.get().defaultBlockState(), 3);

	}
}
