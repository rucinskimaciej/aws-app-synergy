package online.rumac.common.util.platformIdentifier;

import com.synergy.core.driver.DeviceCapabilities;
import online.rumac.common.util.Platform;

public final class PlatformIdentifier {

    public static Platform getPlatformName(DeviceCapabilities caps) {
        String platformName = caps.getCapabilitiesAsJSON().get("Platform").toString().toUpperCase();
        return Platform.valueOf(platformName);
    }
}
