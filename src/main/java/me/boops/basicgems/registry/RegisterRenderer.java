package me.boops.basicgems.registry;

import me.boops.basicgems.Main;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class RegisterRenderer {
	
	public void RegisterBlock(Block block){
		
		//Get the item
		Item item = Item.getItemFromBlock(block);
		
		String name = (item.getUnlocalizedName().replaceFirst("tile.", ""));
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.MODID + ":" + name, "inventory"));
		
	}
	
	public void RegisterItem(Item item, String RegistryName){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.MODID + ":" + RegistryName, "inventory"));
		
	}
}
