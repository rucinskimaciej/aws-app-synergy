package online.rumac.pages.tab.nativeComponents;

import com.synergy.core.driver.By;
import online.rumac.pages.tabs.nativeComponents.NativeComponentsView;
import online.rumac.common.BaseSetup;
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

    protected abstract String getTitle();

    @Test(groups = "done")
    void findViewTitle() {
        assertTrue(view.containsTitle(getTitle()));
    }
}
