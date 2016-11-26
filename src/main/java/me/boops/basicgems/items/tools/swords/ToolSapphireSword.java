package me.boops.basicgems.items.tools.swords;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ToolSapphireSword extends ItemSword {
	
	//Get Custom Tool Materials
	static private ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 2, 312, 1.0F, 1.0F, 26);

	public ToolSapphireSword() {
		super(SAPPHIRE);
		
		this.setUnlocalizedName("sapphire_sword");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
