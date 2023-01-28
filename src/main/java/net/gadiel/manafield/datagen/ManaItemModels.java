package net.gadiel.manafield.datagen;

import net.gadiel.manafield.ManaField;
import net.gadiel.manafield.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ManaItemModels extends ItemModelProvider {

    public ManaItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ManaField.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.OVERWORLD_AZURE_ORE_ITEM.getId().getPath(), modLoc("block/overworld_azure_ore"));
        withExistingParent(Registration.NETHERRACK_AZURE_ORE_ITEM.getId().getPath(), modLoc("block/netherrack_azure_ore"));
        withExistingParent(Registration.ENDSTONE_AZURE_ORE_ITEM.getId().getPath(), modLoc("block/endstone_azure_ore"));
        withExistingParent(Registration.DEEPSLATE_AZURE_ORE_ITEM.getId().getPath(), modLoc("block/deepslate_azure_ore"));

        singleTexture(Registration.RAW_AZURE.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_azure"));
        singleTexture(Registration.AZURE_INGOT.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/azure_ingot"));
    }
}
