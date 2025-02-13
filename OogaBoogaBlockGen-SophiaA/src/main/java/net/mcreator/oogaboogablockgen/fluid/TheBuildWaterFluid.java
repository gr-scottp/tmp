
package net.mcreator.oogaboogablockgen.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModItems;
import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModFluids;
import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModFluidTypes;
import net.mcreator.oogaboogablockgen.init.OogaboogablockgenModBlocks;

public abstract class TheBuildWaterFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> OogaboogablockgenModFluidTypes.THE_BUILD_WATER_TYPE.get(), () -> OogaboogablockgenModFluids.THE_BUILD_WATER.get(),
			() -> OogaboogablockgenModFluids.FLOWING_THE_BUILD_WATER.get()).explosionResistance(95f).tickRate(7).slopeFindDistance(10).bucket(() -> OogaboogablockgenModItems.THE_BUILD_WATER_BUCKET.get())
			.block(() -> (LiquidBlock) OogaboogablockgenModBlocks.THE_BUILD_WATER.get());

	private TheBuildWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.SPLASH;
	}

	public static class Source extends TheBuildWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends TheBuildWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
