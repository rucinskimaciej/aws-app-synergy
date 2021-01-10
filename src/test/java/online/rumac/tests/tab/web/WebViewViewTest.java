package online.rumac.tests.tab.web;

import com.synergy.core.driver.By;
import online.rumac.common.logger.Log;
import online.rumac.common.views.tabs.web.WebView;
import online.rumac.tests.common.BaseSetup;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebViewViewTest extends BaseSetup {

    private WebView webView;

    @BeforeMethod
    void setup() {
        webView = new WebView(driver);
    }

    @Test(groups = "done")
    void websiteInputTest() throws InterruptedException {
        Log.onTerminal("Attempting websiteInputTest");

        By elementLocator = By.ID("com.amazonaws.devicefarm.android.referenceapp:id/website_input");
        String sendKeys = "http://www.viacom.tech";

        webView.sendKeysTo(elementLocator, sendKeys);
        Log.onTerminal("Send keys: " + sendKeys);
        Thread.sleep(3000); // to see the output
    }


    @Test(groups = "broken")
    void searchBarInputTest() throws InterruptedException {
//        System.err.println(driver.screen().getContextHandles()); // <- returns only NATIVE_APP context
        Log.onTerminal("Attempting searchBarInputTest");

        By elementLocator = By.XPath("//android.webkit.WebView[@content-desc=\"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more\"]/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.EditText");
        String sendKeys = "Clean code";

        webView.sendKeysTo(elementLocator, sendKeys);

        Log.onTerminal("Send keys: " + sendKeys);
        Thread.sleep(3000); // to see the output
    }
}
