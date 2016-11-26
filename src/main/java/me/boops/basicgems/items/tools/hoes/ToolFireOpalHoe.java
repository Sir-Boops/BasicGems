package me.boops.basicgems.items.tools.hoes;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolFireOpalHoe extends ItemHoe {
	
	//Get Custom Tool Materials
	static private ToolMaterial FIREOPAL = EnumHelper.addToolMaterial("FIREOPAL", 2, 608, 1.0F, 1.0F, 30);

	public ToolFireOpalHoe() {
		super(FIREOPAL);
		
		this.setUnlocalizedName("fireopal_hoe");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
