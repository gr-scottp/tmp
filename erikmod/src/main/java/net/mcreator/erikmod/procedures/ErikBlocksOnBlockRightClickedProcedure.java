package net.mcreator.erikmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.erikmod.init.ErikmodModBlocks;

public class ErikBlocksOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x + 1, y, z), ErikmodModBlocks.ERIK_BLOCKS.get().defaultBlockState(), 3);
	}
}
