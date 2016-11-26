package me.boops.basicgems.blocks;

import java.util.Random;

import me.boops.basicgems.Main;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockRubyOre extends Block {

	public BlockRubyOre() {
		super(Material.ROCK);

		// Set the name
		this.setUnlocalizedName("ruby_ore");

		// Set other Settings
		this.setCreativeTab(Main.tab);

		// Block Settings
		this.setHardness(1.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setSoundType(SoundType.STONE);
	}

	// Set what it drops
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {

		return Item.getByNameOrId("basicgems:ruby_gem");
	}

	// Set amount it drops
	@Override
	public int quantityDropped(Random random) {
		return 1;
	}

}
