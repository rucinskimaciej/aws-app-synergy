package online.rumac.tests.common;

import com.synergy.core.driver.DeviceCapabilities;
import com.synergy.core.driver.mobile.android.AndroidDriver;
import online.rumac.common.util.deviceCapabilitiesInjector.DeviceCapabilitiesGenerator;

public final class DriverGenerator {

    // Edit capabilities name (without ".json" suffix) and server url
    private final static String CAPABILITIES = "AwsLG";
    private final static String SERVER_URL = "http://127.0.0.1:7777";

    public static AndroidDriver generate() {
        DeviceCapabilities caps = DeviceCapabilitiesGenerator.fromJson(CAPABILITIES);
        return new AndroidDriver(SERVER_URL, caps);
    }
}
