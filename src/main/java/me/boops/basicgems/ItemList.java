package me.boops.basicgems;

import me.boops.basicgems.items.ItemAmethystGem;
import me.boops.basicgems.items.ItemFireOpalGem;
import me.boops.basicgems.items.ItemPinkDiamondGem;
import me.boops.basicgems.items.ItemRubyGem;
import me.boops.basicgems.items.ItemSapphireGem;
import me.boops.basicgems.items.ItemTopazGem;
import me.boops.basicgems.items.armor.boots.ArmorAmethystBoots;
import me.boops.basicgems.items.armor.boots.ArmorFireOpalBoots;
import me.boops.basicgems.items.armor.boots.ArmorPinkDiamondBoots;
import me.boops.basicgems.items.armor.boots.ArmorRubyBoots;
import me.boops.basicgems.items.armor.boots.ArmorSapphireBoots;
import me.boops.basicgems.items.armor.boots.ArmorTopazBoots;
import me.boops.basicgems.items.armor.chest.ArmorAmethystChest;
import me.boops.basicgems.items.armor.chest.ArmorFireOpalChest;
import me.boops.basicgems.items.armor.chest.ArmorPinkDiamondChest;
import me.boops.basicgems.items.armor.chest.ArmorRubyChest;
import me.boops.basicgems.items.armor.chest.ArmorSapphireChest;
import me.boops.basicgems.items.armor.chest.ArmorTopazChest;
import me.boops.basicgems.items.armor.helm.ArmorAmethystHelm;
import me.boops.basicgems.items.armor.helm.ArmorFireOpalHelm;
import me.boops.basicgems.items.armor.helm.ArmorPinkDiamondHelm;
import me.boops.basicgems.items.armor.helm.ArmorRubyHelm;
import me.boops.basicgems.items.armor.helm.ArmorSapphireHelm;
import me.boops.basicgems.items.armor.helm.ArmorTopazHelm;
import me.boops.basicgems.items.armor.legs.ArmorAmethystLegs;
import me.boops.basicgems.items.armor.legs.ArmorFireOpalLegs;
import me.boops.basicgems.items.armor.legs.ArmorPinkDiamondLegs;
import me.boops.basicgems.items.armor.legs.ArmorRubyLegs;
import me.boops.basicgems.items.armor.legs.ArmorSapphireLegs;
import me.boops.basicgems.items.armor.legs.ArmorTopazLegs;
import me.boops.basicgems.items.tools.axe.ToolAmethystAxe;
import me.boops.basicgems.items.tools.axe.ToolFireOpalAxe;
import me.boops.basicgems.items.tools.axe.ToolPinkDiamondAxe;
import me.boops.basicgems.items.tools.axe.ToolRubyAxe;
import me.boops.basicgems.items.tools.axe.ToolSapphireAxe;
import me.boops.basicgems.items.tools.axe.ToolTopazAxe;
import me.boops.basicgems.items.tools.hoes.ToolAmethystHoe;
import me.boops.basicgems.items.tools.hoes.ToolFireOpalHoe;
import me.boops.basicgems.items.tools.hoes.ToolPinkDiamondHoe;
import me.boops.basicgems.items.tools.hoes.ToolRubyHoe;
import me.boops.basicgems.items.tools.hoes.ToolSapphireHoe;
import me.boops.basicgems.items.tools.hoes.ToolTopazHoe;
import me.boops.basicgems.items.tools.pickaxes.ToolAmethystPickaxe;
import me.boops.basicgems.items.tools.pickaxes.ToolFireOpalPickaxe;
import me.boops.basicgems.items.tools.pickaxes.ToolPinkDiamondPickaxe;
import me.boops.basicgems.items.tools.pickaxes.ToolRubyPickaxe;
import me.boops.basicgems.items.tools.pickaxes.ToolSapphirePickaxe;
import me.boops.basicgems.items.tools.pickaxes.ToolTopazPickaxe;
import me.boops.basicgems.items.tools.shovel.ToolAmethystShovel;
import me.boops.basicgems.items.tools.shovel.ToolFireOpalShovel;
import me.boops.basicgems.items.tools.shovel.ToolPinkDiamondShovel;
import me.boops.basicgems.items.tools.shovel.ToolRubyShovel;
import me.boops.basicgems.items.tools.shovel.ToolSapphireShovel;
import me.boops.basicgems.items.tools.shovel.ToolTopazShovel;
import me.boops.basicgems.items.tools.swords.ToolAmethystSword;
import me.boops.basicgems.items.tools.swords.ToolFireOpalSword;
import me.boops.basicgems.items.tools.swords.ToolPinkDiamondSword;
import me.boops.basicgems.items.tools.swords.ToolRubySword;
import me.boops.basicgems.items.tools.swords.ToolSapphireSword;
import me.boops.basicgems.items.tools.swords.ToolTopazSword;
import net.minecraft.item.Item;

public class ItemList {
	
	//Register Gems
	public static Item amethyst_gem = new ItemAmethystGem();
	public static Item sapphire_gem = new ItemSapphireGem();
	public static Item ruby_gem = new ItemRubyGem();
	public static Item fireopal_gem = new ItemFireOpalGem();
	public static Item topaz_gem = new ItemTopazGem();
	public static Item pinkdiamond_gem = new ItemPinkDiamondGem();
	
	//Register Swords
	public static Item amethyst_sword = new ToolAmethystSword();
	public static Item sapphire_sword = new ToolSapphireSword();
	public static Item ruby_sword = new ToolRubySword();
	public static Item fireopal_sword = new ToolFireOpalSword();
	public static Item topaz_sword = new ToolTopazSword();
	public static Item pinkdiamond_sword = new ToolPinkDiamondSword();
	
	//Register Pickaxes
	public static Item amethyst_pickaxe = new ToolAmethystPickaxe();
	public static Item sapphire_pickaxe = new ToolSapphirePickaxe();
	public static Item ruby_pickaxe = new ToolRubyPickaxe();
	public static Item fireopal_pickaxe = new ToolFireOpalPickaxe();
	public static Item topaz_pickaxe = new ToolTopazPickaxe();
	public static Item pinkdiamond_pickaxe = new ToolPinkDiamondPickaxe();
	
	//Register Shovel
	public static Item amethyst_shovel = new ToolAmethystShovel();
	public static Item sapphire_shovel = new ToolSapphireShovel();
	public static Item ruby_shovel = new ToolRubyShovel();
	public static Item fireopal_shovel = new ToolFireOpalShovel();
	public static Item topaz_shovel = new ToolTopazShovel();
	public static Item pinkdiamond_shovel = new ToolPinkDiamondShovel();
	
	//Register Axe
	public static Item amethyst_axe = new ToolAmethystAxe();
	public static Item sapphire_axe = new ToolSapphireAxe();
	public static Item ruby_axe = new ToolRubyAxe();
	public static Item fireopal_axe = new ToolFireOpalAxe();
	public static Item topaz_axe = new ToolTopazAxe();
	public static Item pinkdiamond_axe = new ToolPinkDiamondAxe();
	
	//Register Hoe
	public static Item amethyst_hoe = new ToolAmethystHoe();
	public static Item sapphire_hoe = new ToolSapphireHoe();
	public static Item ruby_hoe = new ToolRubyHoe();
	public static Item fireopal_hoe = new ToolFireOpalHoe();
	public static Item topaz_hoe = new ToolTopazHoe();
	public static Item pinkdiamond_hoe = new ToolPinkDiamondHoe();
	
	//Register Amethyst Armor
	public static Item amethyst_helm = new ArmorAmethystHelm();
	public static Item amethyst_chest = new ArmorAmethystChest();
	public static Item amethyst_legs = new ArmorAmethystLegs();
	public static Item amethyst_boots = new ArmorAmethystBoots();
	
	//Register Sapphire Armor
	public static Item sapphire_helm = new ArmorSapphireHelm();
	public static Item sapphire_chest = new ArmorSapphireChest();
	public static Item sapphire_legs = new ArmorSapphireLegs();
	public static Item sapphire_boots = new ArmorSapphireBoots();
	
	//Register Ruby Armor
	public static Item ruby_helm = new ArmorRubyHelm();
	public static Item ruby_chest = new ArmorRubyChest();
	public static Item ruby_legs = new ArmorRubyLegs();
	public static Item ruby_boots = new ArmorRubyBoots();
	
	//Register FireOpal Armor
	public static Item fireopal_helm = new ArmorFireOpalHelm();
	public static Item fireopal_chest = new ArmorFireOpalChest();
	public static Item fireopal_legs = new ArmorFireOpalLegs();
	public static Item fireopal_boots = new ArmorFireOpalBoots();
	
	//Register Topaz Armor
	public static Item topaz_helm = new ArmorTopazHelm();
	public static Item topaz_chest = new ArmorTopazChest();
	public static Item topaz_legs = new ArmorTopazLegs();
	public static Item topaz_boots = new ArmorTopazBoots();
	
	//Register Pink Diamond Armor
	public static Item pinkdiamond_helm = new ArmorPinkDiamondHelm();
	public static Item pinkdiamond_chest = new ArmorPinkDiamondChest();
	public static Item pinkdiamond_legs = new ArmorPinkDiamondLegs();
	public static Item pinkdiamond_boots = new ArmorPinkDiamondBoots();
	
}
