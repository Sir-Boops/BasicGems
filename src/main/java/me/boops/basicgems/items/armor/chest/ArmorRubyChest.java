package me.boops.basicgems.items.armor.chest;

import me.boops.basicgems.Main;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorRubyChest extends ItemArmor {
	
	private static ArmorMaterial RUBY = EnumHelper.addArmorMaterial("RUBY", "ruby_chest", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

	public ArmorRubyChest() {
		super(RUBY, 1, EntityEquipmentSlot.CHEST);
		
		this.setUnlocalizedName("ruby_chest");
		this.setCreativeTab(Main.tab);
		
	}
	
	@Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type){
		return Main.MODID + ":textures/items/armor/ruby_layer_1.png";
    }
	
}
