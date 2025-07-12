package com.youngfredo.fredosvanillaitems.item;

import com.youngfredo.fredosvanillaitems.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier ENDERITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ENDERITE_TOOL,
            4561,18f, 6f, 32, () -> Ingredient.of(ModItems.ENDERITE));

}
