package me.boops.basicgems.items.tools.axe;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolPinkDiamondAxe extends ItemAxe {
	
	//Get Custom Tool Materials
	static private ToolMaterial PINK_DIAMOND = EnumHelper.addToolMaterial("PINK_DIAMOND", 2, 2016, 1.0F, 1.0F, 26);

	public ToolPinkDiamondAxe() {
		super(PINK_DIAMOND, 1.0F, 1.0F);
		
		this.setUnlocalizedName("pinkdiamond_axe");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
