package com.LethalLeonard.tutmod;

import com.LethalLeonard.tutmod.proxy.CommonProxy;
import com.LethalLeonard.tutmod.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.modid, name = Reference.name, version = Reference.version,guiFactory = Reference.guiFactory)
public class TutMod
{
    @Mod.Instance(Reference.modid)
    public static TutMod instance;

    @SidedProxy(clientSide = Reference.clientSide, serverSide = Reference.serverSide)
    public static CommonProxy proxy;

    //The FML Initialization events all initialize everything that would need to be for the mod
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
