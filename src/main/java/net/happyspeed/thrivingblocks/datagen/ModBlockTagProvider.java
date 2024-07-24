package net.happyspeed.thrivingblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
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
                .add(ModBlocks.GRASSY_STONE_BLOCK)
                .add(ModBlocks.GRASSY_ANDESITE_BLOCK)
                .add(ModBlocks.GRASSY_GRANITE_BLOCK)
                .add(ModBlocks.GRASSY_DEEPSLATE_BLOCK)
                .add(ModBlocks.GRASSY_DIORITE_BLOCK)
                .add(ModBlocks.ROUGH_OBSIDIAN)
                .add(ModBlocks.GRASSY_MOSSY_COBBLESTONE_BLOCK)
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
                .add(ModBlocks.COARSE_SAND)
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
                .add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK)
                .add(ModBlocks.MOSS_GRASS_BLOCK)
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
                .add(ModBlocks.FLAT_MOSS_CARPET_BLOCK)
                .add(ModBlocks.GRASS_CARPET_BLOCK)
                .add(ModBlocks.MOSS_GRASS_BLOCK)
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
                .add(ModBlocks.SMOOTH_SAND_BLOCK);
//                .add(NaturesSpiritModBlocks.FLAT_RED_MOSS_CARPET_BLOCK)
//                .add(NaturesSpiritModBlocks.ROCKY_SANDY_SOIL_BLOCK)
//                .add(NaturesSpiritModBlocks.PURE_SANDY_SOIL_BLOCK)
//                .add(NaturesSpiritModBlocks.RED_MOSS_GRASS_BLOCK)
//                .add(NaturesSpiritModBlocks.GRASSY_SANDY_SOIL_BLOCK);
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.OLD_OAK_LEAVES)
                .add(ModBlocks.FLOWERING_JUNGLE_LEAVES);
        getOrCreateTagBuilder(BlockTags.SAND)
                .add(ModBlocks.SMOOTH_SAND_BLOCK)
                .add(ModBlocks.COARSE_SAND);
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.GRASS_CARPET_BLOCK)
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
    }
}
