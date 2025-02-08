package net.happyspeed.thrivingblocks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.happyspeed.thrivingblocks.block.ModBlocks;
import net.happyspeed.thrivingblocks.block.NaturesSpiritModBlocks;
import net.happyspeed.thrivingblocks.item.ModItems;
import net.happyspeed.thrivingblocks.item.ModItemGroups;
import net.happyspeed.thrivingblocks.item.NatureModItemGroups;
import net.happyspeed.thrivingblocks.sound.ModSounds;
import net.happyspeed.thrivingblocks.util.ExtraUtils;
import net.minecraft.block.Blocks;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class ThrivingBlocksMod implements ModInitializer {
    public static final String MOD_ID = "thrivingblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static boolean NaturesSpiritModLoaded = false;


    @Override
    public void onInitialize() {
        Optional<ModContainer> modContainer = FabricLoader.getInstance().getModContainer(ThrivingBlocksMod.MOD_ID);
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            NaturesSpiritModLoaded = true;
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(ThrivingBlocksMod.MOD_ID, "natures_spirit_compat_recipes"), (ModContainer) modContainer.get(), Text.translatable("pack.thrivingblocks.natures_spirit_compat_text"), ResourcePackActivationType.ALWAYS_ENABLED);
        }
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModSounds.registerSounds();
        ExtraUtils.init();
        if (NaturesSpiritModLoaded) {
            NaturesSpiritModBlocks.registerModBlocks();
            NatureModItemGroups.registerItemGroups();
        }

        ModSounds.registerSounds();

    }
}