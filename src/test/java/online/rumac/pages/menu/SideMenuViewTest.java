package online.rumac.pages.menu;

import online.rumac.common.logger.Log;
import online.rumac.pages.menu.view.SideMenuView;
import online.rumac.common.BaseSetup;
import org.testng.annotations.Test;

public class SideMenuViewTest extends BaseSetup {

    @Test(groups = "undone")
    void openSideMenuBar() {
        SideMenuView.getInstance().getViewFor(driver);
        Log.onTerminal("Side menu opened successfully");
    }

}
