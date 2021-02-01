package online.rumac.awsReferenceApp.tabs.nativeComponents;

import com.synergy.core.exceptions.NoSuchElementException;
import online.rumac.common.driver.DriverManager;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContentOutOfViewTest extends NativeComponentsViewTest {

    private ContentOutOfView contentOutOfView;

    @Override
    protected String getTitle() {
        return "Content Out of View";
    }

    @Override
    protected NativeComponentsView getNativeComponentsView() {
        contentOutOfView = new ContentOutOfView();
        return contentOutOfView;    }

    @Test(groups = "done")
    public void findsTextWhenScrollsToBottom() {
        assertEquals(contentOutOfView.scrollAndFindHiddenText(), "This is hidden text");
    }

    @Test(groups = "done")
    public void throwsWhenFindingTextOnBaseScreen() {
        assertThrows(NoSuchElementException.class, () -> contentOutOfView.findHiddenText());
    }
}