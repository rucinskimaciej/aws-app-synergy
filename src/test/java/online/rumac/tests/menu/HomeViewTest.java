package online.rumac.tests.menu;

import online.rumac.common.BaseSetup;
import online.rumac.common.logger.Log;
import online.rumac.common.views.HomeView;
import org.testng.annotations.Test;

public class HomeViewTest extends BaseSetup {

    @Test(groups = "inProgress")
    void homeViewTest() {
        HomeView.getInstance().getViewFor(driver);
        Log.onTerminal("\"Home\" view opened successfully");
    }
}
