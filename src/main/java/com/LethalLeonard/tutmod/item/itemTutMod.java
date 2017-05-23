package com.LethalLeonard.tutmod.item;

import com.LethalLeonard.tutmod.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class itemTutMod extends Item
{
    public itemTutMod()
    {
        super();
        this.maxStackSize = 1;
    }

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

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }
}
