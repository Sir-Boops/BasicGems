package me.boops.basicgems.items.tools.shovel;

import me.boops.basicgems.Main;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class ToolAmethystShovel extends ItemSpade {
	
	//Get Custom Tool Materials
	static private ToolMaterial AMETHYST = EnumHelper.addToolMaterial("AMETHYST", 2, 204, 1.0F, 1.0F, 22);

	public ToolAmethystShovel() {
		super(AMETHYST);
		
		this.setUnlocalizedName("amethyst_shovel");
		
		this.setCreativeTab(Main.tab);
		
	}


}
