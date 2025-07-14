package com.youngfredo.fredosvanillaitems.item;

import com.youngfredo.fredosvanillaitems.FredosVanillaItems;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FredosVanillaItems.MOD_ID);

    public static final DeferredItem<Item> ENDERITE = ITEMS.register("enderite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENDERITE_SHARD = ITEMS.register("enderite_shard",
            () -> new Item(new Item.Properties()));





    public static final DeferredItem<SwordItem> ENDERITE_SWORD = ITEMS.register("enderite_sword",
            () -> new SwordItem(ModToolTiers.ENDERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ENDERITE, 5, -2.0f))));
    public static final DeferredItem<PickaxeItem> ENDERITE_PICKAXE = ITEMS.register("enderite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ENDERITE, 1.0F, -2.8f))));
    public static final DeferredItem<AxeItem> ENDERITE_AXE = ITEMS.register("enderite_axe",
            () -> new AxeItem(ModToolTiers.ENDERITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ENDERITE, 7.0F, -3.0f))));
    public static final DeferredItem<ShovelItem> ENDERITE_SHOVEL = ITEMS.register("enderite_shovel",
            () -> new ShovelItem(ModToolTiers.ENDERITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ENDERITE, 1.5F, -3.0f))));
    public static final DeferredItem<HoeItem> ENDERITE_HOE = ITEMS.register("enderite_hoe",
            () -> new HoeItem(ModToolTiers.ENDERITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ENDERITE, -3.0F, 0.0f))));


    public static final DeferredItem<ArmorItem> ENDERITE_HELMET = ITEMS.register("enderite_helmet",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(55))));
    public static final DeferredItem<ArmorItem> ENDERITE_CHESTPLATE = ITEMS.register("enderite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(55))));
    public static final DeferredItem<ArmorItem> ENDERITE_LEGGINGS = ITEMS.register("enderite_leggings",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(55))));
    public static final DeferredItem<ArmorItem> ENDERITE_BOOTS = ITEMS.register("enderite_boots",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(55))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
