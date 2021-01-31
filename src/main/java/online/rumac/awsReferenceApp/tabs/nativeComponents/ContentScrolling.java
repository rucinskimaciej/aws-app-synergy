package online.rumac.awsReferenceApp.tabs.nativeComponents;

import com.synergy.core.driver.mobile.MobileDriver;

public class ContentScrolling extends NativeComponentsView {

    public ContentScrolling(MobileDriver driver) {
        super(driver);
    }

    @Override
    public void goToView() {
        scroll().right(1);
    }
}
