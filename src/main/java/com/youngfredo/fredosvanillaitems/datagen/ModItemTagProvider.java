package com.youngfredo.fredosvanillaitems.datagen;

import com.youngfredo.fredosvanillaitems.FredosVanillaItems;
import com.youngfredo.fredosvanillaitems.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, FredosVanillaItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS)
                .add(ModItems.ENDERITE_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.ENDERITE_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.ENDERITE_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.ENDERITE_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.ENDERITE_HOE.get());
        tag(ItemTags.SWORDS)
                .add(ModItems.EMERALD_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.EMERALD_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.EMERALD_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.EMERALD_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.EMERALD_HOE.get());
        tag(ItemTags.SWORDS)
                .add(ModItems.RUBY_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.RUBY_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.RUBY_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.RUBY_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ENDERITE_HELMET.get())
                .add(ModItems.ENDERITE_CHESTPLATE.get())
                .add(ModItems.ENDERITE_LEGGINGS.get())
                .add(ModItems.ENDERITE_BOOTS.get())
                .add(ModItems.EMERALD_HELMET.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.EMERALD_BOOTS.get())
                .add(ModItems.RUBY_HELMET.get())
                .add(ModItems.RUBY_CHESTPLATE.get())
                .add(ModItems.RUBY_LEGGINGS.get())
                .add(ModItems.RUBY_BOOTS.get());

    }
}
