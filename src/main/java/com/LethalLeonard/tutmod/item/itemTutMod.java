package com.LethalLeonard.tutmod.item;

import com.LethalLeonard.tutmod.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class itemTutMod extends Item
{
    //This constuctor is what sets any defaults that would commonly be used across items
    public itemTutMod()
    {
        super();
        this.maxStackSize = 1;
    }

    //Overrides the output when recieving the localized name
    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.resPrefix, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.resPrefix, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    //Formats the item's name how it can be understood
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }
}
