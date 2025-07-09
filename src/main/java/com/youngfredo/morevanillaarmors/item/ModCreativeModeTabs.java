package com.youngfredo.morevanillaarmors.item;

import com.youngfredo.morevanillaarmors.MoreVanillaArmors;
import com.youngfredo.morevanillaarmors.block.ModBlocks;
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
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreVanillaArmors.MOD_ID);

    public static final Supplier<CreativeModeTab> ENDERITE_ITEMS_TAB = CREATIVE_MODE_TAB.register("enderite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDERITE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MoreVanillaArmors.MOD_ID, "emerald_items_tab"))
                    .title(Component.translatable("creativetab.morevanillaarmors.enderite_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.ENDERITE_SHARD);
                        output.accept(ModItems.ENDERITE);

                    }).build());

    public static final Supplier<CreativeModeTab> ENDERITE_BLOCK_TAB = CREATIVE_MODE_TAB.register("enderite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ENDERITE_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MoreVanillaArmors.MOD_ID, "enderite_items_tab"))
                    .title(Component.translatable("creativetab.morevanillaarmors.enderite_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.ENDERITE_ORE);
                        output.accept(ModBlocks.ENDERITE_BLOCK);

                    }).build());


    public static void  register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
