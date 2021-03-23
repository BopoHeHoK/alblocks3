package ru.alterland.blocksmod.block;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.alterland.blocksmod.BlocksMod;
import java.util.function.Supplier;

public class ColorBlock{

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    //CREATE COLOR BLOCKS

    public static final RegistryObject<Block> COLOR_0 = register("colorclay_0",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> COLOR_1 = register("colorclay_1",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> COLOR_2 = register("colorclay_2",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> COLOR_3 = register("colorclay_3",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> COLOR_4 = register("colorclay_4",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> COLOR_5 = register("colorclay_5",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> COLOR_6 = register("colorclay_6",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> COLOR_7 = register("colorclay_7",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> COLOR_8 = register("colorclay_8",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(2).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> COLOR_9 = register("colorclay_9",
            () -> new StairsBlock(COLOR_0.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(2).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> COLOR_10 = register("colorclay_10",
            () -> new StairsBlock(COLOR_1.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(2).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> COLOR_11 = register("colorclay_11",
            () -> new StairsBlock(COLOR_2.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(2).sound(SoundType.STONE))
    );

    //INITIALISES

    public static RegistryObject<Block> register(String name, final Supplier<Block> blockFactory) {
        RegistryObject<Block> block = BLOCKS.register(name, blockFactory);
        ITEMS.register(name, () -> new BlockItem(block.get(), defaultItemProperties()));
        return block;
    }
    private static Item.Properties defaultItemProperties() {
        return new Item.Properties().group(BlocksMod.COLOR_GROUP);
    }
}
