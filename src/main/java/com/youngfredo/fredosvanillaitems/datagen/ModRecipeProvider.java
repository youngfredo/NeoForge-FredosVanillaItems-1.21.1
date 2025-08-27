package com.youngfredo.fredosvanillaitems.datagen;

import com.youngfredo.fredosvanillaitems.FredosVanillaItems;
import com.youngfredo.fredosvanillaitems.block.ModBlocks;
import com.youngfredo.fredosvanillaitems.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        trimSmithing(recipeOutput, ModItems.YOUNGFREDO_SMITHING_TEMPLATE.get(), ResourceLocation.fromNamespaceAndPath(FredosVanillaItems.MOD_ID, "youngfredo"));

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

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_SWORD.get())
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" # ")
                .define('S', Items.EMERALD)
                .define('#', Items.STICK)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_PICKAXE.get())
                .pattern("SSS")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', Items.EMERALD)
                .define('#', Items.STICK)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_AXE.get())
                .pattern("SS ")
                .pattern("S# ")
                .pattern(" # ")
                .define('S', Items.EMERALD)
                .define('#', Items.STICK)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_SHOVEL.get())
                .pattern(" S ")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', Items.EMERALD)
                .define('#', Items.STICK)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_HOE.get())
                .pattern("SS ")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', Items.EMERALD)
                .define('#', Items.STICK)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', Items.EMERALD)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.EMERALD)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', Items.EMERALD)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .pattern("   ")
                .define('S', Items.EMERALD)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.RUBY_SWORD.get())
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" # ")
                .define('S', ModItems.RUBY.get())
                .define('#', Items.STICK)
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE.get())
                .pattern("SSS")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', ModItems.RUBY.get())
                .define('#', Items.STICK)
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_AXE.get())
                .pattern("SS ")
                .pattern("S# ")
                .pattern(" # ")
                .define('S', ModItems.RUBY.get())
                .define('#', Items.STICK)
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL.get())
                .pattern(" S ")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', ModItems.RUBY.get())
                .define('#', Items.STICK)
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.RUBY_HOE.get())
                .pattern("SS ")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', ModItems.RUBY.get())
                .define('#', Items.STICK)
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.RUBY_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', ModItems.RUBY.get())
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.RUBY_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.RUBY.get())
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.RUBY_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.RUBY.get())
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.RUBY_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .pattern("   ")
                .define('S', ModItems.RUBY.get())
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.RUBY.get())
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9)
                .requires(ModBlocks.RUBY_BLOCK)
                .unlockedBy("has_ruby_block", has(ModBlocks.RUBY_BLOCK))
                .save(recipeOutput, "fredosvanillaitems:ruby_from_ruby_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_SWORD.get())
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" # ")
                .define('S', Items.COPPER_INGOT)
                .define('#', Items.STICK)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE.get())
                .pattern("SSS")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', Items.COPPER_INGOT)
                .define('#', Items.STICK)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_AXE.get())
                .pattern("SS ")
                .pattern("S# ")
                .pattern(" # ")
                .define('S', Items.COPPER_INGOT)
                .define('#', Items.STICK)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL.get())
                .pattern(" S ")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', Items.COPPER_INGOT)
                .define('#', Items.STICK)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_HOE.get())
                .pattern("SS ")
                .pattern(" # ")
                .pattern(" # ")
                .define('S', Items.COPPER_INGOT)
                .define('#', Items.STICK)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .pattern("   ")
                .define('S', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.EMERALD_APPLE.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('A', Items.APPLE)
                .define('S', Items.EMERALD)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_EMERALD_APPLE.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('A', Items.APPLE)
                .define('S', Items.EMERALD_BLOCK)
                .unlockedBy("has_emerald_block", has(Items.EMERALD_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.RUBY_APPLE.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('A', Items.APPLE)
                .define('S', ModItems.RUBY.get())
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ENCHANTED_RUBY_APPLE.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('A', Items.APPLE)
                .define('S', ModBlocks.RUBY_BLOCK.get())
                .unlockedBy("has_ruby_block", has(ModBlocks.RUBY_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('A', Items.APPLE)
                .define('S', Items.GOLD_BLOCK)
                .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_HORSE_ARMOR.get())
                .pattern("C C")
                .pattern("CCC")
                .pattern("C C")
                .define('C', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.IRON_HORSE_ARMOR)
                .pattern("S S")
                .pattern("SSS")
                .pattern("S S")
                .define('S', Items.IRON_INGOT)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.GOLDEN_HORSE_ARMOR)
                .pattern("S S")
                .pattern("SSS")
                .pattern("S S")
                .define('S', Items.GOLD_INGOT)
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_HORSE_ARMOR.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("S S")
                .define('S', Items.EMERALD)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.RUBY_HORSE_ARMOR.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.RUBY.get())
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Items.DIAMOND_HORSE_ARMOR)
                .pattern("S S")
                .pattern("SSS")
                .pattern("S S")
                .define('S', Items.DIAMOND)
                .unlockedBy("has_diamond", has(Items.DIAMOND)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.NETHERITE_HORSE_ARMOR.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("S S")
                .define('S', Items.NETHERITE_INGOT)
                .unlockedBy("has_netherite_ingot", has(Items.NETHERITE_INGOT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.ENDERITE_HORSE_ARMOR.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.ENDERITE.get())
                .unlockedBy("has_enderite", has(ModItems.ENDERITE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.YOUNGFREDO_SMITHING_TEMPLATE.get(), 2)
                .pattern("#S#")
                .pattern("#C#")
                .pattern("###")
                .define('#', Items.DIAMOND)
                .define('S', ModItems.YOUNGFREDO_SMITHING_TEMPLATE.get())
                .define('C', Items.COBBLED_DEEPSLATE)
                .unlockedBy("has_youngfredo_armor_trim_smithing_template", has(ModItems.YOUNGFREDO_SMITHING_TEMPLATE)).save(recipeOutput);
    }
}
