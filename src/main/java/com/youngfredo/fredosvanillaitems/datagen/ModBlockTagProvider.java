package com.youngfredo.fredosvanillaitems.datagen;

import com.youngfredo.fredosvanillaitems.FredosVanillaItems;
import com.youngfredo.fredosvanillaitems.block.ModBlocks;
import com.youngfredo.fredosvanillaitems.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FredosVanillaItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ENDERITE_BLOCK.get())
                .add(ModBlocks.ENDERITE_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.RUBY_ORE.get());


        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ENDERITE_ORE.get());

        tag(ModTags.Blocks.NEEDS_ENDERITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_ENDERITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(ModTags.Blocks.NEEDS_ENDERITE_TOOL);

        tag(ModTags.Blocks.NEEDS_EMERALD_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_EMERALD_TOOL);

        tag(ModTags.Blocks.NEEDS_RUBY_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_RUBY_TOOL);

        tag(ModTags.Blocks.NEEDS_COPPER_TOOL)
                .addTag(BlockTags.NEEDS_STONE_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .remove(ModTags.Blocks.NEEDS_COPPER_TOOL);
    }
}
