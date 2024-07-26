package net.happyspeed.thrivingblocks.block.custom;

import net.happyspeed.thrivingblocks.block.ModBlocks;
import net.happyspeed.thrivingblocks.sound.ModSounds;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;

public class AlertBlockEntity extends BlockEntity {
    public boolean structureHere = false;
    public int soundTimer = 0;
    public AlertBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlocks.ALERT_BLOCK_ENTITY_BLOCK_ENTITY_TYPE, pos, state);
    }

    public static void tick(World world, BlockPos pos, BlockState state, AlertBlockEntity acc) {
        if (acc.soundTimer < 50) {
            acc.soundTimer++;
        }
        if (world.getEmittedRedstonePower(pos, Direction.DOWN) > 0 && acc.soundTimer == 50) {
            world.playSound(null, pos.getX(), (double)pos.getY() + 0.5, pos.getZ(), ModSounds.ALARM_ONE_SOUND, SoundCategory.PLAYERS, 7.0f, 0.9f);
            acc.soundTimer = 0;
        }
    }
}
