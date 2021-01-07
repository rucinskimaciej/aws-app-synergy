package online.rumac.tests.mainActivity;

import com.synergy.core.driver.mobile.android.AndroidDeviceInfo;
import online.rumac.common.logger.Log;
import online.rumac.tests.common.BaseSetup;
import org.testng.annotations.Test;

public class MainActivityTest extends BaseSetup {

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
