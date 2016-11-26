package me.boops.basicgems.items;

import java.util.List;

import me.boops.basicgems.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemSapphireGem extends Item {
	
	public ItemSapphireGem(){
		
		//Set the name
		this.setUnlocalizedName("sapphire_gem");
		
		//Set creative tab
		this.setCreativeTab(Main.tab);
		
	}
	
	//Set the tool tip
	@Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced){
		
		tooltip.add("§9It's dripping wet");
		
    }
}
