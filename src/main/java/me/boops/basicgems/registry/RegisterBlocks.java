package me.boops.basicgems.registry;

import me.boops.basicgems.Main;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegisterBlocks {
	
    @SubscribeEvent
	public static void registerStuff(RegistryEvent.Register<Block> event) {
    	
    	for(int i = 0; i < RegCache.blocks.size(); i++) {
    		
    		RegCache.blocks.get(i).setRegistryName(Main.MODID, RegCache.blocks.get(i).getUnlocalizedName().substring(5));
    		event.getRegistry().register(RegCache.blocks.get(i));
    	}	
	}
}
