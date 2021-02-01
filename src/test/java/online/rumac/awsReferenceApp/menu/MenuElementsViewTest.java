package online.rumac.awsReferenceApp.menu;

import com.synergy.core.driver.mobile.MobileDriver;
import online.rumac.common.driver.DriverGenerator;
import online.rumac.common.driver.DriverManager;
import online.rumac.common.logger.Log;
import online.rumac.common.BaseSetup;
import org.testng.annotations.Test;

import static online.rumac.awsReferenceApp.menu.view.Menu.*;
import static online.rumac.awsReferenceApp.menu.view.Menu.WEB;
import static online.rumac.awsReferenceApp.menu.view.MenuElementsView.show;

public class MenuElementsViewTest extends BaseSetup {

    @Test(groups = {"done"})
    void homeViewTest() {
        Log.onTerminal("Attempting \"Home\" view test");
        show(HOME, viewHolder.getDriver());
        Log.onTerminal("\"Home\" view opened successfully");
    }

    @Test(groups = {"done"})
    void webViewTest() {
        Log.onTerminal("Attempting \"WebView\" view test");
        show(WEB, viewHolder.getDriver());
        Log.onTerminal("\"WebView\" view opened successfully");
    }

    @Test(groups = {"done"})
    void nativeComponentsViewTest() {
        Log.onTerminal("Attempting \"Native Components\" view test");
        show(NATIVE_COMPONENTS, viewHolder.getDriver());
        Log.onTerminal("\"Native Components\" view opened successfully");
    }

    @Test(groups = {"done"})
    void inputControlsViewTest() {
        Log.onTerminal("Attempting \"Input Controls\" view test");
        show(INPUT_CONTROLS, viewHolder.getDriver());
        Log.onTerminal("\"Input Controls\" view opened successfully");
    }

    @Test(groups = {"done"})
    void nestedViewsViewTest() {
        Log.onTerminal("Attempting \"Nested Views\" view test");
        show(NESTED_VIEWS, viewHolder.getDriver());
        Log.onTerminal("\"Nested Views\" view opened successfully");
    }

    @Test(groups = {"done"})
    void crashBugViewTest() {
        Log.onTerminal("Attempting \"Crash Bug\" view test");
        show(CRASH_BUG, viewHolder.getDriver());
        Log.onTerminal("\"Crash Bug\" view opened successfully");
    }

    @Test(groups = {"done"})
    void alertsViewTest() {
        Log.onTerminal("Attempting \"Alerts\" view test");
        show(ALERTS, viewHolder.getDriver());
        Log.onTerminal("\"Alerts\" view opened successfully");
    }

    @Test(groups = {"done"})
    void loginPageViewTest() {
        Log.onTerminal("Attempting \"Login Page\" view test");
        show(LOGIN_PAGE, viewHolder.getDriver());
        Log.onTerminal("\"Login Page\" view opened successfully");
    }

    // requires scroll which shifts xpath
    @Test(groups = {"broken"}, enabled = false)
    void localWebViewViewTest() {
        Log.onTerminal("Attempting \"Local WebView View\" view test");
        show(LOCAL_WEB_VIEW, viewHolder.getDriver());
        Log.onTerminal("\"Local WebView View\" view opened successfully");
    }

    // requires scroll which shifts xpath
    @Test(groups = {"broken"}, enabled = false)
    void fixturesViewTest() {
        Log.onTerminal("Attempting \"Fixtures\" view test");
        show(FIXTURES, viewHolder.getDriver());
        Log.onTerminal("\"Fixtures\" view opened successfully");
    }

    // requires scroll which shifts xpath
    @Test(groups = {"broken"}, enabled = false)
    void supplementalUploadsViewTest() {
        Log.onTerminal("Attempting \"Supplemental Uploads\" view test");
        show(SUPPLEMENTAL_UPLOADS, viewHolder.getDriver());
        Log.onTerminal("\"Supplemental Uploads\" view opened successfully");
    }

    @Override
    protected DriverManager getViewHolder() {
        return new DriverManager() {
            @Override
            public MobileDriver getDriver() {
                return DriverGenerator.generate();
            }
        };
    }
}
