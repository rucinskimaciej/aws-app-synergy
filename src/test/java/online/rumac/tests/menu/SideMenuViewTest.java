package online.rumac.tests.menu;

import online.rumac.common.BaseSetup;
import online.rumac.common.logger.Log;
import online.rumac.common.views.SideMenuView;
import org.testng.annotations.Test;

public class SideMenuViewTest extends BaseSetup {

    @Test(groups = "inProgress")
    void openSideMenuBar() {
        SideMenuView.getInstance().getViewFor(driver);
        Log.onTerminal("Side menu opened successfully");
    }


}