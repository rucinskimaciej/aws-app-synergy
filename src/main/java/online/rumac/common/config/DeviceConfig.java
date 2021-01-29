package online.rumac.common.config;

import com.synergy.core.driver.DeviceCapabilities;

public class DeviceConfig {

    private final DeviceCapabilities caps;

    public DeviceConfig(DeviceCapabilities caps) {
        this.caps = caps;
    }

    public void setDeviceType() {
        caps.addCapability("Platform", ConfigUtils.PLATFORM);
    }

    public void setDeviceId() {
        caps.addCapability("DeviceID", ConfigUtils.DEVICE_ID);
    }

    public void setAppPackage() {
        caps.addCapability("AppPackage", ConfigUtils.APP_PACKAGE);
    }
}
