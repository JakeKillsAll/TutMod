package com.LethalLeonard.tutmod.reference;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class Materials
{
    //Creates a simple material that can be applied to tools
    public static Item.ToolMaterial sampleMaterial = EnumHelper.addToolMaterial("SampleMat",
            3,4096,1000, 100,20);
}
