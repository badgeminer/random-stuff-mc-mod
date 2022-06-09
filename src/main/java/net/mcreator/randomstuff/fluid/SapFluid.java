
package net.mcreator.randomstuff.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.randomstuff.init.RandomStuffModItems;
import net.mcreator.randomstuff.init.RandomStuffModFluids;
import net.mcreator.randomstuff.init.RandomStuffModBlocks;

public abstract class SapFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(RandomStuffModFluids.SAP,
			RandomStuffModFluids.FLOWING_SAP,
			FluidAttributes.builder(new ResourceLocation("random_stuff:blocks/sap"), new ResourceLocation("random_stuff:blocks/sap"))

					.viscosity(100000)

					.rarity(Rarity.UNCOMMON)).explosionResistance(100f)

							.bucket(RandomStuffModItems.SAP_BUCKET).block(() -> (LiquidBlock) RandomStuffModBlocks.SAP.get());

	private SapFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SapFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SapFluid {
		public Flowing() {
			super();
		}

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
