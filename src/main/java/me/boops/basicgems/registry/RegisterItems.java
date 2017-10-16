package me.boops.basicgems.registry;

import me.boops.basicgems.Main;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegisterItems {
	
    @SubscribeEvent
	public static void registerStuff(RegistryEvent.Register<Item> event) {
    	
    	for(int i = 0; i < RegCache.items.size(); i++) {
    		
    		RegCache.items.get(i).setRegistryName(Main.MODID, RegCache.items.get(i).getUnlocalizedName().substring(5));
    		event.getRegistry().register(RegCache.items.get(i));
    		ModelLoader.setCustomModelResourceLocation(RegCache.items.get(i), 0, new ModelResourceLocation(new ResourceLocation(Main.MODID, RegCache.items.get(i).getUnlocalizedName().substring(5)),"inventory"));
    		
    	}
	}
}
