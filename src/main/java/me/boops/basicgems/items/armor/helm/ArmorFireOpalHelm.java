package me.boops.basicgems.items.armor.helm;

import java.util.List;

import com.google.common.collect.Lists;

import me.boops.basicgems.Main;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorFireOpalHelm extends ItemArmor {

	private static ArmorMaterial FIREOPAL = EnumHelper.addArmorMaterial("FIREOPAL", "fireopal_helm", 33,
			new int[] { 3, 6, 8, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

	public ArmorFireOpalHelm() {
		super(FIREOPAL, 0, EntityEquipmentSlot.HEAD);

		this.setUnlocalizedName("fireopal_helm");
		this.setCreativeTab(Main.tab);

	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return Main.MODID + ":textures/items/armor/fireopal_layer_1.png";
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {

		List<ItemStack> armor = Lists.newArrayList(player.getArmorInventoryList());

		if (armor.get(0) != null && armor.get(1) != null && armor.get(2) != null && armor.get(3) != null) {
			if (armor.get(0).getUnlocalizedName().equals("item.fireopal_boots")) {
				if (armor.get(1).getUnlocalizedName().equals("item.fireopal_legs")) {
					if (armor.get(2).getUnlocalizedName().equals("item.fireopal_chest")) {
						if (armor.get(3).getUnlocalizedName().equals("item.fireopal_helm")) {
							player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 200));
						}
					}
				}
			}
		}
	}

}
