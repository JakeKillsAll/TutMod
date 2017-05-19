package com.LethalLeonard.tutmod;

import com.LethalLeonard.tutmod.Reference.Reference;
import com.LethalLeonard.tutmod.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.modid, name = Reference.name, version = Reference.version)
public class TutMod
{

    @Mod.Instance(Reference.modid)
    public static TutMod instance;

    @SidedProxy(clientSide = Reference.clientSide, serverSide = Reference.serverSide)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

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
