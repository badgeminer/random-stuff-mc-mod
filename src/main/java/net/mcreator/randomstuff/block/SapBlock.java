
package net.mcreator.randomstuff.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SapBlock extends LiquidBlock {
	public SapBlock() {
		super(() -> (FlowingFluid) RandomStuffModFluids.SAP.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

}