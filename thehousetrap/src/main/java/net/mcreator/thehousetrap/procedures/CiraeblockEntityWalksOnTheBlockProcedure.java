package net.mcreator.thehousetrap.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.thehousetrap.init.ThehousetrapModBlocks;

public class CiraeblockEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, BlockPos pos) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing(x + (entity.getDirection()).getStepX(), y, z + (entity.getDirection()).getStepZ()), ThehousetrapModBlocks.CIRAEBLOCK.get().defaultBlockState(), 3);
	}
}
