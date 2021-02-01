package online.rumac.awsReferenceApp.tabs.nativeComponents;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CameraTest extends NativeComponentsViewTest {

    private Camera cameraView;

    @Override
    protected String getTitle() {
        return "Camera";
    }

    @Override
    protected NativeComponentsView getNativeComponentsView() {
        cameraView = new Camera();
        return cameraView;    }

    @Test(groups = "done")
    public void testIsDisplayed() {
        assertTrue(cameraView.isDisplayed());
    }

    @Test(groups = "done")
    public void testIsEnabled() {
        assertTrue(cameraView.isEnabled());
    }
}