package kr.kro.yewonmods.ymetallib.fluids;

import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;

import static kr.kro.yewonmods.ymetallib.Main.*;

public class SulfuricAcid extends SulfuricAcidFluid{
    @Override
    public Fluid getStill() {
        return SULFURIC_ACID_STILL;
    }

    @Override
    public Fluid getFlowing() {
        return SULFURIC_ACID_FLOWING;
    }

    @Override
    public Item getBucketItem() {
        return SULFURIC_ACID_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        return SULFURIC_ACID_BLOCK.getDefaultState().with(FluidBlock.LEVEL, getBlockStateLevel(fluidState));
    }

    public static class Flowing extends SulfuricAcid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends SulfuricAcid {
        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }
}
