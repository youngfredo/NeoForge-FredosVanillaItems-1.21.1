package com.youngfredo.fredosvanillaitems.datagen;

import com.youngfredo.fredosvanillaitems.block.ModBlocks;
import com.youngfredo.fredosvanillaitems.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENDERITE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.ENDERITE.get())
                .unlockedBy("has_enderite", has(ModItems.ENDERITE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE.get())
                .pattern("CCC")
                .pattern("C#B")
                .pattern("BBB")
                .define('B', ModItems.ENDERITE_SHARD.get())
                .define('C', Items.ECHO_SHARD)
                .define('#', Items.ENDER_EYE)
                .unlockedBy("has_enderite_shard", has(ModItems.ENDERITE_SHARD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("#S#")
                .pattern("#C#")
                .pattern("###")
                .define('#', Items.DIAMOND)
                .define('S', ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get())
                .define('C', Items.END_STONE)
                .unlockedBy("has_enderite_upgrade_smithing_template", has(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENDERITE.get(), 9)
                .requires(ModBlocks.ENDERITE_BLOCK)
                .unlockedBy("has_enderite_block", has(ModBlocks.ENDERITE_BLOCK))
                .save(recipeOutput, "fredosvanillaitems:enderite_from_enderite_block");

    }
}
