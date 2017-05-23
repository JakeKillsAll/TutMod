package com.LethalLeonard.tutmod.item;

import com.LethalLeonard.tutmod.reference.Names;
import com.LethalLeonard.tutmod.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class itemSomeSword extends ItemSword
{
    public itemSomeSword(Item.ToolMaterial material)
    {
        super(material);
        this.setMaxDamage(100);
        this.setUnlocalizedName(Reference.resPrefix+Names.itemSomeSword);
    }
}
