package online.rumac.common.views.tabs.nativeComponents;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.NativeElement;
import com.synergy.core.driver.mobile.MobileDriver;
import com.synergy.core.exceptions.ElementException;

public class ImageCollection extends NativeComponentsView {

    protected ImageCollection(MobileDriver driver) {
        super(driver);
    }

    @Override
    protected void goTo() {
        // this is main view
    }

    private static final String IMAGE_PATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support." +
            "v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4." +
            "view.ViewPager/android.widget.LinearLayout/android.widget.GridView/android.widget.ImageView";

    private String getImagePath(int imageIndex) {
        return String.format("%s[%d]",IMAGE_PATH, imageIndex + 1);
    }

    public boolean imageIsOnScreen(int imageIndex) {
        try {
            NativeElement element = driver.finder().findElement(By.XPath(getImagePath(imageIndex)));
            if (element != null) return true;
        } catch (ElementException e) {
            // skip
        }
        return false;
    }
}
