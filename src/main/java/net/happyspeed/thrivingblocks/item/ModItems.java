package net.happyspeed.thrivingblocks.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.happyspeed.thrivingblocks.ThrivingBlocksMod;
import net.happyspeed.thrivingblocks.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item DRIPLEAF_PAD = registerItem("dripleaf_pad", new PlaceableOnWaterItem(ModBlocks.DRIPLEAF_PAD, new Item.Settings()));

    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ThrivingBlocksMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ThrivingBlocksMod.LOGGER.info("Registering Mod Items for " + ThrivingBlocksMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
