package online.rumac.tests.menu;

import online.rumac.common.logger.Log;
import online.rumac.tests.common.BaseSetup;
import org.testng.annotations.Test;

import static online.rumac.pages.menu.view.MenuElementsView.show;


public class MenuElementsViewTest extends BaseSetup {

    @Test(groups = {"done"})
    void homeViewTest() {
        Log.onTerminal("Attempting \"Home\" view test");
        show(HOME, driver);
        Log.onTerminal("\"Home\" view opened successfully");
    }

    @Test(groups = {"done"})
    void webViewTest() {
        Log.onTerminal("Attempting \"WebView\" view test");
        show(WEB, driver);
        Log.onTerminal("\"WebView\" view opened successfully");
    }

    @Test(groups = {"done"})
    void nativeComponentsViewTest() {
        Log.onTerminal("Attempting \"Native Components\" view test");
        show(NATIVE_COMPONENTS, driver);
        Log.onTerminal("\"Native Components\" view opened successfully");
    }

    @Test(groups = {"done"})
    void inputControlsViewTest() {
        Log.onTerminal("Attempting \"Input Controls\" view test");
        show(INPUT_CONTROLS, driver);
        Log.onTerminal("\"Input Controls\" view opened successfully");
    }

    @Test(groups = {"done"})
    void nestedViewsViewTest() {
        Log.onTerminal("Attempting \"Nested Views\" view test");
        show(NESTED_VIEWS, driver);
        Log.onTerminal("\"Nested Views\" view opened successfully");
    }

    @Test(groups = {"done"})
    void crashBugViewTest() {
        Log.onTerminal("Attempting \"Crash Bug\" view test");
        show(CRASH_BUG, driver);
        Log.onTerminal("\"Crash Bug\" view opened successfully");
    }

    @Test(groups = {"done"})
    void alertsViewTest() {
        Log.onTerminal("Attempting \"Alerts\" view test");
        show(ALERTS, driver);
        Log.onTerminal("\"Alerts\" view opened successfully");
    }

    @Test(groups = {"done"})
    void loginPageViewTest() {
        Log.onTerminal("Attempting \"Login Page\" view test");
        show(LOGIN_PAGE, driver);
        Log.onTerminal("\"Login Page\" view opened successfully");
    }

    // requires scroll which shifts xpath
    @Test(groups = {"broken"}, enabled = false)
    void localWebViewViewTest() {
        Log.onTerminal("Attempting \"Local WebView View\" view test");
        show(LOCAL_WEB_VIEW, driver);
        Log.onTerminal("\"Local WebView View\" view opened successfully");
    }

    // requires scroll which shifts xpath
    @Test(groups = {"broken"}, enabled = false)
    void fixturesViewTest() {
        Log.onTerminal("Attempting \"Fixtures\" view test");
        show(FIXTURES, driver);
        Log.onTerminal("\"Fixtures\" view opened successfully");
    }

    // requires scroll which shifts xpath
    @Test(groups = {"broken"}, enabled = false)
    void supplementalUploadsViewTest() {
        Log.onTerminal("Attempting \"Supplemental Uploads\" view test");
        show(SUPPLEMENTAL_UPLOADS, driver);
        Log.onTerminal("\"Supplemental Uploads\" view opened successfully");
    }
}
