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

public class ConcreteBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);


    //CREATE CONCRETE BLOCKS

    public static final RegistryObject<Block> CONCRETE_0 = register("concrete_0",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> CONCRETE_1 = register("concrete_1",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> CONCRETE_2 = register("concrete_2",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> CONCRETE_3 = register("concrete_3",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> CONCRETE_4 = register("concrete_4",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> CONCRETE_5 = register("concrete_5",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> CONCRETE_6 = register("concrete_6",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> CONCRETE_7 = register("concrete_7",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> CONCRETE_8 = register("concrete_8",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );

    //INITIALISES

    public static RegistryObject<Block> register(String name, final Supplier<Block> blockFactory) {
        RegistryObject<Block> block = BLOCKS.register(name, blockFactory);
        ITEMS.register(name, () -> new BlockItem(block.get(), defaultItemProperties()));
        return block;
    }
    private static Item.Properties defaultItemProperties() {
        return new Item.Properties().group(BlocksMod.ROAD_GROUP);
    }
}
