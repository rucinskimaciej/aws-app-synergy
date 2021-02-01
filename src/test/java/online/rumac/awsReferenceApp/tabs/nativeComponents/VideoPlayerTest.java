package online.rumac.awsReferenceApp.tabs.nativeComponents;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class VideoPlayerTest extends NativeComponentsViewTest {

    private VideoPlayer videoPlayer;

    @Override
    protected NativeComponentsView getNativeComponentsView() {
        videoPlayer = new VideoPlayer();
        return videoPlayer;
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