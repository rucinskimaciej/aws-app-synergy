package online.rumac.common.views.tabs.nativeComponents;

import com.synergy.core.driver.mobile.MobileDriver;
import online.rumac.common.logger.Log;

public class ContentScrolling extends NativeComponentsView {

    public ContentScrolling(MobileDriver driver) {
        super(driver);
    }

    @Override
    public void goToView() {
        scroll().right(1);
    }
}
