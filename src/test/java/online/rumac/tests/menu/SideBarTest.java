package online.rumac.tests.menu;

import online.rumac.common.BaseSetup;
import online.rumac.common.logger.Log;
import online.rumac.views.SideMenuView;
import org.testng.annotations.Test;

public class SideBarTest extends BaseSetup {

    @Test(groups = "all")
    void openSideMenuBar() {
        SideMenuView.getInstance().getViewFor(driver);
        Log.onTerminal("Side menu opened successfully");
    }


}
