package online.rumac.betplus.mainScreen;

import online.rumac.common.BaseSetup;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class MainScreenTest extends BaseSetup {

    private MainScreen view;

    @BeforeMethod(alwaysRun = true)
    @Override
    public void testSetup() {
        super.testSetup();
        this.view = new MainScreen(driver);
    }

    @Test(groups = "undone")
    public void testLoadMainScreen() {
        assertTrue(view.loadMainScreen());
    }
}