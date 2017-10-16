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
	public Item amethyst_gem = new ItemAmethystGem();
	public Item sapphire_gem = new ItemSapphireGem();
	public Item ruby_gem = new ItemRubyGem();
	public Item fireopal_gem = new ItemFireOpalGem();
	public Item topaz_gem = new ItemTopazGem();
	public Item pinkdiamond_gem = new ItemPinkDiamondGem();
	
	//Register Swords
	public Item amethyst_sword = new ToolAmethystSword();
	public Item sapphire_sword = new ToolSapphireSword();
	public Item ruby_sword = new ToolRubySword();
	public Item fireopal_sword = new ToolFireOpalSword();
	public Item topaz_sword = new ToolTopazSword();
	public Item pinkdiamond_sword = new ToolPinkDiamondSword();
	
	//Register Pickaxes
	public Item amethyst_pickaxe = new ToolAmethystPickaxe();
	public Item sapphire_pickaxe = new ToolSapphirePickaxe();
	public Item ruby_pickaxe = new ToolRubyPickaxe();
	public Item fireopal_pickaxe = new ToolFireOpalPickaxe();
	public Item topaz_pickaxe = new ToolTopazPickaxe();
	public Item pinkdiamond_pickaxe = new ToolPinkDiamondPickaxe();
	
	//Register Shovel
	public Item amethyst_shovel = new ToolAmethystShovel();
	public Item sapphire_shovel = new ToolSapphireShovel();
	public Item ruby_shovel = new ToolRubyShovel();
	public Item fireopal_shovel = new ToolFireOpalShovel();
	public Item topaz_shovel = new ToolTopazShovel();
	public Item pinkdiamond_shovel = new ToolPinkDiamondShovel();
	
	//Register Axe
	public Item amethyst_axe = new ToolAmethystAxe();
	public Item sapphire_axe = new ToolSapphireAxe();
	public Item ruby_axe = new ToolRubyAxe();
	public Item fireopal_axe = new ToolFireOpalAxe();
	public Item topaz_axe = new ToolTopazAxe();
	public Item pinkdiamond_axe = new ToolPinkDiamondAxe();
	
	//Register Hoe
	public Item amethyst_hoe = new ToolAmethystHoe();
	public Item sapphire_hoe = new ToolSapphireHoe();
	public Item ruby_hoe = new ToolRubyHoe();
	public Item fireopal_hoe = new ToolFireOpalHoe();
	public Item topaz_hoe = new ToolTopazHoe();
	public Item pinkdiamond_hoe = new ToolPinkDiamondHoe();
	
	//Register Amethyst Armor
	public Item amethyst_helm = new ArmorAmethystHelm();
	public Item amethyst_chest = new ArmorAmethystChest();
	public Item amethyst_legs = new ArmorAmethystLegs();
	public Item amethyst_boots = new ArmorAmethystBoots();
	
	//Register Sapphire Armor
	public Item sapphire_helm = new ArmorSapphireHelm();
	public Item sapphire_chest = new ArmorSapphireChest();
	public Item sapphire_legs = new ArmorSapphireLegs();
	public Item sapphire_boots = new ArmorSapphireBoots();
	
	//Register Ruby Armor
	public Item ruby_helm = new ArmorRubyHelm();
	public Item ruby_chest = new ArmorRubyChest();
	public Item ruby_legs = new ArmorRubyLegs();
	public Item ruby_boots = new ArmorRubyBoots();
	
	//Register FireOpal Armor
	public Item fireopal_helm = new ArmorFireOpalHelm();
	public Item fireopal_chest = new ArmorFireOpalChest();
	public Item fireopal_legs = new ArmorFireOpalLegs();
	public Item fireopal_boots = new ArmorFireOpalBoots();
	
	//Register Topaz Armor
	public Item topaz_helm = new ArmorTopazHelm();
	public Item topaz_chest = new ArmorTopazChest();
	public Item topaz_legs = new ArmorTopazLegs();
	public Item topaz_boots = new ArmorTopazBoots();
	
	//Register Pink Diamond Armor
	public Item pinkdiamond_helm = new ArmorPinkDiamondHelm();
	public Item pinkdiamond_chest = new ArmorPinkDiamondChest();
	public Item pinkdiamond_legs = new ArmorPinkDiamondLegs();
	public Item pinkdiamond_boots = new ArmorPinkDiamondBoots();
	
}
