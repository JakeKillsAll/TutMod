package com.LethalLeonard.tutmod.block;

import com.LethalLeonard.tutmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockTutMod extends Block
{

    public blockTutMod(Material materialIn)
    {
        super(materialIn);
    }

    //Overrides the output when recieving the localized name
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.resPrefix, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    //Formats the item's name how it can be understood
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }
}
