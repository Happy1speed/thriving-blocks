package net.happyspeed.thrivingblocks.util;

import net.happyspeed.thrivingblocks.ThrivingBlocksMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> SHORT_SMALL_DRIPLEAF_PLACEABLE =
                createTag("short_small_dripleaf_placeable");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(ThrivingBlocksMod.MOD_ID, name));
        }
    }
    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(ThrivingBlocksMod.MOD_ID, name));
        }
    }
}
