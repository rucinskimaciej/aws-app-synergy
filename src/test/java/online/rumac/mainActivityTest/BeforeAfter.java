package online.rumac.mainActivityTest;

import com.synergy.core.driver.DeviceCapabilities;
import com.synergy.core.driver.mobile.android.AndroidDriver;
import online.rumac.deviceCapabilitiesInjector.DeviceCapabilitiesGenerator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BeforeAfter {

    protected AndroidDriver driver;

    @BeforeTest
    void setup() {
        DeviceCapabilities caps = DeviceCapabilitiesGenerator.fromJson("src/test/resources/caps/MainActivity.json");
        driver = new AndroidDriver("http://127.0.0.1:7777", caps);
    }

    @AfterTest
    void tearDown() {
        driver.stop();
    }
}
