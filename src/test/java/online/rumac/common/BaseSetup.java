package online.rumac.common;

import com.synergy.core.driver.DeviceCapabilities;
import com.synergy.core.driver.mobile.android.AndroidDriver;
import online.rumac.util.deviceCapabilitiesInjector.DeviceCapabilitiesGenerator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseSetup {

    protected AndroidDriver driver;
    protected static String serverURL = "http://127.0.0.1:7777";
    protected static String activityName;

    @BeforeTest
    protected void setup() {
        if (activityName == null) throw new NullPointerException("Set static 'activityName' to define capabilities");
        DeviceCapabilities caps = DeviceCapabilitiesGenerator.fromJson(activityName);
        driver = new AndroidDriver(serverURL, caps);
    }

    @AfterTest
    protected void tearDown() {
//        driver.keyboard().sendKeyCode(26);
        driver.stop();
    }
}
