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

public class StonewallBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    //CREATE STONEWALL BLOCKS

    public static final RegistryObject<Block> STONEWALL_0 = register("stonewall_0",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONEWALL_1 = register("stonewall_1",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONEWALL_2 = register("stonewall_2",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONEWALL_3 = register("stonewall_3",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONEWALL_4 = register("stonewall_4",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONEWALL_5 = register("stonewall_5",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONEWALL_6 = register("stonewall_6",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONEWALL_7 = register("stonewall_7",
            () -> new Block(Block.Properties.create(Material.ROCK))
    );
    public static final RegistryObject<Block> STONEWALL_8 = register("stonewall_8",
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
