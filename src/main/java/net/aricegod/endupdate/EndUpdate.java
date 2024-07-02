package net.aricegod.endupdate;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndUpdate implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("end-update");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}