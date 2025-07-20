package com.youngfredo.fredosvanillaitems.item;

import com.youngfredo.fredosvanillaitems.FredosVanillaItems;
import com.youngfredo.fredosvanillaitems.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FredosVanillaItems.MOD_ID);

    public static final Supplier<CreativeModeTab> EMERALD_ITEMS_TAB = CREATIVE_MODE_TAB.register("emerald_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.EMERALD))
                    .title(Component.translatable("creativetab.fredosvanillaitems.emerald_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.EMERALD_SWORD);
                        output.accept(ModItems.EMERALD_PICKAXE);
                        output.accept(ModItems.EMERALD_AXE);
                        output.accept(ModItems.EMERALD_SHOVEL);
                        output.accept(ModItems.EMERALD_HOE);

                        output.accept(ModItems.EMERALD_HELMET);
                        output.accept(ModItems.EMERALD_CHESTPLATE);
                        output.accept(ModItems.EMERALD_LEGGINGS);
                        output.accept(ModItems.EMERALD_BOOTS);

                    }).build());

    public static final Supplier<CreativeModeTab> ENDERITE_ITEMS_TAB = CREATIVE_MODE_TAB.register("enderite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDERITE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FredosVanillaItems.MOD_ID, "emerald_items_tab"))
                    .title(Component.translatable("creativetab.fredosvanillaitems.enderite_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.ENDERITE_SWORD);
                        output.accept(ModItems.ENDERITE_PICKAXE);
                        output.accept(ModItems.ENDERITE_AXE);
                        output.accept(ModItems.ENDERITE_SHOVEL);
                        output.accept(ModItems.ENDERITE_HOE);

                        output.accept(ModItems.ENDERITE_HELMET);
                        output.accept(ModItems.ENDERITE_CHESTPLATE);
                        output.accept(ModItems.ENDERITE_LEGGINGS);
                        output.accept(ModItems.ENDERITE_BOOTS);

                        output.accept(ModItems.ENDERITE_SHARD);
                        output.accept(ModItems.ENDERITE);
                        output.accept(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE);


                    }).build());

    public static final Supplier<CreativeModeTab> ENDERITE_BLOCK_TAB = CREATIVE_MODE_TAB.register("enderite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ENDERITE_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FredosVanillaItems.MOD_ID, "enderite_items_tab"))
                    .title(Component.translatable("creativetab.fredosvanillaitems.enderite_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.ENDERITE_ORE);
                        output.accept(ModBlocks.ENDERITE_BLOCK);

                    }).build());


    public static void  register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
