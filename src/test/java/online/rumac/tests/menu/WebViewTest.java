package online.rumac.tests.menu;

import online.rumac.common.BaseSetup;
import online.rumac.common.logger.Log;
import online.rumac.common.views.WebView;
import org.testng.annotations.Test;

public class WebViewTest extends BaseSetup {

    @Test
    void webViewTest() {
        WebView.getInstance().getViewFor(driver);
        Log.onTerminal("\"Web\" view opened successfully");
    }
}
