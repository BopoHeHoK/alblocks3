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

public class RoofBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    //CREATE ROOF BLOCKS

    public static final RegistryObject<Block> ROOF_0 = register("roof_0",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_1 = register("roof_1",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_2 = register("roof_2",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_3 = register("roof_3",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_4 = register("roof_4",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_5 = register("roof_5",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_6 = register("roof_6",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_7 = register("roof_7",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_8 = register("roof_8",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_0_STAIRS = register("roof_0_stairs",
            () -> new StairsBlock(ROOF_0.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_1_STAIRS = register("roof_1_stairs",
            () -> new StairsBlock(ROOF_1.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_2_STAIRS = register("roof_2_stairs",
            () -> new StairsBlock(ROOF_2.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_3_STAIRS = register("roof_3_stairs",
            () -> new StairsBlock(ROOF_3.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_4_STAIRS = register("roof_4_stairs",
            () -> new StairsBlock(ROOF_4.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_5_STAIRS = register("roof_5_stairs",
            () -> new StairsBlock(ROOF_5.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_6_STAIRS = register("roof_6_stairs",
            () -> new StairsBlock(ROOF_6.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_7_STAIRS = register("roof_7_stairs",
            () -> new StairsBlock(ROOF_7.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_8_STAIRS = register("roof_8_stairs",
            () -> new StairsBlock(ROOF_8.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_0_SLAB = register("roof_0_slab",
           () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_1_SLAB = register("roof_1_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_2_SLAB = register("roof_2_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_3_SLAB = register("roof_3_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_4_SLAB = register("roof_4_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_5_SLAB = register("roof_5_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_6_SLAB = register("roof_6_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_7_SLAB = register("roof_7_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_8_SLAB = register("roof_8_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_9 = register("roof_9",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_10 = register("roof_10",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_11 = register("roof_11",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_12 = register("roof_12",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_13 = register("roof_13",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_14 = register("roof_14",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_15 = register("roof_15",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_16 = register("roof_16",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_17 = register("roof_17",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_9_STAIRS = register("roof_9_stairs",
            () -> new StairsBlock(ROOF_9.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_10_STAIRS = register("roof_10_stairs",
            () -> new StairsBlock(ROOF_10.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_11_STAIRS = register("roof_11_stairs",
            () -> new StairsBlock(ROOF_11.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_12_STAIRS = register("roof_12_stairs",
            () -> new StairsBlock(ROOF_12.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_13_STAIRS = register("roof_13_stairs",
            () -> new StairsBlock(ROOF_13.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_14_STAIRS = register("roof_14_stairs",
            () -> new StairsBlock(ROOF_14.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_15_STAIRS = register("roof_15_stairs",
            () -> new StairsBlock(ROOF_15.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_16_STAIRS = register("roof_16_stairs",
            () -> new StairsBlock(ROOF_16.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_17_STAIRS = register("roof_17_stairs",
            () -> new StairsBlock(ROOF_17.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_9_SLAB = register("roof_9_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_10_SLAB  = register("roof_10_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_11_SLAB  = register("roof_11_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_12_SLAB  = register("roof_12_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_13_SLAB  = register("roof_13_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_14_SLAB  = register("roof_14_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_15_SLAB  = register("roof_15_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_16_SLAB  = register("roof_16_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_17_SLAB  = register("roof_17_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_18 = register("roof_18",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_19 = register("roof_19",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_20 = register("roof_20",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_21 = register("roof_21",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_22 = register("roof_22",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_23 = register("roof_23",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_24 = register("roof_24",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_25 = register("roof_25",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_26 = register("roof_26",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_18_STAIRS = register("roof_18_stairs",
            () -> new StairsBlock(ROOF_18.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_19_STAIRS = register("roof_19_stairs",
            () -> new StairsBlock(ROOF_19.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_20_STAIRS = register("roof_20_stairs",
            () -> new StairsBlock(ROOF_20.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_21_STAIRS = register("roof_21_stairs",
            () -> new StairsBlock(ROOF_21.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_22_STAIRS = register("roof_22_stairs",
            () -> new StairsBlock(ROOF_22.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_23_STAIRS = register("roof_23_stairs",
            () -> new StairsBlock(ROOF_23.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_24_STAIRS = register("roof_24_stairs",
            () -> new StairsBlock(ROOF_24.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_25_STAIRS = register("roof_25_stairs",
            () -> new StairsBlock(ROOF_25.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_26_STAIRS = register("roof_26_stairs",
            () -> new StairsBlock(ROOF_26.get().getDefaultState(), AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_18_SLAB = register("roof_18_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_19_SLAB = register("roof_19_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_20_SLAB = register("roof_20_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_21_SLAB = register("roof_21_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_22_SLAB = register("roof_22_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_23_SLAB = register("roof_23_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_24_SLAB = register("roof_24_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_25_SLAB = register("roof_25_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );
    public static final RegistryObject<Block> ROOF_26_SLAB = register("roof_26_slab",
            () -> new SlabBlock(SlabBlock.Properties.create(Material.CLAY).hardnessAndResistance(1f).sound(SoundType.BASALT))
    );

    //INITIALISES

    public static RegistryObject<Block> register(String name, final Supplier<Block> blockFactory) {
        RegistryObject<Block> block = BLOCKS.register(name, blockFactory);
        ITEMS.register(name, () -> new BlockItem(block.get(), defaultItemProperties()));
        return block;
    }
    private static Item.Properties defaultItemProperties() {
        return new Item.Properties().group(BlocksMod.ROOF_GROUP);
    }
}
