package me.boops.basicgems.items.tools.pickaxes;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolFireOpalPickaxe extends ItemPickaxe{
	
	//Get Custom Tool Materials
	static private ToolMaterial FIREOPAL = EnumHelper.addToolMaterial("FIREOPAL", 2, 608, 1.0F, 1.0F, 30);

	public ToolFireOpalPickaxe() {
		super(FIREOPAL);
		
		this.setUnlocalizedName("fireopal_pickaxe");
		
		this.setCreativeTab(Main.tab);
		
	}
	
	
}
