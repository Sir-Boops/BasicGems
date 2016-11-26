package me.boops.basicgems.items.tools.axe;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolTopazAxe extends ItemAxe {
	
	//Get Custom Tool Materials
	static private ToolMaterial TOPAZ = EnumHelper.addToolMaterial("TOPAZ", 2, 926, 1.0F, 1.0F, 32);

	public ToolTopazAxe() {
		super(TOPAZ, 1.0F, 1.0F);
		
		this.setUnlocalizedName("topaz_axe");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
