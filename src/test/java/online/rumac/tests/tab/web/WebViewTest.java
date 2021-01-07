package online.rumac.tests.tab.web;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import online.rumac.common.logger.Log;
import online.rumac.tests.common.BaseSetup;
import org.testng.annotations.Test;

public class WebViewTest extends BaseSetup {

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

}
