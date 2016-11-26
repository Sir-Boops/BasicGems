package me.boops.basicgems.items.tools.axe;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolSapphireAxe extends ItemAxe {
	
	// Get Custom Tool Materials
	static private ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 2, 312, 1.0F, 1.0F, 26);

	public ToolSapphireAxe() {
		super(SAPPHIRE, 1.0F, 1.0F);

		this.setUnlocalizedName("sapphire_axe");

		this.setCreativeTab(Main.tab);

	}
	
}
