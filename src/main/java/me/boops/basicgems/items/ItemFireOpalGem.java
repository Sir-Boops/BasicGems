package me.boops.basicgems.items;

import java.util.List;

import javax.annotation.Nullable;

import me.boops.basicgems.Main;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemFireOpalGem extends Item {
	
	public ItemFireOpalGem(){
		
		//Set the name
		this.setUnlocalizedName("fireopal_gem");
		
		//Set creative tab
		this.setCreativeTab(Main.tab);	
	}
	
	//Set the tooltip
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn){
		tooltip.add("§4It holds the essence of fire");
    }
}
