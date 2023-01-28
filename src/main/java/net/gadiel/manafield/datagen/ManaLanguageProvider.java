package net.gadiel.manafield.datagen;

import net.gadiel.manafield.ManaField;
import net.gadiel.manafield.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static net.gadiel.manafield.setup.ModSetup.TAB_NAME;

public class ManaLanguageProvider extends LanguageProvider {

    public ManaLanguageProvider(DataGenerator gen, String locale) {
        super(gen, ManaField.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "ManaField");
        add(Registration.OVERWORLD_AZURE_ORE.get(), "Azure Ore");
        add(Registration.NETHERRACK_AZURE_ORE.get(), "Netherrack Azure Ore");
        add(Registration.ENDSTONE_AZURE_ORE.get(), "Endstone Azure Ore");
        add(Registration.DEEPSLATE_AZURE_ORE.get(), "DeepSlate Azure Ore");
        add(Registration.RAW_AZURE.get(), "Raw Azure");
        add(Registration.AZURE_INGOT.get(), "Azure Ingot");
    }

}
