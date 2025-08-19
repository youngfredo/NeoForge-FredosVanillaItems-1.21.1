package com.youngfredo.fredosvanillaitems.trim;

import com.youngfredo.fredosvanillaitems.FredosVanillaItems;
import com.youngfredo.fredosvanillaitems.item.ModItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class ModTrimMaterials {
    public static final ResourceKey<TrimMaterial> RUBY =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(FredosVanillaItems.MOD_ID, "ruby"));
    public static final ResourceKey<TrimMaterial> ENDERITE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(FredosVanillaItems.MOD_ID, "enderite"));



    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, RUBY, ModItems.RUBY.get(), Style.EMPTY.withColor(TextColor.parseColor("#d31d36").getOrThrow()), 0.4F);
        register(context, ENDERITE, ModItems.ENDERITE.get(), Style.EMPTY.withColor(TextColor.parseColor("#2a2042").getOrThrow()), 1.0F);
    }





    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item,
                                 Style style, float itemModelIndex) {
        TrimMaterial trimmaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModelIndex,
                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style), Map.of());
        context.register(trimKey, trimmaterial);
    }
}
