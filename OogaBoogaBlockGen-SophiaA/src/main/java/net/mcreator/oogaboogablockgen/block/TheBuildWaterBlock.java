
package net.mcreator.oogaboogablockgen.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModFluids;

public class TheBuildWaterBlock extends LiquidBlock {
	public TheBuildWaterBlock() {
		super(OogaboogablockgenModFluids.THE_BUILD_WATER.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(95f).lightLevel(s -> 1).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
