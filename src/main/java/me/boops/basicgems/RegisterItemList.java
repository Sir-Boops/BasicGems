package me.boops.basicgems;

import me.boops.basicgems.registry.RegisterItem;

public class RegisterItemList {
	
	RegisterItem registerItem = new RegisterItem();
	
	public RegisterItemList() {
		
		registerItem.Register(ItemList.amethyst_gem);
		registerItem.Register(ItemList.sapphire_gem);
		registerItem.Register(ItemList.ruby_gem);
		registerItem.Register(ItemList.fireopal_gem);
		registerItem.Register(ItemList.topaz_gem);
		registerItem.Register(ItemList.pinkdiamond_gem);
		
		//Register Swords
		registerItem.Register(ItemList.amethyst_sword);
		registerItem.Register(ItemList.sapphire_sword);
		registerItem.Register(ItemList.ruby_sword);
		registerItem.Register(ItemList.fireopal_sword);
		registerItem.Register(ItemList.topaz_sword);
		registerItem.Register(ItemList.pinkdiamond_sword);
		
		//Register Picks
		registerItem.Register(ItemList.amethyst_pickaxe);
		registerItem.Register(ItemList.sapphire_pickaxe);
		registerItem.Register(ItemList.ruby_pickaxe);
		registerItem.Register(ItemList.fireopal_pickaxe);
		registerItem.Register(ItemList.topaz_pickaxe);
		registerItem.Register(ItemList.pinkdiamond_pickaxe);
		
		//Register Shovels
		registerItem.Register(ItemList.amethyst_shovel);
		registerItem.Register(ItemList.sapphire_shovel);
		registerItem.Register(ItemList.ruby_shovel);
		registerItem.Register(ItemList.fireopal_shovel);
		registerItem.Register(ItemList.topaz_shovel);
		registerItem.Register(ItemList.pinkdiamond_shovel);
		
		//Register Axes
		registerItem.Register(ItemList.amethyst_axe);
		registerItem.Register(ItemList.sapphire_axe);
		registerItem.Register(ItemList.ruby_axe);
		registerItem.Register(ItemList.fireopal_axe);
		registerItem.Register(ItemList.topaz_axe);
		registerItem.Register(ItemList.pinkdiamond_axe);
		
		//Register Hoes
		registerItem.Register(ItemList.amethyst_hoe);
		registerItem.Register(ItemList.sapphire_hoe);
		registerItem.Register(ItemList.ruby_hoe);
		registerItem.Register(ItemList.fireopal_hoe);
		registerItem.Register(ItemList.topaz_hoe);
		registerItem.Register(ItemList.pinkdiamond_hoe);
		
		//Register Amethyst Armor
		registerItem.Register(ItemList.amethyst_helm);
		registerItem.Register(ItemList.amethyst_chest);
		registerItem.Register(ItemList.amethyst_legs);
		registerItem.Register(ItemList.amethyst_boots);
		
		//Register Sapphire Armor
		registerItem.Register(ItemList.sapphire_helm);
		registerItem.Register(ItemList.sapphire_chest);
		registerItem.Register(ItemList.sapphire_legs);
		registerItem.Register(ItemList.sapphire_boots);
		
		//Register Ruby Armor
		registerItem.Register(ItemList.ruby_helm);
		registerItem.Register(ItemList.ruby_chest);
		registerItem.Register(ItemList.ruby_legs);
		registerItem.Register(ItemList.ruby_boots);
		
		//Register FireOpal Armor
		registerItem.Register(ItemList.fireopal_helm);
		registerItem.Register(ItemList.fireopal_chest);
		registerItem.Register(ItemList.fireopal_legs);
		registerItem.Register(ItemList.fireopal_boots);
		
		//Register Topaz Armor
		registerItem.Register(ItemList.topaz_helm);
		registerItem.Register(ItemList.topaz_chest);
		registerItem.Register(ItemList.topaz_legs);
		registerItem.Register(ItemList.topaz_boots);
		
		//Register Pink Diamond Armor
		registerItem.Register(ItemList.pinkdiamond_helm);
		registerItem.Register(ItemList.pinkdiamond_chest);
		registerItem.Register(ItemList.pinkdiamond_legs);
		registerItem.Register(ItemList.pinkdiamond_boots);
		
	}
}
