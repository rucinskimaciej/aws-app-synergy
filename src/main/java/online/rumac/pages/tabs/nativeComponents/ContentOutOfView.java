package online.rumac.pages.tabs.nativeComponents;

import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;

public class ContentOutOfView extends NativeComponentsView {

    protected ContentOutOfView(MobileDriver driver) {
        super(driver);
    }

    @Override
    protected void goToView() {
        scroll().right(4);
    }

    public String findHiddenText() {
        return getHiddenTextElement().getText();
    }

    public MobileElement getHiddenTextElement() {
        return supplyElementBy("AndroidUIAutomator", "text(\"This is hidden text\")");

    }
}
