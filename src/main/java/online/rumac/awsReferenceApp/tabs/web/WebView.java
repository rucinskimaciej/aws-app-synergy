package online.rumac.awsReferenceApp.tabs.web;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.android.AndroidDriver;
import online.rumac.common.driver.DriverManager;
import online.rumac.common.interactions.KeysSender;
import online.rumac.awsReferenceApp.menu.view.Menu;
import online.rumac.awsReferenceApp.menu.view.MenuElementsView;

public class WebView extends DriverManager implements KeysSender {

    @Override
    public void sendKeysTo(By elementLocator, String keys) {
        MenuElementsView.show(Menu.WEB, driver);
        MobileElement element = driver.finder().findElement(elementLocator);
        element.click();
        element.sendKeys(keys);
        ((AndroidDriver) driver).keyboard().sendKeyCode(66);
    }
}
