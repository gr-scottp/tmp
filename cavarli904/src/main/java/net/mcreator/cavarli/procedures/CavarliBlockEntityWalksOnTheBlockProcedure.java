package net.mcreator.cavarli.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.cavarli.init.CavarliModBlocks;

public class CavarliBlockEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing((entity.getDirection()).getStepX() + x, y, (entity.getDirection()).getStepZ() + z), CavarliModBlocks.CAVARLI_BLOCK.get().defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.TNT.defaultBlockState(), 3);
	}
}
