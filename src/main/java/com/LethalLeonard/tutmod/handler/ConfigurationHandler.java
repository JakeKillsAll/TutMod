package com.LethalLeonard.tutmod.handler;

import com.LethalLeonard.tutmod.utility.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //creates the configuration file object
        Configuration configuration = new Configuration(configFile);

        try
        {
            //Attempts to load a pre-existing configuration, if failed, it creates it
            configuration.load();

            //populates config file if empty with defaults or reads the config
            boolean configValue = configuration.getBoolean("Sample Value", "General", true,
                    "This is a test config value");
            int sampleInt = configuration.getInt("Sample Int", "General", 120,10,
                    500,"Some random int value");
            boolean sampleBoolean = configuration.getBoolean("SampleBoolean","Other",true,
                    "Random Comment");
        }
        catch(Exception e)
        {
            //Catches and prints any errors with the configuration file
            LogHelper.error(e);
        }
        finally
        {
            //If the config changed,it saves it
            if(configuration.hasChanged())
            {
                configuration.save();
            }
        }
    }
}