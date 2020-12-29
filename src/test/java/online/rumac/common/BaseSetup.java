package online.rumac.common;

import com.synergy.core.driver.DeviceCapabilities;
import com.synergy.core.driver.mobile.android.AndroidDriver;
import online.rumac.common.util.deviceCapabilitiesInjector.DeviceCapabilitiesGenerator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


public class BaseSetup {

    protected AndroidDriver driver;
    protected static String serverURL = "http://127.0.0.1:7777";

    @BeforeClass
    protected void setup() {
        DeviceCapabilities caps = DeviceCapabilitiesGenerator.fromJson("MainActivity");
        driver = new AndroidDriver(serverURL, caps);
    }

    @BeforeTest
    void testSetup() {
        driver.options().setElementTimeout(0);
        driver.app().reset();
    }

    @AfterClass
    void tearDown() {
        driver.stop();
    }
}
