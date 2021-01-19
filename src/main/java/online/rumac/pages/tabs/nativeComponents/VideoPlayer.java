package online.rumac.pages.tabs.nativeComponents;

import com.synergy.core.driver.By;
import com.synergy.core.driver.elements.MobileElement;
import com.synergy.core.driver.mobile.MobileDriver;
import com.synergy.core.exceptions.NoSuchElementException;

public class VideoPlayer extends NativeComponentsView {

    private MobileElement videoElement;

    public VideoPlayer(MobileDriver driver) {
        super(driver);
        videoElement = supplyVideoElement();
    }

    private MobileElement supplyVideoElement() {
        String idLocator = "com.amazonaws.devicefarm.android.referenceapp:id/native_video_player";
        MobileElement videoElement = null;
        try {
            videoElement = driver.finder().findElement(By.ID(idLocator));
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return videoElement;
    }

    public boolean isDisplayed() {
        return videoElement.isDisplayed();
    }

    public boolean isPlaying() {
        return videoElement.isEnabled();
    }

    public MobileElement getVideoElement() {
        return videoElement;
    }

    @Override
    protected void goToView() {
        scroll().right(2);
    }
}
