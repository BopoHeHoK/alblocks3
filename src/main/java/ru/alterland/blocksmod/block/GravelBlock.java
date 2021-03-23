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

public class GravelBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    //CREATE GRAVEL BLOCKS

    public static final RegistryObject<Block> GRAVEL_0 = register("gravel_0",
            () -> new Block(Block.Properties.create(Material.SAND))
    );
    public static final RegistryObject<Block> GRAVEL_1 = register("gravel_1",
            () -> new Block(Block.Properties.create(Material.SAND))
    );
    public static final RegistryObject<Block> GRAVEL_2 = register("gravel_2",
            () -> new Block(Block.Properties.create(Material.SAND))
    );
    public static final RegistryObject<Block> GRAVEL_3 = register("gravel_3",
            () -> new Block(Block.Properties.create(Material.SAND))
    );
    public static final RegistryObject<Block> GRAVEL_4 = register("gravel_4",
            () -> new Block(Block.Properties.create(Material.SAND))
    );
    public static final RegistryObject<Block> GRAVEL_5 = register("gravel_5",
            () -> new Block(Block.Properties.create(Material.SAND))
    );
    public static final RegistryObject<Block> GRAVEL_6 = register("gravel_6",
            () -> new Block(Block.Properties.create(Material.SAND))
    );
    public static final RegistryObject<Block> GRAVEL_7 = register("gravel_7",
            () -> new Block(Block.Properties.create(Material.SAND))
    );
    public static final RegistryObject<Block> GRAVEL_8 = register("gravel_8",
            () -> new Block(Block.Properties.create(Material.SAND))
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
