package online.rumac.tests.common;

import com.synergy.core.driver.DeviceCapabilities;
import com.synergy.core.driver.mobile.android.AndroidDriver;
import online.rumac.common.util.deviceCapabilitiesInjector.DeviceCapabilitiesGenerator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseSetup {

    protected AndroidDriver driver;
    protected static String serverURL = "http://127.0.0.1:7777";

    @BeforeTest
    void testSetup() {
        DeviceCapabilities caps = DeviceCapabilitiesGenerator.fromJson("MainActivity");
        driver = new AndroidDriver(serverURL, caps);
    }

    @AfterTest
    void tearDown() {
        driver.stop();
    }
}
