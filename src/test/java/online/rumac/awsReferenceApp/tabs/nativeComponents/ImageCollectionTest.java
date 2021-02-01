package online.rumac.awsReferenceApp.tabs.nativeComponents;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.*;

public class ImageCollectionTest extends NativeComponentsViewTest {

    private ImageCollection imageCollectionView;

    @Override
    protected NativeComponentsView getNativeComponentsView() {
        imageCollectionView = new ImageCollection();
        return imageCollectionView;
    }

    @Override
    protected String getTitle() {
        return "Image Collection";
    }

    @Test(groups = "done")
    void findImagesOnScreen() {
        assertTrue(imageCollectionView.imageIsOnScreen(1 + new Random().nextInt(6)));
    }


}
