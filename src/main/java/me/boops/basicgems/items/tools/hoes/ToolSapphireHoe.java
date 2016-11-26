package me.boops.basicgems.items.tools.hoes;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolSapphireHoe extends ItemHoe {
	
	// Get Custom Tool Materials
	static private ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 2, 312, 1.0F, 1.0F, 26);

	public ToolSapphireHoe() {
		super(SAPPHIRE);

		this.setUnlocalizedName("sapphire_hoe");

		this.setCreativeTab(Main.tab);

	}
	
}
