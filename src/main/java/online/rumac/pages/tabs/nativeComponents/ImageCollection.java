package online.rumac.pages.tabs.nativeComponents;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.NativeElement;
import com.synergy.core.driver.mobile.MobileDriver;
import com.synergy.core.exceptions.NoSuchElementException;

public class ImageCollection extends NativeComponentsView {

    public ImageCollection(MobileDriver driver) {
        super(driver);
    }

    private static final String IMAGE_PATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support." +
            "v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4." +
            "view.ViewPager/android.widget.LinearLayout/android.widget.GridView/android.widget.ImageView";

    public boolean imageIsOnScreen(int imageIndex) {
        try {
            NativeElement element = supplyElementBy("XPath", getImagePath(imageIndex));
            if (element != null) return true;
        } catch (NoSuchElementException e) {
            // skip
        }
        return false;
    }

    @Override
    protected void goToView() {
        if (!isNativeImageGridViewOnScreen()) scroll().left(4);
        throwExceptionIfScrollUnsuccessful();
    }

    private void throwExceptionIfScrollUnsuccessful() {
        getNativeImageGridViewElement();
    }

    private boolean isNativeImageGridViewOnScreen() {
        NativeElement element = null;
        try {
            element = getNativeImageGridViewElement();
        } catch (NoSuchElementException e) {
            // do nothing
        }
        return element != null;
    }

    private NativeElement getNativeImageGridViewElement() {
        return supplyElementBy("ID", "com.amazonaws.devicefarm.android.referenceapp:id/native_image_grid_view");
    }

    private String getImagePath(int imageIndex) {
        return String.format("%s[%d]",IMAGE_PATH, imageIndex + 1);
    }
}
