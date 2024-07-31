package net.happyspeed.thrivingblocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.happyspeed.thrivingblocks.ThrivingBlocksMod;
import net.happyspeed.thrivingblocks.block.custom.*;
import net.happyspeed.thrivingblocks.sound.ModSounds;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.enums.Instrument;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.*;

public class ModBlocks {
    public static final Block FULL_GRASS_BLOCK = registerBlock("full_grass_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.GRASS)));
    public static final Block COBBLED_SANDSTONE = registerBlock("cobbled_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block FULL_PODZOL_BLOCK = registerBlock("full_podzol_block",
            new Block(FabricBlockSettings.copyOf(Blocks.PODZOL)));
    public static final Block OLD_OAK_LEAVES = registerBlock("old_oak_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block FLOWERING_JUNGLE_LEAVES = registerBlock("flowering_jungle_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block GRASSY_MOSS_BLOCK = registerBlock("grassy_moss",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)));
    public static final Block GRASSY_STONE_BLOCK = registerBlock("grassy_stone",
            new Block(FabricBlockSettings.copyOf(STONE).sounds(ModSounds.GRASSY_STONE_BLOCK_SOUNDS)));
    public static final Block GRASSY_GRANITE_BLOCK = registerBlock("grassy_granite",
            new Block(FabricBlockSettings.copyOf(STONE).sounds(ModSounds.GRASSY_STONE_BLOCK_SOUNDS)));
    public static final Block GRASSY_ANDESITE_BLOCK = registerBlock("grassy_andesite",
            new Block(FabricBlockSettings.copyOf(STONE).sounds(ModSounds.GRASSY_STONE_BLOCK_SOUNDS)));
    public static final Block GRASSY_DIORITE_BLOCK = registerBlock("grassy_diorite",
            new Block(FabricBlockSettings.copyOf(STONE).sounds(ModSounds.GRASSY_STONE_BLOCK_SOUNDS)));
    public static final Block GRASSY_DEEPSLATE_BLOCK = registerBlock("grassy_deepslate",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(ModSounds.GRASSY_DEEPSLATE_BLOCK_SOUNDS)));
    public static final Block GRASSY_CLAY_BLOCK = registerBlock("grassy_clay",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).sounds(ModSounds.GRASSY_CLAY_BLOCK_SOUNDS)));
    public static final Block GRASSY_COARSE_DIRT_BLOCK = registerBlock("grassy_coarse_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.COARSE_DIRT).sounds(ModSounds.GRASSY_CLAY_BLOCK_SOUNDS)));
    public static final Block GRASSY_MUD_BLOCK = registerBlock("grassy_mud",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(ModSounds.GRASSY_MUD_BLOCK_SOUNDS)));
    public static final Block SAND_PATH_BLOCK = registerBlock("sand_path",
            new SandPathBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block SHORT_DIRT_BLOCK = registerBlock("short_dirt_block",
            new ShortDirtBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block SHORT_GRASS_BLOCK = registerBlock("short_grass_block",
            new ShortDirtBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block STONE_PATH_BLOCK = registerBlock("stone_path_block",
            new StonePathBlock(FabricBlockSettings.copyOf(STONE)));
    public static final Block SMOOTH_SAND_BLOCK = registerBlock("smooth_sand",
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block GRASSY_MOSSY_COBBLESTONE_BLOCK = registerBlock("grassy_mossy_cobblestone",
            new Block(FabricBlockSettings.copyOf(STONE).sounds(ModSounds.GRASSY_STONE_BLOCK_SOUNDS)));
    public static final Block GRASS_CARPET_BLOCK = registerBlock("grass_carpet",
            new GrassCarpetBlock(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.MOSS_BLOCK).breakInstantly().noCollision().replaceable()));
    public static final Block FLAT_MOSS_CARPET_BLOCK = registerBlock("flat_moss_carpet",
            new FlatMossCarpetBlock(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.MOSS_BLOCK).breakInstantly().noCollision().replaceable()));
    public static final Block COARSE_SAND = registerBlock("coarse_sand",
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block ROUGH_OBSIDIAN = registerBlock("rough_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block OLD_GLOWSTONE_BLOCK = registerBlock("old_glowstone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block ANCIENT_EMERALD_BLOCK = registerBlock("ancient_emerald_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block STONE_PATH_STAIRS = registerBlock("stone_path_stairs",
            new PathStairsBlock(STONE.getDefaultState(), AbstractBlock.Settings.copy(STONE)));

    public static final Block OLD_GROWTH_FERN = registerBlock("old_growth_fern",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.FERN).noCollision()));
    public static final Block POTTED_OLD_GROWTH_FERN = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_old_growth_fern"),
            new FlowerPotBlock(OLD_GROWTH_FERN, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block OLD_GROWTH_GRASS = registerBlock("old_growth_grass",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.GRASS).noCollision()));
    public static final Block POTTED_OLD_GROWTH_GRASS = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_old_growth_grass"),
            new FlowerPotBlock(OLD_GROWTH_GRASS, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block TINY_SHARP_GRASS = registerBlock("tiny_sharp_grass",
            new SmallerGrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS).noCollision()));
    public static final Block SMALL_SHARP_GRASS = registerBlock("small_sharp_grass",
            new SmallerGrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS).noCollision()));

    public static final Block POTTED_GRASS = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_grass"),
            new FlowerPotBlock(Blocks.GRASS, FabricBlockSettings.copyOf(Blocks.POTTED_FERN).nonOpaque()));

    public static final Block DYNAMIC_MOSSY_COBBLESTONE_BLOCK = registerBlock("dynamic_mossy_cobblestone_block",
            new Block(FabricBlockSettings.copyOf(STONE)));
    public static final Block DYNAMIC_MOSSY_STONE_BRICKS_BLOCK = registerBlock("dynamic_mossy_stone_bricks_block",
            new Block(FabricBlockSettings.copyOf(STONE_BRICKS)));

    public static final Block CRACKED_MOSSY_STONE_BRICKS_BLOCK = registerBlock("cracked_mossy_stone_bricks_block",
            new Block(FabricBlockSettings.copyOf(CRACKED_STONE_BRICKS)));
    public static final Block DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK = registerBlock("dynamic_cracked_mossy_stone_bricks_block",
            new Block(FabricBlockSettings.copyOf(CRACKED_STONE_BRICKS)));

    public static final Block RED_DIMENSIONAL_STONE_BLOCK = registerBlock("red_dimensional_stone_block",
            new Block(FabricBlockSettings.copyOf(AMETHYST_BLOCK)));
    public static final Block BLUE_DIMENSIONAL_STONE_BLOCK = registerBlock("blue_dimensional_stone_block",
            new Block(FabricBlockSettings.copyOf(AMETHYST_BLOCK)));
    public static final Block AZURE_DIMENSIONAL_STONE_BLOCK = registerBlock("azure_dimensional_stone_block",
            new Block(FabricBlockSettings.copyOf(AMETHYST_BLOCK)));

    public static final Block GOLDEN_BUTTON = registerBlock("golden_button",
            new ButtonBlock(FabricBlockSettings.copyOf(STONE_BUTTON),BlockSetType.GOLD, 2, true));

    public static final Block MESSY_BRICKS_BLOCK = registerBlock("messy_bricks_block",
            new Block(FabricBlockSettings.copyOf(BRICKS)));

    public static final Block NATURAL_STONE_BLOCK = registerBlock("natural_stone_block",
            new Block(FabricBlockSettings.copyOf(STONE)));

    public static final Block NATURAL_ANDESITE_BLOCK = registerBlock("natural_andesite_block",
            new Block(FabricBlockSettings.copyOf(ANDESITE)));

    public static final Block NATURAL_GRANITE_BLOCK = registerBlock("natural_granite_block",
            new Block(FabricBlockSettings.copyOf(GRANITE)));

    public static final Block NATURAL_DIORITE_BLOCK = registerBlock("natural_diorite_block",
            new Block(FabricBlockSettings.copyOf(DIORITE)));

    public static final Block CRUSHED_BASALT_BLOCK = registerBlock("crushed_basalt",
            new Block(FabricBlockSettings.copyOf(BASALT)));
    public static final Block CRUSHED_DEEPSLATE_BLOCK = registerBlock("crushed_deepslate",
            new Block(FabricBlockSettings.copyOf(DEEPSLATE)));

    public static final Block CRACKED_STONE_BLOCK = registerBlock("cracked_stone",
            new Block(FabricBlockSettings.copyOf(STONE)));

    public static final Block MAGMA_STONE_BLOCK = registerBlock("magma_stone",
            new MagmaBlock(FabricBlockSettings.copyOf(MAGMA_BLOCK)));

    public static final Block CRACKED_MOSSY_STONE_BRICKS_STAIRS = registerBlock("cracked_mossy_stone_bricks_stairs",
            new StairsBlock(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_MOSSY_STONE_BRICKS_SLAB = registerBlock("cracked_mossy_stone_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_MOSSY_STONE_BRICKS_WALL = registerBlock("cracked_mossy_stone_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));

    public static final Block MOSS_GRASS_BLOCK = registerBlock("moss_grass_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));

    public static final Block ALERT_BLOCK = registerBlock("alert_block",
            new AlertBlock(FabricBlockSettings.copyOf(Blocks.DIRT).hardness(0.3f).sounds(BlockSoundGroup.NETHERITE)));
    public static final BlockEntityType<AlertBlockEntity> ALERT_BLOCK_ENTITY_BLOCK_ENTITY_TYPE = registerBlockEntity("alarm_block_entity", FabricBlockEntityTypeBuilder.create(AlertBlockEntity::new, ALERT_BLOCK));

    public static final Block DIRECTIONAL_DEEPSLATE_TILES = registerBlock("directional_deepslate_tiles",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(DEEPSLATE_TILES)));

    public static final Block CRACKED_DIRECTIONAL_DEEPSLATE_TILES = registerBlock("cracked_directional_deepslate_tiles",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(DEEPSLATE_TILES)));

    public static final Block DIRECTIONAL_BRICKS = registerBlock("directional_bricks",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.BRICKS)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ThrivingBlocksMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ThrivingBlocksMod.LOGGER.info("Registering ModBlocks for " + ThrivingBlocksMod.MOD_ID);
    }

    public static <T extends BlockEntity> BlockEntityType<T> registerBlockEntity(String name, FabricBlockEntityTypeBuilder<T> factory) {
        return Registry.register(
                Registries.BLOCK_ENTITY_TYPE,
                new Identifier(ThrivingBlocksMod.MOD_ID, name),
                factory.build()
        );
    }
}
