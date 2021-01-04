package online.rumac.tests.mainActivity;

import com.synergy.core.driver.mobile.android.AndroidDeviceInfo;
import com.synergy.core.driver.mobile.android.AndroidDriver;
import online.rumac.common.logger.Log;
import online.rumac.tests.common.DriverGenerator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainActivityTest {

    private AndroidDriver driver;

    @BeforeTest
    void testSetup() {
        driver = DriverGenerator.generate();
    }

    @AfterTest
    void tearDown() {
        driver.stop();
    }

    @Test(groups = {"done"})
    void connectionTest() {
        AndroidDeviceInfo deviceInfo = driver.info().getDeviceInfo();
        String info = deviceInfo.getAppVersion();
        String log;
        if (info != null && !info.isEmpty()) log = "App openned succesfully";
        else log = "Could not open app";
        Log.onTerminal(log);
    }
}
