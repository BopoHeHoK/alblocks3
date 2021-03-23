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

public class StoneBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    //CREATE STONE BLOCKS

    public static final RegistryObject<Block> STONE_0 = register("stone_0",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONE_1 = register("stone_1",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONE_2 = register("stone_2",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONE_3 = register("stone_3",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONE_4 = register("stone_4",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONE_5 = register("stone_5",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONE_6 = register("stone_6",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONE_7 = register("stone_7",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONE_8 = register("stone_8",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );

    //INITIALISES

    public static RegistryObject<Block> register(String name, final Supplier<Block> blockFactory) {
        RegistryObject<Block> block = BLOCKS.register(name, blockFactory);
        ITEMS.register(name, () -> new BlockItem(block.get(), defaultItemProperties()));
        return block;
    }
    private static Item.Properties defaultItemProperties() {
        return new Item.Properties().group(BlocksMod.ROCK_GROUP);
    }
}
