package online.rumac.common.config;

import online.rumac.common.appDetails.AppDetails;
import online.rumac.common.util.Platform;

public class ConfigUtils {

    public final String PLATFORM;
    public final String DEVICE_ID;
    public final String APP_PACKAGE;
    public final String APP_NAME;
    public final String LAUNCH_ACTIVITY;
    public final String UNLOCK_STRATEGY;

    public ConfigUtils() {
        this.PLATFORM = System.getProperty("device.platform");
        AppDetails appDetails = new AppDetails(Platform.valueOf(PLATFORM.toUpperCase()));
        this.DEVICE_ID = System.getProperty("device.id");
        this.APP_PACKAGE = appDetails.APP_PACKAGE;
        this.APP_NAME = appDetails.APP_NAME;
        this.LAUNCH_ACTIVITY = appDetails.LAUNCH_ACTIVITY;
        this.UNLOCK_STRATEGY = appDetails.UNLOCK_STRATEGY;
    }
}
