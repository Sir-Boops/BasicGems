package me.boops.basicgems.items.armor.legs;

import me.boops.basicgems.Main;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorTopazLegs extends ItemArmor {
	
	private static ArmorMaterial TOPAZ = EnumHelper.addArmorMaterial("TOPAZ", "topaz_legs", 33,
			new int[] { 3, 6, 8, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

	public ArmorTopazLegs() {
		super(TOPAZ, 2, EntityEquipmentSlot.LEGS);

		this.setUnlocalizedName("topaz_legs");
		this.setCreativeTab(Main.tab);

	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return Main.MODID + ":textures/items/armor/topaz_layer_2.png";
	}
	
}
