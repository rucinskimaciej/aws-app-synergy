package online.rumac.common.views.tabs.menu;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;
import online.rumac.common.views.View;

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
        MobileElement sideMenuBarButton = driver.finder().findElement(By.ClassName("android.widget.ImageButton"));
        sideMenuBarButton.click();
    }
}
