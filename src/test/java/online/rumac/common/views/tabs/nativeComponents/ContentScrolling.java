package online.rumac.common.views.tabs.nativeComponents;

import com.synergy.core.driver.mobile.MobileDriver;

public class ContentScrolling extends NativeComponentsView {

    public ContentScrolling(MobileDriver driver) {
        super(driver);
    }

    @Override
    public void goToView() {
        swipe.setThreadSleep(400);
        swipe.right(1);
    }
}
