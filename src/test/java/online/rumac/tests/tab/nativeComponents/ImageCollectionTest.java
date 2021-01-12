package online.rumac.tests.tab.nativeComponents;

import online.rumac.pages.tabs.nativeComponents.ImageCollection;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.*;

public class ImageCollectionTest extends NativeComponentsViewTest {

    @Override
    @BeforeMethod(alwaysRun = true)
    protected void setViewBeforeMethod() {
        view = new ImageCollection(driver);
    }

    @Override
    protected int getTitleXpathIndex() {
        return 1;
    }

    @Override
    protected String getTitle() {
        return "Image Collection";
    }

    @Test(groups = "done")
    void findImagesOnScreen() {
        assertTrue(((ImageCollection) view).imageIsOnScreen(1 + new Random().nextInt(6)));
    }


}
