package online.rumac.awsReferenceApp.tabs.nativeComponents;

import com.synergy.core.driver.mobile.MobileDriver;

public class ContentScrolling extends NativeComponentsView {

    @Override
    public void goToView() {
        scroll().right(1);
    }
}
