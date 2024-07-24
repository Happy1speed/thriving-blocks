package net.happyspeed.thrivingblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.happyspeed.thrivingblocks.block.ModBlocks;
import net.happyspeed.thrivingblocks.block.NaturesSpiritModBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool crackedMossyStoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_BLOCK);

        crackedMossyStoneBricksPool.stairs(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_STAIRS);
        crackedMossyStoneBricksPool.slab(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_SLAB);
        crackedMossyStoneBricksPool.wall(ModBlocks.CRACKED_MOSSY_STONE_BRICKS_WALL);

//        BlockStateModelGenerator.BlockTexturePool redMossyTravertineBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_BLOCK);
//        BlockStateModelGenerator.BlockTexturePool redMossyCobbledTravertinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_BLOCK);
//        BlockStateModelGenerator.BlockTexturePool redMossyCobblestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_BLOCK);
//        BlockStateModelGenerator.BlockTexturePool redMossyStoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_BLOCK);
//
//        redMossyTravertineBricksPool.stairs(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_STAIRS);
//        redMossyTravertineBricksPool.slab(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_SLAB);
//        redMossyTravertineBricksPool.wall(NaturesSpiritModBlocks.RED_MOSSY_TRAVERTINE_BRICKS_WALL);
//
//        redMossyCobbledTravertinePool.stairs(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_STAIRS);
//        redMossyCobbledTravertinePool.slab(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_SLAB);
//        redMossyCobbledTravertinePool.wall(NaturesSpiritModBlocks.RED_MOSSY_COBBLED_TRAVERTINE_WALL);
//
//        redMossyStoneBricksPool.stairs(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_STAIRS);
//        redMossyStoneBricksPool.slab(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_SLAB);
//        redMossyStoneBricksPool.wall(NaturesSpiritModBlocks.RED_MOSSY_STONE_BRICKS_WALL);
//
//        redMossyCobblestonePool.slab(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_SLAB);
//        redMossyCobblestonePool.stairs(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_STAIRS);
//        redMossyCobblestonePool.wall(NaturesSpiritModBlocks.RED_MOSSY_COBBLESTONE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
