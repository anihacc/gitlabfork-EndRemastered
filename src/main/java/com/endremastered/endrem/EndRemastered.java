package com.endremastered.endrem;

import com.endremastered.endrem.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class EndRemastered implements ModInitializer {
	public static String MOD_ID = "endrem";
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			createIdentifier("endrem_tab"),
			() -> new ItemStack(Blocks.END_PORTAL));

	public static Identifier createIdentifier(String name) {
		return new Identifier(EndRemastered.MOD_ID, name);
	}

	@Override
	public void onInitialize() {
		ItemRegistry.init();
	}
}