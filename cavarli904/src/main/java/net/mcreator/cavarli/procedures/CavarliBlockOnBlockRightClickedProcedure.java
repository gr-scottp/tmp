package net.mcreator.cavarli.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cavarli.init.CavarliModBlocks;

public class CavarliBlockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x + 1, y, z), CavarliModBlocks.CAVARLI_BLOCK.get().defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y, z), Blocks.TNT.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y, z), Blocks.TURTLE_EGG.defaultBlockState(), 3);
	}
}
