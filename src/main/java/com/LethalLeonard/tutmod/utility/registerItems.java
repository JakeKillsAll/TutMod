package com.LethalLeonard.tutmod.utility;

import com.LethalLeonard.tutmod.item.itemTutMod;
import com.LethalLeonard.tutmod.reference.Reference;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class registerItems
{
    //This initializes the item so that it can be in the game
    public static void Register(Item item, String itemName)
    {
        item.setRegistryName(new ResourceLocation(Reference.modid,itemName));
        GameRegistry.register(item);
    }

    /*This registers the texture as well as the model to the item and is what is rendered into the gam
    as long as it has no variants and is a simple item, IE Pickaxe, food, anything "2D"*/
    public static void RegisterClient(Item item,String itemName,ItemModelMesher mesher)
    {
        ModelResourceLocation model = new ModelResourceLocation(Reference.resPrefix+itemName,"inventory");
        ModelLoader.registerItemVariants(item, model);
        mesher.register(item,0,model);
    }

}
