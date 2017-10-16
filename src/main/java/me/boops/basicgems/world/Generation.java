package me.boops.basicgems.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class Generation implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			net.minecraft.world.gen.IChunkGenerator chunkGenerator, IChunkProvider chunkProviderr) {

		// Check if we are in the overworld
		if (world.provider.getDimension() == 0) {
			
			//Add the ores
			generateOre(Block.getBlockFromName("basicgems:amethyst_ore").getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 102, 4 + random.nextInt(4), 16);
			generateOre(Block.getBlockFromName("basicgems:sapphire_ore").getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 58, 4 + random.nextInt(4), 12);
			generateOre(Block.getBlockFromName("basicgems:ruby_ore").getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 48, 4 + random.nextInt(4), 10);
			generateOre(Block.getBlockFromName("basicgems:fireopal_ore").getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 38, 4 + random.nextInt(4), 8);
			generateOre(Block.getBlockFromName("basicgems:topaz_ore").getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 28, 4 + random.nextInt(4), 6);
			generateOre(Block.getBlockFromName("basicgems:pinkdiamond_ore").getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 14, 4 + random.nextInt(4), 5);

		}
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
	
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}
