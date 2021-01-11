package online.rumac.tests.tab.nativeComponents;

import com.synergy.core.driver.By;
import online.rumac.common.views.tabs.nativeComponents.ContentScrolling;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class ContentScrollingTest extends NativeComponentsViewTest {

    @BeforeMethod(alwaysRun = true)
    @Override
    protected void setViewBeforeMethod() {
        view = new ContentScrolling(driver);
    }

    @Override
    protected int getTitleXpathIndex() {
        return 2;
    }

    @Test(groups = "done")
    void findTextAfterScrolling() {
        view.scroll().down(5);
        By locator = By.XPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.TextView");
        assertTrue(view.contains("Ut accumsan commodo ex, nec ornare mi malesuada maximus.",locator));
    }

    @Override
    protected String getTitle() {
        return "Content Scrolling";
    }

}
