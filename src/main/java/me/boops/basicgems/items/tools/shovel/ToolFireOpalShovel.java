package me.boops.basicgems.items.tools.shovel;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class ToolFireOpalShovel extends ItemSpade {
	
	//Get Custom Tool Materials
	static private ToolMaterial FIREOPAL = EnumHelper.addToolMaterial("FIREOPAL", 2, 608, 1.0F, 1.0F, 30);

	public ToolFireOpalShovel() {
		super(FIREOPAL);
		
		this.setUnlocalizedName("fireopal_shovel");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
