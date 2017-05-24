package com.LethalLeonard.tutmod.proxy;

import com.LethalLeonard.tutmod.handler.ConfigurationHandler;
import com.LethalLeonard.tutmod.init.ModBlocks;
import com.LethalLeonard.tutmod.init.ModItems;
import com.LethalLeonard.tutmod.utility.Recipes;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * This class sets anything that would be rendered both client and server side in their init phase
 */
public abstract class CommonProxy {

    public void preInit(FMLPreInitializationEvent event)
    {
        //Creates and read the configuration file
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        //Registers the Blocks and Items to the game
        ModBlocks.init();
        ModItems.init();
    }

    public void init(FMLInitializationEvent event)
    {
        //Adds all Item and Block recipes
        Recipes.addRecipes();
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}