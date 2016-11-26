package me.boops.basicgems.items.tools.pickaxes;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolRubyPickaxe extends ItemPickaxe {
	
	//Get Custom Tool Materials
	static private ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2, 564, 1.0F, 1.0F, 28);
	
	public ToolRubyPickaxe() {
		super(RUBY);
		
		this.setUnlocalizedName("ruby_pickaxe");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
