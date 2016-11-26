package me.boops.basicgems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.boops.basicgems.gui.CreativeTab;
import me.boops.basicgems.world.Generation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME)
public class Main {
	
	public static final String MODID = "basicgems";
	public static final String NAME = "Basic Gems";
	public static final String VERSION = "0.0.1";
	public static final Logger log = LogManager.getLogger(MODID);

	// Add a new tab
	public static CreativeTabs tab = new CreativeTab("BasicGems");
	
	@EventHandler
	public void PreInit(FMLInitializationEvent event){
		
		//Register the world generator
		GameRegistry.registerWorldGenerator(new Generation(), 3);
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
		//Register blocks
		new RegisterBlockList();
		
		//Register Items
		new RegisterItemList();
		
		//Register Recipes
		new RegisterRecipesList();
	}
}
