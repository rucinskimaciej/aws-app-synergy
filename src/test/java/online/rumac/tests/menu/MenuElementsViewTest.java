package online.rumac.tests.menu;

import online.rumac.common.BaseSetup;
import online.rumac.common.logger.Log;
import org.testng.annotations.Test;

import static online.rumac.common.views.Menu.*;
import static online.rumac.common.views.MenuElementsView.show;


public class MenuElementsViewTest extends BaseSetup {

    @Test
    void homeViewTest() {
        Log.onTerminal("Attempting \"Home\" view test");
        show(HOME, driver);
        Log.onTerminal("\"Home\" view opened successfully");
    }

    @Test
    void webViewTest() {
        Log.onTerminal("Attempting \"Web\" view test");
        show(WEB, driver);
        Log.onTerminal("\"Web\" view opened successfully");
    }

    @Test
    void nativeComponentsViewTest() {
        Log.onTerminal("Attempting \"Native Components\" view test");
        show(NATIVE_COMPONENTS, driver);
        Log.onTerminal("\"Native Components\" view opened successfully");
    }

    @Test
    void inputControlsViewTest() {
        Log.onTerminal("Attempting \"Input Controls\" view test");
        show(INPUT_CONTROLS, driver);
        Log.onTerminal("\"Input Controls\" view opened successfully");
    }

    @Test
    void nestedViewsViewTest() {
        Log.onTerminal("Attempting \"Nested Views\" view test");
        show(NESTED_VIEWS, driver);
        Log.onTerminal("\"Nested Views\" view opened successfully");
    }

    @Test
    void crashBugViewTest() {
        Log.onTerminal("Attempting \"Crash Bug\" view test");
        show(CRASH_BUG, driver);
        Log.onTerminal("\"Crash Bug\" view opened successfully");
    }

    @Test
    void alertsViewTest() {
        Log.onTerminal("Attempting \"Alerts\" view test");
        show(ALERTS, driver);
        Log.onTerminal("\"Alerts\" view opened successfully");
    }

    @Test
    void loginPageViewTest() {
        Log.onTerminal("Attempting \"Login Page\" view test");
        show(LOGIN_PAGE, driver);
        Log.onTerminal("\"Login Page\" view opened successfully");
    }

    @Test
    void localWebViewViewTest() {
        Log.onTerminal("Attempting \"Local Web View\" view test");
        show(LOCAL_WEB_VIEW, driver);
        Log.onTerminal("\"Local Web View\" view opened successfully");
    }

    @Test
    void fixturesViewTest() {
        Log.onTerminal("Attempting \"Fixtures\" view test");
        show(FIXTURES, driver);
        Log.onTerminal("\"Fixtures\" view opened successfully");
    }

    @Test
    void supplementalUploadsViewTest() {
        Log.onTerminal("Attempting \"Supplemental Uploads\" view test");
        show(SUPPLEMENTAL_UPLOADS, driver);
        Log.onTerminal("\"Supplemental Uploads\" view opened successfully");
    }
}