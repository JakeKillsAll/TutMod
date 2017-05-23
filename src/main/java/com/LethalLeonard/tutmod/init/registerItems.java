package com.LethalLeonard.tutmod.init;

import com.LethalLeonard.tutmod.item.itemTutMod;
import com.LethalLeonard.tutmod.reference.Reference;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class registerItems
{
    public static void Register(itemTutMod item, String itemName)
    {
        item.setRegistryName(new ResourceLocation(Reference.modid,itemName));
        GameRegistry.register(item);
    }

    public static void RegisterClient(itemTutMod item,String itemName,ItemModelMesher mesher)
    {
        ModelResourceLocation model = new ModelResourceLocation(Reference.resPrefix+itemName,"inventory");
        ModelLoader.registerItemVariants(item, model);
        mesher.register(item,0,model);
    }

}
