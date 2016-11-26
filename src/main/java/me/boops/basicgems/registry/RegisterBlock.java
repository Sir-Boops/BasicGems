package me.boops.basicgems.registry;

import me.boops.basicgems.Main;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterBlock {
	
	public void Register(Block block){
		
		//Get the item
		//Register the block item
		ItemBlock item = new ItemBlock(block);
		
		String name = (item.getUnlocalizedName().replaceFirst("tile.", ""));
		
		//Register the block
		GameRegistry.register(block.setRegistryName(Main.MODID, name));
		GameRegistry.register(item.setRegistryName(Main.MODID, name));
		
		//Register the renderer
		RegisterRenderer renderer = new RegisterRenderer();
		
		renderer.RegisterBlock(block);
	}
}
