package online.rumac.common.config;

import com.synergy.core.driver.DeviceCapabilities;

import static online.rumac.common.config.ConfigUtils.*;

public class CapabilitiesConfig {

    private final DeviceCapabilities caps;

    public CapabilitiesConfig() {
        this.caps = new DeviceCapabilities();
    }

    private void setDeviceType() {
        caps.addCapability("Platform", PLATFORM);
    }

    private void setDeviceId() {
        caps.addCapability("DeviceID", DEVICE_ID);
    }

    private void setAppPackage() {
        caps.addCapability("AppPackage", APP_PACKAGE);
    }

    private void setAppName() {
        caps.addCapability("App", APP_NAME);
    }

    private void setLaunchActivity() {
        caps.addCapability("LaunchActivity", LAUNCH_ACTIVITY);
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
