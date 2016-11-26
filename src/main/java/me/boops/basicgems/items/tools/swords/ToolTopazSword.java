package me.boops.basicgems.items.tools.swords;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ToolTopazSword extends ItemSword {
	
	//Get Custom Tool Materials
	static private ToolMaterial TOPAZ = EnumHelper.addToolMaterial("TOPAZ", 2, 926, 1.0F, 1.0F, 32);

	public ToolTopazSword() {
		super(TOPAZ);
		
		this.setUnlocalizedName("topaz_sword");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
