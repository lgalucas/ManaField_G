package net.gadiel.manafield.datagen;

import net.gadiel.manafield.ManaField;
import net.gadiel.manafield.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ManaBlockTags extends BlockTagsProvider{
    public ManaBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, ManaField.MODID, helper);
    }
    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.OVERWORLD_AZURE_ORE.get())
                .add(Registration.NETHERRACK_AZURE_ORE.get())
                .add(Registration.ENDSTONE_AZURE_ORE.get())
                .add(Registration.DEEPSLATE_AZURE_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.OVERWORLD_AZURE_ORE.get())
                .add(Registration.NETHERRACK_AZURE_ORE.get())
                .add(Registration.ENDSTONE_AZURE_ORE.get())
                .add(Registration.DEEPSLATE_AZURE_ORE.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.OVERWORLD_AZURE_ORE.get())
                .add(Registration.NETHERRACK_AZURE_ORE.get())
                .add(Registration.ENDSTONE_AZURE_ORE.get())
                .add(Registration.DEEPSLATE_AZURE_ORE.get());
    }

    @Override
    public String getName() {
        return "ManaField Tags";
    }
}
