package online.rumac.betplus.mainScreen;

import online.rumac.common.BaseSetup;
import online.rumac.common.driver.DriverManager;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class MainScreenTest extends BaseSetup {

    private MainScreen view;

    @Override
    protected DriverManager getViewHolder() {
        view = new MainScreen();
        return view;
    }

    @Test(groups = "undone")
    public void testLoadMainScreen() {
        assertTrue(view.loadMainScreen());
    }
}