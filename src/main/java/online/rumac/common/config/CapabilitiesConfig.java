package online.rumac.common.config;

import com.synergy.core.driver.DeviceCapabilities;

public class CapabilitiesConfig {

    private final DeviceCapabilities caps;

    public CapabilitiesConfig() {
        this.caps = new DeviceCapabilities();
        ConfigUtils config = new ConfigUtils();
        config.getProperties().forEach(caps::addCapability);
    }

    public DeviceCapabilities getDeviceCapabilities() {
        return caps;
    }
}