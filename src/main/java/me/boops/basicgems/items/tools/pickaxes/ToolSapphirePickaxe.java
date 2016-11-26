package me.boops.basicgems.items.tools.pickaxes;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolSapphirePickaxe extends ItemPickaxe {

	// Get Custom Tool Materials
	static private ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 2, 312, 1.0F, 1.0F, 26);

	public ToolSapphirePickaxe() {
		super(SAPPHIRE);

		this.setUnlocalizedName("sapphire_pickaxe");

		this.setCreativeTab(Main.tab);

	}
}
