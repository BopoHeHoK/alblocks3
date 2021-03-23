package ru.alterland.blocksmod.init;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import ru.alterland.blocksmod.block.*;

public class Blocks {

    public Blocks(final IEventBus eventBus){

        BricksBlock.BLOCKS.register(eventBus);
        ColorBlock.BLOCKS.register(eventBus);
        ConcreteBlock.BLOCKS.register(eventBus);
        DecorBlock.BLOCKS.register(eventBus);
        GlassBlockAL.BLOCKS.register(eventBus);
        GravelBlock.BLOCKS.register(eventBus);
        ParquetBlock.BLOCKS.register(eventBus);
        PlanksBlock.BLOCKS.register(eventBus);
        RoadBlock.BLOCKS.register(eventBus);
        RoofBlock.BLOCKS.register(eventBus);
        SettBlock.BLOCKS.register(eventBus);
        SidingBlock.BLOCKS.register(eventBus);
        SteelBlock.BLOCKS.register(eventBus);
        StoneBlock.BLOCKS.register(eventBus);
        StonewallBlock.BLOCKS.register(eventBus);
        StreettileBlock.BLOCKS.register(eventBus);
        TilesBlock.BLOCKS.register(eventBus);
        WoodBlock.BLOCKS.register(eventBus);

        BricksBlock.ITEMS.register(eventBus);
        ColorBlock.ITEMS.register(eventBus);
        ConcreteBlock.ITEMS.register(eventBus);
        DecorBlock.ITEMS.register(eventBus);
        GlassBlockAL.ITEMS.register(eventBus);
        GravelBlock.ITEMS.register(eventBus);
        ParquetBlock.ITEMS.register(eventBus);
        PlanksBlock.ITEMS.register(eventBus);
        RoadBlock.ITEMS.register(eventBus);
        RoofBlock.ITEMS.register(eventBus);
        SettBlock.ITEMS.register(eventBus);
        SidingBlock.ITEMS.register(eventBus);
        SteelBlock.ITEMS.register(eventBus);
        StoneBlock.ITEMS.register(eventBus);
        StonewallBlock.ITEMS.register(eventBus);
        StreettileBlock.ITEMS.register(eventBus);
        TilesBlock.ITEMS.register(eventBus);
        WoodBlock.ITEMS.register(eventBus);
    }

}
