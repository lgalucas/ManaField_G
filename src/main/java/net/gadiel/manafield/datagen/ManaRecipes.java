package net.gadiel.manafield.datagen;

import net.gadiel.manafield.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class ManaRecipes extends RecipeProvider {

    public ManaRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.ORES_AZURE_ITEM),
                        Registration.AZURE_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ore", has(Registration.ORES_AZURE_ITEM))
                .save(consumer, "azure_ingot1");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_AZURE.get()),
                        Registration.AZURE_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_raw_ore", has(Registration.RAW_AZURE.get()))
                .save(consumer, "azure_ingot2");
    }
}
