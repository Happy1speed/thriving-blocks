package net.happyspeed.thrivingblocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.happyspeed.thrivingblocks.ThrivingBlocksMod;
import net.happyspeed.thrivingblocks.block.ModBlocks;
import net.happyspeed.thrivingblocks.block.NaturesSpiritModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup THRIVING_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ThrivingBlocksMod.MOD_ID, "thrivingblocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.thrivingblocks"))
                    .icon(() -> new ItemStack(ModBlocks.FULL_GRASS_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FULL_GRASS_BLOCK);
                        entries.add(ModBlocks.FULL_PODZOL_BLOCK);
                        entries.add(ModBlocks.FULL_CRIMSON_NYLIUM_BLOCK);
                        entries.add(ModBlocks.FULL_WARPED_NYLIUM_BLOCK);
                        entries.add(ModBlocks.COBBLED_SANDSTONE);
                        entries.add(ModBlocks.COBBLED_RED_SANDSTONE);
                        entries.add(ModBlocks.FLOWERING_JUNGLE_LEAVES);
                        entries.add(ModItems.DRIPLEAF_PAD);
                        entries.add(ModBlocks.DRIPLEAF_VINE_BLOCK);
                        entries.add(ModBlocks.MANGROVE_ROOT_CLUMP);
                        entries.add(ModBlocks.AZALEA_DROOP_BLOCK);
                        entries.add(ModBlocks.FLOWERING_AZALEA_DROOP_BLOCK);
                        entries.add(ModBlocks.AZALEA_BUSH_BLOCK);
                        entries.add(ModBlocks.FLOWERING_AZALEA_BUSH_BLOCK);
                        entries.add(ModBlocks.UNDERHANG_VINE);
                        entries.add(ModBlocks.NEAT_SMALL_DRIPLEAF);
                        entries.add(ModBlocks.NEAT_FERN);
                        entries.add(ModBlocks.NEAT_LARGE_FERN);
                        entries.add(ModBlocks.BUSH_FERN);
                        entries.add(ModBlocks.NEAT_BUSH_FERN);
                        entries.add(ModBlocks.GRASSY_MOSS_BLOCK);
                        entries.add(ModBlocks.GRASSY_STONE_BLOCK);
                        entries.add(ModBlocks.GRASSY_MOSSY_COBBLESTONE_BLOCK);
                        entries.add(ModBlocks.GRASSY_COBBLESTONE_BLOCK);
                        entries.add(ModBlocks.GRASSY_GRANITE_BLOCK);
                        entries.add(ModBlocks.GRASSY_ANDESITE_BLOCK);
                        entries.add(ModBlocks.GRASSY_DIORITE_BLOCK);
                        entries.add(ModBlocks.GRASSY_DEEPSLATE_BLOCK);
                        entries.add(ModBlocks.GRASSY_CLAY_BLOCK);
                        entries.add(ModBlocks.GRASSY_COARSE_DIRT_BLOCK);
                        entries.add(ModBlocks.GRASSY_PACKED_MUD_BLOCK);
                        entries.add(ModBlocks.GRASSY_MUD_BLOCK);
                        entries.add(ModBlocks.MOSS_GRASS_BLOCK);
                        entries.add(ModBlocks.SHORT_GRASS_BLOCK);
                        entries.add(ModBlocks.SHORT_DIRT_BLOCK);
                        entries.add(ModBlocks.SAND_PATH_BLOCK);
                        entries.add(ModBlocks.SMOOTH_SAND_BLOCK);
                        entries.add(ModBlocks.RED_SAND_PATH_BLOCK);
                        entries.add(ModBlocks.SMOOTH_RED_SAND_BLOCK);
                        entries.add(ModBlocks.GRAVEL_PATH_BLOCK);
                        entries.add(ModBlocks.CLAY_PATH_BLOCK);
                        entries.add(ModBlocks.MUD_PATH_BLOCK);
                        entries.add(ModBlocks.STONE_PATH_BLOCK);
                        entries.add(ModBlocks.STONE_PATH_STAIRS);
                        entries.add(ModBlocks.FLAT_MOSS_CARPET_BLOCK);
                        entries.add(ModBlocks.GRASS_CARPET_BLOCK);
                        entries.add(ModBlocks.DYNAMIC_MOSSY_COBBLESTONE_BLOCK);
                        entries.add(ModBlocks.DYNAMIC_MOSSY_STONE_BRICKS_BLOCK);
                        entries.add(ModBlocks.DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK);
                        entries.add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK);
                        entries.add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_SLAB);
                        entries.add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_WALL);
                        entries.add(ModBlocks.MESSY_BRICKS_BLOCK);
                        entries.add(ModBlocks.NATURAL_ANDESITE_BLOCK);
                        entries.add(ModBlocks.NATURAL_DIORITE_BLOCK);
                        entries.add(ModBlocks.NATURAL_GRANITE_BLOCK);
                        entries.add(ModBlocks.NATURAL_STONE_BLOCK);
                        entries.add(ModBlocks.CRUSHED_DEEPSLATE_BLOCK);
                        entries.add(ModBlocks.CRUSHED_BASALT_BLOCK);
                        entries.add(ModBlocks.CHIPPED_STONE);
                        entries.add(ModBlocks.TOUGH_DIRT_BLOCK);
                        entries.add(ModBlocks.MAGMA_STONE_BLOCK);
                        entries.add(ModBlocks.MAGMA_BLACKSTONE_BLOCK);
                        entries.add(ModBlocks.CRACKED_STONE_BLOCK);
                        entries.add(ModBlocks.DIRECTIONAL_DEEPSLATE_TILES);
                        entries.add(ModBlocks.CRACKED_DIRECTIONAL_DEEPSLATE_TILES);
                        entries.add(ModBlocks.DIRECTIONAL_BRICKS);
                        entries.add(ModBlocks.DIRECTIONAL_QUARTZ_BRICKS);
                        entries.add(ModBlocks.DIRECTIONAL_MUD_BRICKS);
                        entries.add(ModBlocks.PURPUR_JOINT);
                        entries.add(ModBlocks.BEDROCK_DIAMOND_ORE);
                    }).build());
    public static final ItemGroup THRIVING_BLOCKS_MISC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ThrivingBlocksMod.MOD_ID, "thrivingblocksmisc"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.thrivingblocksmisc"))
                    .icon(() -> new ItemStack(ModBlocks.ALERT_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.AZURE_DIMENSIONAL_STONE_BLOCK);
                        entries.add(ModBlocks.RED_DIMENSIONAL_STONE_BLOCK);
                        entries.add(ModBlocks.BLUE_DIMENSIONAL_STONE_BLOCK);
                        entries.add(ModBlocks.ALERT_BLOCK);
                        entries.add(ModBlocks.AMBIENT_CLOCK_BLOCK);
                        entries.add(ModBlocks.GOLDEN_BUTTON);
                        entries.add(ModBlocks.CREEPER_GOLD_BLOCK);
                        entries.add(ModBlocks.GLASS_LAYER);
                        entries.add(ModBlocks.BLACK_GLASS_LAYER);
                        entries.add(ModBlocks.WHITE_GLASS_LAYER);
                        entries.add(ModBlocks.GRAY_GLASS_LAYER);
                        entries.add(ModBlocks.GREEN_GLASS_LAYER);
                        entries.add(ModBlocks.YELLOW_GLASS_LAYER);
                        entries.add(ModBlocks.ORANGE_GLASS_LAYER);
                        entries.add(ModBlocks.RED_GLASS_LAYER);
                        entries.add(ModBlocks.BLUE_GLASS_LAYER);
                        entries.add(ModBlocks.MAGENTA_GLASS_LAYER);
                        entries.add(ModBlocks.PINK_GLASS_LAYER);
                        entries.add(ModBlocks.PURPLE_GLASS_LAYER);
                        entries.add(ModBlocks.BROWN_GLASS_LAYER);
                        entries.add(ModBlocks.LIGHT_GRAY_GLASS_LAYER);
                        entries.add(ModBlocks.LIME_GLASS_LAYER);
                        entries.add(ModBlocks.CYAN_GLASS_LAYER);
                        entries.add(ModBlocks.LIGHT_BLUE_GLASS_LAYER);
                        entries.add(ModBlocks.GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.BLACK_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.WHITE_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.GRAY_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.GREEN_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.YELLOW_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.ORANGE_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.RED_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.BLUE_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.MAGENTA_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.PINK_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.PURPLE_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.BROWN_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.LIGHT_GRAY_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.LIME_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.CYAN_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.LIGHT_BLUE_GLASS_LAYER_CLEAR);
                        entries.add(ModBlocks.CHAIN_STUB);
                    }).build());
    public static final ItemGroup THRIVING_BLOCKS_OLD_TEXTURE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ThrivingBlocksMod.MOD_ID, "thrivingblocksold"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.thrivingblocksold"))
                    .icon(() -> new ItemStack(ModBlocks.OLD_GLOWSTONE_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ROUGH_OBSIDIAN);
                        entries.add(ModBlocks.OLD_GLOWSTONE_BLOCK);
                        entries.add(ModBlocks.COARSE_SAND);
                        entries.add(ModBlocks.ANCIENT_EMERALD_BLOCK);
                        entries.add(ModBlocks.OLD_OAK_LEAVES);
                        entries.add(ModBlocks.OLD_GROWTH_FERN);
                        entries.add(ModBlocks.NEAT_OLD_GROWTH_FERN);
                        entries.add(ModBlocks.OLD_GROWTH_GRASS);
                        entries.add(ModBlocks.SMALL_SHARP_GRASS);
                        entries.add(ModBlocks.TINY_SHARP_GRASS);
                    }).build());
    public static void registerItemGroups() {
        ThrivingBlocksMod.LOGGER.info("Registering Item Groups for " + ThrivingBlocksMod.MOD_ID);
    }
}
