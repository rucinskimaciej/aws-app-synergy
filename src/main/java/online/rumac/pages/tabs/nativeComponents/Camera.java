package online.rumac.pages.tabs.nativeComponents;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;
import com.synergy.core.exceptions.NoSuchElementException;

public class Camera extends NativeComponentsView {

    private final MobileElement camera;

    protected Camera(MobileDriver driver) {
        super(driver);
        camera = supplyCameraElement();
    }

    public boolean isDisplayed() {
        return camera.isDisplayed();
    }

    public boolean isEnabled() {
        return camera.isEnabled();
    }

    private MobileElement supplyCameraElement() {
        MobileElement camera = null;
        try {
            String id = "com.amazonaws.devicefarm.android.referenceapp:id/camera_surface_view";
            camera = driver.finder().findElement(By.ID(id));
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return camera;
    }

    @Override
    protected void goToView() {
        scroll().right(3);
    }


}
