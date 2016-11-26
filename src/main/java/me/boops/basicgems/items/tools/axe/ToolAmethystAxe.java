package me.boops.basicgems.items.tools.axe;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolAmethystAxe extends ItemAxe {
	
	//Get Custom Tool Materials
	static private ToolMaterial AMETHYST = EnumHelper.addToolMaterial("AMETHYST", 2, 204, 1.0F, 1.5F, 22);
	
	public ToolAmethystAxe() {
		super(AMETHYST, 1.0F, 1.0F);
		
		this.setUnlocalizedName("amethyst_axe");
		
		this.setCreativeTab(Main.tab);
	}
	
}
