package online.rumac.common;

import com.synergy.core.driver.mobile.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class BaseSetup {

    protected AndroidDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void testSetup() {
        driver = DriverGenerator.generate();
        driver.options().setElementTimeout(500);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.stop();
    }
}
