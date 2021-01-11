package online.rumac.common.interactions;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;

public interface Interactions {

    MobileDriver getDriver();

    default Scroll scroll() {
        return new Scroll(getDriver());
    }

    default boolean contains(String s, By locator) {
        MobileElement textElement = getDriver().finder().findElement(locator);
        return textElement.getText().contains(s);
    }
}
