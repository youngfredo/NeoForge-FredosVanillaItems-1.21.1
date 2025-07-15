package com.youngfredo.fredosvanillaitems.worldgen;

import com.youngfredo.fredosvanillaitems.FredosVanillaItems;
import com.youngfredo.fredosvanillaitems.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ENDERITE_ORE_LARGE_KEY = registerKey("end_enderite_ore_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ENDERITE_ORE_SMALL_KEY = registerKey("end_enderite_ore_small");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        register(context, END_ENDERITE_ORE_LARGE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.ENDERITE_ORE.get().defaultBlockState(), 3));
        register(context, END_ENDERITE_ORE_SMALL_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.ENDERITE_ORE.get().defaultBlockState(), 2));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(FredosVanillaItems.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
