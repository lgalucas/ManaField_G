package net.gadiel.manafield.datagen;


import net.gadiel.manafield.setup.Registration;
import net.minecraft.data.DataGenerator;

public class ManaLootTables extends BaseLootTableProvider {

    public ManaLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(Registration.OVERWORLD_AZURE_ORE.get(), createSilkTouchTable("azure", Registration.OVERWORLD_AZURE_ORE.get(), Registration.RAW_AZURE.get(), 1, 3));
        lootTables.put(Registration.NETHERRACK_AZURE_ORE.get(), createSilkTouchTable("azure", Registration.NETHERRACK_AZURE_ORE.get(), Registration.RAW_AZURE.get(), 1, 3));
        lootTables.put(Registration.ENDSTONE_AZURE_ORE.get(), createSilkTouchTable("azure", Registration.ENDSTONE_AZURE_ORE.get(), Registration.RAW_AZURE.get(), 1, 3));
        lootTables.put(Registration.DEEPSLATE_AZURE_ORE.get(), createSilkTouchTable("azure", Registration.DEEPSLATE_AZURE_ORE.get(), Registration.RAW_AZURE.get(), 1, 3));
    }
}
