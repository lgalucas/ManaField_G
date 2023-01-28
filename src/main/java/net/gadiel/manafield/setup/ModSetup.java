package net.gadiel.manafield.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {
    public static final String TAB_NAME = "ManaField";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public net.minecraft.world.item.ItemStack makeIcon() {
            return new net.minecraft.world.item.ItemStack(Items.EMERALD);
        }
    };

    public static void init(FMLCommonSetupEvent event) {

    }
}
