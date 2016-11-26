package me.boops.basicgems.items;

import java.util.List;

import me.boops.basicgems.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFireOpalGem extends Item {
	
	public ItemFireOpalGem(){
		
		//Set the name
		this.setUnlocalizedName("fireopal_gem");
		
		//Set creative tab
		this.setCreativeTab(Main.tab);	
	}
	
	//Set the tooltip
	@Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced){
		tooltip.add("§4It holds the essence of fire");
    }
}
