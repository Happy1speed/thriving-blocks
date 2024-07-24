package net.happyspeed.thrivingblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.happyspeed.thrivingblocks.block.ModBlocks;
import net.happyspeed.thrivingblocks.block.NaturesSpiritModBlocks;
import net.happyspeed.thrivingblocks.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FULL_GRASS_BLOCK,Blocks.GRASS_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_SANDSTONE,Blocks.SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FULL_PODZOL_BLOCK,Blocks.PODZOL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_OAK_LEAVES,Blocks.OAK_LEAVES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLOWERING_JUNGLE_LEAVES,Blocks.JUNGLE_LEAVES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_MOSS_BLOCK,Blocks.MOSS_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_STONE_BLOCK,Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_ANDESITE_BLOCK,Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_GRANITE_BLOCK,Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_DEEPSLATE_BLOCK,Blocks.DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_DEEPSLATE_BLOCK,Blocks.COBBLED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_DIORITE_BLOCK,Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_CLAY_BLOCK,Blocks.CLAY);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_COARSE_DIRT_BLOCK,Blocks.COARSE_DIRT);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_MUD_BLOCK,Blocks.MUD);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAND_PATH_BLOCK,Blocks.SAND);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SAND_BLOCK,Blocks.SAND);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHORT_DIRT_BLOCK,Blocks.DIRT);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASSY_MOSSY_COBBLESTONE_BLOCK,Blocks.MOSSY_COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRASS_CARPET_BLOCK,Blocks.GRASS_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_GROWTH_GRASS,Blocks.GRASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_SHARP_GRASS,Blocks.GRASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TINY_SHARP_GRASS,Blocks.GRASS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_GROWTH_FERN,Blocks.FERN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROUGH_OBSIDIAN,Blocks.OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COARSE_SAND,Blocks.SAND);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_PATH_BLOCK,Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_PATH_STAIRS,ModBlocks.STONE_PATH_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLAT_MOSS_CARPET_BLOCK,Blocks.MOSS_CARPET);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYNAMIC_MOSSY_COBBLESTONE_BLOCK,Blocks.MOSSY_COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYNAMIC_MOSSY_STONE_BRICKS_BLOCK,Blocks.MOSSY_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK,Blocks.MOSSY_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MOSSY_STONE_BRICKS_SLAB,ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MOSSY_STONE_BRICKS_STAIRS,ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MOSSY_STONE_BRICKS_WALL,ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK,Blocks.CRACKED_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK,Blocks.CRACKED_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK,Blocks.MOSSY_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_EMERALD_BLOCK,Blocks.EMERALD_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDEN_BUTTON, Items.GOLD_INGOT);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRUSHED_DEEPSLATE_BLOCK, Blocks.DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRUSHED_DEEPSLATE_BLOCK, Blocks.COBBLED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRUSHED_BASALT_BLOCK, Blocks.SMOOTH_BASALT);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRUSHED_BASALT_BLOCK, Blocks.BASALT);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NATURAL_ANDESITE_BLOCK, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NATURAL_DIORITE_BLOCK, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NATURAL_GRANITE_BLOCK, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NATURAL_STONE_BLOCK, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MESSY_BRICKS_BLOCK, Blocks.BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_STONE_BLOCK, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGMA_STONE_BLOCK, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGMA_STONE_BLOCK, Blocks.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSS_GRASS_BLOCK, Blocks.MOSS_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLD_GLOWSTONE_BLOCK, Blocks.GLOWSTONE);

        //Natures spirit compat
//        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK, Blocks.MOSSY_COBBLESTONE);
//        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_STAIRS, NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK);
//        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_SLAB, NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK, 2);
//        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_WALL, NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK);
//        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK, Blocks.MOSSY_STONE_BRICKS);
//        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_STAIRS, NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK);
//        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_SLAB, NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK, 2);
//        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_WALL, NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK);
    }
}