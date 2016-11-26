package me.boops.basicgems.items.tools.hoes;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolRubyHoe extends ItemHoe {
	
	//Get Custom Tool Materials
	static private ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2, 564, 1.0F, 1.0F, 28);
	
	public ToolRubyHoe() {
		super(RUBY);
		
		this.setUnlocalizedName("ruby_hoe");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
