package com.youngfredo.fredosvanillaitems.datagen;

import com.youngfredo.fredosvanillaitems.block.ModBlocks;
import com.youngfredo.fredosvanillaitems.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_SWORD.get())
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" C ")
                .define('B', ModItems.ENDERITE.get())
                .define('C', Items.STICK)
                .unlockedBy("has_enderite", has(ModItems.ENDERITE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_PICKAXE.get())
                .pattern("BBB")
                .pattern(" C ")
                .pattern(" C ")
                .define('B', ModItems.ENDERITE.get())
                .define('C', Items.STICK)
                .unlockedBy("has_enderite", has(ModItems.ENDERITE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_AXE.get())
                .pattern("BB ")
                .pattern("BC ")
                .pattern(" C ")
                .define('B', ModItems.ENDERITE.get())
                .define('C', Items.STICK)
                .unlockedBy("has_enderite", has(ModItems.ENDERITE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_SHOVEL.get())
                .pattern(" B ")
                .pattern(" C ")
                .pattern(" C ")
                .define('B', ModItems.ENDERITE.get())
                .define('C', Items.STICK)
                .unlockedBy("has_enderite", has(ModItems.ENDERITE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_HOE.get())
                .pattern("BB ")
                .pattern(" C ")
                .pattern(" C ")
                .define('B', ModItems.ENDERITE.get())
                .define('C', Items.STICK)
                .unlockedBy("has_enderite", has(ModItems.ENDERITE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENDERITE.get(), 9)
                .requires(ModBlocks.ENDERITE_BLOCK)
                .unlockedBy("has_enderite_block", has(ModBlocks.ENDERITE_BLOCK))
                .save(recipeOutput, "fredosvanillaitems:enderite_from_enderite_block");
    }
}
