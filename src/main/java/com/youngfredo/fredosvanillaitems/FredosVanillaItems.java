package com.youngfredo.fredosvanillaitems;

import com.youngfredo.fredosvanillaitems.block.ModBlocks;
import com.youngfredo.fredosvanillaitems.item.ModCreativeModeTabs;
import com.youngfredo.fredosvanillaitems.item.ModItems;
import com.youngfredo.fredosvanillaitems.loot.ModLootModifiers;
import net.minecraft.world.item.CreativeModeTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(FredosVanillaItems.MOD_ID)
public class FredosVanillaItems {
    public static final String MOD_ID = "fredosvanillaitems";
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public FredosVanillaItems(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);


        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);


        ModLootModifiers.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ENDERITE_SHARD);
            event.accept(ModItems.ENDERITE);
            event.accept(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.ENDERITE_ORE);
            event.accept(ModBlocks.ENDERITE_BLOCK);
        }

        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.EMERALD_SHOVEL);
            event.accept(ModItems.EMERALD_PICKAXE);
            event.accept(ModItems.EMERALD_AXE);
            event.accept(ModItems.EMERALD_HOE);

            event.accept(ModItems.ENDERITE_SHOVEL);
            event.accept(ModItems.ENDERITE_PICKAXE);
            event.accept(ModItems.ENDERITE_AXE);
            event.accept(ModItems.ENDERITE_HOE);


        }

        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.EMERALD_SWORD);
            event.accept(ModItems.ENDERITE_SWORD);
            event.accept(ModItems.EMERALD_AXE);
            event.accept(ModItems.ENDERITE_AXE);


            event.accept(ModItems.EMERALD_HELMET);
            event.accept(ModItems.EMERALD_CHESTPLATE);
            event.accept(ModItems.EMERALD_LEGGINGS);
            event.accept(ModItems.EMERALD_BOOTS);

            event.accept(ModItems.ENDERITE_HELMET);
            event.accept(ModItems.ENDERITE_CHESTPLATE);
            event.accept(ModItems.ENDERITE_LEGGINGS);
            event.accept(ModItems.ENDERITE_BOOTS);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = FredosVanillaItems.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    static class ClientModEvents {
        @SubscribeEvent
        static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
