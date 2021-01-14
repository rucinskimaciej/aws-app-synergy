package online.rumac.common;

import com.synergy.core.driver.DeviceCapabilities;
import com.synergy.core.driver.mobile.MobileDriver;
import com.synergy.core.driver.mobile.android.AndroidDriver;
import com.synergy.core.driver.mobile.ios.IOSDriver;
import online.rumac.exceptions.EmptyCapabilitiesException;
import online.rumac.common.util.deviceCapabilitiesInjector.DeviceCapabilitiesGenerator;

import static online.rumac.common.util.platformIdentifier.PlatformIdentifier.*;

public final class DriverGenerator {

    private static final String CAPABILITIES_PROPERTY = "json.capabilities";
    public static final String SERVER_URL_PROPERTY = "synergy.server.url";
    public static final String DEFAULT_SYNERGY_SERVER = "http://127.0.0.1:7777";

    public static MobileDriver generate() {
        DeviceCapabilities caps = DeviceCapabilitiesGenerator.fromJson(getJsonCapabilitiesFileName());
        String server = getServer();
        return getPlatformSpecificDriver(server, caps);
    }

    private static MobileDriver getPlatformSpecificDriver(String server, DeviceCapabilities caps) {
        switch (getPlatformName(caps)) {
            case ANDROID: return new AndroidDriver(server, caps);
            case IOS: return new IOSDriver(server, caps);
            default: throw new IllegalArgumentException(
                    "Could not determine platform. Make sure that capabilities JSON file contains correct values");
        }
    }

    private static String getServer() {
        return System.getProperty(SERVER_URL_PROPERTY, DEFAULT_SYNERGY_SERVER);
    }

    private static String getJsonCapabilitiesFileName() {
        try {
            return System.getProperty(CAPABILITIES_PROPERTY);
        } catch (IllegalArgumentException e) {
            throw new EmptyCapabilitiesException();
        }
    }
}
