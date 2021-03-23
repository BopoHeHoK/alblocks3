package ru.alterland.blocksmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.alterland.blocksmod.BlocksMod;
import java.util.function.Supplier;

public class BricksBlock{

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    //CREATE BRICKS BLOCKS

    public static final RegistryObject<Block> BRICKS_0 = register("bricks_0",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_1 = register("bricks_1",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_2 = register("bricks_2",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_3 = register("bricks_3",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_4 = register("bricks_4",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_5 = register("bricks_5",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_6 = register("bricks_6",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_7 = register("bricks_7",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_8 = register("bricks_8",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_9 = register("bricks_9",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_10 = register("bricks_10",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_11 = register("bricks_11",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_12 = register("bricks_12",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_13 = register("bricks_13",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_14 = register("bricks_14",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_15 = register("bricks_15",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_16 = register("bricks_16",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_17 = register("bricks_17",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_18 = register("bricks_18",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_19 = register("bricks_19",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_20 = register("bricks_20",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_21 = register("bricks_21",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_22 = register("bricks_22",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_23 = register("bricks_23",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_24 = register("bricks_24",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_25 = register("bricks_25",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_26 = register("bricks_26",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_27 = register("bricks_27",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_28 = register("bricks_28",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_29 = register("bricks_29",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_30 = register("bricks_30",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_31 = register("bricks_31",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_32 = register("bricks_32",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_33 = register("bricks_33",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_34 = register("bricks_34",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_35 = register("bricks_35",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_36 = register("bricks_36",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_37 = register("bricks_37",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_38 = register("bricks_38",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_39 = register("bricks_39",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_40 = register("bricks_40",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_41 = register("bricks_41",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_42 = register("bricks_42",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_43 = register("bricks_43",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );
    public static final RegistryObject<Block> BRICKS_44 = register("bricks_44",
            () -> new Block(Block.Properties.create(Material.CLAY).hardnessAndResistance(8).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))
    );

    //INITIALIZATION

    public static RegistryObject<Block> register(String name, final Supplier<Block> blockFactory) {
        RegistryObject<Block> block = BLOCKS.register(name, blockFactory);
        ITEMS.register(name, () -> new BlockItem(block.get(), defaultItemProperties()));
        return block;
    }
    private static Item.Properties defaultItemProperties() {
        return new Item.Properties().group(BlocksMod.BRICKS_GROUP);
    }
}
