package me.boops.basicgems.items.tools.hoes;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolTopazHoe extends ItemHoe {
	
	//Get Custom Tool Materials
	static private ToolMaterial TOPAZ = EnumHelper.addToolMaterial("TOPAZ", 2, 926, 1.0F, 1.0F, 32);

	public ToolTopazHoe() {
		super(TOPAZ);
		
		this.setUnlocalizedName("topaz_hoe");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
