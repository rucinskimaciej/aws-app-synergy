package online.rumac.common.config;

import online.rumac.common.details.Details;
import online.rumac.common.details.appDetails.AppDetails;
import online.rumac.common.details.deviceDetails.DeviceDetails;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigUtils {

    private final Map<String, String> properties;
    private final String PLATFORM;

    public ConfigUtils() {
        properties = new HashMap<>();
        setDeviceProperties();
        PLATFORM = properties.get("Platform");
        setAppProperties();
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    private void setDeviceProperties() {
        Details device = new DeviceDetails();
        properties.put("Platform", device.getDetails().get("Platform"));
        properties.put("DeviceId", device.getDetails().get("DeviceId"));
        properties.put("UnlockStrategy", device.getDetails().get("UnlockStrategy"));
    }

    private void setAppProperties() {
        Details app = new AppDetails(PLATFORM);
        properties.put("AppPackage", app.getDetails().get("AppPackage"));
        properties.put("AppName", app.getDetails().get("AppName"));
        properties.put("LaunchActivity", app.getDetails().get("LaunchActivity"));
    }
}
