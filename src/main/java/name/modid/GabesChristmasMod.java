package name.modid;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import name.modid.Item.ModItems;

public class GabesChristmasMod implements ModInitializer {
	public static final String MOD_ID = "gabes-christmas-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
	}
}