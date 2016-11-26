package me.boops.basicgems.items.tools.pickaxes;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolAmethystPickaxe extends ItemPickaxe {
	
	//Get Custom Tool Materials
	static private ToolMaterial AMETHYST = EnumHelper.addToolMaterial("AMETHYST", 2, 204, 1.0F, 1.5F, 22);

	public ToolAmethystPickaxe() {
		super(AMETHYST);
		
		
		//Set the name
		this.setUnlocalizedName("amethyst_pickaxe");
		
		//Other settings
		this.setCreativeTab(Main.tab);
	}

}
