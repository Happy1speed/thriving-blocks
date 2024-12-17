package net.happyspeed.thrivingblocks.block.custom;

import net.happyspeed.thrivingblocks.ThrivingBlocksMod;
import net.happyspeed.thrivingblocks.block.ModBlocks;
import net.happyspeed.thrivingblocks.sound.ModSounds;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class AmbientClockBlockEntity extends BlockEntity {
    public int soundTimer = 279;
    public AmbientClockBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlocks.AMBIENT_CLOCK_BLOCK_ENTITY_BLOCK_ENTITY_TYPE, pos, state);
    }

    public static void tick(World world, BlockPos pos, BlockState state, AmbientClockBlockEntity acc) {
        if (acc.soundTimer < 280) {
            acc.soundTimer++;
        }
        if (world.getEmittedRedstonePower(pos, Direction.DOWN) > 0 && acc.soundTimer == 280) {
            world.playSound(null, pos.getX(), (double)pos.getY() + 0.5, pos.getZ(), ModSounds.CLOCK_TICK_TOCK_SOUND, SoundCategory.PLAYERS, 1.0f, 1.0f);
            acc.soundTimer = 0;
        }
    }
}
