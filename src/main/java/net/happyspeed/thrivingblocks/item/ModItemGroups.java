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
                        entries.add(ModBlocks.COBBLED_SANDSTONE);
                        entries.add(ModBlocks.FULL_PODZOL_BLOCK);
                        entries.add(ModBlocks.OLD_OAK_LEAVES);
                        entries.add(ModBlocks.FLOWERING_JUNGLE_LEAVES);
                        entries.add(ModBlocks.GRASSY_MOSS_BLOCK);
                        entries.add(ModBlocks.GRASSY_STONE_BLOCK);
                        entries.add(ModBlocks.GRASSY_GRANITE_BLOCK);
                        entries.add(ModBlocks.GRASSY_ANDESITE_BLOCK);
                        entries.add(ModBlocks.GRASSY_DIORITE_BLOCK);
                        entries.add(ModBlocks.GRASSY_DEEPSLATE_BLOCK);
                        entries.add(ModBlocks.GRASSY_CLAY_BLOCK);
                        entries.add(ModBlocks.GRASSY_COARSE_DIRT_BLOCK);
                        entries.add(ModBlocks.GRASSY_MUD_BLOCK);
                        entries.add(ModBlocks.SHORT_GRASS_BLOCK);
                        entries.add(ModBlocks.SAND_PATH_BLOCK);
                        entries.add(ModBlocks.SMOOTH_SAND_BLOCK);
                        entries.add(ModBlocks.SHORT_DIRT_BLOCK);
                        entries.add(ModBlocks.GRASSY_MOSSY_COBBLESTONE_BLOCK);
                        entries.add(ModBlocks.GRASS_CARPET_BLOCK);
                        entries.add(ModBlocks.ROUGH_OBSIDIAN);
                        entries.add(ModBlocks.COARSE_SAND);
                        entries.add(ModBlocks.OLD_GROWTH_FERN);
                        entries.add(ModBlocks.OLD_GROWTH_GRASS);
                        entries.add(ModBlocks.STONE_PATH_BLOCK);
                        entries.add(ModBlocks.STONE_PATH_STAIRS);
                        entries.add(ModBlocks.FLAT_MOSS_CARPET_BLOCK);
                        entries.add(ModBlocks.OLD_GLOWSTONE_BLOCK);
                        entries.add(ModBlocks.ANCIENT_EMERALD_BLOCK);
                        entries.add(ModBlocks.DYNAMIC_MOSSY_COBBLESTONE_BLOCK);
                        entries.add(ModBlocks.DYNAMIC_MOSSY_STONE_BRICKS_BLOCK);
                        entries.add(ModBlocks.DYNAMIC_CRACKED_MOSSY_STONE_BRICKS_BLOCK);
                        entries.add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK);
                        entries.add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_SLAB);
                        entries.add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_WALL);
                        entries.add(ModBlocks.AZURE_DIMENSIONAL_STONE_BLOCK);
                        entries.add(ModBlocks.RED_DIMENSIONAL_STONE_BLOCK);
                        entries.add(ModBlocks.BLUE_DIMENSIONAL_STONE_BLOCK);
                        entries.add(ModBlocks.GOLDEN_BUTTON);
                        entries.add(ModBlocks.MESSY_BRICKS_BLOCK);
                        entries.add(ModBlocks.NATURAL_ANDESITE_BLOCK);
                        entries.add(ModBlocks.NATURAL_DIORITE_BLOCK);
                        entries.add(ModBlocks.NATURAL_GRANITE_BLOCK);
                        entries.add(ModBlocks.NATURAL_STONE_BLOCK);
                        entries.add(ModBlocks.CRUSHED_DEEPSLATE_BLOCK);
                        entries.add(ModBlocks.CRUSHED_BASALT_BLOCK);
                        entries.add(ModBlocks.CRACKED_STONE_BLOCK);
                        entries.add(ModBlocks.MAGMA_STONE_BLOCK);
                        entries.add(ModBlocks.MOSS_GRASS_BLOCK);
                    }).build());
    public static void registerItemGroups() {
        ThrivingBlocksMod.LOGGER.info("Registering Item Groups for " + ThrivingBlocksMod.MOD_ID);
    }
}
