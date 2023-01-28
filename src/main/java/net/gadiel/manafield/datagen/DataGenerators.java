package net.gadiel.manafield.datagen;

import net.gadiel.manafield.ManaField;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = ManaField.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new ManaRecipes(generator));
            generator.addProvider(new ManaLootTables(generator));
            ManaBlockTags blockTags = new ManaBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new ManaItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new ManaBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new ManaItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new ManaLanguageProvider(generator, "en_us"));
        }
    }

}
