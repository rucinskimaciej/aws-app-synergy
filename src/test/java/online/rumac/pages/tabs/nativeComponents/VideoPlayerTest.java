package online.rumac.pages.tabs.nativeComponents;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class VideoPlayerTest extends NativeComponentsViewTest {

    private VideoPlayer videoPlayer;

    @BeforeMethod(alwaysRun = true)
    @Override
    protected void setViewBeforeMethod() {
        view = new VideoPlayer(driver);
        videoPlayer = (VideoPlayer) view;
    }

    @Override
    protected String getTitle() {
        return "Video Player";
    }

    @Test(groups = "done")
    void isVideoElementDisplayed() {
        assertTrue(videoPlayer.isDisplayed());
    }

    @Test(groups = "done")
    void containsVideoElement() {
        assertNotNull(videoPlayer.getVideoElement());
    }

    @Test(groups = "done")
    void isVideoElementEnabled() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(videoPlayer.isPlaying());
    }

}