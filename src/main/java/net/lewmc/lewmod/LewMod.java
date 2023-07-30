package net.lewmc.lewmod;

import net.fabricmc.api.ModInitializer;

import net.lewmc.lewmod.block.ModBlocks;
import net.lewmc.lewmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class LewMod implements ModInitializer {

	public static final String MOD_ID = "lewmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		GeckoLib.initialize();

	}
}