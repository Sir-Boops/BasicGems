package me.boops.basicgems.items.armor.chest;

import me.boops.basicgems.Main;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorPinkDiamondChest extends ItemArmor {
	
	private static ArmorMaterial PINKDIAMOND = EnumHelper.addArmorMaterial("PINKDIAMOND", "pinkdiamond_chest", 33,
			new int[] { 3, 6, 8, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

	public ArmorPinkDiamondChest() {
		super(PINKDIAMOND, 1, EntityEquipmentSlot.CHEST);

		this.setUnlocalizedName("pinkdiamond_chest");
		this.setCreativeTab(Main.tab);

	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return Main.MODID + ":textures/items/armor/pinkdiamond_layer_1.png";
	}
	
}
