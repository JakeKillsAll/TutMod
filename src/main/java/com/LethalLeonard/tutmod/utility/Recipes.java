package com.LethalLeonard.tutmod.utility;

import com.LethalLeonard.tutmod.init.ModBlocks;
import com.LethalLeonard.tutmod.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes
{
    public static void addRecipes()
    {
        //Crafting Recipes
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.someSword)," I ", " I ", " I ", 'I', ModItems.itemSample);


        //Smelting Recipes
        GameRegistry.addSmelting(new ItemStack(ModItems.itemSample,1),new ItemStack(ModBlocks.blockSample,1),5f);
    }
}
