package online.rumac.tests.tab.nativeComponents;

import com.synergy.core.driver.By;
import online.rumac.common.views.tabs.nativeComponents.ContentScrolling;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ContentScrollingTest extends NativeComponentsViewTest {

    @BeforeMethod
    @Override
    protected void setViewBeforeMethod() {
        view = new ContentScrolling(driver);
    }

    @Override
    protected int getTitleXpathIndex() {
        return 2;
    }

    @Test(groups = "inProgress")
    void findTextAfterScrolling() {
        // fixme
    }

    @Override
    protected String getTitle() {
        return "Content Scrolling";
    }
}
