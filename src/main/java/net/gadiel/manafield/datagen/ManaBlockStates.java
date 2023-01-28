package net.gadiel.manafield.datagen;

import net.gadiel.manafield.ManaField;
import net.gadiel.manafield.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ManaBlockStates extends BlockStateProvider {

    public ManaBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, ManaField.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.OVERWORLD_AZURE_ORE.get());
        simpleBlock(Registration.NETHERRACK_AZURE_ORE.get());
        simpleBlock(Registration.ENDSTONE_AZURE_ORE.get());
        simpleBlock(Registration.DEEPSLATE_AZURE_ORE.get());
    }
}
