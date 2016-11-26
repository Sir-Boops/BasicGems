package me.boops.basicgems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterRecipesList {
	
	public RegisterRecipesList(){
		
		//Sword Recipes
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.amethyst_sword), "G", "G", "S", 'G', ItemList.amethyst_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.sapphire_sword), "G", "G", "S", 'G', ItemList.sapphire_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.ruby_sword), "G", "G", "S", 'G', ItemList.ruby_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.fireopal_sword), "G", "G", "S", 'G', ItemList.fireopal_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.topaz_sword), "G", "G", "S", 'G', ItemList.topaz_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.pinkdiamond_sword), "G", "G", "S", 'G', ItemList.pinkdiamond_gem, 'S', Items.STICK);
		
		//Pickaxe Recipes
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.amethyst_pickaxe), "GGG", "ASA", "ASA", 'G', ItemList.amethyst_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.sapphire_pickaxe), "GGG", "ASA", "ASA", 'G', ItemList.sapphire_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.ruby_pickaxe), "GGG", "ASA", "ASA", 'G', ItemList.ruby_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.fireopal_pickaxe), "GGG", "ASA", "ASA", 'G', ItemList.fireopal_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.topaz_pickaxe), "GGG", "ASA", "ASA", 'G', ItemList.topaz_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.pinkdiamond_pickaxe), "GGG", "ASA", "ASA", 'G', ItemList.pinkdiamond_gem, 'S', Items.STICK);
		
		//Shovel Recipes
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.amethyst_shovel), "AGA", "ASA", "ASA", 'G', ItemList.amethyst_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.sapphire_shovel), "AGA", "ASA", "ASA", 'G', ItemList.sapphire_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.ruby_shovel), "AGA", "ASA", "ASA", 'G', ItemList.ruby_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.fireopal_shovel), "AGA", "ASA", "ASA", 'G', ItemList.fireopal_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.topaz_shovel), "AGA", "ASA", "ASA", 'G', ItemList.topaz_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.pinkdiamond_shovel), "AGA", "ASA", "ASA", 'G', ItemList.pinkdiamond_gem, 'S', Items.STICK);
		
		//Axe Recipes
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.amethyst_axe), "GGA", "GSA", "ASA", 'G', ItemList.amethyst_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.sapphire_axe), "GGA", "GSA", "ASA", 'G', ItemList.sapphire_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.ruby_axe), "GGA", "GSA", "ASA", 'G', ItemList.ruby_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.fireopal_axe), "GGA", "GSA", "ASA", 'G', ItemList.fireopal_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.topaz_axe), "GGA", "GSA", "ASA", 'G', ItemList.topaz_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.pinkdiamond_axe), "GGA", "GSA", "ASA", 'G', ItemList.pinkdiamond_gem, 'S', Items.STICK);
		
		//Hoe Recipes
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.amethyst_hoe), "AGG", "ASA", "ASA", 'G', ItemList.amethyst_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.sapphire_hoe), "AGG", "ASA", "ASA", 'G', ItemList.sapphire_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.ruby_hoe), "AGG", "ASA", "ASA", 'G', ItemList.ruby_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.fireopal_hoe), "AGG", "ASA", "ASA", 'G', ItemList.fireopal_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.topaz_hoe), "AGG", "ASA", "ASA", 'G', ItemList.topaz_gem, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.pinkdiamond_hoe), "AGG", "ASA", "ASA", 'G', ItemList.pinkdiamond_gem, 'S', Items.STICK);
		
		//Amethyst Armor Recipes
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.amethyst_helm), "GGG", "GAG", "AAA", 'G', ItemList.amethyst_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.amethyst_chest), "GAG", "GGG", "GGG", 'G', ItemList.amethyst_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.amethyst_legs), "GGG", "GAG", "GAG", 'G', ItemList.amethyst_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.amethyst_boots), "AAA", "GAG", "GAG", 'G', ItemList.amethyst_gem);
		
		//Sapphire Armor Recipes
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.sapphire_helm), "GGG", "GAG", "AAA", 'G', ItemList.sapphire_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.sapphire_chest), "GAG", "GGG", "GGG", 'G', ItemList.sapphire_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.sapphire_legs), "GGG", "GAG", "GAG", 'G', ItemList.sapphire_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.sapphire_boots), "AAA", "GAG", "GAG", 'G', ItemList.sapphire_gem);
		
		//Ruby Armor Recipes
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.ruby_helm), "GGG", "GAG", "AAA", 'G', ItemList.ruby_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.ruby_chest), "GAG", "GGG", "GGG", 'G', ItemList.ruby_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.ruby_legs), "GGG", "GAG", "GAG", 'G', ItemList.ruby_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.ruby_boots), "AAA", "GAG", "GAG", 'G', ItemList.ruby_gem);
		
		//FireOpal Armor Recipes
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.fireopal_helm), "GGG", "GAG", "AAA", 'G', ItemList.fireopal_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.fireopal_chest), "GAG", "GGG", "GGG", 'G', ItemList.fireopal_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.fireopal_legs), "GGG", "GAG", "GAG", 'G', ItemList.fireopal_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.fireopal_boots), "AAA", "GAG", "GAG", 'G', ItemList.fireopal_gem);
		
		//Topaz Armor Recipes
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.topaz_helm), "GGG", "GAG", "AAA", 'G', ItemList.topaz_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.topaz_chest), "GAG", "GGG", "GGG", 'G', ItemList.topaz_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.topaz_legs), "GGG", "GAG", "GAG", 'G', ItemList.topaz_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.topaz_boots), "AAA", "GAG", "GAG", 'G', ItemList.topaz_gem);
		
		//Pink Diamond Armor Recipes
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.pinkdiamond_helm), "GGG", "GAG", "AAA", 'G', ItemList.pinkdiamond_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.pinkdiamond_chest), "GAG", "GGG", "GGG", 'G', ItemList.pinkdiamond_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.pinkdiamond_legs), "GGG", "GAG", "GAG", 'G', ItemList.pinkdiamond_gem);
		GameRegistry.addShapedRecipe(new ItemStack(ItemList.pinkdiamond_boots), "AAA", "GAG", "GAG", 'G', ItemList.pinkdiamond_gem);
	}
}
