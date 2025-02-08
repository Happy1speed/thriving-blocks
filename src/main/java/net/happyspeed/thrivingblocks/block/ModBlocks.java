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
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.*;

public class ModBlocks {
    public static final Block FULL_GRASS_BLOCK = registerBlock("full_grass_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.GRASS)));
    public static final Block COBBLED_SANDSTONE = registerBlock("cobbled_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));
    public static final Block COBBLED_RED_SANDSTONE = registerBlock("cobbled_red_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE)));
    public static final Block FULL_PODZOL_BLOCK = registerBlock("full_podzol_block",
            new Block(FabricBlockSettings.copyOf(Blocks.PODZOL)));
    public static final Block OLD_OAK_LEAVES = registerBlock("old_oak_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block FLOWERING_JUNGLE_LEAVES = registerBlock("flowering_jungle_leaves",
            new NoFastGraphicsLeaves(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES)));
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
            new CustomPathBlock(FabricBlockSettings.copyOf(Blocks.SAND), Blocks.SAND));
    public static final Block GRAVEL_PATH_BLOCK = registerBlock("gravel_path",
            new CustomPathBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL), Blocks.GRAVEL));
    public static final Block RED_SAND_PATH_BLOCK = registerBlock("red_sand_path",
            new CustomPathBlock(FabricBlockSettings.copyOf(Blocks.RED_SAND), Blocks.RED_SAND));
    public static final Block CLAY_PATH_BLOCK = registerBlock("clay_path",
            new CustomPathBlock(FabricBlockSettings.copyOf(Blocks.CLAY), Blocks.CLAY));
    public static final Block MUD_PATH_BLOCK = registerBlock("mud_path",
            new CustomPathBlock(FabricBlockSettings.copyOf(Blocks.MUD), Blocks.MUD));
    public static final Block SHORT_DIRT_BLOCK = registerBlock("short_dirt_block",
            new ShortDirtBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block SHORT_GRASS_BLOCK = registerBlock("short_grass_block",
            new ShortDirtBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block STONE_PATH_BLOCK = registerBlock("stone_path_block",
            new StonePathBlock(FabricBlockSettings.copyOf(STONE)));
    public static final Block SMOOTH_SAND_BLOCK = registerBlock("smooth_sand",
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block SMOOTH_RED_SAND_BLOCK = registerBlock("smooth_red_sand",
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.RED_SAND)));
    public static final Block GRASSY_MOSSY_COBBLESTONE_BLOCK = registerBlock("grassy_mossy_cobblestone",
            new Block(FabricBlockSettings.copyOf(STONE).sounds(ModSounds.GRASSY_STONE_BLOCK_SOUNDS)));
    public static final Block GRASSY_COBBLESTONE_BLOCK = registerBlock("grassy_cobblestone",
            new Block(FabricBlockSettings.copyOf(STONE).sounds(ModSounds.GRASSY_STONE_BLOCK_SOUNDS)));
    public static final Block GRASS_CARPET_BLOCK = registerBlock("grass_carpet",
            new GrassCarpetBlock(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.MOSS_BLOCK).replaceable().breakInstantly()));
    public static final Block FLAT_MOSS_CARPET_BLOCK = registerBlock("flat_moss_carpet",
            new FlatMossCarpetBlock(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.MOSS_BLOCK).replaceable().breakInstantly()));
    public static final Block COARSE_SAND = registerBlock("coarse_sand",
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.SAND).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block ROUGH_OBSIDIAN = registerBlock("rough_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block OLD_GLOWSTONE_BLOCK = registerBlock("old_glowstone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block ANCIENT_EMERALD_BLOCK = registerBlock("ancient_emerald_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block STONE_PATH_STAIRS = registerBlock("stone_path_stairs",
            new PathStairsBlock(STONE.getDefaultState(), AbstractBlock.Settings.copy(STONE)));

    public static final Block OLD_GROWTH_FERN = registerBlock("old_growth_fern",
            new OldGrowthFernBlock(FabricBlockSettings.copyOf(Blocks.FERN).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_OLD_GROWTH_FERN = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_old_growth_fern"),
            new FlowerPotBlock(OLD_GROWTH_FERN, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block OLD_GROWTH_GRASS = registerBlock("old_growth_grass",
            new OldGrowthGrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XYZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_OLD_GROWTH_GRASS = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_old_growth_grass"),
            new FlowerPotBlock(OLD_GROWTH_GRASS, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block TINY_SHARP_GRASS = registerBlock("tiny_sharp_grass",
            new SmallerGrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_TINY_SHARP_GRASS = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_tiny_sharp_grass"),
            new FlowerPotBlock(TINY_SHARP_GRASS, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block SMALL_SHARP_GRASS = registerBlock("small_sharp_grass",
            new SmallerGrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_SMALL_SHARP_GRASS = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_small_sharp_grass"),
            new FlowerPotBlock(SMALL_SHARP_GRASS, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

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
            new MagmaBlock(FabricBlockSettings.copyOf(MAGMA_BLOCK).sounds(BlockSoundGroup.STONE)));

    public static final Block MAGMA_BLACKSTONE_BLOCK = registerBlock("magma_blackstone",
            new MagmaBlock(FabricBlockSettings.copyOf(MAGMA_BLOCK).sounds(BlockSoundGroup.STONE)));

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

    public static final Block AMBIENT_CLOCK_BLOCK = registerBlock("ambient_clock_block",
            new AmbientClockBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).hardness(0.3f).sounds(BlockSoundGroup.WOOD)));
    public static final BlockEntityType<AmbientClockBlockEntity> AMBIENT_CLOCK_BLOCK_ENTITY_BLOCK_ENTITY_TYPE = registerBlockEntity("ambient_clock_block_entity", FabricBlockEntityTypeBuilder.create(AmbientClockBlockEntity::new, AMBIENT_CLOCK_BLOCK));

    public static final Block DIRECTIONAL_DEEPSLATE_TILES = registerBlock("directional_deepslate_tiles",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(DEEPSLATE_TILES)));

    public static final Block CRACKED_DIRECTIONAL_DEEPSLATE_TILES = registerBlock("cracked_directional_deepslate_tiles",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(DEEPSLATE_TILES)));

    public static final Block DIRECTIONAL_BRICKS = registerBlock("directional_bricks",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block DIRECTIONAL_QUARTZ_BRICKS = registerBlock("directional_quartz_bricks",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)));

    public static final Block DRIPLEAF_PAD = registerJustBlock("dripleaf_pad",
            new DripleafPadBlock(FabricBlockSettings.copyOf(LILY_PAD)));

    public static final Block NEAT_FERN = registerBlock("neat_fern",
            new OldGrowthFernBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block NEAT_LARGE_FERN = registerBlock("neat_large_fern",
            new TallPlantBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block NEAT_OLD_GROWTH_FERN = registerBlock("neat_old_growth_fern",
            new OldGrowthFernBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CHIPPED_STONE = registerBlock("chipped_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block CREEPER_GOLD_BLOCK = registerBlock("creeper_gold_block",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block PURPUR_JOINT = registerBlock("purpur_joint",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));

    public static final Block AZALEA_DROOP_BLOCK = registerBlock("azalea_droop",
            new AzaleaDroopBlock(FabricBlockSettings.copyOf(Blocks.AZALEA).breakInstantly().noCollision()));
    public static final Block FLOWERING_AZALEA_DROOP_BLOCK = registerBlock("flowering_azalea_droop",
            new AzaleaDroopBlock(FabricBlockSettings.copyOf(Blocks.AZALEA).breakInstantly().noCollision()));

    public static final Block AZALEA_BUSH_BLOCK = registerBlock("azalea_bush_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AZALEA)));
    public static final Block FLOWERING_AZALEA_BUSH_BLOCK = registerBlock("flowering_azalea_bush_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AZALEA)));

    public static final Block UNDERHANG_VINE = registerBlock("underhang_vine",
            new VineMultifaceBlock(FabricBlockSettings.copyOf(Blocks.VINE).breakInstantly().replaceable().burnable()));

    public static final Block GLASS_LAYER = registerBlock("glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly().solid()));


    public static final Block BLACK_GLASS_LAYER = registerBlock("black_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block WHITE_GLASS_LAYER = registerBlock("white_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block GRAY_GLASS_LAYER = registerBlock("gray_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block GREEN_GLASS_LAYER = registerBlock("green_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block YELLOW_GLASS_LAYER = registerBlock("yellow_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block ORANGE_GLASS_LAYER = registerBlock("orange_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block RED_GLASS_LAYER = registerBlock("red_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block BLUE_GLASS_LAYER = registerBlock("blue_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block MAGENTA_GLASS_LAYER = registerBlock("magenta_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block PINK_GLASS_LAYER = registerBlock("pink_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block PURPLE_GLASS_LAYER = registerBlock("purple_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block BROWN_GLASS_LAYER = registerBlock("brown_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block LIGHT_GRAY_GLASS_LAYER = registerBlock("light_gray_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block LIME_GLASS_LAYER = registerBlock("lime_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block CYAN_GLASS_LAYER = registerBlock("cyan_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block LIGHT_BLUE_GLASS_LAYER = registerBlock("light_blue_glass_layer",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block GLASS_LAYER_CLEAR = registerBlock("glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly().solid()));

    public static final Block BLACK_GLASS_LAYER_CLEAR = registerBlock("black_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block WHITE_GLASS_LAYER_CLEAR = registerBlock("white_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block GRAY_GLASS_LAYER_CLEAR = registerBlock("gray_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block GREEN_GLASS_LAYER_CLEAR = registerBlock("green_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block YELLOW_GLASS_LAYER_CLEAR = registerBlock("yellow_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block ORANGE_GLASS_LAYER_CLEAR = registerBlock("orange_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block RED_GLASS_LAYER_CLEAR = registerBlock("red_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block BLUE_GLASS_LAYER_CLEAR = registerBlock("blue_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block MAGENTA_GLASS_LAYER_CLEAR = registerBlock("magenta_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block PINK_GLASS_LAYER_CLEAR = registerBlock("pink_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block PURPLE_GLASS_LAYER_CLEAR = registerBlock("purple_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block BROWN_GLASS_LAYER_CLEAR = registerBlock("brown_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block LIGHT_GRAY_GLASS_LAYER_CLEAR = registerBlock("light_gray_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block LIME_GLASS_LAYER_CLEAR = registerBlock("lime_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block CYAN_GLASS_LAYER_CLEAR = registerBlock("cyan_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block LIGHT_BLUE_GLASS_LAYER_CLEAR = registerBlock("light_blue_glass_layer_clear",
            new GlassLayerMultifaceBlock(FabricBlockSettings.copyOf(Blocks.GLASS).breakInstantly()));

    public static final Block POTTED_REDSTONE_TORCH = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_redstone_torch"),
            new FlowerPotBlock(REDSTONE_TORCH, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque().luminance(3)));

    public static final Block POTTED_TORCH = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_torch"),
            new FlowerPotBlock(TORCH, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque().luminance(8)));

    public static final Block POTTED_SOUL_TORCH = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_soul_torch"),
            new FlowerPotBlock(SOUL_TORCH, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque().luminance(6)));

    public static final Block CHAIN_STUB = registerBlock("chain_stub",
            new ChainStubBlock(FabricBlockSettings.copyOf(CHAIN)));

    public static final Block TOUGH_DIRT_BLOCK = registerBlock("tough_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));

    public static final Block BEDROCK_DIAMOND_ORE = registerBlock("bedrock_diamond_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK)));

    public static final Block MANGROVE_ROOT_CLUMP = registerBlock("mangrove_root_clump",
            new MangroveRootsBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_ROOTS)));

    public static final Block FULL_CRIMSON_NYLIUM_BLOCK = registerBlock("full_crimson_nylium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_NYLIUM)));

    public static final Block FULL_WARPED_NYLIUM_BLOCK = registerBlock("full_warped_nylium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_NYLIUM)));

    public static final Block DIRECTIONAL_MUD_BRICKS = registerBlock("directional_mud_bricks",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));

    public static final Block GRASSY_PACKED_MUD_BLOCK = registerBlock("grassy_packed_mud",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_MUD).sounds(ModSounds.GRASSY_PACKED_MUD_BLOCK_SOUNDS)));

    public static final Block BUSH_FERN = registerBlock("bush_fern",
            new FernBlock(FabricBlockSettings.copyOf(Blocks.GRASS).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XYZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BUSH_FERN = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_bush_fern"),
            new FlowerPotBlock(BUSH_FERN, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block NEAT_BUSH_FERN = registerBlock("neat_bush_fern",
            new FernBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DRIPLEAF_VINE_BLOCK = registerBlock("dripleaf_vine",
            new DripleafVineBlock(FabricBlockSettings.copyOf(Blocks.BIG_DRIPLEAF).sounds(BlockSoundGroup.SMALL_DRIPLEAF).hardness(0.1f).collidable(false)));

    public static final Block POTTED_SMALL_DRIPLEAF = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_small_dripleaf"),
            new FlowerPotBlock(SMALL_DRIPLEAF, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block NEAT_SMALL_DRIPLEAF = registerBlock("neat_small_dripleaf",
            new SmallDripleafBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.SMALL_DRIPLEAF).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GLOWING_OBSIDIAN_BLOCK = registerBlock("glowing_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).luminance(state -> 5).postProcess(Blocks::always).emissiveLighting(Blocks::always)));

    public static final Block OLD_DEAD_BUSH_BLOCK = registerBlock("old_dead_bush",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH)));

    public static final Block POTTED_OLD_DEAD_BUSH_BLOCK = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_old_dead_bush"),
            new FlowerPotBlock(ModBlocks.OLD_DEAD_BUSH_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block ROUGH_STONE = registerBlock("rough_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block COARSE_GRAVEL = registerBlock("coarse_gravel",
            new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));

    public static final Block OLD_STONEBRICKS = registerBlock("old_stonebricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block OLD_MOSSY_STONEBRICKS = registerBlock("old_mossy_stonebricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block CRACKED_OLD_STONEBRICKS = registerBlock("cracked_old_stonebricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block WORN_BRICKS = registerBlock("worn_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block OLD_COBBLESTONE = registerBlock("old_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block OLD_MOSSY_COBBLESTONE = registerBlock("old_mossy_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE)));

    public static final Block ANCIENT_COBBLESTONE = registerBlock("ancient_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block GRASSY_SAND_BLOCK = registerBlock("grassy_sand",
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.SAND).sounds(ModSounds.GRASSY_SAND_BLOCK_SOUNDS)));

    public static final Block GRASSY_SANDSTONE_BLOCK = registerBlock("grassy_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(ModSounds.GRASSY_STONE_BLOCK_SOUNDS)));

    public static final Block GRASSY_RED_SAND_BLOCK = registerBlock("grassy_red_sand",
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.RED_SAND).sounds(ModSounds.GRASSY_SAND_BLOCK_SOUNDS)));

    public static final Block GRASSY_RED_SANDSTONE_BLOCK = registerBlock("grassy_red_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE).sounds(ModSounds.GRASSY_STONE_BLOCK_SOUNDS)));

    public static final Block GRASSY_OLD_COBBLESTONE_BLOCK = registerBlock("grassy_old_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE).sounds(ModSounds.GRASSY_STONE_BLOCK_SOUNDS)));

    public static final Block ANCIENT_SOUL_SAND_BLOCK = registerBlock("ancient_soul_sand",
            new SoulSandBlock(FabricBlockSettings.copyOf(Blocks.SOUL_SAND)));

    public static final Block DEGRADED_NETHERRACK_BLOCK = registerBlock("degraded_netherrack",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK)));

    public static final Block LIGHTLY_WEATHERED_ANCIENT_COBBLESTONE_BLOCK = registerBlock("lightly_weathered_ancient_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block BAMBOO_VINES_BLOCK = registerBlock("bamboo_vines",
            new VineMultifaceBlock(FabricBlockSettings.copyOf(Blocks.VINE).breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MOSS_VINES_BLOCK = registerBlock("moss_vines",
            new VineMultifaceBlock(FabricBlockSettings.copyOf(Blocks.VINE).breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DYNAMIC_MOSS_VINES_BLOCK = registerBlock("dynamic_moss_vines",
            new VineMultifaceBlock(FabricBlockSettings.copyOf(Blocks.VINE).breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SHORT_SMALL_DRIPLEAF = registerBlock("short_small_dripleaf",
            new ShortSmallDripleafBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.SMALL_DRIPLEAF).offset(AbstractBlock.OffsetType.XYZ).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block NEAT_SHORT_SMALL_DRIPLEAF = registerBlock("neat_short_small_dripleaf",
            new ShortSmallDripleafBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.SMALL_DRIPLEAF).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block OLD_JUNGLE_LEAVES = registerBlock("old_jungle_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES)));

    public static final Block OLD_SPRUCE_LEAVES = registerBlock("old_spruce_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES)));

    public static final Block RUSTIC_REDSTONE_LAMP = registerBlock("rustic_redstone_lamp",
            new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP)));

    public static final Block GRASSY_SOUL_SAND_BLOCK = registerBlock("grassy_soul_sand",
            new Block(FabricBlockSettings.copyOf(Blocks.SOUL_SOIL).sounds(ModSounds.GRASSY_SOUL_SAND_BLOCK_SOUNDS)));

    public static final Block GRASSY_SOUL_SOIL_BLOCK = registerBlock("grassy_soul_soil",
            new Block(FabricBlockSettings.copyOf(Blocks.SOUL_SOIL).sounds(ModSounds.GRASSY_SOUL_SAND_BLOCK_SOUNDS)));

    public static final Block GRASSY_BEDROCK_BLOCK = registerBlock("grassy_bedrock",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(ModSounds.GRASSY_STONE_BLOCK_SOUNDS)));

    public static final Block FULL_DIRT_PATH_BLOCK = registerBlock("full_dirt_path",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));

    public static final Block MUDDY_DEAD_BUSH_BLOCK = registerBlock("muddy_dead_bush",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH)));

    public static final Block POTTED_MUDDY_DEAD_BUSH_BLOCK = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_muddy_dead_bush"),
            new FlowerPotBlock(ModBlocks.MUDDY_DEAD_BUSH_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block DEAD_DRIPLEAF_VINE_BLOCK = registerBlock("dead_dripleaf_vine",
            new DripleafVineBlock(FabricBlockSettings.copyOf(Blocks.BIG_DRIPLEAF).sounds(BlockSoundGroup.SMALL_DRIPLEAF).hardness(0.1f).collidable(false)));

    public static final Block MUDDY_DRIPLEAF_VINE_BLOCK = registerBlock("muddy_dripleaf_vine",
            new DripleafVineBlock(FabricBlockSettings.copyOf(Blocks.BIG_DRIPLEAF).sounds(BlockSoundGroup.SMALL_DRIPLEAF).hardness(0.1f).collidable(false)));

    public static final Block AZALEA_DROOP_VINES_BLOCK = registerBlock("azalea_droop_vines",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.AZALEA).noCollision().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block FLOWERING_AZALEA_DROOP_VINES_BLOCK = registerBlock("flowering_azalea_droop_vines",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.AZALEA).noCollision().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DYNAMIC_FLAT_MOSS_CARPET_BLOCK = registerBlock("dynamic_flat_moss_carpet",
            new FlatMossCarpetBlock(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.MOSS_BLOCK).replaceable().breakInstantly()));

    public static final Block DYNAMIC_MOSS_GRASS_BLOCK = registerBlock("dynamic_moss_grass_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));

    public static final Block POTTED_SHORT_SMALL_DRIPLEAF = Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, "potted_short_small_dripleaf"),
            new FlowerPotBlock(ModBlocks.SHORT_SMALL_DRIPLEAF, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));

    public static final Block SMOOTH_STONE_STAIRS_BLOCK = registerBlock("smooth_stone_stairs",
            new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));

    public static final Block SMALL_DRIPLEAF_VINE_BLOCK = registerBlock("small_dripleaf_vine",
            new SmallDripleafVineBlock(FabricBlockSettings.copyOf(Blocks.BIG_DRIPLEAF).sounds(BlockSoundGroup.SMALL_DRIPLEAF).hardness(0.1f).collidable(false)));

    public static final Block CRYSTALLINE_AMETHYST_BLOCK = registerBlock("crystalline_amethyst_block",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block OLD_GRASS_BLOCK = registerBlock("old_grass_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));

    public static final Block DIRECTIONAL_OLD_GRASS_BLOCK = registerBlock("directional_old_grass_block",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));

    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block OLD_GRASS_CARPET_BLOCK = registerBlock("old_grass_carpet",
            new GrassCarpetBlock(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.MOSS_BLOCK).replaceable().breakInstantly()));

    public static final Block END_STONE_STAIRS_BLOCK = registerBlock("end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block DYNAMIC_MOSS_BLOCK = registerBlock("dynamic_moss_block",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)));

    public static final Block RAGGED_GRASS_VINES_BLOCK = registerBlock("ragged_grass_vines",
            new VineMultifaceBlock(FabricBlockSettings.copyOf(Blocks.VINE).breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GRASSY_DYNAMIC_MOSS_BLOCK = registerBlock("grassy_dynamic_moss_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));

    public static final Block PHANTOM_CUBE_BLOCK = registerBlock("phantom_cube",
            new PhantomCube(AbstractBlock.Settings.create().replaceable().noCollision().noBlockBreakParticles().pistonBehavior(PistonBehavior.DESTROY).breakInstantly()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, name), block);
    }

    private static Block registerJustBlock(String name, Block block) {
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
