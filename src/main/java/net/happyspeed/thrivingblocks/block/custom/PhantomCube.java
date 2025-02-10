package net.happyspeed.thrivingblocks.block.custom;
import net.happyspeed.thrivingblocks.ThrivingBlocksMod;
import net.happyspeed.thrivingblocks.block.ModBlocks;
import net.happyspeed.thrivingblocks.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

public class PhantomCube extends Block {


    public PhantomCube(Settings settings) {
        super(settings);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.INVISIBLE;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return (context.isHolding(ModBlocks.PHANTOM_CUBE_BLOCK.asItem()) || context.isHolding(Item.fromBlock(Blocks.AIR))) ? VoxelShapes.fullCube() : VoxelShapes.empty();
    }


    @Override
    public boolean hasDynamicBounds() {
        return super.hasDynamicBounds();
    }

//    @Override
//    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
//        return true;
//    }

//    @Override
//    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
//        return 1.0f;
//    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        if (stateFrom.isOf(this)) {
            return true;
        }
        return super.isSideInvisible(state, stateFrom, direction);
    }
}
