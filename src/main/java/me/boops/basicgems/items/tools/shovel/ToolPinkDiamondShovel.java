package me.boops.basicgems.items.tools.shovel;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class ToolPinkDiamondShovel extends ItemSpade {
	
	//Get Custom Tool Materials
	static private ToolMaterial PINK_DIAMOND = EnumHelper.addToolMaterial("PINK_DIAMOND", 2, 2016, 1.0F, 1.0F, 26);

	public ToolPinkDiamondShovel() {
		super(PINK_DIAMOND);
		
		this.setUnlocalizedName("pinkdiamond_shovel");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
