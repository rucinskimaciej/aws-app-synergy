package online.rumac.tests.menu;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import online.rumac.common.BaseSetup;
import org.testng.annotations.Test;

public class SideBarTest extends BaseSetup {

    @Test(groups = "all")
    void openSideMenuBar() {
        driver.options().setElementTimeout(2000);
        MobileElement sideMenuBarButton = driver.finder().findElement(By.ClassName("android.widget.ImageButton"));
        sideMenuBarButton.click();
        System.out.println("Side menu opened successfully");
    }


}
