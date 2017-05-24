package com.LethalLeonard.tutmod.item;

import com.LethalLeonard.tutmod.reference.Names;
import com.LethalLeonard.tutmod.reference.Reference;
import com.LethalLeonard.tutmod.utility.ModCreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class itemSomeSword extends ItemSword
{
    //This sets all the parameters for the sword item
    public itemSomeSword(Item.ToolMaterial material)
    {
        super(material);
        this.setUnlocalizedName(Reference.resPrefix+Names.itemSomeSword);
        this.setCreativeTab(ModCreativeTabs.tutTab);
    }
}
