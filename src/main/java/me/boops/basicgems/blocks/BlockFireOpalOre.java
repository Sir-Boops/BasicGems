package me.boops.basicgems.blocks;

import java.util.Random;

import me.boops.basicgems.Main;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFireOpalOre extends Block {

	public BlockFireOpalOre() {
		super(Material.ROCK);

		// Set the name
		this.setUnlocalizedName("fireopal_ore");

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

		return Item.getByNameOrId("basicgems:fireopal_gem");
	}

	// Set amount it drops
	@Override
	public int quantityDropped(Random random) {
		return 1;
	}
	
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand){
		
		//Check if block below is air
		if(worldIn.getBlockState(pos.add(0, -1, 0)).getMaterial().equals(Material.AIR)){
			
            double d0 = (double)((float)pos.getX() + rand.nextFloat());
            double d1 = (double)pos.getY() - 0.05D;
            double d2 = (double)((float)pos.getZ() + rand.nextFloat());
            worldIn.spawnParticle(EnumParticleTypes.DRIP_LAVA, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
			
		}
    }

}
