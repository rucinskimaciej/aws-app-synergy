package online.rumac.common.views;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;

public class SideMenuView implements View {

    private static SideMenuView view;

    private SideMenuView() {}

    public static View getInstance() {
        if (view == null) {
            view = new SideMenuView();
        }
        return view;
    }

    @Override
    public void getViewFor(MobileDriver driver) {
        driver.options().setElementTimeout(500);
        MobileElement sideMenuBarButton = driver.finder().findElement(By.ClassName("android.widget.ImageButton"));
        sideMenuBarButton.click();
    }
}
