package com.LethalLeonard.tutmod.block;

import com.LethalLeonard.tutmod.init.ModItems;
import com.LethalLeonard.tutmod.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class blockSample extends blockTutMod
{
    public blockSample()
    {
        super(Material.ROCK);
        this.setUnlocalizedName(Names.sampleBlock);
        this.setHardness(5.0f);
        this.setHarvestLevel("pickaxe",1);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.itemSample;
    }

    @Override
    public int quantityDropped(Random random)
    {
        return(random.nextInt(4)+1);
    }
}
