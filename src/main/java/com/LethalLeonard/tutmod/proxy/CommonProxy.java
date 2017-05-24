package com.LethalLeonard.tutmod.proxy;

import com.LethalLeonard.tutmod.handler.ConfigurationHandler;
import com.LethalLeonard.tutmod.init.ModBlocks;
import com.LethalLeonard.tutmod.init.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public abstract class CommonProxy {
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        ModBlocks.init();
        ModItems.init();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}