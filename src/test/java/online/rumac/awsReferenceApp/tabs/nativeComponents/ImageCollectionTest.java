package online.rumac.awsReferenceApp.tabs.nativeComponents;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.*;

public class ImageCollectionTest extends NativeComponentsViewTest {

    @Override
    protected NativeComponentsView getNativeComponentsView() {
        return new ImageCollection();
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
