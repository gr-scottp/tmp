package net.mcreator.thehousetrap.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.thehousetrap.init.ThehousetrapModBlocks;

public class CiraeblockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z + 1), ThehousetrapModBlocks.CIRAEBLOCK.get().defaultBlockState(), 3);
	}
}
