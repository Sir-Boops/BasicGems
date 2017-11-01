package me.boops.basicgems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.boops.basicgems.gui.CreativeTab;
import me.boops.basicgems.registry.RegCache;
import me.boops.basicgems.world.Generation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME)
public class Main {
	
	public static final String MODID = "basicgems";
	public static final String NAME = "Basic Gems";
	public static final String VERSION = "0.0.1";
	public static final Logger log = LogManager.getLogger(MODID);

	// Add a new tab
	public static CreativeTabs tab = new CreativeTab("BasicGems");

	
	private ItemList itemList = new ItemList();
	private BlockList Blocklist = new BlockList();
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event){
		
		// Register blocks
		RegCache.blocks.add(Blocklist.amethyst_ore);
		RegCache.blocks.add(Blocklist.fireopal_ore);
		RegCache.blocks.add(Blocklist.pinkdiamond_ore);
		RegCache.blocks.add(Blocklist.ruby_ore);
		RegCache.blocks.add(Blocklist.sapphire_ore);
		RegCache.blocks.add(Blocklist.topaz_ore);
		
		//Register RegCache.RegCache.blocks
		RegCache.items.add(new ItemBlock(Blocklist.amethyst_ore));
		RegCache.items.add(new ItemBlock(Blocklist.fireopal_ore));
		RegCache.items.add(new ItemBlock(Blocklist.pinkdiamond_ore));
		RegCache.items.add(new ItemBlock(Blocklist.ruby_ore));
		RegCache.items.add(new ItemBlock(Blocklist.sapphire_ore));
		RegCache.items.add(new ItemBlock(Blocklist.topaz_ore));
		
		//Register Gems
		RegCache.items.add(itemList.amethyst_gem);
		RegCache.items.add(itemList.sapphire_gem);
		RegCache.items.add(itemList.fireopal_gem);
		RegCache.items.add(itemList.ruby_gem);
		RegCache.items.add(itemList.topaz_gem);
		RegCache.items.add(itemList.pinkdiamond_gem);
		
		// Register swords
		RegCache.items.add(itemList.amethyst_sword);
		RegCache.items.add(itemList.sapphire_sword);
		RegCache.items.add(itemList.fireopal_sword);
		RegCache.items.add(itemList.ruby_sword);
		RegCache.items.add(itemList.topaz_sword);
		RegCache.items.add(itemList.pinkdiamond_sword);
		
		//Register picks
		RegCache.items.add(itemList.amethyst_pickaxe);
		RegCache.items.add(itemList.sapphire_pickaxe);
		RegCache.items.add(itemList.fireopal_pickaxe);
		RegCache.items.add(itemList.ruby_pickaxe);
		RegCache.items.add(itemList.topaz_pickaxe);
		RegCache.items.add(itemList.pinkdiamond_pickaxe);
		
		// Register shovels
		RegCache.items.add(itemList.amethyst_shovel);
		RegCache.items.add(itemList.sapphire_shovel);
		RegCache.items.add(itemList.fireopal_shovel);
		RegCache.items.add(itemList.ruby_shovel);
		RegCache.items.add(itemList.topaz_shovel);
		RegCache.items.add(itemList.pinkdiamond_shovel);
		
		// Register Axes
		RegCache.items.add(itemList.amethyst_axe);
		RegCache.items.add(itemList.sapphire_axe);
		RegCache.items.add(itemList.fireopal_axe);
		RegCache.items.add(itemList.ruby_axe);
		RegCache.items.add(itemList.topaz_axe);
		RegCache.items.add(itemList.pinkdiamond_axe);
		
		// Register hoes
		RegCache.items.add(itemList.amethyst_hoe);
		RegCache.items.add(itemList.sapphire_hoe);
		RegCache.items.add(itemList.fireopal_hoe);
		RegCache.items.add(itemList.ruby_hoe);
		RegCache.items.add(itemList.topaz_hoe);
		RegCache.items.add(itemList.pinkdiamond_hoe);
		
		// Register ame armor
		RegCache.items.add(itemList.amethyst_helm);
		RegCache.items.add(itemList.amethyst_chest);
		RegCache.items.add(itemList.amethyst_legs);
		RegCache.items.add(itemList.amethyst_boots);
		
		//Register sapphire
		RegCache.items.add(itemList.sapphire_helm);
		RegCache.items.add(itemList.sapphire_chest);
		RegCache.items.add(itemList.sapphire_legs);
		RegCache.items.add(itemList.sapphire_boots);
		
		//Register ruby
		RegCache.items.add(itemList.ruby_helm);
		RegCache.items.add(itemList.ruby_chest);
		RegCache.items.add(itemList.ruby_legs);
		RegCache.items.add(itemList.ruby_boots);
		
		// Register fireopel armor
		RegCache.items.add(itemList.fireopal_helm);
		RegCache.items.add(itemList.fireopal_chest);
		RegCache.items.add(itemList.fireopal_legs);
		RegCache.items.add(itemList.fireopal_boots);
		
		// Register topaz armor
		RegCache.items.add(itemList.topaz_helm);
		RegCache.items.add(itemList.topaz_chest);
		RegCache.items.add(itemList.topaz_legs);
		RegCache.items.add(itemList.topaz_boots);
		
		// Register pink Diamond
		RegCache.items.add(itemList.pinkdiamond_helm);
		RegCache.items.add(itemList.pinkdiamond_chest);
		RegCache.items.add(itemList.pinkdiamond_legs);
		RegCache.items.add(itemList.pinkdiamond_boots);
		
		//Register the world generator
		GameRegistry.registerWorldGenerator(new Generation(), 3);
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
	}
}
