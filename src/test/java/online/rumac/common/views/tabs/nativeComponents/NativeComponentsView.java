package online.rumac.common.views.tabs.nativeComponents;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.NativeElement;
import com.synergy.core.driver.mobile.MobileDriver;
import com.synergy.core.exceptions.NoSuchElementException;
import online.rumac.common.driver.DriverManager;
import online.rumac.common.interactions.Swipe;
import online.rumac.common.views.Menu;
import online.rumac.common.views.MenuElementsView;

public abstract class NativeComponentsView extends DriverManager {

    protected final Swipe swipe;

    protected NativeComponentsView(MobileDriver driver) {
        super(driver);
        MenuElementsView.show(Menu.NATIVE_COMPONENTS, driver);
        swipe = new Swipe(driver);
    }

    protected abstract void goTo();

    public NativeComponentsView getView() {
        return this;
    }

    public boolean containsTitle(By title) {
        try {
            NativeElement element = driver.finder().findElement(title);
            return element != null;
        } catch (NoSuchElementException e) {
            // do nothing
        }
        return false;
    }
}
