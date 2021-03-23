package ru.alterland.blocksmod;

import net.minecraft.block.GlassBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.alterland.blocksmod.init.*;
import ru.alterland.blocksmod.tabs.Tabs;


@Mod(BlocksMod.MOD_ID)
public class BlocksMod extends Tabs{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "blocksmod";
    public static final ItemGroup COLOR_GROUP = new ColorGroup("colorgroup");
    public static final ItemGroup ROCK_GROUP = new RockGroup("rockgroup");
    public static final ItemGroup BRICKS_GROUP = new BricksGroup("brickgroup");
    public static final ItemGroup ROOF_GROUP = new RoofGroup("roofgroup");
    public static final ItemGroup WOOD_GROUP = new WoodGroup("woodgroup");
    public static final ItemGroup DECOR_GROUP = new DecorGroup("decorgroup");
    public static final ItemGroup ROAD_GROUP = new RoadGroup("roadgroup");

    //INITIALIZATION

    public BlocksMod() {
        final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        new Blocks(eventBus);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientReg::init);
    }
}

//field_228617_T_