package com.LethalLeonard.tutmod.init;

import com.LethalLeonard.tutmod.block.blockSample;
import com.LethalLeonard.tutmod.block.blockTutMod;
import com.LethalLeonard.tutmod.reference.Names;
import com.LethalLeonard.tutmod.reference.Reference;
import com.LethalLeonard.tutmod.utility.register;
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

    /**
     * Calls the register method that registers and initializes the block into the game
     */
    public static void init()
    {
        register.RegisterBlock(blockSample,Names.sampleBlock);
    }

    /**
     * Calls the register method that registers the block to it's textures and models
     */
    @SideOnly(Side.CLIENT)
    public static void initClient(ItemModelMesher mesher)
    {
        register.RegisterBlockClient(blockSample,Names.sampleBlock,mesher);
    }
}
