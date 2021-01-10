package online.rumac.common.interactions;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;

public interface Interactions {

    MobileDriver getDriver();

    default boolean contains(String s) {
        MobileElement textElement = getDriver().finder().findElement(By.XPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.TextView"));
        return textElement.getText().contains(s);
    }

    default Swipe scroll() {
        return new Swipe(getDriver());
    }
}
