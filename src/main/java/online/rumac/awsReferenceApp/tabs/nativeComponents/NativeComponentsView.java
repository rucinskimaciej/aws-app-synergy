package online.rumac.awsReferenceApp.tabs.nativeComponents;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.elements.NativeElement;
import com.synergy.core.exceptions.NoSuchElementException;
import online.rumac.common.driver.DriverManager;
import online.rumac.common.interactions.Interactions;
import online.rumac.common.interactions.Scroll;
import online.rumac.awsReferenceApp.menu.view.Menu;
import online.rumac.awsReferenceApp.menu.view.MenuElementsView;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class NativeComponentsView extends DriverManager implements Interactions {

    protected NativeComponentsView() {
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

    public boolean containsTitle(String title) {
        try {
            String locator = String.format("text(\"%s\")", title);
            NativeElement element = driver.finder().findElement(By.AndroidUIAutomator(locator));
            return element != null;
        } catch (NoSuchElementException e) {
            // do nothing
        }
        return false;
    }

    protected MobileElement supplyElementBy(String method, String locator) {
        By by = by(method, locator);
        return driver.finder().findElement(by);
    }

    private By by(String method, String locator) {
        try {
            Method m = By.class.getMethod(method, String.class);
            return (By) m.invoke(null, locator);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
