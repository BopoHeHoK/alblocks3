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

public class GlassBlockAL{

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    //CREATE GLASS BLOCKS

    public static final RegistryObject<Block> GLASS_0 = register("glass_0",
            () -> new GlassBlock(Block.Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(0.3f).notSolid())
    );
    public static final RegistryObject<Block> GLASS_1 = register("glass_1",
            () -> new GlassBlock(Block.Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(0.3f).notSolid())
    );
    public static final RegistryObject<Block> GLASS_2 = register("glass_2",
            () -> new GlassBlock(Block.Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(0.3f).notSolid())
    );
    public static final RegistryObject<Block> GLASS_3 = register("glass_3",
            () -> new GlassBlock(Block.Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(0.3f).notSolid())
    );
    public static final RegistryObject<Block> GLASS_4 = register("glass_4",
            () -> new GlassBlock(Block.Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(0.3f).notSolid())
    );
    public static final RegistryObject<Block> GLASS_5 = register("glass_5",
            () -> new GlassBlock(Block.Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(0.3f).notSolid())
    );
    public static final RegistryObject<Block> GLASS_6 = register("glass_6",
            () -> new GlassBlock(Block.Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(0.3f).notSolid())
    );
    public static final RegistryObject<Block> GLASS_7 = register("glass_7",
            () -> new GlassBlock(Block.Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(0.3f).notSolid())
    );
    public static final RegistryObject<Block> GLASS_8 = register("glass_8",
            () -> new GlassBlock(Block.Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(0.3f).notSolid())
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
