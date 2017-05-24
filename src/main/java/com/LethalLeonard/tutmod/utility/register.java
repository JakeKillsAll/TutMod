package com.LethalLeonard.tutmod.utility;

import com.LethalLeonard.tutmod.item.itemTutMod;
import com.LethalLeonard.tutmod.reference.Names;
import com.LethalLeonard.tutmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class register
{
    /**
     * This initializes the item so that it can be in the game
     */
    public static void RegisterItem(Item item, String itemName)
    {
        item.setRegistryName(new ResourceLocation(Reference.modid,itemName));
        GameRegistry.register(item);
    }

    /**
     *This registers the texture as well as the model to the item and is what is rendered into the game
     *as long as it has no variants and is a simple item, IE Pickaxe, food, anything "2D"
     */
    public static void RegisterClientItem(Item item, String itemName, ItemModelMesher mesher)
    {
        ModelResourceLocation model = new ModelResourceLocation(Reference.resPrefix+itemName,"inventory");
        ModelLoader.registerItemVariants(item, model);
        mesher.register(item,0,model);
    }

    /**
     * Initializes a block so that it can be in the game
     */
    public static void RegisterBlock(Block block,String name)
    {
        ResourceLocation location = new ResourceLocation(Reference.modid, name);
        block.setRegistryName(location);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block),location);
    }

    /**
     * Registers a block to it's JSON model files as well as it's textures
     */
    public static void RegisterBlockClient(Block block, String name, ItemModelMesher mesher)
    {
        Item item = Item.getItemFromBlock(block);
        ModelResourceLocation model = new ModelResourceLocation(Reference.resPrefix+name,
                "inventory");
        ModelLoader.registerItemVariants(item,model);
        mesher.register(item,0,model);
    }

}
