package online.rumac.common.views;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;

import static online.rumac.common.views.Menu.*;

public class HomeView implements View {

    private static View view;

    private HomeView() {}

    public static View getInstance() {
        if (view == null) {
            view = new HomeView();
        }
        return view;
    }

    @Override
    public void getViewFor(MobileDriver driver) {
        SideMenuView.getInstance().getViewFor(driver);
        MobileElement element;
//        element = driver.finder().findElement(By.Text(HOME.getField())); // <= not recognized by driver.finder()
        element = driver.finder().findElement(By.XPath("(//android.widget.ImageView[@content-desc=\"Row Category Image\"])[1]"));

        element.click();

    }
}
