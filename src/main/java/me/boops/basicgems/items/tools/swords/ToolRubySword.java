package me.boops.basicgems.items.tools.swords;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ToolRubySword extends ItemSword {
	
	//Get Custom Tool Materials
	static private ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2, 564, 1.0F, 1.0F, 28);
	
	public ToolRubySword() {
		super(RUBY);
		
		this.setUnlocalizedName("ruby_sword");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
