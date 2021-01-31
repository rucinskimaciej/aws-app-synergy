package online.rumac.awsReferenceApp.menu.view;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;
import online.rumac.awsReferenceApp.menu.View;

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
        MobileElement sideMenuBarButton = driver.finder().findElement(By.AccessibilityID("ReferenceApp"));
        sideMenuBarButton.click();
    }
}
