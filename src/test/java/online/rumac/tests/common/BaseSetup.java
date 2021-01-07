package online.rumac.tests.common;

import com.synergy.core.driver.mobile.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class BaseSetup {

    protected AndroidDriver driver;

    @BeforeMethod(groups = "setup")
    public void testSetup() {
        driver = DriverGenerator.generate();
    }

    @AfterMethod(groups = "setup")
    public void tearDown() {
        driver.stop();
    }
}
