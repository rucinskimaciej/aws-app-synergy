package online.rumac.common.config;

import com.synergy.core.driver.DeviceCapabilities;

public class CapabilitiesConfig {

    private final DeviceCapabilities caps;

    public CapabilitiesConfig(DeviceCapabilities caps) {
        this.caps = caps;
    }

    public CapabilitiesConfig() {
        this.caps = new DeviceCapabilities();
    }

    private void setDeviceType() {
        caps.addCapability("Platform", ConfigUtils.PLATFORM);
    }

    private void setDeviceId() {
        caps.addCapability("DeviceID", ConfigUtils.DEVICE_ID);
    }

    private void setAppPackage() {
        caps.addCapability("AppPackage", ConfigUtils.APP_PACKAGE);
    }

    private void setCaps() {
        setDeviceType();
        setDeviceId();
        setAppPackage();
    }

    private DeviceCapabilities getDeviceCapabilities() {
        setCaps();
        return caps;
    }
}
