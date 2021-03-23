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

public class DecorBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    //CREATE DECOR BLOCKS

    public static final RegistryObject<Block> DECOR_0 = register("decor_0",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> DECOR_1 = register("decor_1",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> DECOR_2 = register("decor_2",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> DECOR_3 = register("decor_3",
            () -> new Block(Block.Properties.create(Material.ROCK))
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
