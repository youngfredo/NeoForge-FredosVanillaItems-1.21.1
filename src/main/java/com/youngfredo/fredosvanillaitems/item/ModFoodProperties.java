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
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 4800),1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 4800), 1.0f)
            .build();

    public static final FoodProperties ENCHANTED_EMERALD_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 4800),1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 4800), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 6000, 1), 1.0f)
            .build();
}
