package online.rumac.common.views;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;

import static online.rumac.common.views.Menu.*;

public class MenuElementsView {

    public static void show(Menu menuElement, MobileDriver driver) {
        SideMenuView.getInstance().getViewFor(driver);
        MobileElement element = driver.finder().findElement(By.XPath(getXpath(ofIndex(menuElement))));
//        MobileElement element = driver.finder().findElement(By.Text(menuElement.getField())); // <= driver.finder() can never find element by text
        element.click();
    }
}
