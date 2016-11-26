package me.boops.basicgems.items.armor.boots;

import me.boops.basicgems.Main;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorSapphireBoots extends ItemArmor {
	
	private static ArmorMaterial SAPPHRE = EnumHelper.addArmorMaterial("SAPPHRE", "sapphire_boots", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

	public ArmorSapphireBoots() {
		super(SAPPHRE, 3, EntityEquipmentSlot.FEET);
		
		this.setUnlocalizedName("sapphire_boots");
		this.setCreativeTab(Main.tab);
		
	}
	
	@Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type){
		return Main.MODID + ":textures/items/armor/sapphire_layer_1.png";
    }
	
}
