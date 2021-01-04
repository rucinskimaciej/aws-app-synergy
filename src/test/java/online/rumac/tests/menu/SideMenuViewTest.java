package online.rumac.tests.menu;

import com.synergy.core.driver.DeviceCapabilities;
import com.synergy.core.driver.mobile.android.AndroidDriver;
import online.rumac.common.util.deviceCapabilitiesInjector.DeviceCapabilitiesGenerator;
import online.rumac.tests.common.BaseSetup;
import online.rumac.common.logger.Log;
import online.rumac.common.views.SideMenuView;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SideMenuViewTest { //extends BaseSetup {

    private AndroidDriver driver;
    private static String serverURL = "http://127.0.0.1:7777";

    @BeforeTest(alwaysRun = true)
    void testSetup() {
        DeviceCapabilities caps = DeviceCapabilitiesGenerator.fromJson("MainActivity");
        driver = new AndroidDriver(serverURL, caps);
    }

    @AfterTest(alwaysRun = true)
    void tearDown() {
        driver.stop();
    }

    @Test(groups = "done")
    void openSideMenuBar() {
        SideMenuView.getInstance().getViewFor(driver);
        Log.onTerminal("Side menu opened successfully");
    }


}
