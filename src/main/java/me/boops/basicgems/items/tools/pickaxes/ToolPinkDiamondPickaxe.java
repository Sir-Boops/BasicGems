package me.boops.basicgems.items.tools.pickaxes;

import me.boops.basicgems.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ToolPinkDiamondPickaxe extends ItemPickaxe {
	
	//Get Custom Tool Materials
	static private ToolMaterial PINK_DIAMOND = EnumHelper.addToolMaterial("PINK_DIAMOND", 2, 2016, 1.0F, 1.0F, 26);

	public ToolPinkDiamondPickaxe() {
		super(PINK_DIAMOND);
		
		this.setUnlocalizedName("pinkdiamond_pickaxe");
		
		this.setCreativeTab(Main.tab);
		
	}
	
	//Cause an explosion
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		worldIn.createExplosion(player, pos.getX(), pos.getY(), pos.getZ(), 7.0F, true);
		
		//Damage the item
		player.getHeldItemMainhand().damageItem(1, player);
		
        return EnumActionResult.PASS;
	}

}
