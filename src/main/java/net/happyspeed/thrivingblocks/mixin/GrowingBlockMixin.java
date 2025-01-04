package net.happyspeed.thrivingblocks.mixin;


import net.happyspeed.thrivingblocks.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SaplingBlock.class)
public class GrowingBlockMixin {
    @Inject(method = "randomTick", at=@At(value = "HEAD"), cancellable = true)
    private void cancelGrowth(BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo ci) {
        if (world.getBlockState(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ())).isIn(ModTags.Blocks.CANCELS_ABOVE_TREE_GROWTH)) {
            ci.cancel();
        }
    }
}
