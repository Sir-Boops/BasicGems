package me.boops.basicgems.items.tools.hoes;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolPinkDiamondHoe extends ItemHoe {

	// Get Custom Tool Materials
	static private ToolMaterial PINK_DIAMOND = EnumHelper.addToolMaterial("PINK_DIAMOND", 2, 2016, 1.0F, 1.0F, 26);

	public ToolPinkDiamondHoe() {
		super(PINK_DIAMOND);

		this.setUnlocalizedName("pinkdiamond_hoe");

		this.setCreativeTab(Main.tab);

	}
}
