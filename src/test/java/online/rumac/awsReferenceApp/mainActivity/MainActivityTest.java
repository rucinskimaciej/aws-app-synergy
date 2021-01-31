package online.rumac.awsReferenceApp.mainActivity;

import com.synergy.core.driver.mobile.MobileDriver;
import com.synergy.core.driver.mobile.android.AndroidDriver;
import com.synergy.core.driver.mobile.ios.IOSDriver;
import online.rumac.common.driver.DriverGenerator;
import online.rumac.common.logger.Log;
import online.rumac.common.BaseSetup;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainActivityTest extends BaseSetup {

    private MobileDriver driver;

    @Test(groups = {"done"})
    void connectionTest() {
        String info = null;
        if (driver instanceof AndroidDriver) info = ((AndroidDriver) driver).info().getDeviceInfo().getAppVersion();
        if (driver instanceof IOSDriver) info = ((IOSDriver) driver).info().getDeviceInfo().getAppVersion();

        String log;
        if (info != null && !info.isEmpty()) log = "App opened successfully";
        else log = "Could not open app";
        Log.onTerminal(log);
    }

    @BeforeMethod(alwaysRun = true)
    @Override
    public void testSetup() {
        driver = DriverGenerator.generate();
    }
}
