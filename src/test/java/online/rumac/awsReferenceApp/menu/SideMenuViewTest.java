package online.rumac.awsReferenceApp.menu;

import online.rumac.common.logger.Log;
import online.rumac.awsReferenceApp.menu.view.SideMenuView;
import online.rumac.common.BaseSetup;
import org.testng.annotations.Test;

public class SideMenuViewTest extends BaseSetup {

    @Test(groups = "done")
    void openSideMenuBar() {
        SideMenuView.getInstance().getViewFor(driver);
        Log.onTerminal("Side menu opened successfully");
    }

}
