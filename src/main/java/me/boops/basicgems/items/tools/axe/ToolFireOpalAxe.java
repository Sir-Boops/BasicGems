package me.boops.basicgems.items.tools.axe;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolFireOpalAxe extends ItemAxe {
	
	//Get Custom Tool Materials
	static private ToolMaterial FIREOPAL = EnumHelper.addToolMaterial("FIREOPAL", 2, 608, 1.0F, 1.0F, 30);

	public ToolFireOpalAxe() {
		super(FIREOPAL, 1.0F, 1.0F);
		
		this.setUnlocalizedName("fireopal_axe");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
