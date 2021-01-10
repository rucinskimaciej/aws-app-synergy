package online.rumac.tests.menu;

import online.rumac.common.logger.Log;
import online.rumac.common.views.tabs.menu.SideMenuView;
import online.rumac.tests.common.BaseSetup;
import org.testng.annotations.Test;

public class SideMenuViewTest extends BaseSetup {

    @Test(groups = "done")
    void openSideMenuBar() {
        SideMenuView.getInstance().getViewFor(driver);
        Log.onTerminal("Side menu opened successfully");
    }

}
