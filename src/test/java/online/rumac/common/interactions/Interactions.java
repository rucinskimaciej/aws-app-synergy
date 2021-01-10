package online.rumac.common.interactions;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;
import com.synergy.core.driver.mobile.MobileScreen;
import online.rumac.common.logger.Log;

public interface Interactions {

    MobileDriver getDriver();

    default Swipe scroll() {
        return new Swipe(getDriver());
    }

    default boolean contains(String s) {
        MobileElement textElement = getDriver().finder().findElement(By.XPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.TextView"));
        return textElement.getText().contains(s);
    }

    default void scrollToBottom() {
        Log.onTerminal("SCROLLING TO BOTTOM");
        MobileScreen previousScreen;
        do {
            previousScreen = getDriver().screen();
            scroll().down(1);
        } while (canScrollFurther(previousScreen));
        Log.onTerminal("SUCCESSFULLY SCROLLED TO BOTTOM");
    }

    default boolean canScrollFurther(MobileScreen previousScreen) {
        if (previousScreen == null) return false;
        return previousScreen.equals(getDriver().screen());
    }
}
