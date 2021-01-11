package online.rumac.common.interactions;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;

public interface Interactions {

    MobileDriver getDriver();

    default Swipe scroll() {
        return new Swipe(getDriver());
    }

    default boolean contains(String s, By locator) {
        MobileElement textElement = getDriver().finder().findElement(locator);
        return textElement.getText().contains(s);
    }
}
