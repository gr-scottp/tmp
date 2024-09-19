
package net.mcreator.something.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.something.init.SomethingModItems;
import net.mcreator.something.init.SomethingModFluids;
import net.mcreator.something.init.SomethingModFluidTypes;
import net.mcreator.something.init.SomethingModBlocks;

public abstract class NOTWATERFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> SomethingModFluidTypes.NOTWATER_TYPE.get(), () -> SomethingModFluids.NOTWATER.get(), () -> SomethingModFluids.FLOWING_NOTWATER.get())
			.explosionResistance(100f).tickRate(50).bucket(() -> SomethingModItems.NOTWATER_BUCKET.get()).block(() -> (LiquidBlock) SomethingModBlocks.NOTWATER.get());

	private NOTWATERFluid() {
		super(PROPERTIES);
	}

	public static class Source extends NOTWATERFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NOTWATERFluid {
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
