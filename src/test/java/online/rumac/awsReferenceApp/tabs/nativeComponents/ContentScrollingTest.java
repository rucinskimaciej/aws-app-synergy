package online.rumac.awsReferenceApp.tabs.nativeComponents;

import com.synergy.core.driver.By;
import online.rumac.common.driver.DriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class ContentScrollingTest extends NativeComponentsViewTest {

    @Override
    protected NativeComponentsView getNativeComponentsView() {
        return new ContentScrolling();
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
