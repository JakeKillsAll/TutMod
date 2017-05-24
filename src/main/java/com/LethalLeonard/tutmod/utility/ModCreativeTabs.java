package com.LethalLeonard.tutmod.utility;

import com.LethalLeonard.tutmod.init.ModItems;
import com.LethalLeonard.tutmod.reference.Names;
import com.LethalLeonard.tutmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModCreativeTabs {

    //Creates, names, and sets the icon of a creative tab
    public static CreativeTabs tutTab = new CreativeTabs(Reference.resPrefix+ Names.tab1) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.someSword);
        }
    };
}
