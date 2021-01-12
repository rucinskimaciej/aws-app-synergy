package online.rumac.tests.tab.nativeComponents;

import com.synergy.core.driver.By;
import online.rumac.pages.tabs.nativeComponents.NativeComponentsView;
import online.rumac.tests.common.BaseSetup;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public abstract class NativeComponentsViewTest extends BaseSetup {

    protected NativeComponentsView view;
    protected final String title;

    public NativeComponentsViewTest() {
        this.title = getTitle();
    }

    @BeforeMethod(alwaysRun = true)
    protected abstract void setViewBeforeMethod();

    protected abstract int getTitleXpathIndex();

    protected abstract String getTitle();

    protected String getTitleXPath() {
        return String.format("%s[%d]", titlePath, getTitleXpathIndex());
    }

    @Test(groups = "done")
    void findViewTitle() {
        assertTrue(view.containsTitle(By.XPath(getTitleXPath())));
    }

    private final String titlePath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.TextView";
}
