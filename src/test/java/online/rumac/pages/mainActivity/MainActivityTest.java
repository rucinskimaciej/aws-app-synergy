package online.rumac.pages.mainActivity;

import com.synergy.core.driver.mobile.android.AndroidDeviceInfo;
import com.synergy.core.driver.mobile.android.AndroidDriver;
import com.synergy.core.driver.mobile.ios.IOSDriver;
import online.rumac.common.logger.Log;
import online.rumac.common.BaseSetup;
import org.testng.annotations.Test;

public class MainActivityTest extends BaseSetup {

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
}
