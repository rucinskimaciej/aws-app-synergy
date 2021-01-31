package online.rumac.awsReferenceApp.menu.view;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;

public class MenuElementsView {

    public static void show(Menu menuElement, MobileDriver driver) {
        SideMenuView.getInstance().getViewFor(driver);
        String text = String.format("text(\"%s\")", menuElement.getField());
        MobileElement element = driver.finder().findElement(By.AndroidUIAutomator(text));
        element.click();
    }
}
