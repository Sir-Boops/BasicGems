package me.boops.basicgems.registry;

import me.boops.basicgems.Main;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterItem {

	public void Register(Item item) {
		
		String name = (item.getUnlocalizedName().replaceFirst("item.", ""));

		// Register the item
		GameRegistry.register(item.setRegistryName(Main.MODID, name));

		// Register The Renderer
		RegisterRenderer renderer = new RegisterRenderer();

		renderer.RegisterItem(item, name);

	}
}
