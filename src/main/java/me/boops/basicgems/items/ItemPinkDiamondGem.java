package me.boops.basicgems.items;

import java.util.List;

import me.boops.basicgems.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPinkDiamondGem extends Item {
	
	public ItemPinkDiamondGem(){
		
		//Set the name
		this.setUnlocalizedName("pinkdiamond_gem");
		
		//Set creative tab
		this.setCreativeTab(Main.tab);
		
	}
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced){
		tooltip.add("§dThe rarest gem of them all");
    }
	
}
