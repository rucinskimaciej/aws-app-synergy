package online.rumac.common.views.tabs.nativeComponents;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.NativeElement;
import com.synergy.core.driver.mobile.MobileDriver;
import com.synergy.core.exceptions.NoSuchElementException;
import online.rumac.common.driver.DriverManager;
import online.rumac.common.interactions.Interactions;
import online.rumac.common.interactions.Scroll;
import online.rumac.common.views.tabs.menu.Menu;
import online.rumac.common.views.tabs.menu.MenuElementsView;

public abstract class NativeComponentsView extends DriverManager implements Interactions {

    protected NativeComponentsView(MobileDriver driver) {
        super(driver);
        driver.options().setElementTimeout(1000);
        MenuElementsView.show(Menu.NATIVE_COMPONENTS, driver);
        goToView();
    }

    @Override
    public Scroll scroll() {
        Scroll scroll = new Scroll(driver);
        scroll.setThreadSleep(500);
        return scroll;
    }

    protected abstract void goToView();

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
