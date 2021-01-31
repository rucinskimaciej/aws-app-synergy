package online.rumac.awsReferenceApp.tabs.nativeComponents;

import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;
import com.synergy.core.exceptions.NoSuchElementException;

public class ContentOutOfView extends NativeComponentsView {

    @Override
    protected void goToView() {
        scroll().right(4);
    }

    public String findHiddenText() {
        return getHiddenTextElement().getText();
    }

    public String scrollAndFindHiddenText() {
        String hiddenText = "";
        Exception e = null;
        do {
            try {
                scroll().down(1);
                hiddenText = findHiddenText();
            } catch (NoSuchElementException nse) {
                e = nse;
            }
        } while (e != null);
        return hiddenText;
    }

    public MobileElement getHiddenTextElement() {
        return supplyElementBy("AndroidUIAutomator", "text(\"This is hidden text\")");
    }
}
