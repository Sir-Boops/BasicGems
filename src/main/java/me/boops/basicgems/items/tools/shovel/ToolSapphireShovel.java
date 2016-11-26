package me.boops.basicgems.items.tools.shovel;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class ToolSapphireShovel extends ItemSpade {
	
	//Get Custom Tool Materials
	static private ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 2, 312, 1.0F, 1.0F, 26);

	public ToolSapphireShovel() {
		super(SAPPHIRE);
		
		this.setUnlocalizedName("sapphire_shovel");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
