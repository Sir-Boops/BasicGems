package me.boops.basicgems.items.tools.shovel;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class ToolTopazShovel extends ItemSpade {
	
	//Get Custom Tool Materials
	static private ToolMaterial TOPAZ = EnumHelper.addToolMaterial("TOPAZ", 2, 926, 1.0F, 1.0F, 32);

	public ToolTopazShovel() {
		super(TOPAZ);
		
		this.setUnlocalizedName("topaz_shovel");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
