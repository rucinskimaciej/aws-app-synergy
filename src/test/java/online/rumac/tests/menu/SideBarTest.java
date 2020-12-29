package online.rumac.tests.menu;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import online.rumac.tests.common.Base;
import org.testng.annotations.Test;

public class SideBarTest extends Base {

    @Test(groups = "all")
    void openSideMenuBar() {
        driver.options().setElementTimeout(2000);
        MobileElement sideMenuBarButton = //driver.finder().findElement(By.AccessibilityID("ReferenceApp"));
                driver.finder().findElement(By.ClassName("android.widget.ImageButton")); //, 0, 99, 168, 243); // <- this should work
        sideMenuBarButton.click();
        System.out.println("Opened side menu successfully");
    }


}
