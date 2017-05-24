package com.LethalLeonard.tutmod.item;

import com.LethalLeonard.tutmod.reference.Names;

public class itemSample extends itemTutMod
{
    //This constructor is what sets anything unique to this item
    public itemSample()
    {
        super();
        this.setUnlocalizedName(Names.itemSample);
        this.setMaxStackSize(64);
    }
}
