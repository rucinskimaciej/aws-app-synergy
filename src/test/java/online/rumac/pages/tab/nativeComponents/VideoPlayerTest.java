package online.rumac.pages.tab.nativeComponents;

import online.rumac.pages.tabs.nativeComponents.VideoPlayer;
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
    protected int getTitleXpathIndex() {
        return 2;
    }

    @Override
    protected String getTitle() {
        return "Video Player";
    }

    @Test(groups = "undone")
    void isVideoElementDisplayed() {
        assertTrue(videoPlayer.isDisplayed());
    }

    @Test(groups = "undone")
    void containsVideoElement() {
        assertNotNull(videoPlayer.getVideoElement());
    }

    @Test(groups = "undone")
    void isVideoElementEnabled() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(videoPlayer.isPlaying());
    }

}