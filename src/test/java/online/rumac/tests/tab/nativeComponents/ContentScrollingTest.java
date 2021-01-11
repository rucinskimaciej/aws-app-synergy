package online.rumac.tests.tab.nativeComponents;

import com.synergy.core.driver.By;
import online.rumac.common.views.tabs.nativeComponents.ContentScrolling;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.testng.Assert.*;


public class ContentScrollingTest extends NativeComponentsViewTest {

    private static int screenshotCounter = 0;

    @BeforeMethod(alwaysRun = true)
    @Override
    protected void setViewBeforeMethod() {
        view = new ContentScrolling(driver);
    }

    @Override
    protected int getTitleXpathIndex() {
        return 2;
    }

    @Test(groups = "undone", enabled = true)
    void findTextAfterScrolling() {
        view.scroll().down(10);
        By locator = By.XPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.TextView");
        assertTrue(view.contains("Ut accumsan commodo ex, nec ornare mi malesuada maximus.",locator));
        saveImage(driver.screen().getImage()); // todo SAVES IMAGE TO DIRECTORY
    }

    void saveImage(File file) {
        try {
            BufferedImage bfrdImg = ImageIO.read(file);
            File outputFIle = new File(String.format("%s%d%s", "C:\\Users\\rucinskm\\Documents\\ViacomCBS\\aws-app-synergy\\src\\test\\resources\\screenshots\\screenshot", ++screenshotCounter,".png"));
            ImageIO.write(bfrdImg, "PNG", outputFIle);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test(groups = "undone", enabled = false)
    void shouldFail() {
        view.scroll().down(10);
        By locator = By.XPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.TextView");
        assertFalse(view.contains("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",locator));
    }

    @Override
    protected String getTitle() {
        return "Content Scrolling";
    }

}
