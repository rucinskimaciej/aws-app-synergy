package online.rumac.tests.tab.web;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.android.AndroidDriver;
import online.rumac.common.logger.Log;
import online.rumac.common.views.Menu;
import online.rumac.common.views.MenuElementsView;
import online.rumac.tests.common.DriverGenerator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebViewTest {

    private AndroidDriver driver;

    @BeforeTest
    void setup() {
        driver = DriverGenerator.generate();
        MenuElementsView.show(Menu.WEB, driver);
    }

    @Test(groups = {"inProgress"})
    void websiteInputTest() throws InterruptedException {
        Log.onTerminal("Initiate websiteInputTest");
        MobileElement element = driver.finder().findElement(By.ID("com.amazonaws.devicefarm.android.referenceapp:id/website_input"));
        element.click();
        String sendKeys = "http://www.viacom.tech";
        element.sendKeys(sendKeys);
        driver.keyboard().sendKeyCode(66);
        Log.onTerminal("Send keys: " + sendKeys);
        Thread.sleep(3000); // to see the output
    }

    @AfterTest
    void tearDown() {
        driver.stop();
    }
}
