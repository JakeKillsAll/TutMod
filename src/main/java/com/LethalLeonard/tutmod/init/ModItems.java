package com.LethalLeonard.tutmod.init;

import com.LethalLeonard.tutmod.item.itemSample;
import com.LethalLeonard.tutmod.item.itemSomeSword;
import com.LethalLeonard.tutmod.item.itemTutMod;
import com.LethalLeonard.tutmod.reference.Materials;
import com.LethalLeonard.tutmod.reference.Names;
import com.LethalLeonard.tutmod.utility.registerItems;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems
{
    public static itemTutMod itemSample = new itemSample();
    public static Item someSword = new itemSomeSword(Materials.sampleMaterial);

    //this is the client's/server's initialization of the item
    public static void init()
    {
       registerItems.Register(itemSample,Names.itemSample);
       registerItems.Register(someSword,Names.itemSomeSword);
    }

    //This is the client's rendering method
    @SideOnly(Side.CLIENT)
    public static void InitClient(ItemModelMesher mesher)
    {
        registerItems.RegisterClient(itemSample,Names.itemSample,mesher);
        registerItems.RegisterClient(someSword,Names.itemSomeSword,mesher);
    }

}
