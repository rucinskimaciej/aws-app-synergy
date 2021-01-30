package online.rumac.common.config;

import com.synergy.core.driver.DeviceCapabilities;

public class CapabilitiesConfig {

    private final DeviceCapabilities caps;
    public final ConfigUtils config;

    public CapabilitiesConfig() {
        this.caps = new DeviceCapabilities();
        this.config = new ConfigUtils();
    }

    private void setDeviceType() {
        caps.addCapability("Platform", config.PLATFORM);
    }

    private void setDeviceId() {
        caps.addCapability("DeviceID", config.DEVICE_ID);
    }

    private void setAppPackage() {
        caps.addCapability("AppPackage", config.APP_PACKAGE);
    }

    private void setAppName() {
        caps.addCapability("App", config.APP_NAME);
    }

    private void setLaunchActivity() {
        caps.addCapability("LaunchActivity", config.LAUNCH_ACTIVITY);
    }

    private void setCaps() {
        setDeviceType();
        setDeviceId();
        setAppPackage();
        setAppName();
        setLaunchActivity();
    }

    public DeviceCapabilities getDeviceCapabilities() {
        setCaps();
        return caps;
    }
}
