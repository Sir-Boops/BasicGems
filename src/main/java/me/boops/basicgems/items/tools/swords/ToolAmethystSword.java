package me.boops.basicgems.items.tools.swords;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ToolAmethystSword extends ItemSword {
	
	static private ToolMaterial AMETHYST = EnumHelper.addToolMaterial("AMETHYST", 2, 204, 1.0F, 1.0F, 22);
	
	public ToolAmethystSword() {
		super(AMETHYST);
		
		//Get Custom Tool Materials
		
		this.setUnlocalizedName("amethyst_sword");
			
		this.setCreativeTab(Main.tab);
		
	}
}
