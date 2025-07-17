package com.youngfredo.fredosvanillaitems.worldgen;

import com.youngfredo.fredosvanillaitems.FredosVanillaItems;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> END_ENDERITE_ORE_LARGE_PLACED_KEY = registerKey("end_enderite_ore_large_placed");
    public static final ResourceKey<PlacedFeature> END_ENDERITE_ORE_SMALL_PLACED_KEY = registerKey("end_enderite_ore_small_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, END_ENDERITE_ORE_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_ENDERITE_ORE_LARGE_KEY),
                ModOrePlacement.rareOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(10),VerticalAnchor.absolute(72))));
        register(context, END_ENDERITE_ORE_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_ENDERITE_ORE_SMALL_KEY),
                ModOrePlacement.commonOrePlacement(24, HeightRangePlacement.uniform(VerticalAnchor.absolute(10),VerticalAnchor.absolute(72))));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(FredosVanillaItems.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
