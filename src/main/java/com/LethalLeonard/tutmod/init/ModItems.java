package com.LethalLeonard.tutmod.init;

import com.LethalLeonard.tutmod.item.itemSample;
import com.LethalLeonard.tutmod.item.itemSomeSword;
import com.LethalLeonard.tutmod.item.itemTutMod;
import com.LethalLeonard.tutmod.reference.Materials;
import com.LethalLeonard.tutmod.reference.Names;
import com.LethalLeonard.tutmod.utility.register;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems
{
    /**
     * Creates the objects that will be used to initialize and texture items
     */
    public static itemTutMod itemSample = new itemSample();
    public static Item someSword = new itemSomeSword(Materials.sampleMaterial);

    //this is the client's/server's initialization of the item
    public static void init()
    {
       register.RegisterItem(itemSample,Names.itemSample);
       register.RegisterItem(someSword,Names.itemSomeSword);
    }

    //This is the client's rendering method
    @SideOnly(Side.CLIENT)
    public static void InitClient(ItemModelMesher mesher)
    {
        register.RegisterClientItem(itemSample,Names.itemSample,mesher);
        register.RegisterClientItem(someSword,Names.itemSomeSword,mesher);
    }

}
