package net.happyspeed.thrivingblocks.block.custom;

import net.happyspeed.thrivingblocks.ThrivingBlocksMod;
import net.happyspeed.thrivingblocks.block.ModBlocks;
import net.happyspeed.thrivingblocks.block.NaturesSpiritModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class FlatMossCarpetBlock
        extends Block {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0, -1.0, 0.0, 16.0, 0.4, 16.0);

    public FlatMossCarpetBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }



    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        if (ThrivingBlocksMod.NaturesSpiritModLoaded) {
            return !floor.isOf(ModBlocks.FLAT_MOSS_CARPET_BLOCK) && !floor.isOf(ModBlocks.GRASS_CARPET_BLOCK) && !floor.isOf(NaturesSpiritModBlocks.FLAT_RED_MOSS_CARPET_BLOCK) && !floor.isOf(Blocks.AIR);
        }
        return !floor.isOf(ModBlocks.FLAT_MOSS_CARPET_BLOCK) && !floor.isOf(ModBlocks.GRASS_CARPET_BLOCK) && !floor.isOf(Blocks.AIR);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        return this.canPlantOnTop(world.getBlockState(blockPos), world, blockPos);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        if (type == NavigationType.AIR && !this.collidable) {
            return true;
        }
        return super.canPathfindThrough(state, world, pos, type);
    }
}
