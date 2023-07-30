package net.lewmc.lewmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.lewmc.lewmod.block.ModBlocks;
import net.lewmc.lewmod.item.ModItems;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(Items.LEATHER), ModItems.HARDENED_LEATHER,
                1.5f, 200, "hardened_leather");

        offerReversibleCompactingRecipes(exporter, ModItems.ARCANE_SHARD, ModBlocks.ARCANE_BLOCK);

        ShapedRecipeJsonBuilder.create(ModItems.SHINY_COIN)
                .pattern(" # ")
                .pattern("#C#")
                .pattern(" # ")
                .input('C', Items.COPPER_INGOT)
                .input('#', Items.GOLD_NUGGET)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion(RecipeProvider.hasItem(Items.GOLD_NUGGET),
                        RecipeProvider.conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.SHINY_COIN)));

        ShapelessRecipeJsonBuilder.create(ModItems.SHADED_LEATHER)
                .input(Items.BLACK_DYE)
                .input(Items.LEATHER)
                .criterion(RecipeProvider.hasItem(Items.BLACK_DYE),
                        RecipeProvider.conditionsFromItem(Items.BLACK_DYE))
                .criterion(RecipeProvider.hasItem(Items.LEATHER),
                        RecipeProvider.conditionsFromItem(Items.LEATHER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.SHADED_LEATHER)));

    }
}
