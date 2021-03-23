package ru.alterland.blocksmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.alterland.blocksmod.BlocksMod;
import java.util.function.Supplier;

public class SteelBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    //CREATE STEEL BLOCKS

    public static final RegistryObject<Block> STEEL_0 = register("steel_0",
            () -> new Block(Block.Properties.create(Material.IRON))
    );
    public static final RegistryObject<Block> STEEL_1 = register("steel_1",
            () -> new Block(Block.Properties.create(Material.IRON))
    );
    public static final RegistryObject<Block> STEEL_2 = register("steel_2",
            () -> new Block(Block.Properties.create(Material.IRON))
    );
    public static final RegistryObject<Block> STEEL_3 = register("steel_3",
            () -> new Block(Block.Properties.create(Material.IRON))
    );
    public static final RegistryObject<Block> STEEL_4 = register("steel_4",
            () -> new Block(Block.Properties.create(Material.IRON))
    );
    public static final RegistryObject<Block> STEEL_5 = register("steel_5",
            () -> new Block(Block.Properties.create(Material.IRON))
    );
    public static final RegistryObject<Block> STEEL_6 = register("steel_6",
            () -> new Block(Block.Properties.create(Material.IRON))
    );
    public static final RegistryObject<Block> STEEL_7 = register("steel_7",
            () -> new Block(Block.Properties.create(Material.IRON))
    );
    public static final RegistryObject<Block> STEEL_8 = register("steel_8",
            () -> new Block(Block.Properties.create(Material.IRON))
    );

    //INITIALISES

    public static RegistryObject<Block> register(String name, final Supplier<Block> blockFactory) {
        RegistryObject<Block> block = BLOCKS.register(name, blockFactory);
        ITEMS.register(name, () -> new BlockItem(block.get(), defaultItemProperties()));
        return block;
    }
    private static Item.Properties defaultItemProperties() {
        return new Item.Properties().group(BlocksMod.DECOR_GROUP);
    }
}
