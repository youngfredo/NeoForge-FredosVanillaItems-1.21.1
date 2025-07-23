package com.youngfredo.fredosvanillaitems.item;

import com.youngfredo.fredosvanillaitems.util.ModTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier ENDERITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ENDERITE_TOOL,
            4561,32f, 6f, 30, () -> Ingredient.of(ModItems.ENDERITE));
    public static final Tier EMERALD = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL,
            500,7f, 2.5f, 18, () -> Ingredient.of(Items.EMERALD));
    public static final Tier RUBY = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL,
            1040,7.5f, 2.75f, 18, () -> Ingredient.of(ModItems.RUBY));
    //public static final Tier COPPER = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL,
    //        500,7f, 2.5f, 18, () -> Ingredient.of(Items.COPPER_INGOT));
}
