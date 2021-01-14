package online.rumac.common;

import com.synergy.core.driver.DeviceCapabilities;
import com.synergy.core.driver.mobile.android.AndroidDriver;
import online.rumac.exceptions.EmptyCapabilitiesException;
import online.rumac.common.util.deviceCapabilitiesInjector.DeviceCapabilitiesGenerator;

public final class DriverGenerator {

    private static final String CAPABILITIES_PROPERTY = "json.capabilities";
    public static final String SERVER_URL_PROPERTY = "synergy.server.url";
    public static final String DEFAULT_SYNERGY_SERVER = "http://127.0.0.1:7777";

    public static AndroidDriver generate() {
        DeviceCapabilities caps = DeviceCapabilitiesGenerator.fromJson(getCapabilities());
        // todo return getPlatformSpecificDriver();
        return new AndroidDriver(getServer(), caps);
    }

    private static String getServer() {
        return System.getProperty(SERVER_URL_PROPERTY, DEFAULT_SYNERGY_SERVER);
    }

    private static String getCapabilities() {
        try {
            return System.getProperty(CAPABILITIES_PROPERTY);
        } catch (IllegalArgumentException e) {
            throw new EmptyCapabilitiesException();
        }
    }
}
