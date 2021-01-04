package online.rumac.tests.menu;

import com.synergy.core.driver.mobile.android.AndroidDriver;
import online.rumac.common.logger.Log;
import online.rumac.common.views.SideMenuView;
import online.rumac.tests.common.DriverGenerator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SideMenuViewTest {

    private AndroidDriver driver;

    @BeforeTest
    void testSetup() {
        driver = DriverGenerator.generate();
    }

    @AfterTest
    void tearDown() {
        driver.stop();
    }

    @Test(groups = "done")
    void openSideMenuBar() {
        SideMenuView.getInstance().getViewFor(driver);
        Log.onTerminal("Side menu opened successfully");
    }


}
