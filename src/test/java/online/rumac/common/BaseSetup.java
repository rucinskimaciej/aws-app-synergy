package online.rumac.common;

import com.synergy.core.driver.mobile.MobileDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class BaseSetup {

    protected MobileDriver driver;

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
