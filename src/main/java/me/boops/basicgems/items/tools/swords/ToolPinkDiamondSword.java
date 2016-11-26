package me.boops.basicgems.items.tools.swords;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ToolPinkDiamondSword extends ItemSword {
	
	//Get Custom Tool Materials
	static private ToolMaterial PINK_DIAMOND = EnumHelper.addToolMaterial("PINK_DIAMOND", 2, 2016, 1.0F, 1.0F, 26);

	public ToolPinkDiamondSword() {
		super(PINK_DIAMOND);
		
		this.setUnlocalizedName("pinkdiamond_sword");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
