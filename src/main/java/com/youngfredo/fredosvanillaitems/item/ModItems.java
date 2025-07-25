package com.youngfredo.fredosvanillaitems.item;

import com.youngfredo.fredosvanillaitems.FredosVanillaItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FredosVanillaItems.MOD_ID);

    public static final DeferredItem<Item> ENDERITE = ITEMS.register("enderite",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).fireResistant()));
    public static final DeferredItem<Item> ENDERITE_SHARD = ITEMS.register("enderite_shard",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).fireResistant()));
    public static final DeferredItem<Item> ENDERITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("enderite_upgrade_smithing_template",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.fredosvanillaitems.enderite_upgrade_smithing_template.tooltip"));
                    tooltipComponents.add(Component.translatable("tooltip.fredosvanillaitems.enderite_upgrade_smithing_template.tooltipspace"));
                    tooltipComponents.add(Component.translatable("tooltip.fredosvanillaitems.enderite_upgrade_smithing_template.tooltipapplies"));
                    tooltipComponents.add(Component.translatable("tooltip.fredosvanillaitems.enderite_upgrade_smithing_template.tooltipequipment"));
                    tooltipComponents.add(Component.translatable("tooltip.fredosvanillaitems.enderite_upgrade_smithing_template.tooltipingredients"));
                    tooltipComponents.add(Component.translatable("tooltip.fredosvanillaitems.enderite_upgrade_smithing_template.tooltipmaterial"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));



    public static final DeferredItem<SwordItem> ENDERITE_SWORD = ITEMS.register("enderite_sword",
            () -> new SwordItem(ModToolTiers.ENDERITE, new Item.Properties().fireResistant()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ENDERITE, 5, -2.0f))));
    public static final DeferredItem<PickaxeItem> ENDERITE_PICKAXE = ITEMS.register("enderite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDERITE, new Item.Properties().fireResistant()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ENDERITE, 1.0F, -2.8f))));
    public static final DeferredItem<AxeItem> ENDERITE_AXE = ITEMS.register("enderite_axe",
            () -> new AxeItem(ModToolTiers.ENDERITE, new Item.Properties().fireResistant()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ENDERITE, 7.0F, -3.0f))));
    public static final DeferredItem<ShovelItem> ENDERITE_SHOVEL = ITEMS.register("enderite_shovel",
            () -> new ShovelItem(ModToolTiers.ENDERITE, new Item.Properties().fireResistant()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ENDERITE, 1.5F, -3.0f))));
    public static final DeferredItem<HoeItem> ENDERITE_HOE = ITEMS.register("enderite_hoe",
            () -> new HoeItem(ModToolTiers.ENDERITE, new Item.Properties().fireResistant()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ENDERITE, -3.0F, 0.0f))));

    public static final DeferredItem<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.EMERALD, 3, -2.4f))));
    public static final DeferredItem<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.EMERALD, 1.0F, -2.8f))));
    public static final DeferredItem<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.EMERALD, 5.0F, -3.0f))));
    public static final DeferredItem<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.EMERALD, 1.5F, -3.0f))));
    public static final DeferredItem<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.EMERALD, -3.0F, 0.0f))));

    public static final DeferredItem<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.RUBY, 3, -2.4f))));
    public static final DeferredItem<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.RUBY, 1.0F, -2.8f))));
    public static final DeferredItem<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.RUBY, 5.0F, -3.0f))));
    public static final DeferredItem<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.RUBY, 1.5F, -3.0f))));
    public static final DeferredItem<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModToolTiers.RUBY, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.RUBY, -3.0F, 0.0f))));


    public static final DeferredItem<ArmorItem> ENDERITE_HELMET = ITEMS.register("enderite_helmet",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(55))));
    public static final DeferredItem<ArmorItem> ENDERITE_CHESTPLATE = ITEMS.register("enderite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(55))));
    public static final DeferredItem<ArmorItem> ENDERITE_LEGGINGS = ITEMS.register("enderite_leggings",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(55))));
    public static final DeferredItem<ArmorItem> ENDERITE_BOOTS = ITEMS.register("enderite_boots",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(55))));

    public static final DeferredItem<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(24))));
    public static final DeferredItem<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(24))));
    public static final DeferredItem<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(24))));
    public static final DeferredItem<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(24))));

    public static final DeferredItem<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(29))));
    public static final DeferredItem<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(29))));
    public static final DeferredItem<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(29))));
    public static final DeferredItem<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(29))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
