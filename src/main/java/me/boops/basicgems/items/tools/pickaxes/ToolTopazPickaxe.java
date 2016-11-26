package me.boops.basicgems.items.tools.pickaxes;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolTopazPickaxe extends ItemPickaxe{
	
	//Get Custom Tool Materials
	static private ToolMaterial TOPAZ = EnumHelper.addToolMaterial("TOPAZ", 2, 926, 1.0F, 1.0F, 32);

	public ToolTopazPickaxe() {
		super(TOPAZ);
		
		this.setUnlocalizedName("topaz_pickaxe");
		
		this.setCreativeTab(Main.tab);
		
	}
	
}
