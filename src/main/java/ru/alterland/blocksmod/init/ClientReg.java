package ru.alterland.blocksmod.init;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import ru.alterland.blocksmod.BlocksMod;
import ru.alterland.blocksmod.block.GlassBlockAL;

@Mod.EventBusSubscriber(modid = BlocksMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientReg {
    public static void init(final FMLClientSetupEvent event){
        RenderTypeLookup.setRenderLayer(GlassBlockAL.GLASS_0.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(GlassBlockAL.GLASS_1.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(GlassBlockAL.GLASS_2.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(GlassBlockAL.GLASS_3.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(GlassBlockAL.GLASS_4.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(GlassBlockAL.GLASS_5.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(GlassBlockAL.GLASS_6.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(GlassBlockAL.GLASS_7.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(GlassBlockAL.GLASS_8.get(), RenderType.getCutout());
    }
}
