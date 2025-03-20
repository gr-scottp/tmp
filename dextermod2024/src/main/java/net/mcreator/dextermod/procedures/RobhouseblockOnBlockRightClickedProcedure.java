package net.mcreator.dextermod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RobhouseblockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xOffset = 0;
		double yOffset = 0;
		double zOffset = 0;
		xOffset = -2;
		yOffset = 0;
		zOffset = -2;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 5; index1++) {
				world.setBlock(BlockPos.containing(x + xOffset, y - 1, z + zOffset), Blocks.OAK_PLANKS.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xOffset, y + 3, z + zOffset), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
				xOffset = xOffset + 1;
			}
			xOffset = -2;
			zOffset = zOffset + 1;
		}
		xOffset = -2;
		yOffset = 0;
		zOffset = -2;
		for (int index2 = 0; index2 < 3; index2++) {
			for (int index3 = 0; index3 < 5; index3++) {
				world.setBlock(BlockPos.containing(x + xOffset, y + yOffset, z + 2), Blocks.OAK_PLANKS.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xOffset, y + yOffset, z - 2), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
				xOffset = xOffset + 1;
			}
			xOffset = -2;
			yOffset = yOffset + 1;
		}
		xOffset = -2;
		yOffset = 0;
		zOffset = -2;
		for (int index4 = 0; index4 < 3; index4++) {
			for (int index5 = 0; index5 < 5; index5++) {
				world.setBlock(BlockPos.containing(x + 2, y + yOffset, z + zOffset), Blocks.OAK_PLANKS.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x - 2, y + yOffset, z + zOffset), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
				zOffset = zOffset + 1;
			}
			zOffset = -2;
			yOffset = yOffset + 1;
		}
	}
}
