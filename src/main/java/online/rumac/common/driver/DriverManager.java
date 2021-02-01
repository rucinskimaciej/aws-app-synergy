package online.rumac.common.driver;

import com.synergy.core.driver.mobile.MobileDriver;

public abstract class DriverManager {

    protected final MobileDriver driver;

    public DriverManager() {
        this.driver = DriverGenerator.generate();
    }

    public MobileDriver getDriver() {
        return driver;
    }
}
