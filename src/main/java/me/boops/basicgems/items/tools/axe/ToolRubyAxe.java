package me.boops.basicgems.items.tools.axe;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolRubyAxe extends ItemAxe {
	
	//Get Custom Tool Materials
	static private ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2, 564, 1.0F, 1.0F, 28);
	
	public ToolRubyAxe() {
		super(RUBY, 1.0F, 1.0F);
		
		this.setUnlocalizedName("ruby_axe");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
