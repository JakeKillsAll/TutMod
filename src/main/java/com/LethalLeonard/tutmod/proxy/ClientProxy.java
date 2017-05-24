package com.LethalLeonard.tutmod.proxy;

import com.LethalLeonard.tutmod.init.ModBlocks;
import com.LethalLeonard.tutmod.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
        ModBlocks.initClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
        ModItems.InitClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
}
