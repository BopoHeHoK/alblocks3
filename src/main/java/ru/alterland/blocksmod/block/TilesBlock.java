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

public class TilesBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    //CREATE TILES BLOCKS

    public static final RegistryObject<Block> TILES_0 = register("tiles_0",
            () -> new Block(Block.Properties.create(Material.CLAY))
    );
    public static final RegistryObject<Block> TILES_1 = register("tiles_1",
            () -> new Block(Block.Properties.create(Material.CLAY))
    );
    public static final RegistryObject<Block> TILES_2 = register("tiles_2",
            () -> new Block(Block.Properties.create(Material.CLAY))
    );
    public static final RegistryObject<Block> TILES_3 = register("tiles_3",
            () -> new Block(Block.Properties.create(Material.CLAY))
    );
    public static final RegistryObject<Block> TILES_4 = register("tiles_4",
            () -> new Block(Block.Properties.create(Material.CLAY))
    );
    public static final RegistryObject<Block> TILES_5 = register("tiles_5",
            () -> new Block(Block.Properties.create(Material.CLAY))
    );
    public static final RegistryObject<Block> TILES_6 = register("tiles_6",
            () -> new Block(Block.Properties.create(Material.CLAY))
    );
    public static final RegistryObject<Block> TILES_7 = register("tiles_7",
            () -> new Block(Block.Properties.create(Material.CLAY))
    );
    public static final RegistryObject<Block> TILES_8 = register("tiles_8",
            () -> new Block(Block.Properties.create(Material.CLAY))
    );

    //INITIALISES

    public static RegistryObject<Block> register(String name, final Supplier<Block> blockFactory) {
        RegistryObject<Block> block = BLOCKS.register(name, blockFactory);
        ITEMS.register(name, () -> new BlockItem(block.get(), defaultItemProperties()));
        return block;
    }
    private static Item.Properties defaultItemProperties() {
        return new Item.Properties().group(BlocksMod.BRICKS_GROUP);
    }
}
