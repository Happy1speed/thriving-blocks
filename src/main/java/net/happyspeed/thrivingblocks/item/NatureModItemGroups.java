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

public class NatureModItemGroups {
    public static final ItemGroup THRIVING_BLOCKS_NATURES_SPIRIT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ThrivingBlocksMod.MOD_ID, "thrivingblocksnaturespirit"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.thrivingblocksnaturespirit"))
                    .icon(() -> new ItemStack(NaturesSpiritModBlocks.PURE_SANDY_SOIL_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(NaturesSpiritModBlocks.COBBLED_PINK_SANDSTONE);
                        entries.add(NaturesSpiritModBlocks.COBBLED_CHERT_BLOCK);
                        entries.add(NaturesSpiritModBlocks.NATURAL_TRAVERTINE_BLOCK);
                        entries.add(NaturesSpiritModBlocks.DIRECTIONAL_TRAVERTINE_TILES);
                        entries.add(NaturesSpiritModBlocks.PURE_SANDY_SOIL_BLOCK);
                        entries.add(NaturesSpiritModBlocks.ROCKY_SANDY_SOIL_BLOCK);
                        entries.add(NaturesSpiritModBlocks.GRASSY_SANDY_SOIL_BLOCK);
                        entries.add(NaturesSpiritModBlocks.GRASSY_PINK_SAND_BLOCK);
                        entries.add(NaturesSpiritModBlocks.GRASSY_PINK_SANDSTONE_BLOCK);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_BLOCK);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_SLAB);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_STAIRS);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_WALL);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_BLOCK);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_STAIRS);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_SLAB);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_WALL);
                        entries.add(NaturesSpiritModBlocks.FLAT_RED_MOSS_CARPET_BLOCK);
                        entries.add(NaturesSpiritModBlocks.RED_MOSS_GRASS_BLOCK);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_SLAB);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_STAIRS);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_WALL);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_SLAB);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_STAIRS);
                        entries.add(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_WALL);
                        entries.add(NaturesSpiritModBlocks.NEAT_LUSH_FERN);
                        entries.add(NaturesSpiritModBlocks.NEAT_LARGE_LUSH_FERN);
                        entries.add(NaturesSpiritModBlocks.NEAT_FLAXEN_FERN);
                        entries.add(NaturesSpiritModBlocks.NEAT_LARGE_FLAXEN_FERN);
                    }).build());
    public static void registerItemGroups() {
        ThrivingBlocksMod.LOGGER.info("Registering Item Groups for " + ThrivingBlocksMod.MOD_ID);
    }
}
