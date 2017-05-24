package com.LethalLeonard.tutmod.block;

import com.LethalLeonard.tutmod.init.ModItems;
import com.LethalLeonard.tutmod.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

public class blockSample extends blockTutMod
{
    public blockSample()
    {
        //This super sets the block's material
        super(Material.ROCK);
        //sets the name for the texture and for localization
        this.setUnlocalizedName(Names.sampleBlock);
        //sets hardness of the block (How long it takes to break
        this.setHardness(5.0f);
        //sets the tool used to harvest the block and how strong of a tool is required
        this.setHarvestLevel("pickaxe",1);
    }

    //sets the item the gets dropped
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.itemSample;
    }

    //sets the amount dropped with fortune
    @Override
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        return this.quantityDropped(random) + random.nextInt(fortune + 1);
    }

    //sets the amount of experience dropped when broken
    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this))
        {
            return 1 + RANDOM.nextInt(5);
        }
        return 0;
    }

}
