package net.happyspeed.thrivingblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.happyspeed.thrivingblocks.block.ModBlocks;
import net.happyspeed.thrivingblocks.block.NaturesSpiritModBlocks;
import net.happyspeed.thrivingblocks.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FULL_GRASS_BLOCK,Blocks.GRASS_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_SANDSTONE,Blocks.SANDSTONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FULL_PODZOL_BLOCK,Blocks.PODZOL);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_OAK_LEAVES,Blocks.OAK_LEAVES);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLOWERING_JUNGLE_LEAVES,Blocks.JUNGLE_LEAVES);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_MOSS_BLOCK,Blocks.MOSS_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_STONE_BLOCK,Blocks.STONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_ANDESITE_BLOCK,Blocks.ANDESITE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_GRANITE_BLOCK,Blocks.GRANITE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_DEEPSLATE_BLOCK,Blocks.DEEPSLATE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_DEEPSLATE_BLOCK,Blocks.COBBLED_DEEPSLATE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_DIORITE_BLOCK,Blocks.DIORITE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_CLAY_BLOCK,Blocks.CLAY);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_COARSE_DIRT_BLOCK,Blocks.COARSE_DIRT);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_MUD_BLOCK,Blocks.MUD);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAND_PATH_BLOCK,Blocks.SAND);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SAND_BLOCK,Blocks.SAND);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHORT_DIRT_BLOCK,Blocks.DIRT);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHORT_GRASS_BLOCK,Blocks.GRASS_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_MOSSY_COBBLESTONE_BLOCK,Blocks.MOSSY_COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASS_CARPET_BLOCK, Blocks.GRASS_BLOCK, 4);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_GROWTH_GRASS,Blocks.GRASS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_SHARP_GRASS,Blocks.GRASS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TINY_SHARP_GRASS,Blocks.GRASS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_GROWTH_FERN,Blocks.FERN);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROUGH_OBSIDIAN,Blocks.OBSIDIAN);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COARSE_SAND,Blocks.SAND);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_PATH_BLOCK,Blocks.STONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_PATH_STAIRS,ModBlocks.STONE_PATH_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLAT_MOSS_CARPET_BLOCK,Blocks.MOSS_CARPET);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYNAMIC_FLAT_MOSS_CARPET_BLOCK,Blocks.MOSS_CARPET);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYNAMIC_MOSSY_COBBLESTONE_BLOCK,Blocks.MOSSY_COBBLESTONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYNAMIC_MOSSY_STONE_BRICKS_BLOCK,Blocks.MOSSY_STONE_BRICKS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK,Blocks.MOSSY_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MOSSY_STONE_BRICKS_SLAB,ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK, 2);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MOSSY_STONE_BRICKS_STAIRS,ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MOSSY_STONE_BRICKS_WALL,ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK,Blocks.CRACKED_STONE_BRICKS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK,Blocks.CRACKED_STONE_BRICKS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK,Blocks.MOSSY_STONE_BRICKS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_EMERALD_BLOCK,Blocks.EMERALD_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDEN_BUTTON, Items.GOLD_INGOT);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRUSHED_DEEPSLATE_BLOCK, Blocks.DEEPSLATE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRUSHED_DEEPSLATE_BLOCK, Blocks.COBBLED_DEEPSLATE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRUSHED_BASALT_BLOCK, Blocks.SMOOTH_BASALT);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRUSHED_BASALT_BLOCK, Blocks.BASALT);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NATURAL_ANDESITE_BLOCK, Blocks.ANDESITE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NATURAL_DIORITE_BLOCK, Blocks.DIORITE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NATURAL_GRANITE_BLOCK, Blocks.GRANITE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NATURAL_STONE_BLOCK, Blocks.STONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MESSY_BRICKS_BLOCK, Blocks.BRICKS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BLOCK, Blocks.STONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGMA_STONE_BLOCK, Blocks.STONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGMA_STONE_BLOCK, Blocks.MAGMA_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSS_GRASS_BLOCK, Blocks.MOSS_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_GLOWSTONE_BLOCK, Blocks.GLOWSTONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIRECTIONAL_DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIRECTIONAL_DEEPSLATE_TILES, Blocks.CRACKED_DEEPSLATE_TILES);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIRECTIONAL_BRICKS, Blocks.BRICKS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIRECTIONAL_QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_RED_SANDSTONE, Blocks.RED_SANDSTONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALERT_BLOCK, Blocks.NOTE_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPLEAF_PAD, Blocks.BIG_DRIPLEAF);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEAT_FERN, Blocks.FERN);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEAT_LARGE_FERN, Blocks.FERN);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEAT_OLD_GROWTH_FERN, ModBlocks.OLD_GROWTH_FERN);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CREEPER_GOLD_BLOCK, Blocks.GOLD_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GOLD_BLOCK, ModBlocks.CREEPER_GOLD_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_JOINT, Blocks.PURPUR_PILLAR);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHIPPED_STONE, Blocks.STONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLOWERING_AZALEA_DROOP_BLOCK, Blocks.FLOWERING_AZALEA);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_DROOP_BLOCK, Blocks.AZALEA);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_BUSH_BLOCK, Blocks.AZALEA);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLOWERING_AZALEA_BUSH_BLOCK, Blocks.FLOWERING_AZALEA);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.UNDERHANG_VINE, Blocks.VINE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SAND_PATH_BLOCK, Blocks.RED_SAND);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAVEL_PATH_BLOCK, Blocks.GRAVEL);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CLAY_PATH_BLOCK, Blocks.CLAY);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_PATH_BLOCK, Blocks.MUD);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SAND_BLOCK, Blocks.RED_SAND);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLASS_LAYER, Blocks.GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLASS_LAYER, Blocks.BLACK_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLASS_LAYER, Blocks.WHITE_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLASS_LAYER, Blocks.GRAY_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLASS_LAYER, Blocks.GREEN_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLASS_LAYER, Blocks.YELLOW_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLASS_LAYER, Blocks.ORANGE_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLASS_LAYER, Blocks.RED_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLASS_LAYER, Blocks.BLUE_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLASS_LAYER, Blocks.MAGENTA_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLASS_LAYER, Blocks.PINK_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLASS_LAYER, Blocks.PURPLE_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLASS_LAYER, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLASS_LAYER, Blocks.LIME_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLASS_LAYER, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLASS_LAYER, Blocks.CYAN_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLASS_LAYER_CLEAR, Blocks.GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLASS_LAYER_CLEAR, Blocks.BLACK_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLASS_LAYER_CLEAR, Blocks.WHITE_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLASS_LAYER_CLEAR, Blocks.GRAY_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLASS_LAYER_CLEAR, Blocks.GREEN_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLASS_LAYER_CLEAR, Blocks.YELLOW_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLASS_LAYER_CLEAR, Blocks.ORANGE_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLASS_LAYER_CLEAR, Blocks.RED_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLASS_LAYER_CLEAR, Blocks.BLUE_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLASS_LAYER_CLEAR, Blocks.MAGENTA_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLASS_LAYER_CLEAR, Blocks.PINK_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLASS_LAYER_CLEAR, Blocks.PURPLE_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLASS_LAYER_CLEAR, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLASS_LAYER_CLEAR, Blocks.LIME_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLASS_LAYER_CLEAR, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLASS_LAYER_CLEAR, Blocks.CYAN_STAINED_GLASS_PANE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHAIN_STUB, Blocks.CHAIN);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOUGH_DIRT_BLOCK, Blocks.DIRT);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGMA_BLACKSTONE_BLOCK, Blocks.BLACKSTONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_ROOT_CLUMP, Blocks.MANGROVE_ROOTS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FULL_WARPED_NYLIUM_BLOCK, Blocks.WARPED_NYLIUM);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FULL_CRIMSON_NYLIUM_BLOCK, Blocks.CRIMSON_NYLIUM);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIRECTIONAL_MUD_BRICKS, Blocks.MUD_BRICKS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBIENT_CLOCK_BLOCK, Blocks.NOTE_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_PACKED_MUD_BLOCK, Blocks.PACKED_MUD);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUSH_FERN, Blocks.FERN);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEAT_BUSH_FERN, Blocks.FERN);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEAT_BUSH_FERN, ModBlocks.BUSH_FERN);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPLEAF_VINE_BLOCK, Blocks.BIG_DRIPLEAF);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEAD_DRIPLEAF_VINE_BLOCK, Blocks.BIG_DRIPLEAF);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUDDY_DRIPLEAF_VINE_BLOCK, Blocks.BIG_DRIPLEAF);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_COBBLESTONE_BLOCK, Blocks.COBBLESTONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEAT_SMALL_DRIPLEAF, Blocks.SMALL_DRIPLEAF);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.fromTag(ItemTags.SAPLINGS), RecipeCategory.BUILDING_BLOCKS, Blocks.DEAD_BUSH.asItem(), 0.1f, 50).criterion("dead_bush", VanillaRecipeProvider.conditionsFromTag(ItemTags.SAPLINGS)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(ModBlocks.CRACKED_OLD_STONEBRICKS), RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_STONEBRICKS, 0.35f, 200).criterion("old_smelt_stonebricks", VanillaRecipeProvider.conditionsFromItem(ModBlocks.OLD_STONEBRICKS)).offerTo(exporter);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOWING_OBSIDIAN_BLOCK, Blocks.OBSIDIAN);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_DEAD_BUSH_BLOCK, Blocks.DEAD_BUSH);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COARSE_GRAVEL, Blocks.GRAVEL);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROUGH_STONE, Blocks.STONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_STONEBRICKS, Blocks.STONE_BRICKS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_MOSSY_STONEBRICKS, Blocks.STONE_BRICKS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_MOSSY_STONEBRICKS, Blocks.MOSSY_STONE_BRICKS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WORN_BRICKS, Blocks.BRICKS);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_COBBLESTONE, Blocks.COBBLESTONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_COBBLESTONE, Blocks.COBBLESTONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_SAND_BLOCK, Blocks.SAND);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_SANDSTONE_BLOCK, Blocks.SANDSTONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_RED_SAND_BLOCK, Blocks.RED_SAND);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_RED_SANDSTONE_BLOCK, Blocks.RED_SANDSTONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_OLD_COBBLESTONE_BLOCK, ModBlocks.OLD_COBBLESTONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEGRADED_NETHERRACK_BLOCK, Blocks.NETHERRACK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_SOUL_SAND_BLOCK, Blocks.SOUL_SAND);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_VINES_BLOCK, Blocks.BAMBOO);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHTLY_WEATHERED_ANCIENT_COBBLESTONE_BLOCK, Blocks.COBBLESTONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSS_VINES_BLOCK, Blocks.MOSS_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYNAMIC_MOSS_VINES_BLOCK, Blocks.MOSS_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSS_VINES_BLOCK, Blocks.VINE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYNAMIC_MOSS_VINES_BLOCK, Blocks.VINE);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.GRASS_BLOCK, ModBlocks.GRASS_CARPET_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHORT_SMALL_DRIPLEAF, Blocks.SMALL_DRIPLEAF);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NEAT_SHORT_SMALL_DRIPLEAF, Blocks.SMALL_DRIPLEAF);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BIG_DRIPLEAF, Blocks.SMALL_DRIPLEAF);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_JUNGLE_LEAVES, Blocks.JUNGLE_LEAVES);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_SPRUCE_LEAVES, Blocks.SPRUCE_LEAVES);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUSTIC_REDSTONE_LAMP, Blocks.REDSTONE_LAMP);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_SOUL_SAND_BLOCK, Blocks.SOUL_SAND);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FULL_DIRT_PATH_BLOCK, Blocks.DIRT);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_SOUL_SOIL_BLOCK, Blocks.SOUL_SOIL);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUDDY_DEAD_BUSH_BLOCK, Blocks.DEAD_BUSH);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_DROOP_VINES_BLOCK, Blocks.AZALEA);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLOWERING_AZALEA_DROOP_VINES_BLOCK, Blocks.FLOWERING_AZALEA);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYNAMIC_MOSS_GRASS_BLOCK, Blocks.MOSS_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS_BLOCK, Blocks.SMOOTH_STONE);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_DRIPLEAF_VINE_BLOCK, Blocks.SMALL_DRIPLEAF);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTALLINE_AMETHYST_BLOCK, Blocks.AMETHYST_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE, 2);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_GRASS_BLOCK, Blocks.GRASS_BLOCK);
        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS_BLOCK, Blocks.END_STONE);


        //Natures spirit compat
//        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK, Blocks.MOSSY_COBBLESTONE);
//        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_STAIRS, NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK);
//        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_SLAB, NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK, 2);
//        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_WALL, NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK);
//        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK, Blocks.MOSSY_STONE_BRICKS);
//        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_STAIRS, NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK);
//        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_SLAB, NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK, 2);
//        offerTwoWayStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_WALL, NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK);
    }
    public static void offerTwoWayStonecuttingRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(input), category, output, 1).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter, RecipeProvider.convertBetween(output, input) + "_stonecutting");
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(output), category, input, 1).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input)).offerTo(exporter, RecipeProvider.convertBetween(output, input) + "_stonecutting_inverse");
    }
}
