
package net.mcreator.something.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class JUSTINBEBEBlock extends Block {
	public JUSTINBEBEBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GRAVEL).strength(1f, 1000f).lightLevel(s -> 15).friction(5f).jumpFactor(21.6f).hasPostProcess((bs, br, bp) -> true)
				.emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
