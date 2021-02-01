package online.rumac.common;

import com.synergy.core.driver.mobile.MobileDriver;
import online.rumac.common.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class BaseSetup {

    private MobileDriver driver;
    protected final DriverManager viewHolder;

    protected BaseSetup() {
        this.viewHolder = getViewHolder();
    }

    @BeforeMethod(alwaysRun = true)
    public final void testSetup() {
        driver = getViewHolder().getDriver();
    }

    protected abstract DriverManager getViewHolder();

    @AfterMethod(alwaysRun = true)
    public final void tearDown() {
        driver.stop();
    }
}
