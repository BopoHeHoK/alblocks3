package ru.alterland.blocksmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.alterland.blocksmod.BlocksMod;
import java.util.function.Supplier;

public class WoodBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlocksMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    //CREATE WOOD BLOCKS

    public static final RegistryObject<Block> WOOD_0 = register("wood_0",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_1 = register("wood_1",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_2 = register("wood_2",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_3 = register("wood_3",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_4 = register("wood_4",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_5 = register("wood_5",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_6 = register("wood_6",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_7 = register("wood_7",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_8 = register("wood_8",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_9 = register("wood_9",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_10 = register("wood_10",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_11 = register("wood_11",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_12 = register("wood_12",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_13 = register("wood_13",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_14 = register("wood_14",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_15 = register("wood_15",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_16 = register("wood_16",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
    );
    public static final RegistryObject<Block> WOOD_17 = register("wood_17",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2).harvestTool(ToolType.AXE).sound(SoundType.WOOD))
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
