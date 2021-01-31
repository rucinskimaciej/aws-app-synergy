package online.rumac.awsReferenceApp.tabs.nativeComponents;

import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;

public class Camera extends NativeComponentsView {

    private final MobileElement camera;

    protected Camera(MobileDriver driver) {
        super(driver);
        String idLocator = "com.amazonaws.devicefarm.android.referenceapp:id/camera_surface_view";
        camera = supplyElementBy("ID", idLocator);
    }

    public boolean isDisplayed() {
        return camera.isDisplayed();
    }

    public boolean isEnabled() {
        return camera.isEnabled();
    }

    @Override
    protected void goToView() {
        scroll().right(3);
    }


}
