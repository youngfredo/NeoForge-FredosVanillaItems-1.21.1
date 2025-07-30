package com.youngfredo.fredosvanillaitems.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties RUBY_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400),1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 2400), 1.0f)
            .build();

    public static final FoodProperties ENCHANTED_RUBY_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 1),1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 1), 1.0f)
            .build();

    public static final FoodProperties EMERALD_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 24000),1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 18000), 1.0f)
            .build();

    public static final FoodProperties ENCHANTED_EMERALD_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 48000, 2),1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 36000), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 18000, 4), 1.0f)
            .build();
}
