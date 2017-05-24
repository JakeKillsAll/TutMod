package com.LethalLeonard.tutmod.init;

import com.LethalLeonard.tutmod.block.blockSample;
import com.LethalLeonard.tutmod.block.blockTutMod;
import com.LethalLeonard.tutmod.reference.Names;
import com.LethalLeonard.tutmod.reference.Reference;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks
{
    public static blockTutMod blockSample = new blockSample();

    public static void init()
    {
        ResourceLocation location = new ResourceLocation(Reference.modid, Names.sampleBlock);
        blockSample.setRegistryName(location);
        GameRegistry.register(blockSample);
        GameRegistry.register(new ItemBlock(blockSample),location);
    }

    @SideOnly(Side.CLIENT)
    public static void initClient(ItemModelMesher mesher)
    {
        Item item = Item.getItemFromBlock(blockSample);
        ModelResourceLocation model = new ModelResourceLocation(Reference.resPrefix+Names.sampleBlock,
                "inventory");
        ModelLoader.registerItemVariants(item,model);
        mesher.register(item,0,model);
    }
}
