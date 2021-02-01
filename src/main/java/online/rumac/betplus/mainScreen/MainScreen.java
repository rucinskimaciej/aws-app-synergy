package online.rumac.betplus.mainScreen;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import online.rumac.common.driver.DriverManager;

public class MainScreen extends DriverManager {

    public boolean loadMainScreen() {
        driver.options().setElementTimeout(10000);
        driver.options().setElementPollInterval(100);
        String id = "com.viacom.betplus.debug:id/logo";
        MobileElement logo = driver.finder().findElement(By.ID(id));
        return logo.isDisplayed();
    }
}
