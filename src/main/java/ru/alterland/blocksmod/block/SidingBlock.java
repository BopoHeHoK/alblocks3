package ru.alterland.blocksmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.alterland.blocksmod.BlocksMod;
import java.util.function.Supplier;

public class SidingBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    //CREATE SIDING BLOCKS

    public static final RegistryObject<Block> SIDING_0 = register("siding_0",
            () -> new Block(Block.Properties.create(Material.WOOD))
    );
    public static final RegistryObject<Block> SIDING_1 = register("siding_1",
            () -> new Block(Block.Properties.create(Material.WOOD))
    );
    public static final RegistryObject<Block> SIDING_2 = register("siding_2",
            () -> new Block(Block.Properties.create(Material.WOOD))
    );
    public static final RegistryObject<Block> SIDING_3 = register("siding_3",
            () -> new Block(Block.Properties.create(Material.WOOD))
    );
    public static final RegistryObject<Block> SIDING_4 = register("siding_4",
            () -> new Block(Block.Properties.create(Material.WOOD))
    );
    public static final RegistryObject<Block> SIDING_5 = register("siding_5",
            () -> new Block(Block.Properties.create(Material.WOOD))
    );
    public static final RegistryObject<Block> SIDING_6 = register("siding_6",
            () -> new Block(Block.Properties.create(Material.WOOD))
    );
    public static final RegistryObject<Block> SIDING_7 = register("siding_7",
            () -> new Block(Block.Properties.create(Material.WOOD))
    );
    public static final RegistryObject<Block> SIDING_8 = register("siding_8",
            () -> new Block(Block.Properties.create(Material.WOOD))
    );

    //INITIALISES

    public static RegistryObject<Block> register(String name, final Supplier<Block> blockFactory) {
        RegistryObject<Block> block = BLOCKS.register(name, blockFactory);
        ITEMS.register(name, () -> new BlockItem(block.get(), defaultItemProperties()));
        return block;
    }
    private static Item.Properties defaultItemProperties() {
        return new Item.Properties().group(BlocksMod.WOOD_GROUP);
    }
}
