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

public class StreettileBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    //CREATE STREETTILE BLOCKS

    public static final RegistryObject<Block> STREETTILE_0 = register("streettile_0",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STREETTILE_1 = register("streettile_1",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STREETTILE_2 = register("streettile_2",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STREETTILE_3 = register("streettile_3",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STREETTILE_4 = register("streettile_4",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STREETTILE_5 = register("streettile_5",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STREETTILE_6 = register("streettile_6",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STREETTILE_7 = register("streettile_7",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STREETTILE_8 = register("streettile_8",
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
