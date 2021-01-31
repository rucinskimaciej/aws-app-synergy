package online.rumac.awsReferenceApp.tabs.nativeComponents;

import com.synergy.core.exceptions.NoSuchElementException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContentOutOfViewTest extends NativeComponentsViewTest {

    private ContentOutOfView contentOutOfView;

    @Test(groups = "done")
    public void findsTextWhenScrollsToBottom() {
        assertEquals(contentOutOfView.scrollAndFindHiddenText(), "This is hidden text");
    }

    @Test(groups = "done")
    public void throwsWhenFindingTextOnBaseScreen() {
        assertThrows(NoSuchElementException.class, () -> contentOutOfView.findHiddenText());
    }

    @BeforeMethod(alwaysRun = true)
    @Override
    protected void setViewBeforeMethod() {
        view = new ContentOutOfView(driver);
        contentOutOfView = (ContentOutOfView) view;
    }

    @Override
    protected String getTitle() {
        return "Content Out of View";
    }
}