package me.boops.basicgems.items.tools.shovel;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class ToolRubyShovel extends ItemSpade {
	
	//Get Custom Tool Materials
	static private ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2, 564, 1.0F, 1.0F, 28);
	
	public ToolRubyShovel() {
		super(RUBY);
		
		this.setUnlocalizedName("ruby_shovel");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
