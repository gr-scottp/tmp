package net.mcreator.wingsoffire.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class MomolandhouseblockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xOffset = 0;
		double yOffset = 0;
		double zOffset = 0;
		xOffset = -2;
		yOffset = 0;
		zOffset = -2;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 5; index1++) {
				world.setBlock(BlockPos.containing(x + xOffset, y - 1, z + zOffset), Blocks.STONE.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xOffset, y + 3, z + zOffset), Blocks.DEEPSLATE_BRICKS.defaultBlockState(), 3);
				xOffset = xOffset + 1;
			}
			xOffset = -2;
			zOffset = zOffset + 1;
		}
		for (int index2 = 0; index2 < 3; index2++) {
			for (int index3 = 0; index3 < 5; index3++) {
				world.setBlock(BlockPos.containing(x + xOffset, y + yOffset, z + 2), Blocks.STONE.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + xOffset, y + yOffset, z - 2), Blocks.STONE.defaultBlockState(), 3);
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
				world.setBlock(BlockPos.containing(x + 2, y + yOffset, z + zOffset), Blocks.STONE.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 2, y + yOffset, z + zOffset), Blocks.STONE.defaultBlockState(), 3);
				zOffset = zOffset + 1;
			}
			zOffset = -2;
			yOffset = yOffset + 1;
		}
		world.setBlock(BlockPos.containing(x + 1, y + 1, z + 2), Blocks.GLASS.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 2, y + 1, z + 2), Blocks.GLASS.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y, z + 2), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y + 1, z + 2), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y + 1, z + 2), (new Object() {
			public BlockState with(BlockState _bs, String _property, String _newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
				return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
			}
		}.with(Blocks.OAK_DOOR.defaultBlockState(), "half", "upper")), 3);
		world.setBlock(BlockPos.containing(x - 1, y, z + 2), Blocks.OAK_DOOR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x - 1, y + 0, z - 1), (new Object() {
			public BlockState with(BlockState _bs, Direction newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
					return _bs.setValue(_dp, newValue);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
			}
		}.with((new Object() {
			public BlockState with(BlockState _bs, String _property, String _newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
				return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
			}
		}.with(Blocks.PINK_BED.defaultBlockState(), "part", "head")), Direction.WEST)), 3);
		world.setBlock(BlockPos.containing(x - 0, y + 0, z - 1), (new Object() {
			public BlockState with(BlockState _bs, Direction newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
					return _bs.setValue(_dp, newValue);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
			}
		}.with((new Object() {
			public BlockState with(BlockState _bs, String _property, String _newValue) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
				return _prop instanceof EnumProperty _ep && _ep.getValue(_newValue).isPresent() ? _bs.setValue(_ep, (Enum) _ep.getValue(_newValue).get()) : _bs;
			}
		}.with(Blocks.PINK_BED.defaultBlockState(), "part", "foot")), Direction.WEST)), 3);
	}
}
