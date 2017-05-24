package com.LethalLeonard.tutmod.item;

import com.LethalLeonard.tutmod.reference.Names;
import com.LethalLeonard.tutmod.utility.ModCreativeTabs;

public class itemSample extends itemTutMod
{
    //This constructor is what sets anything unique to this item
    public itemSample()
    {
        super();
        this.setUnlocalizedName(Names.itemSample);
        this.setMaxStackSize(64);
        this.setCreativeTab(ModCreativeTabs.tutTab);
    }
}
