package net.happyspeed.thrivingblocks.sound;

import net.happyspeed.thrivingblocks.ThrivingBlocksMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final BlockSoundGroup GRASSY_DEEPSLATE_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            BlockSoundGroup.DEEPSLATE.getBreakSound(), BlockSoundGroup.GRASS.getStepSound(), BlockSoundGroup.DEEPSLATE.getPlaceSound(),
            BlockSoundGroup.DEEPSLATE.getHitSound(), BlockSoundGroup.GRASS.getFallSound());

    public static final BlockSoundGroup GRASSY_STONE_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            BlockSoundGroup.STONE.getBreakSound(), BlockSoundGroup.GRASS.getStepSound(), BlockSoundGroup.STONE.getPlaceSound(),
            BlockSoundGroup.STONE.getHitSound(), BlockSoundGroup.GRASS.getFallSound());

    public static final BlockSoundGroup GRASSY_CLAY_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            BlockSoundGroup.GRAVEL.getBreakSound(), BlockSoundGroup.GRASS.getStepSound(), BlockSoundGroup.GRAVEL.getPlaceSound(),
            BlockSoundGroup.GRAVEL.getHitSound(), BlockSoundGroup.GRASS.getFallSound());

    public static final BlockSoundGroup GRASSY_MUD_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            BlockSoundGroup.MUD.getBreakSound(), BlockSoundGroup.GRASS.getStepSound(), BlockSoundGroup.MUD.getPlaceSound(),
            BlockSoundGroup.MUD.getHitSound(), BlockSoundGroup.GRASS.getFallSound());

    public static final BlockSoundGroup GRASSY_PACKED_MUD_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            BlockSoundGroup.PACKED_MUD.getBreakSound(), BlockSoundGroup.GRASS.getStepSound(), BlockSoundGroup.PACKED_MUD.getPlaceSound(),
            BlockSoundGroup.PACKED_MUD.getHitSound(), BlockSoundGroup.GRASS.getFallSound());

    public static final BlockSoundGroup GRASSY_SAND_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            BlockSoundGroup.SAND.getBreakSound(), BlockSoundGroup.GRASS.getStepSound(), BlockSoundGroup.SAND.getPlaceSound(),
            BlockSoundGroup.SAND.getHitSound(), BlockSoundGroup.GRASS.getFallSound());

    public static final BlockSoundGroup GRASSY_SOUL_SAND_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            BlockSoundGroup.SOUL_SAND.getBreakSound(), BlockSoundGroup.GRASS.getStepSound(), BlockSoundGroup.SOUL_SAND.getPlaceSound(),
            BlockSoundGroup.SOUL_SAND.getHitSound(), BlockSoundGroup.GRASS.getFallSound());

    public static final SoundEvent ALARM_ONE_SOUND = registerSoundEvent("alarm_one_sound");

    public static final SoundEvent CLOCK_TICK_TOCK_SOUND = registerSoundEvent("clock_tick_tock_sound");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(ThrivingBlocksMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        ThrivingBlocksMod.LOGGER.info("Registering Sounds for " + ThrivingBlocksMod.MOD_ID);
    }
}
