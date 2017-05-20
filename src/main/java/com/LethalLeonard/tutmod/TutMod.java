package com.LethalLeonard.tutmod;

import com.LethalLeonard.tutmod.handler.ConfigurationHandler;
import com.LethalLeonard.tutmod.reference.Reference;
import com.LethalLeonard.tutmod.proxy.IProxy;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.modid, name = Reference.name, version = Reference.version,guiFactory = Reference.guiFactory)
public class TutMod
{

    @Mod.Instance(Reference.modid)
    public static TutMod instance;

    @SidedProxy(clientSide = Reference.clientSide, serverSide = Reference.serverSide)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile()); //Creates the config, also generates OG config
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
