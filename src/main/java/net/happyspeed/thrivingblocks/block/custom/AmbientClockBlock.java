package net.happyspeed.thrivingblocks.block.custom;

import net.happyspeed.thrivingblocks.block.ModBlocks;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AmbientClockBlock extends BlockWithEntity implements BlockEntityProvider {

    public AmbientClockBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new AmbientClockBlockEntity(pos, state);
    }
    @Override
    public BlockRenderType getRenderType(BlockState state) {
        // With inheriting from BlockWithEntity this defaults to INVISIBLE, so we need to change that!
        return BlockRenderType.MODEL;
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, ModBlocks.AMBIENT_CLOCK_BLOCK_ENTITY_BLOCK_ENTITY_TYPE, (world1, pos, state1, be) -> AmbientClockBlockEntity.tick(world1, pos, state1, be));
    }
}

