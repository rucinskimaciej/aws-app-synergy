package online.rumac.common.views;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;
public class WebView implements View {

    private static View view;

    private WebView() {}

    public static View getInstance() {
        if (view == null) {
            view = new WebView();
        }
        return view;
    }

    @Override
    public void getViewFor(MobileDriver driver) {
        SideMenuView.getInstance().getViewFor(driver);
        MobileElement element = driver.finder().findElement(By.XPath("(//android.widget.ImageView[@content-desc=\"Row Category Image\"])[2]"));
        element.click();
    }
}
