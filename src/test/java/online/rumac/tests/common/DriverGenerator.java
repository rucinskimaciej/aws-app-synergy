package online.rumac.tests.common;

import com.synergy.core.driver.DeviceCapabilities;
import com.synergy.core.driver.mobile.android.AndroidDriver;
import online.rumac.common.util.deviceCapabilitiesInjector.DeviceCapabilitiesGenerator;

public final class DriverGenerator {

    public static AndroidDriver generate() {
        String serverURL = "http://127.0.0.1:7777";
        DeviceCapabilities caps = DeviceCapabilitiesGenerator.fromJson("MainActivity");
        return new AndroidDriver(serverURL, caps);
    }
}
