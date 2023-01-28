package net.gadiel.manafield.setup;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.gadiel.manafield.ManaField.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    // Some common properties for our blocks and items
    public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);


    public static final RegistryObject<Block> OVERWORLD_AZURE_ORE = BLOCKS.register("overworld_azure_ore", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> OVERWORLD_AZURE_ORE_ITEM = fromBlock(OVERWORLD_AZURE_ORE);
    public static final RegistryObject<Block> NETHERRACK_AZURE_ORE = BLOCKS.register("netherrack_azure_ore", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> NETHERRACK_AZURE_ORE_ITEM = fromBlock(NETHERRACK_AZURE_ORE);
    public static final RegistryObject<Block> ENDSTONE_AZURE_ORE = BLOCKS.register("endstone_azure_ore", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> ENDSTONE_AZURE_ORE_ITEM = fromBlock(ENDSTONE_AZURE_ORE);
    public static final RegistryObject<Block> DEEPSLATE_AZURE_ORE = BLOCKS.register("deepslate_azure_ore", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> DEEPSLATE_AZURE_ORE_ITEM = fromBlock(DEEPSLATE_AZURE_ORE);

    // Conveniance function: Take a RegistryObject<Block> and make a corresponding RegistryObject<Item> from it
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
