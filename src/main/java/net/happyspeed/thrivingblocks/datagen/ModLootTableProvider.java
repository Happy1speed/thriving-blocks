package net.happyspeed.thrivingblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.happyspeed.thrivingblocks.block.ModBlocks;
import net.happyspeed.thrivingblocks.block.NaturesSpiritModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.data.server.loottable.vanilla.VanillaBlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.FULL_GRASS_BLOCK, (Block block) -> drops((Block)block, Blocks.DIRT));
        addDrop(ModBlocks.FULL_CRIMSON_NYLIUM_BLOCK, (Block block) -> drops((Block)block, Blocks.NETHERRACK));
        addDrop(ModBlocks.FULL_WARPED_NYLIUM_BLOCK, (Block block) -> drops((Block)block, Blocks.NETHERRACK));
        addDrop(ModBlocks.GRASSY_MOSS_BLOCK, (Block block) -> drops((Block)block, Blocks.MOSS_BLOCK));
        addDrop(ModBlocks.GRASSY_STONE_BLOCK, (Block block) -> drops((Block)block, Blocks.COBBLESTONE));
        addDrop(ModBlocks.GRASSY_GRANITE_BLOCK, (Block block) -> drops((Block)block, Blocks.GRANITE));
        addDrop(ModBlocks.GRASSY_ANDESITE_BLOCK, (Block block) -> drops((Block)block, Blocks.ANDESITE));
        addDrop(ModBlocks.GRASSY_DIORITE_BLOCK, (Block block) -> drops((Block)block, Blocks.DIORITE));
        addDrop(ModBlocks.GRASSY_DEEPSLATE_BLOCK, (Block block) -> drops((Block)block, Blocks.COBBLED_DEEPSLATE));
        addDrop(ModBlocks.FULL_PODZOL_BLOCK, (Block block) -> drops((Block)block, Blocks.DIRT));
        addDrop(ModBlocks.GRASSY_CLAY_BLOCK, (Block block) -> drops((Block)block, Blocks.CLAY));
        addDrop(ModBlocks.GRASSY_COARSE_DIRT_BLOCK, (Block block) -> drops((Block)block, Blocks.COARSE_DIRT));
        addDrop(ModBlocks.GRASSY_MUD_BLOCK, (Block block) -> drops((Block)block, Blocks.MUD));
        addDrop(ModBlocks.GRASSY_PACKED_MUD_BLOCK, (Block block) -> drops((Block)block, Blocks.PACKED_MUD));
        addDrop(ModBlocks.SAND_PATH_BLOCK, (Block block) -> drops((Block)block, Blocks.SAND));
        addDrop(ModBlocks.GRAVEL_PATH_BLOCK, (Block block) -> drops((Block)block, Blocks.GRAVEL));
        addDrop(ModBlocks.CLAY_PATH_BLOCK, (Block block) -> drops((Block)block, Blocks.CLAY));
        addDrop(ModBlocks.RED_SAND_PATH_BLOCK, (Block block) -> drops((Block)block, Blocks.RED_SAND));
        addDrop(ModBlocks.MUD_PATH_BLOCK, (Block block) -> drops((Block)block, Blocks.MUD));
        addDrop(ModBlocks.SHORT_GRASS_BLOCK, (Block block) -> drops((Block)block, Blocks.DIRT));
        addDrop(ModBlocks.SHORT_DIRT_BLOCK, (Block block) -> drops((Block)block, Blocks.DIRT));
        addDrop(ModBlocks.MOSS_GRASS_BLOCK, (Block block) -> drops((Block)block, Blocks.DIRT));
        addDrop(ModBlocks.GRASSY_MOSSY_COBBLESTONE_BLOCK, (Block block) -> drops((Block)block, Blocks.MOSSY_COBBLESTONE));
        addDrop(ModBlocks.GRASSY_COBBLESTONE_BLOCK, (Block block) -> drops((Block)block, Blocks.COBBLESTONE));
        addDrop(ModBlocks.OLD_OAK_LEAVES, leavesDrops(ModBlocks.OLD_OAK_LEAVES, Block.getBlockFromItem(Items.STICK), 0.05f));
        addDrop(ModBlocks.FLOWERING_JUNGLE_LEAVES, leavesDrops(ModBlocks.FLOWERING_JUNGLE_LEAVES, Block.getBlockFromItem(Items.STICK), 0.05f));
        addDrop(ModBlocks.COBBLED_SANDSTONE);
        addDrop(ModBlocks.DRIPLEAF_VINE_BLOCK);
        addDrop(ModBlocks.SMOOTH_SAND_BLOCK);
        addDrop(ModBlocks.SMOOTH_RED_SAND_BLOCK);
        addDrop(ModBlocks.GRASS_CARPET_BLOCK);
        addDrop(ModBlocks.FLAT_MOSS_CARPET_BLOCK);
        addDrop(ModBlocks.ROUGH_OBSIDIAN);
        addDrop(ModBlocks.COARSE_SAND);
        addDrop(ModBlocks.DIRECTIONAL_QUARTZ_BRICKS);
        addDrop(ModBlocks.STONE_PATH_BLOCK);
        addDrop(ModBlocks.STONE_PATH_STAIRS);
        addDrop(ModBlocks.DYNAMIC_MOSSY_STONE_BRICKS_BLOCK);
        addDrop(ModBlocks.DYNAMIC_MOSSY_COBBLESTONE_BLOCK);
        addDrop(ModBlocks.OLD_GLOWSTONE_BLOCK);
        addDrop(ModBlocks.ANCIENT_EMERALD_BLOCK);
        addDrop(ModBlocks.GOLDEN_BUTTON);
        addDrop(ModBlocks.RED_DIMENSIONAL_STONE_BLOCK);
        addDrop(ModBlocks.BLUE_DIMENSIONAL_STONE_BLOCK);
        addDrop(ModBlocks.AZURE_DIMENSIONAL_STONE_BLOCK);
        addDrop(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK);
        addDrop(ModBlocks.DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK);
        addDrop(ModBlocks.NATURAL_ANDESITE_BLOCK);
        addDrop(ModBlocks.NATURAL_DIORITE_BLOCK);
        addDrop(ModBlocks.NATURAL_GRANITE_BLOCK);
        addDrop(ModBlocks.NATURAL_STONE_BLOCK);
        addDrop(ModBlocks.MESSY_BRICKS_BLOCK);
        addDrop(ModBlocks.CRUSHED_BASALT_BLOCK);
        addDrop(ModBlocks.CRUSHED_DEEPSLATE_BLOCK);
        addDrop(ModBlocks.CRACKED_STONE_BLOCK);
        addDrop(ModBlocks.MAGMA_STONE_BLOCK);
        addDrop(ModBlocks.DIRECTIONAL_DEEPSLATE_TILES);
        addDrop(ModBlocks.CRACKED_DIRECTIONAL_DEEPSLATE_TILES);
        addDrop(ModBlocks.DIRECTIONAL_BRICKS);
        addDrop(ModBlocks.COBBLED_RED_SANDSTONE);
        addDrop(ModBlocks.DRIPLEAF_PAD);
        addDrop(ModBlocks.ALERT_BLOCK);
        addDrop(ModBlocks.PURPUR_JOINT);
        addDrop(ModBlocks.CREEPER_GOLD_BLOCK);
        addDrop(ModBlocks.CHIPPED_STONE);
        addDrop(ModBlocks.FLOWERING_AZALEA_DROOP_BLOCK);
        addDrop(ModBlocks.AZALEA_DROOP_BLOCK);
        addDrop(ModBlocks.AZALEA_BUSH_BLOCK);
        addDrop(ModBlocks.FLOWERING_AZALEA_BUSH_BLOCK);
        addDrop(ModBlocks.CHAIN_STUB);
        addDrop(ModBlocks.DIRECTIONAL_MUD_BRICKS);
        addDrop(ModBlocks.MAGMA_BLACKSTONE_BLOCK);
        addDrop(ModBlocks.MANGROVE_ROOT_CLUMP);
        addDrop(ModBlocks.GLOWING_OBSIDIAN_BLOCK);
        addDropWithSilkTouch(ModBlocks.GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.BLACK_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.WHITE_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.GRAY_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.GREEN_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.YELLOW_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.ORANGE_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.RED_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.BLUE_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.MAGENTA_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.PINK_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.PURPLE_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.BROWN_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.LIGHT_GRAY_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.LIME_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.LIGHT_BLUE_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.CYAN_GLASS_LAYER);
        addDropWithSilkTouch(ModBlocks.GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.BLACK_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.WHITE_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.GRAY_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.GREEN_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.YELLOW_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.ORANGE_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.RED_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.BLUE_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.MAGENTA_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.PINK_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.PURPLE_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.BROWN_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.LIGHT_GRAY_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.LIME_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.LIGHT_BLUE_GLASS_LAYER_CLEAR);
        addDropWithSilkTouch(ModBlocks.CYAN_GLASS_LAYER_CLEAR);
        this.addDrop(ModBlocks.UNDERHANG_VINE, (Block block) -> this.multifaceGrowthDrops((Block)block, WITH_SHEARS));
        addDrop(ModBlocks.SMALL_SHARP_GRASS, this::grassDrops);
        addDrop(ModBlocks.TINY_SHARP_GRASS, this::grassDrops);
        addDrop(ModBlocks.OLD_GROWTH_GRASS, this::grassDrops);
        addDrop(ModBlocks.OLD_GROWTH_FERN, this::grassDrops);
        addDrop(ModBlocks.NEAT_FERN, this::grassDrops);
        addDrop(ModBlocks.NEAT_LARGE_FERN, this::grassDrops);
        addDrop(ModBlocks.NEAT_OLD_GROWTH_FERN, this::grassDrops);
        addDrop(ModBlocks.BUSH_FERN, this::grassDrops);
        addDrop(ModBlocks.NEAT_BUSH_FERN, this::grassDrops);
        this.addDrop(ModBlocks.OLD_DEAD_BUSH_BLOCK, (Block block) -> dropsWithShears(block, (LootPoolEntry.Builder)this.applyExplosionDecay((ItemConvertible)block, ItemEntry.builder(Items.STICK).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f))))));
        addDrop(ModBlocks.NEAT_SMALL_DRIPLEAF, (Block block) -> BlockLootTableGenerator.dropsWithShears(block));
        addPottedPlantDrops(ModBlocks.POTTED_GRASS);
        addPottedPlantDrops(ModBlocks.POTTED_OLD_GROWTH_GRASS);
        addPottedPlantDrops(ModBlocks.POTTED_OLD_GROWTH_FERN);
        addPottedPlantDrops(ModBlocks.POTTED_TINY_SHARP_GRASS);
        addPottedPlantDrops(ModBlocks.POTTED_SMALL_SHARP_GRASS);
        addPottedPlantDrops(ModBlocks.POTTED_SOUL_TORCH);
        addPottedPlantDrops(ModBlocks.POTTED_TORCH);
        addPottedPlantDrops(ModBlocks.POTTED_REDSTONE_TORCH);
        addPottedPlantDrops(ModBlocks.POTTED_BUSH_FERN);
        addPottedPlantDrops(ModBlocks.POTTED_SMALL_DRIPLEAF);
        addPottedPlantDrops(ModBlocks.POTTED_OLD_DEAD_BUSH_BLOCK);
        this.addDrop(ModBlocks.BEDROCK_DIAMOND_ORE, (Block block) -> this.oreDrops((Block)block, Items.DIAMOND));


        //Nature's spirit compat
//        addDrop(NaturesSpiritModBlocks.RED_MOSS_GRASS_BLOCK, (Block block) -> drops((Block)block, Blocks.DIRT));
//        addDrop(NaturesSpiritModBlocks.ROCKY_SANDY_SOIL_BLOCK);
//        addDrop(NaturesSpiritModBlocks.PURE_SANDY_SOIL_BLOCK);
//        addDrop(NaturesSpiritModBlocks.GRASSY_SANDY_SOIL_BLOCK);
//        addDrop(NaturesSpiritModBlocks.NATURAL_TRAVERTINE_BLOCK);
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_BLOCK);
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_SLAB, slabDrops(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_SLAB));
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_STAIRS);
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_WALL);
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_SLAB, slabDrops(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_SLAB));
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_BLOCK);
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_STAIRS);
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_WALL);
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK);
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_STAIRS);
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_SLAB, slabDrops(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_SLAB));
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_WALL);
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_SLAB, slabDrops(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_SLAB));
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK);
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_STAIRS);
//        addDrop(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_WALL);
    }
}
