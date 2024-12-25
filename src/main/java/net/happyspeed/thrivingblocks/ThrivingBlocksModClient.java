package net.happyspeed.thrivingblocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.happyspeed.thrivingblocks.block.ModBlocks;
import net.happyspeed.thrivingblocks.block.NaturesSpiritModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;

public class ThrivingBlocksModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASSY_MOSS_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASSY_STONE_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASSY_GRANITE_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASSY_ANDESITE_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASSY_DIORITE_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASSY_DEEPSLATE_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASSY_CLAY_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASSY_COARSE_DIRT_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASSY_MUD_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASSY_PACKED_MUD_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAND_PATH_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHORT_DIRT_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASSY_MOSSY_COBBLESTONE_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASSY_COBBLESTONE_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASS_CARPET_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OLD_GROWTH_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OLD_GROWTH_FERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TINY_SHARP_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SMALL_SHARP_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_OLD_GROWTH_FERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_OLD_GROWTH_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SMALL_SHARP_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_TINY_SHARP_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_REDSTONE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SOUL_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLOWERING_JUNGLE_LEAVES, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHORT_GRASS_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLAT_MOSS_CARPET_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DYNAMIC_MOSSY_COBBLESTONE_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DYNAMIC_MOSSY_STONE_BRICKS_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DRIPLEAF_PAD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DRIPLEAF_VINE_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SMALL_DRIPLEAF, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NEAT_FERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NEAT_LARGE_FERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NEAT_OLD_GROWTH_FERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AZALEA_DROOP_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLOWERING_AZALEA_DROOP_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.UNDERHANG_VINE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUSH_FERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NEAT_BUSH_FERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BUSH_FERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NEAT_SMALL_DRIPLEAF, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_GLASS_LAYER_CLEAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGROVE_ROOT_CLUMP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHAIN_STUB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_GLASS_LAYER_CLEAR, RenderLayer.getTranslucent());
        if (ThrivingBlocksMod.NaturesSpiritModLoaded) {
            BlockRenderLayerMap.INSTANCE.putBlock(NaturesSpiritModBlocks.FLAT_RED_MOSS_CARPET_BLOCK, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(NaturesSpiritModBlocks.GRASSY_SANDY_SOIL_BLOCK, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(NaturesSpiritModBlocks.RED_MOSS_GRASS_BLOCK, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(NaturesSpiritModBlocks.NEAT_LUSH_FERN, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(NaturesSpiritModBlocks.NEAT_LARGE_LUSH_FERN, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(NaturesSpiritModBlocks.NEAT_FLAXEN_FERN, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(NaturesSpiritModBlocks.NEAT_LARGE_FLAXEN_FERN, RenderLayer.getCutout());
        }

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.FULL_GRASS_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.FULL_GRASS_BLOCK.asItem());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return FoliageColors.getDefaultColor(); }
            return BiomeColors.getFoliageColor(world, pos);
        }, ModBlocks.OLD_OAK_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), ModBlocks.OLD_OAK_LEAVES.asItem());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return FoliageColors.getDefaultColor(); }
            return BiomeColors.getFoliageColor(world, pos);
        }, ModBlocks.FLOWERING_JUNGLE_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), ModBlocks.FLOWERING_JUNGLE_LEAVES.asItem());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GRASSY_MOSS_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.GRASSY_MOSS_BLOCK.asItem());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GRASSY_STONE_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.GRASSY_STONE_BLOCK.asItem());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GRASSY_GRANITE_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.GRASSY_GRANITE_BLOCK.asItem());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GRASSY_ANDESITE_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.GRASSY_ANDESITE_BLOCK.asItem());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GRASSY_DIORITE_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.GRASSY_DIORITE_BLOCK.asItem());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GRASSY_DEEPSLATE_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.GRASSY_DEEPSLATE_BLOCK.asItem());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GRASSY_CLAY_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.GRASSY_CLAY_BLOCK.asItem());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GRASSY_COARSE_DIRT_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.GRASSY_COARSE_DIRT_BLOCK.asItem());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GRASSY_MUD_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.GRASSY_MUD_BLOCK.asItem());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GRASSY_MOSSY_COBBLESTONE_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.GRASSY_MOSSY_COBBLESTONE_BLOCK.asItem());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GRASS_CARPET_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.GRASS_CARPET_BLOCK.asItem());

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.OLD_GROWTH_FERN.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.OLD_GROWTH_FERN);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.OLD_GROWTH_FERN.asItem());

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.OLD_GROWTH_GRASS.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.OLD_GROWTH_GRASS);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.OLD_GROWTH_GRASS.asItem());

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.TINY_SHARP_GRASS.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.TINY_SHARP_GRASS);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.TINY_SHARP_GRASS.asItem());

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.SMALL_SHARP_GRASS.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.SMALL_SHARP_GRASS);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.SMALL_SHARP_GRASS.asItem());

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.POTTED_OLD_GROWTH_FERN.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.POTTED_OLD_GROWTH_FERN);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.POTTED_SMALL_SHARP_GRASS.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.POTTED_SMALL_SHARP_GRASS);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.POTTED_TINY_SHARP_GRASS.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.POTTED_TINY_SHARP_GRASS);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.POTTED_OLD_GROWTH_GRASS.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.POTTED_OLD_GROWTH_GRASS);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.POTTED_GRASS.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.POTTED_GRASS);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.SHORT_GRASS_BLOCK.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.SHORT_GRASS_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.SHORT_GRASS_BLOCK.asItem());
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.DYNAMIC_MOSSY_COBBLESTONE_BLOCK.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.DYNAMIC_MOSSY_COBBLESTONE_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.DYNAMIC_MOSSY_STONE_BRICKS_BLOCK.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.DYNAMIC_MOSSY_STONE_BRICKS_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.DYNAMIC_MOSSY_STONE_BRICKS_BLOCK.asItem());
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK.asItem());

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.NEAT_LARGE_FERN.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.NEAT_LARGE_FERN);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.NEAT_FERN.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.NEAT_FERN);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.NEAT_OLD_GROWTH_FERN.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.NEAT_OLD_GROWTH_FERN);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), ModBlocks.UNDERHANG_VINE.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return FoliageColors.getDefaultColor(); }
            return BiomeColors.getFoliageColor(world, pos);
        }, ModBlocks.UNDERHANG_VINE);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.GRASSY_PACKED_MUD_BLOCK.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GRASSY_PACKED_MUD_BLOCK);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.BUSH_FERN.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.BUSH_FERN);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.NEAT_BUSH_FERN.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.NEAT_BUSH_FERN);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.POTTED_BUSH_FERN.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.POTTED_BUSH_FERN);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), ModBlocks.GRASSY_COBBLESTONE_BLOCK.asItem());
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) { return GrassColors.getDefaultColor(); }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GRASSY_COBBLESTONE_BLOCK);

        //------------------------ Register Nature's spirit compat blocks ----------------------------
        if (ThrivingBlocksMod.NaturesSpiritModLoaded) {
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), NaturesSpiritModBlocks.GRASSY_SANDY_SOIL_BLOCK.asItem());
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return GrassColors.getDefaultColor();
                }
                return BiomeColors.getGrassColor(world, pos);
            }, NaturesSpiritModBlocks.GRASSY_SANDY_SOIL_BLOCK);
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), NaturesSpiritModBlocks.NEAT_LUSH_FERN.asItem());
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return GrassColors.getDefaultColor();
                }
                return BiomeColors.getGrassColor(world, pos);
            }, NaturesSpiritModBlocks.NEAT_LUSH_FERN);

            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getDefaultColor(), NaturesSpiritModBlocks.NEAT_LARGE_LUSH_FERN.asItem());
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return GrassColors.getDefaultColor();
                }
                return BiomeColors.getGrassColor(world, pos);
            }, NaturesSpiritModBlocks.NEAT_LARGE_LUSH_FERN);
        }
    }
}
