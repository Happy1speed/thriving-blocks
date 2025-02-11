package net.happyspeed.thrivingblocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.happyspeed.thrivingblocks.ThrivingBlocksMod;
import net.happyspeed.thrivingblocks.block.custom.*;
import net.happyspeed.thrivingblocks.sound.ModSounds;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.*;

public class NaturesSpiritModBlocks {
    public static final Block FLAT_RED_MOSS_CARPET_BLOCK = registerBlock("flat_red_moss_carpet",
            new FlatMossCarpetBlock(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.MOSS_BLOCK).replaceable().breakInstantly()));

    public static final Block NATURAL_TRAVERTINE_BLOCK = registerBlock("natural_travertine_block",
            new Block(FabricBlockSettings.copyOf(STONE)));

    public static final Block PURE_SANDY_SOIL_BLOCK = registerBlock("pure_sandy_soil_block",
            new Block(FabricBlockSettings.copyOf(GRAVEL)));
    public static final Block ROCKY_SANDY_SOIL_BLOCK = registerBlock("rocky_sandy_soil_block",
            new Block(FabricBlockSettings.copyOf(GRAVEL)));

    public static final Block RED_MOSSY_TRAVERTINE_BRICKS_BLOCK = registerBlock("red_mossy_travertine_bricks_block",
            new Block(FabricBlockSettings.copyOf(MOSSY_COBBLESTONE)));

    public static final Block RED_MOSSY_TRAVERTINE_BRICKS_STAIRS = registerBlock("red_mossy_travertine_bricks_stairs",
            new StairsBlock(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block RED_MOSSY_TRAVERTINE_BRICKS_SLAB = registerBlock("red_mossy_travertine_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block RED_MOSSY_TRAVERTINE_BRICKS_WALL = registerBlock("red_mossy_travertine_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block RED_MOSSY_COBBLED_TRAVERTINE_BLOCK = registerBlock("red_mossy_cobbled_travertine_block",
            new Block(FabricBlockSettings.copyOf(MOSSY_COBBLESTONE)));

    public static final Block RED_MOSSY_COBBLED_TRAVERTINE_STAIRS = registerBlock("red_mossy_cobbled_travertine_stairs",
            new StairsBlock(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RED_MOSSY_COBBLED_TRAVERTINE_SLAB = registerBlock("red_mossy_cobbled_travertine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RED_MOSSY_COBBLED_TRAVERTINE_WALL = registerBlock("red_mossy_cobbled_travertine_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block RED_MOSSY_COBBLESTONE_BLOCK = registerBlock("red_mossy_cobblestone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RED_MOSSY_COBBLESTONE_STAIRS = registerBlock("red_mossy_cobblestone_stairs",
            new StairsBlock(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RED_MOSSY_COBBLESTONE_SLAB = registerBlock("red_mossy_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RED_MOSSY_COBBLESTONE_WALL = registerBlock("red_mossy_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block RED_MOSSY_STONE_BRICKS_BLOCK = registerBlock("red_mossy_stone_bricks_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block RED_MOSSY_STONE_BRICKS_STAIRS = registerBlock("red_mossy_stone_bricks_stairs",
            new StairsBlock(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block RED_MOSSY_STONE_BRICKS_SLAB = registerBlock("red_mossy_stone_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block RED_MOSSY_STONE_BRICKS_WALL = registerBlock("red_mossy_stone_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block RED_MOSS_GRASS_BLOCK = registerBlock("red_moss_grass_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));

    public static final Block COBBLED_CHERT_BLOCK = registerBlock("cobbled_chert",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block GRASSY_SANDY_SOIL_BLOCK = registerBlock("grassy_sandy_soil_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(ModSounds.GRASSY_CLAY_BLOCK_SOUNDS)));

    public static final Block DIRECTIONAL_TRAVERTINE_TILES = registerBlock("directional_travertine_tiles",
            new GlazedTerracottaBlock(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block COBBLED_PINK_SANDSTONE = registerBlock("cobbled_pink_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    public static final Block NEAT_LUSH_FERN = registerBlock("neat_lush_fern",
            new OldGrowthFernBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block NEAT_LARGE_LUSH_FERN = registerBlock("neat_large_lush_fern",
            new TallPlantBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block NEAT_FLAXEN_FERN = registerBlock("neat_flaxen_fern",
            new OldGrowthFernBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block NEAT_LARGE_FLAXEN_FERN = registerBlock("neat_large_flaxen_fern",
            new TallPlantBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GRASSY_PINK_SAND_BLOCK = registerBlock("grassy_pink_sand",
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(ModSounds.GRASSY_SAND_BLOCK_SOUNDS)));

    public static final Block GRASSY_PINK_SANDSTONE_BLOCK = registerBlock("grassy_pink_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(ModSounds.GRASSY_STONE_BLOCK_SOUNDS)));

    public static final Block GRASSY_CHERT_BLOCK = registerBlock("grassy_chert",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(ModSounds.GRASSY_STONE_BLOCK_SOUNDS)));

    public static final Block RED_MOSS_VINES_BLOCK = registerBlock("red_moss_vines",
            new VineMultifaceBlock(FabricBlockSettings.copyOf(Blocks.VINE).breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block NEAT_SEDGE_GRASS = registerBlock("neat_sedge_grass",
            new WaterloggableGrass(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block NEAT_TALL_SEDGE_GRASS = registerBlock("neat_tall_sedge_grass",
            new WaterloggableTallGrass(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).replaceable().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).burnable().pistonBehavior(PistonBehavior.DESTROY)));

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
}
