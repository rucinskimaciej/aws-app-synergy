package online.rumac.pages.tabs.nativeComponents;

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
