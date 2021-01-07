package online.rumac.tests.tab.web;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.Element;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.elements.NativeElement;
import online.rumac.common.logger.Log;
import online.rumac.common.views.Menu;
import online.rumac.common.views.MenuElementsView;
import online.rumac.tests.common.BaseSetup;
import org.testng.annotations.Test;

public class WebViewTest extends BaseSetup {



    @Test(groups = "broken")
    void websiteInputTest() throws InterruptedException {
        Log.onTerminal("Attempting websiteInputTest");
        MenuElementsView.show(Menu.WEB, driver);
//        System.err.println(driver.screen().getContextHandles()); // <- returns only NATIVE_APP context
        MobileElement element = driver.finder().findElement(By.ID("com.amazonaws.devicefarm.android.referenceapp:id/website_input"));
        element.click();
        String sendKeys = "http://www.viacom.tech";
        element.sendKeys(sendKeys);
        driver.keyboard().sendKeyCode(66);
        Log.onTerminal("Send keys: " + sendKeys);
        Thread.sleep(3000); // to see the output
    }


    @Test(groups = "broken")
    void searchBarInputTest() throws InterruptedException {
        Log.onTerminal("Attempting searchBarInputTest");
        MenuElementsView.show(Menu.WEB, driver);
        driver.options().setElementTimeout(500);
        MobileElement element = driver.finder().findElement(By.XPath("//android.webkit.WebView[@content-desc=\"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more\"]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.EditText"));
        element.click();
        String keys = "Clean code";
        element.sendKeys(keys);
        driver.keyboard().sendKeyCode(66);
        Log.onTerminal("Send keys: " + keys);
        Thread.sleep(3000);
    }
}
