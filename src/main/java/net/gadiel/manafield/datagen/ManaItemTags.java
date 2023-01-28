package net.gadiel.manafield.datagen;

import net.gadiel.manafield.ManaField;
import net.gadiel.manafield.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ManaItemTags extends ItemTagsProvider {

        public ManaItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
            super(generator, blockTags, ManaField.MODID, helper);
        }

        @Override
        protected void addTags() {
            tag(Tags.Items.ORES)
                    .add(Registration.OVERWORLD_AZURE_ORE_ITEM.get())
                    .add(Registration.NETHERRACK_AZURE_ORE_ITEM.get())
                    .add(Registration.ENDSTONE_AZURE_ORE_ITEM.get())
                    .add(Registration.DEEPSLATE_AZURE_ORE_ITEM.get());
        }

        @Override
        public String getName() {
            return "ManaField Tags";
        }
}
