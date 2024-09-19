package net.mcreator.cinnamoroll.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class WinterLandOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, 1 + y, z), Blocks.CHERRY_SAPLING.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.CHERRY_LEAVES.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.SUNFLOWER.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y, 1 + z), Blocks.AMETHYST_CLUSTER.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.WARPED_HYPHAE.defaultBlockState(), 3);
	}
}
