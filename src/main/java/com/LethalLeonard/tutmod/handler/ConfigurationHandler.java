package com.LethalLeonard.tutmod.handler;

import com.LethalLeonard.tutmod.utility.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        try
        {
            configuration.load();

            boolean configValue = configuration.getBoolean("Sample Value", "General", true,
                    "This is a test config value");
        }
        catch(Exception e)
        {
            LogHelper.error(e);
        }
        finally
        {
            if(configuration.hasChanged())
            {
                configuration.save();
            }
        }
    }
}