package org.tct.onminelessons;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tct.onminelessons.item.ModItems;

public class OnMineLessons implements ModInitializer {
	public static final String MODID = "onminelessons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModItems.register();
	}
}
