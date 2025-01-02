package net.happyspeed.thrivingblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.yarn.constants.MiningLevels;
import net.happyspeed.thrivingblocks.ThrivingBlocksMod;
import net.happyspeed.thrivingblocks.block.ModBlocks;
import net.happyspeed.thrivingblocks.block.NaturesSpiritModBlocks;
import net.happyspeed.thrivingblocks.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.COBBLED_SANDSTONE)
                .add(ModBlocks.CREEPER_GOLD_BLOCK)
                .add(ModBlocks.CHIPPED_STONE)
                .add(ModBlocks.PURPUR_JOINT)
                .add(ModBlocks.GRASSY_STONE_BLOCK)
                .add(ModBlocks.GRASSY_ANDESITE_BLOCK)
                .add(ModBlocks.GRASSY_GRANITE_BLOCK)
                .add(ModBlocks.GRASSY_DEEPSLATE_BLOCK)
                .add(ModBlocks.GRASSY_DIORITE_BLOCK)
                .add(ModBlocks.ROUGH_OBSIDIAN)
                .add(ModBlocks.GRASSY_MOSSY_COBBLESTONE_BLOCK)
                .add(ModBlocks.GRASSY_COBBLESTONE_BLOCK)
                .add(ModBlocks.STONE_PATH_BLOCK)
                .add(ModBlocks.DYNAMIC_MOSSY_COBBLESTONE_BLOCK)
                .add(ModBlocks.DYNAMIC_MOSSY_STONE_BRICKS_BLOCK)
                .add(ModBlocks.ANCIENT_EMERALD_BLOCK)
                .add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK)
                .add(ModBlocks.DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK)
                .add(ModBlocks.RED_DIMENSIONAL_STONE_BLOCK)
                .add(ModBlocks.BLUE_DIMENSIONAL_STONE_BLOCK)
                .add(ModBlocks.AZURE_DIMENSIONAL_STONE_BLOCK)
                .add(ModBlocks.STONE_PATH_STAIRS)
                .add(ModBlocks.MAGMA_STONE_BLOCK)
                .add(ModBlocks.MESSY_BRICKS_BLOCK)
                .add(ModBlocks.NATURAL_ANDESITE_BLOCK)
                .add(ModBlocks.NATURAL_GRANITE_BLOCK)
                .add(ModBlocks.NATURAL_DIORITE_BLOCK)
                .add(ModBlocks.NATURAL_STONE_BLOCK)
                .add(ModBlocks.CRUSHED_BASALT_BLOCK)
                .add(ModBlocks.CRUSHED_DEEPSLATE_BLOCK)
                .add(ModBlocks.CRACKED_STONE_BLOCK)
                .add(ModBlocks.DIRECTIONAL_DEEPSLATE_TILES)
                .add(ModBlocks.CRACKED_DIRECTIONAL_DEEPSLATE_TILES)
                .add(ModBlocks.DIRECTIONAL_BRICKS)
                .add(ModBlocks.COBBLED_RED_SANDSTONE)
                .add(ModBlocks.DIRECTIONAL_QUARTZ_BRICKS)
                .add(ModBlocks.ALERT_BLOCK)
                .add(ModBlocks.GLASS_LAYER)
                .add(ModBlocks.BLACK_GLASS_LAYER)
                .add(ModBlocks.WHITE_GLASS_LAYER)
                .add(ModBlocks.GRAY_GLASS_LAYER)
                .add(ModBlocks.GREEN_GLASS_LAYER)
                .add(ModBlocks.YELLOW_GLASS_LAYER)
                .add(ModBlocks.ORANGE_GLASS_LAYER)
                .add(ModBlocks.RED_GLASS_LAYER)
                .add(ModBlocks.BLUE_GLASS_LAYER)
                .add(ModBlocks.MAGENTA_GLASS_LAYER)
                .add(ModBlocks.PINK_GLASS_LAYER)
                .add(ModBlocks.PURPLE_GLASS_LAYER)
                .add(ModBlocks.LIGHT_GRAY_GLASS_LAYER)
                .add(ModBlocks.LIME_GLASS_LAYER)
                .add(ModBlocks.LIGHT_BLUE_GLASS_LAYER)
                .add(ModBlocks.CYAN_GLASS_LAYER)
                .add(ModBlocks.BROWN_GLASS_LAYER)
                .add(ModBlocks.GLASS_LAYER_CLEAR)
                .add(ModBlocks.BLACK_GLASS_LAYER_CLEAR)
                .add(ModBlocks.WHITE_GLASS_LAYER_CLEAR)
                .add(ModBlocks.GRAY_GLASS_LAYER_CLEAR)
                .add(ModBlocks.GREEN_GLASS_LAYER_CLEAR)
                .add(ModBlocks.YELLOW_GLASS_LAYER_CLEAR)
                .add(ModBlocks.ORANGE_GLASS_LAYER_CLEAR)
                .add(ModBlocks.RED_GLASS_LAYER_CLEAR)
                .add(ModBlocks.BLUE_GLASS_LAYER_CLEAR)
                .add(ModBlocks.MAGENTA_GLASS_LAYER_CLEAR)
                .add(ModBlocks.PINK_GLASS_LAYER_CLEAR)
                .add(ModBlocks.PURPLE_GLASS_LAYER_CLEAR)
                .add(ModBlocks.LIGHT_GRAY_GLASS_LAYER_CLEAR)
                .add(ModBlocks.LIME_GLASS_LAYER_CLEAR)
                .add(ModBlocks.LIGHT_BLUE_GLASS_LAYER_CLEAR)
                .add(ModBlocks.CYAN_GLASS_LAYER_CLEAR)
                .add(ModBlocks.BROWN_GLASS_LAYER_CLEAR)
                .add(ModBlocks.CHAIN_STUB)
                .add(ModBlocks.BEDROCK_DIAMOND_ORE)
                .add(ModBlocks.MAGMA_BLACKSTONE_BLOCK)
                .add(ModBlocks.FULL_CRIMSON_NYLIUM_BLOCK)
                .add(ModBlocks.FULL_WARPED_NYLIUM_BLOCK)
                .add(ModBlocks.DIRECTIONAL_MUD_BRICKS)
                .add(ModBlocks.AMBIENT_CLOCK_BLOCK)
                .add(ModBlocks.GRASSY_PACKED_MUD_BLOCK)
                .add(ModBlocks.GLOWING_OBSIDIAN_BLOCK)
                .add(ModBlocks.ROUGH_STONE)
                .add(ModBlocks.OLD_STONEBRICKS)
                .add(ModBlocks.OLD_MOSSY_STONEBRICKS)
                .add(ModBlocks.CRACKED_OLD_STONEBRICKS)
                .add(ModBlocks.WORN_BRICKS)
                .add(ModBlocks.OLD_COBBLESTONE)
                .add(ModBlocks.OLD_MOSSY_COBBLESTONE)
                .add(ModBlocks.ANCIENT_COBBLESTONE)
                .add(ModBlocks.GRASSY_SANDSTONE_BLOCK)
                .add(ModBlocks.GRASSY_RED_SANDSTONE_BLOCK)
                .add(ModBlocks.GRASSY_OLD_COBBLESTONE_BLOCK)
                .add(ModBlocks.DEGRADED_NETHERRACK_BLOCK)
                .add(ModBlocks.LIGHTLY_WEATHERED_ANCIENT_COBBLESTONE_BLOCK)
                .add(ModBlocks.RUSTIC_REDSTONE_LAMP)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_STAIRS)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_SLAB)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_WALL)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_STAIRS)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_SLAB)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_WALL)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_SLAB)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_STAIRS)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_WALL)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_SLAB)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_STAIRS)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_WALL)
//                .add(NaturesSpiritModBlocks.NATURAL_TRAVERTINE_BLOCK)
                .add(ModBlocks.GOLDEN_BUTTON);
        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(ModBlocks.FULL_GRASS_BLOCK)
                .add(ModBlocks.FULL_PODZOL_BLOCK)
                .add(ModBlocks.GRASSY_MOSS_BLOCK)
                .add(ModBlocks.GRASSY_STONE_BLOCK)
                .add(ModBlocks.GRASSY_ANDESITE_BLOCK)
                .add(ModBlocks.GRASSY_GRANITE_BLOCK)
                .add(ModBlocks.GRASSY_DEEPSLATE_BLOCK)
                .add(ModBlocks.GRASSY_CLAY_BLOCK)
                .add(ModBlocks.GRASSY_COARSE_DIRT_BLOCK)
                .add(ModBlocks.GRASSY_MUD_BLOCK)
                .add(ModBlocks.GRASSY_DIORITE_BLOCK)
                .add(ModBlocks.GRASSY_MOSSY_COBBLESTONE_BLOCK)
                .add(ModBlocks.GRASSY_COBBLESTONE_BLOCK)
                .add(Blocks.CRACKED_DEEPSLATE_BRICKS)
                .add(Blocks.CRACKED_STONE_BRICKS)
                .add(Blocks.CRACKED_NETHER_BRICKS)
                .add(Blocks.INFESTED_CRACKED_STONE_BRICKS)
                .add(Blocks.CRACKED_DEEPSLATE_TILES)
                .add(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)
                .add(Blocks.MOSSY_COBBLESTONE)
                .add(Blocks.MOSSY_STONE_BRICKS)
                .add(ModBlocks.DYNAMIC_MOSSY_COBBLESTONE_BLOCK)
                .add(ModBlocks.DYNAMIC_MOSSY_STONE_BRICKS_BLOCK)
                .add(ModBlocks.DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK)
                .add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK)
                .add(ModBlocks.MOSS_GRASS_BLOCK)
                .add(ModBlocks.CRACKED_STONE_BLOCK)
                .add(ModBlocks.CRACKED_DIRECTIONAL_DEEPSLATE_TILES)
                .add(ModBlocks.COBBLED_RED_SANDSTONE)
                .add(ModBlocks.COBBLED_SANDSTONE)
                .add(ModBlocks.CRUSHED_BASALT_BLOCK)
                .add(ModBlocks.CRUSHED_DEEPSLATE_BLOCK)
                .add(ModBlocks.AZALEA_BUSH_BLOCK)
                .add(ModBlocks.FLOWERING_AZALEA_BUSH_BLOCK)
                .add(ModBlocks.TOUGH_DIRT_BLOCK)
                .add(ModBlocks.DIRECTIONAL_MUD_BRICKS)
                .add(Blocks.MUD_BRICKS)
                .add(Blocks.PACKED_MUD)
                .add(Blocks.DECORATED_POT)
                .add(ModBlocks.GRASSY_PACKED_MUD_BLOCK)
                .add(ModBlocks.OLD_MOSSY_COBBLESTONE)
                .add(ModBlocks.CRACKED_OLD_STONEBRICKS)
                .add(ModBlocks.OLD_MOSSY_STONEBRICKS)
                .add(ModBlocks.GRASSY_SAND_BLOCK)
                .add(ModBlocks.GRASSY_SANDSTONE_BLOCK)
                .add(ModBlocks.GRASSY_RED_SAND_BLOCK)
                .add(ModBlocks.GRASSY_RED_SANDSTONE_BLOCK)
                .add(ModBlocks.GRASSY_OLD_COBBLESTONE_BLOCK)
//                .add(NaturesSpiritModBlocks.PURE_SANDY_SOIL_BLOCK)
//                .add(NaturesSpiritModBlocks.ROCKY_SANDY_SOIL_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSS_GRASS_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_BLOCK)
//                .add(NaturesSpiritModBlocks.GRASSY_SANDY_SOIL_BLOCK)
                .add(ModBlocks.SHORT_GRASS_BLOCK);
        getOrCreateTagBuilder(BlockTags.BAMBOO_PLANTABLE_ON)
                .add(ModBlocks.FULL_GRASS_BLOCK)
                .add(ModBlocks.FULL_PODZOL_BLOCK)
                .add(ModBlocks.GRASSY_MUD_BLOCK)
                .add(ModBlocks.GRASSY_COARSE_DIRT_BLOCK)
                .add(ModBlocks.GRASSY_CLAY_BLOCK)
                .add(ModBlocks.GRASSY_MOSS_BLOCK)
                .add(ModBlocks.SAND_PATH_BLOCK)
                .add(ModBlocks.RED_SAND_PATH_BLOCK)
                .add(ModBlocks.COARSE_SAND)
                .add(Blocks.CRACKED_DEEPSLATE_BRICKS)
                .add(Blocks.CRACKED_STONE_BRICKS)
                .add(Blocks.CRACKED_NETHER_BRICKS)
                .add(Blocks.INFESTED_CRACKED_STONE_BRICKS)
                .add(Blocks.CRACKED_DEEPSLATE_TILES)
                .add(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)
                .add(Blocks.MOSSY_COBBLESTONE)
                .add(Blocks.MOSSY_STONE_BRICKS)
                .add(Blocks.DECORATED_POT)
                .add(ModBlocks.GRASSY_COBBLESTONE_BLOCK)
                .add(ModBlocks.GRASSY_MOSSY_COBBLESTONE_BLOCK)
                .add(ModBlocks.DYNAMIC_MOSSY_COBBLESTONE_BLOCK)
                .add(ModBlocks.DYNAMIC_MOSSY_STONE_BRICKS_BLOCK)
                .add(ModBlocks.DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK)
                .add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK)
                .add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK)
                .add(ModBlocks.CRACKED_DIRECTIONAL_DEEPSLATE_TILES)
                .add(ModBlocks.MOSS_GRASS_BLOCK)
                .add(ModBlocks.AZALEA_BUSH_BLOCK)
                .add(ModBlocks.FLOWERING_AZALEA_BUSH_BLOCK)
                .add(ModBlocks.TOUGH_DIRT_BLOCK)
                .add(ModBlocks.GRASSY_PACKED_MUD_BLOCK)
                .add(ModBlocks.OLD_MOSSY_COBBLESTONE)
                .add(ModBlocks.CRACKED_OLD_STONEBRICKS)
                .add(ModBlocks.OLD_MOSSY_STONEBRICKS)
                .add(ModBlocks.GRASSY_SAND_BLOCK)
                .add(ModBlocks.GRASSY_SANDSTONE_BLOCK)
                .add(ModBlocks.GRASSY_RED_SAND_BLOCK)
                .add(ModBlocks.GRASSY_RED_SANDSTONE_BLOCK)
                .add(ModBlocks.GRASSY_OLD_COBBLESTONE_BLOCK)
//                .add(NaturesSpiritModBlocks.ROCKY_SANDY_SOIL_BLOCK)
//                .add(NaturesSpiritModBlocks.PURE_SANDY_SOIL_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSS_GRASS_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_BLOCK)
//                .add(NaturesSpiritModBlocks.GRASSY_SANDY_SOIL_BLOCK)
                .add(ModBlocks.SMOOTH_SAND_BLOCK);
        getOrCreateTagBuilder(BlockTags.SNIFFER_DIGGABLE_BLOCK).add(ModBlocks.FULL_GRASS_BLOCK);
        getOrCreateTagBuilder(BlockTags.LUSH_GROUND_REPLACEABLE).add(ModBlocks.FULL_GRASS_BLOCK);
        getOrCreateTagBuilder(BlockTags.MOSS_REPLACEABLE).add(ModBlocks.FULL_GRASS_BLOCK);
        getOrCreateTagBuilder(BlockTags.ANIMALS_SPAWNABLE_ON)
                .add(ModBlocks.FULL_GRASS_BLOCK)
                .add(ModBlocks.FULL_PODZOL_BLOCK)
                .add(ModBlocks.GRASSY_CLAY_BLOCK)
                .add(ModBlocks.GRASSY_COARSE_DIRT_BLOCK)
                .add(ModBlocks.GRASSY_MUD_BLOCK)
                .add(ModBlocks.GRASSY_MOSS_BLOCK)
                .add(ModBlocks.SAND_PATH_BLOCK)
                .add(ModBlocks.COARSE_SAND)
                .add(ModBlocks.GRASSY_COBBLESTONE_BLOCK)
                .add(ModBlocks.GRASSY_MOSSY_COBBLESTONE_BLOCK)
                .add(ModBlocks.FLAT_MOSS_CARPET_BLOCK)
                .add(ModBlocks.GRASS_CARPET_BLOCK)
                .add(ModBlocks.MOSS_GRASS_BLOCK)
                .add(ModBlocks.AZALEA_BUSH_BLOCK)
                .add(ModBlocks.FLOWERING_AZALEA_BUSH_BLOCK)
                .add(ModBlocks.GRASSY_PACKED_MUD_BLOCK)
                .add(ModBlocks.COARSE_GRAVEL)
                .add(ModBlocks.GRASSY_SAND_BLOCK)
                .add(ModBlocks.GRASSY_SANDSTONE_BLOCK)
                .add(ModBlocks.GRASSY_RED_SAND_BLOCK)
                .add(ModBlocks.GRASSY_RED_SANDSTONE_BLOCK)
                .add(ModBlocks.GRASSY_OLD_COBBLESTONE_BLOCK)
                .add(ModBlocks.SMOOTH_SAND_BLOCK);
//                .add(NaturesSpiritModBlocks.FLAT_RED_MOSS_CARPET_BLOCK)
//                .add(NaturesSpiritModBlocks.PURE_SANDY_SOIL_BLOCK)
//                .add(NaturesSpiritModBlocks.ROCKY_SANDY_SOIL_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSS_GRASS_BLOCK)
//                .add(NaturesSpiritModBlocks.GRASSY_SANDY_SOIL_BLOCK);
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.FULL_GRASS_BLOCK)
                .add(ModBlocks.FULL_PODZOL_BLOCK)
                .add(ModBlocks.GRASSY_MUD_BLOCK)
                .add(ModBlocks.GRASSY_CLAY_BLOCK)
                .add(ModBlocks.GRASSY_COARSE_DIRT_BLOCK)
                .add(ModBlocks.GRASSY_MOSS_BLOCK)
                .add(ModBlocks.SAND_PATH_BLOCK)
                .add(ModBlocks.SHORT_DIRT_BLOCK)
                .add(ModBlocks.COARSE_SAND)
                .add(ModBlocks.SMOOTH_SAND_BLOCK)
                .add(ModBlocks.MOSS_GRASS_BLOCK)
                .add(ModBlocks.RED_SAND_PATH_BLOCK)
                .add(ModBlocks.SMOOTH_RED_SAND_BLOCK)
                .add(ModBlocks.GRAVEL_PATH_BLOCK)
                .add(ModBlocks.CLAY_PATH_BLOCK)
                .add(ModBlocks.MUD_PATH_BLOCK)
                .add(ModBlocks.TOUGH_DIRT_BLOCK)
                .add(ModBlocks.GRASSY_PACKED_MUD_BLOCK)
                .add(ModBlocks.COARSE_GRAVEL)
                .add(ModBlocks.GRASSY_SAND_BLOCK)
                .add(ModBlocks.GRASSY_RED_SAND_BLOCK)
                .add(ModBlocks.ANCIENT_SOUL_SAND_BLOCK)
                .add(ModBlocks.SHORT_GRASS_BLOCK);
//                .add(NaturesSpiritModBlocks.PURE_SANDY_SOIL_BLOCK)
//                .add(NaturesSpiritModBlocks.ROCKY_SANDY_SOIL_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSS_GRASS_BLOCK)
//                .add(NaturesSpiritModBlocks.GRASSY_SANDY_SOIL_BLOCK);
        getOrCreateTagBuilder(BlockTags.VALID_SPAWN)
                .add(ModBlocks.FULL_GRASS_BLOCK)
                .add(ModBlocks.FULL_PODZOL_BLOCK)
                .add(ModBlocks.GRASSY_CLAY_BLOCK)
                .add(ModBlocks.GRASSY_MUD_BLOCK)
                .add(ModBlocks.GRASSY_COARSE_DIRT_BLOCK)
                .add(ModBlocks.GRASSY_MOSS_BLOCK)
                .add(ModBlocks.SAND_PATH_BLOCK)
                .add(ModBlocks.COARSE_SAND)
                .add(ModBlocks.GRASS_CARPET_BLOCK)
                .add(ModBlocks.FLAT_MOSS_CARPET_BLOCK)
                .add(ModBlocks.CRACKED_STONE_BLOCK)
                .add(ModBlocks.CRUSHED_DEEPSLATE_BLOCK)
                .add(ModBlocks.CRUSHED_BASALT_BLOCK)
                .add(ModBlocks.MOSS_GRASS_BLOCK)
                .add(ModBlocks.AZALEA_BUSH_BLOCK)
                .add(ModBlocks.FLOWERING_AZALEA_BUSH_BLOCK)
                .add(ModBlocks.TOUGH_DIRT_BLOCK)
                .add(ModBlocks.GRASSY_COBBLESTONE_BLOCK)
                .add(ModBlocks.GRASSY_MOSSY_COBBLESTONE_BLOCK)
                .add(ModBlocks.GRASSY_PACKED_MUD_BLOCK)
                .add(ModBlocks.COARSE_GRAVEL)
                .add(ModBlocks.GRASSY_SAND_BLOCK)
                .add(ModBlocks.GRASSY_SANDSTONE_BLOCK)
                .add(ModBlocks.GRASSY_RED_SAND_BLOCK)
                .add(ModBlocks.GRASSY_RED_SANDSTONE_BLOCK)
                .add(ModBlocks.GRASSY_OLD_COBBLESTONE_BLOCK)
                .add(ModBlocks.SMOOTH_SAND_BLOCK);
//                .add(NaturesSpiritModBlocks.FLAT_RED_MOSS_CARPET_BLOCK)
//                .add(NaturesSpiritModBlocks.ROCKY_SANDY_SOIL_BLOCK)
//                .add(NaturesSpiritModBlocks.PURE_SANDY_SOIL_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSS_GRASS_BLOCK)
//                .add(NaturesSpiritModBlocks.GRASSY_SANDY_SOIL_BLOCK);
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.OLD_OAK_LEAVES)
                .add(ModBlocks.OLD_JUNGLE_LEAVES)
                .add(ModBlocks.OLD_SPRUCE_LEAVES)
                .add(ModBlocks.FLOWERING_JUNGLE_LEAVES);
        getOrCreateTagBuilder(BlockTags.SAND)
                .add(ModBlocks.SMOOTH_SAND_BLOCK)
                .add(ModBlocks.COARSE_SAND);
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.GRASS_CARPET_BLOCK)
                .add(ModBlocks.DRIPLEAF_VINE_BLOCK)
                .add(ModBlocks.DRIPLEAF_PAD)
                .add(ModBlocks.OLD_JUNGLE_LEAVES)
                .add(ModBlocks.OLD_OAK_LEAVES)
                .add(ModBlocks.OLD_SPRUCE_LEAVES)
                .add(ModBlocks.FLOWERING_JUNGLE_LEAVES)
                .add(ModBlocks.UNDERHANG_VINE)
                .add(ModBlocks.MOSS_VINES_BLOCK)
                .add(ModBlocks.DYNAMIC_MOSS_VINES_BLOCK)
                .add(ModBlocks.BAMBOO_VINES_BLOCK)
                .add(ModBlocks.FLAT_MOSS_CARPET_BLOCK);
                //.add(NaturesSpiritModBlocks.FLAT_RED_MOSS_CARPET_BLOCK);
        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.GOLDEN_BUTTON);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_WALL);
//                .add(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_WALL)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_WALL)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_WALL)
//                .add(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_WALL);
        getOrCreateTagBuilder(BlockTags.INSIDE_STEP_SOUND_BLOCKS)
                .add(ModBlocks.FLAT_MOSS_CARPET_BLOCK)
                .add(ModBlocks.GRASS_CARPET_BLOCK)
                .add(ModBlocks.DRIPLEAF_PAD);
        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(ModBlocks.UNDERHANG_VINE);
        getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD)
                .add(ModBlocks.MAGMA_BLACKSTONE_BLOCK)
                .add(ModBlocks.MAGMA_STONE_BLOCK);
        getOrCreateTagBuilder(BlockTags.INFINIBURN_NETHER)
                .add(ModBlocks.MAGMA_BLACKSTONE_BLOCK)
                .add(ModBlocks.MAGMA_STONE_BLOCK);
        getOrCreateTagBuilder(BlockTags.INFINIBURN_END)
                .add(ModBlocks.MAGMA_BLACKSTONE_BLOCK)
                .add(ModBlocks.MAGMA_STONE_BLOCK);
        getOrCreateTagBuilder(BlockTags.NYLIUM)
                .add(ModBlocks.FULL_CRIMSON_NYLIUM_BLOCK)
                .add(ModBlocks.FULL_WARPED_NYLIUM_BLOCK);
        getOrCreateTagBuilder(BlockTags.MUSHROOM_GROW_BLOCK)
                .add(ModBlocks.FULL_CRIMSON_NYLIUM_BLOCK)
                .add(ModBlocks.FULL_WARPED_NYLIUM_BLOCK);
        getOrCreateTagBuilder(BlockTags.SMALL_DRIPLEAF_PLACEABLE)
                .add(ModBlocks.GRASSY_CLAY_BLOCK)
                .add(ModBlocks.GRASSY_MUD_BLOCK)
                .add(Blocks.MUD)
                .add(Blocks.PACKED_MUD)
                .add(Blocks.MOSS_BLOCK)
                .add(Blocks.DECORATED_POT)
                .add(ModBlocks.MOSS_GRASS_BLOCK)
                .add(ModBlocks.GRASSY_MOSS_BLOCK)
                .add(ModBlocks.GRASSY_PACKED_MUD_BLOCK);
        getOrCreateTagBuilder(ModTags.Blocks.SHORT_SMALL_DRIPLEAF_PLACEABLE)
                .add(ModBlocks.GRASSY_CLAY_BLOCK)
                .add(ModBlocks.GRASSY_MUD_BLOCK)
                .add(Blocks.MUD)
                .add(Blocks.PACKED_MUD)
                .add(Blocks.MOSS_BLOCK)
                .add(Blocks.DECORATED_POT)
                .add(ModBlocks.MOSS_GRASS_BLOCK)
                .add(ModBlocks.GRASSY_MOSS_BLOCK)
                .add(ModBlocks.NEAT_SHORT_SMALL_DRIPLEAF)
                .add(ModBlocks.GRASSY_PACKED_MUD_BLOCK);
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.OLD_DEAD_BUSH_BLOCK)
                .add(ModBlocks.MOSS_VINES_BLOCK)
                .add(ModBlocks.DYNAMIC_MOSS_VINES_BLOCK)
                .add(ModBlocks.UNDERHANG_VINE)
                .add(ModBlocks.BAMBOO_VINES_BLOCK)
                .add(ModBlocks.MANGROVE_ROOT_CLUMP)
                .add(ModBlocks.NEAT_SMALL_DRIPLEAF)
                .add(ModBlocks.NEAT_SHORT_SMALL_DRIPLEAF)
                .add(ModBlocks.SHORT_SMALL_DRIPLEAF);
        getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT)
                .add(ModBlocks.OLD_DEAD_BUSH_BLOCK)
                .add(ModBlocks.BAMBOO_VINES_BLOCK)
                .add(ModBlocks.UNDERHANG_VINE)
                .add(ModBlocks.MOSS_VINES_BLOCK)
                .add(ModBlocks.DYNAMIC_MOSS_VINES_BLOCK)
                .add(ModBlocks.NEAT_SMALL_DRIPLEAF);
        getOrCreateTagBuilder(BlockTags.DEAD_BUSH_MAY_PLACE_ON)
                .add(ModBlocks.SMOOTH_SAND_BLOCK)
                .add(ModBlocks.SMOOTH_RED_SAND_BLOCK)
                .add(ModBlocks.COARSE_SAND)
                .add(ModBlocks.COBBLED_RED_SANDSTONE)
                .add(ModBlocks.COBBLED_SANDSTONE)
                .add(ModBlocks.GRASSY_MUD_BLOCK)
                .add(ModBlocks.SMOOTH_SAND_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ROUGH_OBSIDIAN)
                .add(ModBlocks.GLOWING_OBSIDIAN_BLOCK);
        getOrCreateTagBuilder(BlockTags.SAND)
                .add(ModBlocks.GRASSY_SAND_BLOCK)
                .add(ModBlocks.GRASSY_RED_SAND_BLOCK);
        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS)
                .add(ModBlocks.ANCIENT_SOUL_SAND_BLOCK);
    }
}
