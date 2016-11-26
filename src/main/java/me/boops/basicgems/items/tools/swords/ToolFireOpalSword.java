package me.boops.basicgems.items.tools.swords;

import java.util.Random;

import me.boops.basicgems.Main;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ToolFireOpalSword extends ItemSword {
	
	//Get Custom Tool Materials
	static private ToolMaterial FIREOPAL = EnumHelper.addToolMaterial("FIREOPAL", 2, 608, 1.0F, 1.0F, 30);

	public ToolFireOpalSword() {
		super(FIREOPAL);
		
		this.setUnlocalizedName("fireopal_sword");
		
		this.setCreativeTab(Main.tab);
		
	}
	
	@Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
		
		//Spawn the lightning
		playerIn.getEntityWorld().spawnEntityInWorld(new EntityLightningBolt(playerIn.getEntityWorld(), pos.getX(), (pos.getY() + 1), pos.getZ(), false));
		
		//Damage the item
		stack.attemptDamageItem(1, new Random());
		
        return EnumActionResult.PASS;
    }
	
}
