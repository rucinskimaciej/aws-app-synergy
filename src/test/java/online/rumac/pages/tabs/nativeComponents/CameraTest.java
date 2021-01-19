package online.rumac.pages.tabs.nativeComponents;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CameraTest extends NativeComponentsViewTest {


    private Camera cameraView;

    @Test(groups = "undone")
    public void testIsDisplayed() {
        assertTrue(cameraView.isDisplayed());
    }

    @Test(groups = "undone")
    public void testIsEnabled() {
        assertTrue(cameraView.isEnabled());
    }

    @BeforeMethod(alwaysRun = true)
    @Override
    protected void setViewBeforeMethod() {
        view = new Camera(driver);
        cameraView = (Camera) view;
    }

    @Override
    protected String getTitle() {
        return "Camera";
    }
}