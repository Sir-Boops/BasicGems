package me.boops.basicgems;

import me.boops.basicgems.registry.RegisterBlock;

public class RegisterBlockList {
	
	RegisterBlock registerBlock = new RegisterBlock();
	
	public RegisterBlockList() {
		
		registerBlock.Register(BlockList.amethyst_ore);
		registerBlock.Register(BlockList.fireopal_ore);
		registerBlock.Register(BlockList.pinkdiamond_ore);
		registerBlock.Register(BlockList.ruby_ore);
		registerBlock.Register(BlockList.sapphire_ore);
		registerBlock.Register(BlockList.topaz_ore);
		
	}
}
