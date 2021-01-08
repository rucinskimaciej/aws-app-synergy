package online.rumac.common.driver;

import com.synergy.core.driver.mobile.MobileDriver;

public abstract class DriverManager {

    protected final MobileDriver driver;

    protected DriverManager(MobileDriver driver) {
        this.driver = driver;
    }
}
