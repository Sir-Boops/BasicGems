package me.boops.basicgems.items.tools.hoes;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolAmethystHoe extends ItemHoe {
	
	//Get Custom Tool Materials
	static private ToolMaterial AMETHYST = EnumHelper.addToolMaterial("AMETHYST", 2, 204, 1.0F, 1.5F, 22);

	public ToolAmethystHoe() {
		super(AMETHYST);
		
		
		//Set the name
		this.setUnlocalizedName("amethyst_hoe");
		
		//Other settings
		this.setCreativeTab(Main.tab);
	}
	
}
