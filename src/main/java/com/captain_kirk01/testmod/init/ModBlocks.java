package com.captain_kirk01.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.captain_kirk01.testmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLAZE_POWDER_BLOCK = new BlockBase("blaze_powder_block", Material.IRON);
}
